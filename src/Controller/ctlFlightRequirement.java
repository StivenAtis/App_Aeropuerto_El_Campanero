package Controller;

import Classes.clsFlightRequirements;
import Model.modelFlight_Airline;
import java.util.LinkedList;

/**
 *
 * @author Booh
 */
public class ctlFlightRequirement {
    
    modelFlight_Airline modeloRequerimientoVuelo;
    
    //--------------------------------------------------------------------------
    
    public ctlFlightRequirement() {
    
        modeloRequerimientoVuelo = new modelFlight_Airline();
    }

    
    //--------------------------------------------------------------------------
    
    public void createFlightRequirement(clsFlightRequirements FlightRequirement){
        
            modeloRequerimientoVuelo.createFlightRequirement((clsFlightRequirements) FlightRequirement);
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightRequirements readFlightRequirements(String codeFlight){
        
        return modeloRequerimientoVuelo.readFlightRequirements(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteFlight(clsFlightRequirements Flight){
        
        return modeloRequerimientoVuelo.deleteFlight((clsFlightRequirements) Flight);
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsFlightRequirements> listFlight(){
        return modeloRequerimientoVuelo.FlightList();
    }
    
    //--------------------------------------------------------------------------
}
