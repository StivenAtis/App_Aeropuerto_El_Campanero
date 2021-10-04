package Controller;

import Classes.clsDeniedFlights;
import Classes.clsFlightAgenda;
import Classes.clsFlightAgendaReprogramation;
import Classes.clsFlightCancelationAgenda;
import Classes.clsFlightCancelationAirline;
import Model.modelFlight_Agenda;
import java.util.LinkedList;

/**
 *
 * @author Booh
 */
public class ctlFlightAgenda {
    
    modelFlight_Agenda modeloAgendaVuelo;
    
    //--------------------------------------------------------------------------
    
    public ctlFlightAgenda() {
        modeloAgendaVuelo = new modelFlight_Agenda();
    }

    //--------------------------------------------------------------------------
    
    public void createFlightAgenda(clsFlightAgenda FlightAgenda){
        
            modeloAgendaVuelo.createFlightAgenda((clsFlightAgenda) FlightAgenda);
    }
    
    //--------------------------------------------------------------------------
    
    public void createFlightAgendaRepr(clsFlightAgendaReprogramation FlightAgenda){
        
            modeloAgendaVuelo.createFlightAgendaReprogramation((clsFlightAgendaReprogramation) FlightAgenda);
    }
    
    //--------------------------------------------------------------------------
    
    public void createFlightAgendaCancelation(clsFlightCancelationAgenda FlightAgenda){
        
            modeloAgendaVuelo.createFlightAgendaCancelation((clsFlightCancelationAgenda) FlightAgenda);
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightAgenda readFlightAgenda(String codeFlight){
        
        return modeloAgendaVuelo.readFlightAgenda(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public clsDeniedFlights readDeniedFlightAgenda(String codeFlight){
        
        return modeloAgendaVuelo.readDeniedFlightsAgenda(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightAgendaReprogramation readFlightAgendaReprogramation(String codeFlight){
        
        return modeloAgendaVuelo.readFlightAgendaReprogramation(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightCancelationAirline readFlightAirlineCancelation(String codeFlight){
        
        return modeloAgendaVuelo.readFlightCancelationAirline(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightCancelationAgenda readFlightAgendaCancelation(String codeFlight){
        
        return modeloAgendaVuelo.readFlightAgendaCancelatio(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateFlightResquest(clsFlightAgenda codeFlight){
        
            return modeloAgendaVuelo.updateFlightAgenda((clsFlightAgenda) codeFlight);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteFlight(clsFlightAgenda Flight){
        
        return modeloAgendaVuelo.deleteFlight((clsFlightAgenda) Flight);
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsFlightAgenda> listFlightAgenda(){
        return modeloAgendaVuelo.FlightList();
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsDeniedFlights> listFlightDenied(){
        return modeloAgendaVuelo.FlightDeniedList();
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsFlightCancelationAgenda> listCancelationAgenda(){
        return modeloAgendaVuelo.FlightCancelationList();
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsFlightCancelationAirline> listCancelationAirline(){
        return modeloAgendaVuelo.FlightCancelationAirlineList();
    }
    
    //--------------------------------------------------------------------------
}
