package Controller;

import Classes.clsDeniedFlights;
import Classes.clsFlightAgenda;
import Classes.clsFlightAgendaReprogramation;
import Classes.clsFlightCancelationAgenda;
import Classes.clsFlightCancelationAirline;
import Classes.clsGraphFlightsRequestedScheduled_Airport;
import Classes.clsTimeTable;
import Classes.clsType_Flight;
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
    
    public void createTimeTale(clsTimeTable FlightAgenda){
        
            modeloAgendaVuelo.createFlightAgendaTable((clsTimeTable) FlightAgenda);
    }
    
    //--------------------------------------------------------------------------
    
    public void createType_flight(clsType_Flight Flight){
        
            modeloAgendaVuelo.createTypeFlight((clsType_Flight) Flight);
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
    
    public clsTimeTable readTimeTable(String codeFlight){
        
        return modeloAgendaVuelo.readAgendaTable(codeFlight);       
    }
    
    //--------------------------------------------------------------------------
    
    public clsType_Flight readTypeFlight(String codeFlight){
        
        return modeloAgendaVuelo.readTypeFlight(codeFlight);       
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
    
    public boolean deleteTimeTable(clsTimeTable Flight){
        
        return modeloAgendaVuelo.deleteAgendaTable((clsTimeTable) Flight);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteTypeFlight(clsType_Flight Flight){
        
        return modeloAgendaVuelo.deleteTypeFlight((clsType_Flight) Flight);
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
    
    public LinkedList<clsTimeTable> listTimeTable(){
        return modeloAgendaVuelo.TimeTableList();
    }
    
    //--------------------------------------------------------------------------

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    
    public LinkedList<clsGraphFlightsRequestedScheduled_Airport> ChartOfFlight(){
        return modeloAgendaVuelo.ChartOfFlight();
    } 
    
    //--------------------------------------------------------------------------
}
