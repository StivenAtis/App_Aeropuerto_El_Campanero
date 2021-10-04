package Controller;

import Classes.clsDeniedFlights;
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
    
    public void createFlightDenied(clsDeniedFlights FlightDenied){
        
            modeloRequerimientoVuelo.createFlightDeined((clsDeniedFlights) FlightDenied);
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightRequirements readFlightRequirements(String codeFlight){
        
        return modeloRequerimientoVuelo.readFlightRequirements(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public clsDeniedFlights readFlightDenied(String codeFlight){
        
        return modeloRequerimientoVuelo.readFlightDenied(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateFlightResquest (clsFlightRequirements Payment){
        
            return modeloRequerimientoVuelo.updateFlightResquest((clsFlightRequirements) Payment);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateFlightResquestComplete (clsFlightRequirements Payment){
        
            return modeloRequerimientoVuelo.updateFlightResquestCoplete((clsFlightRequirements) Payment);
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
