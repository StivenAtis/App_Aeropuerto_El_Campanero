package utils;

public class Constants {
    //Error messages
    public static final String MSG_SAVE_ERROR = "Error trying to store a record";
    public static final String MSG_UPDATE_ERROR = "Error trying to update a record";
    public static final String MSG_DELETE_ERROR = "Error trying to delete a record";
    public static final String MSG_QUERY_ERROR = "Query error";
        
    //Success messages
    public static final String MSG_SAVE_SUCESS = "The record has been successfully stored";
    public static final String MSG_UPDATE_SUCESS = "The registry has been successfully updated";
    public static final String MSG_DELETE_SUCESS = "The record has been successfully deleted";
        
    //Required fields
    public static final String MSG_REQUIRED = "Fields must not be empty";
    public static final String MSG_NO_EXIST_DATABASE = "The record does not exist in the database";
        
    //Constants jTable solicitudes
    public static final int CODE_FLIGHT = 0;
    public static final int TYPE_FLIGHT = 1;
    public static final int CLASS_FLIGHT = 2;
    public static final int DATE_FLIGHT = 3;
    public static final int TIME_FLIGHT = 4;
    public static final int MODEL_PLANE_FLIGHT = 5;
    public static final int CAPACITY_PLANE_FLIGHT = 6;
    public static final int CREW_PLANE_FLIGHT = 7;
    public static final int DESTINATION_PLANE_FLIGHT = 8;
    
    //Constants jTable vuelos agendados - Aerolinea
    public static final int CODE_FLIGHT_AGENDA = 0;
    public static final int TYPE_FLIGHT_AGENDA = 1;
    public static final int CLASS_FLIGHT_AGENDA = 2;
    public static final int DATE_FLIGHT_AGENDA = 3;
    public static final int TIME_FLIGHT_AGENDA = 4;
    public static final int DESTINATION_AGENDA = 5;
    public static final int PISTA_AGENDA = 6;

    //Constants jTable vuelos agendados - Aerolinea - cancelar
    public static final int CODE_FLIGHT_AGENDA_CANCELAR = 0;
    public static final int TYPE_FLIGHT_AGENDA_CANCELAR = 1;
    public static final int CLASS_FLIGHT_AGENDA_CANCELAR = 2;
    public static final int DATE_FLIGHT_AGENDA_CANCELAR = 3;
    public static final int TIME_FLIGHT_AGENDA_CANCELAR = 4;
    public static final int DESTINATION_AGENDA_CANCELAR = 5;
    public static final int PISTA_AGENDA_CANCELAR = 6;
    public static final int CREW_AGENDA_CANCELAR = 7;
    public static final int ID_AIRLINE_CANCELAR = 8;
    
    //constans jTable flights denied - Airline - Airport
    public static final int CODE_FLIGHT_DENIED = 0;
    public static final int TYPE_FLIGHT_DENIED = 1;
    public static final int CLASS_FLIGHT_DENIED = 2;
    public static final int DATE_FLIGHT_DENIED = 3;
    public static final int TIME_FLIGHT_DENIED = 4;
    public static final int MODEL_FLIGHT_DENIED = 5;
    public static final int CAPACITY_FLIGHT_DENIED = 6;
    public static final int CREW_FLIGHT_DENIED = 7;
    public static final int DESTINY_FLIGHT_DENIED = 8;
    public static final int ID_AIRLINE_DENIED = 8;
    
    //constans jTable flights canceled - Airline - Airport
    public static final int CODE_FLIGHT_CANCELED = 0;
    public static final int TYPE_FLIGHT_CANCELED = 1;
    public static final int CLASS_FLIGHT_CANCELED = 2;
    public static final int CREW_FLIGHT_CANCELED = 3;
    public static final int DESTINY_FLIGHT_CANCELED = 4;
    public static final int RUNWAY_FLIGHT_CANCELED = 5;
    public static final int DATE_FLIGHT_CANCELED = 6;
    public static final int TIME_FLIGHT_CANCELED = 7;
    public static final int ID_AIRLINE_CANCELED = 8;
    
    //constans jTable flights canceled - Airline - Airport
    public static final int CODE_FLIGHT_CANCELED_AIRLINE = 1;
    
    //Constants jTable consultas
    public static final int CODE_FLIGHT_REQUEST = 0;
    public static final int TYPE_FLIGHT_REQUEST = 1;
    public static final int CLASS_FLIGHT_REQUEST = 2;
    public static final int DATE_FLIGHT_REQUEST = 3;
    public static final int TIME_FLIGHT_REQUEST = 4;
    public static final int DESTINATION_FLIGHT_REQUEST = 5;
    public static final int STATE_FLIGHT_REQUEST = 6;
    
    //Constants jTable timeTable
    public static final int CODE_TIME_TABLE = 0;
    public static final int DATE_TIME_TABLE = 1;
    public static final int TIME_TIME_TABLE = 2;
    public static final int RUNWAY_TAKEOFF_TIME_TABLE = 3;
    public static final int RUNWAY_LANDING_TIME_TABLE = 4;
    
    
    //Constants jTable Plans
    public static final int ID_PLAN = 0;
    public static final int CODE_PLAN = 1;
    public static final int NAME_PLAN = 2;
    public static final int DESCRIPTION_PLAN = 3;
    public static final int PRICE_PLAN = 4;
    
    //Constants jPanel
    public static final String PANEL_CUSTOMERS = "pnlCustomers";
    public static final String PANEL_PETS = "pnlPets";
    public static final String PANEL_PLANS = "pnlPlans";
    public static final String PANEL_SCHUDELEFLIGHT = "pnlScheduleFlight";
    public static final String PANEL_FLIGHTREQUESTED = "pnlFlightsRequested";
    public static final String PANEL_SCHUDELEDFLIGHTS = "pnlScheduledFlights";
    public static final String PANEL_FLIGHTSCALENDAR = "pnlFlightCalendar";
    public static final String PANEL_RESSCHUDELEFLIGHT = "pnlRescheduleFlight";
    public static final String PANEL_CANCELFLIGHT = "pnlCancelFlight";
    public static final String PANEL_REFUSEFLIGHT = "pnlRefuseFlight";
    public static final String PANEL_REPORTS = "pnlReports";
    public static final String PANEL_CANCEL_FLIGHT_AIRPORT = "pnlCancelFlightAirport";
    
    public static final String PANEL_SCHUDELEDFLIGHTSAIRLINE = "pnlScheduledFlightsAirline";
    public static final String PANEL_FLIGHTSREQUIREDAIRLINE = "pnlFlightsRequiredAirline";
    public static final String PANEL_FLIGHTQUERY = "pnlFlightQuery";
    public static final String PANEL_DECLINEFLIGHTS = "pnlDeclinedFlights";
    public static final String PANEL_ORDERINGFLIGHTS = "pnlFlightOrderingAirline";
    public static final String PANEL_REPROGRAMFLIGHTS = "pnlReprogramFlightAirline";
    public static final String PANEL_ABORTFLIGHTS = "pnlAbortFlightAirline";
    public static final String PANEL_REPORTSAIRLINE = "pnlReportsAirline";
    
    public static final String PANEL_CHART_FLIGHT = "pnlgraphFlightsRequestedScheduled_Airport";
    public static final String PANEL_CHART_FLIGHT_A = "pnlgraphFlightsRequestedScheduled_Airline";
    
    public static final String PANEL_SETTINGS = "pnlSettings";
    public static final String PANEL_ABOUT = "pnlInfo";

    //Constants ToolBar
    public static final String TITLE_LOGIN = "LOGIN";
    public static final String TITLE_REGISTER = "REGISTRO";
    public static final String TITLE_REQUEST = "SOLICITUDES";
    public static final String TITLE_SCHUDELEFLIGHT = "AGENDAR VUELO";
    public static final String TITLE_FLIGHTREQUESTED = "SOLICITUDES DE VUELO";
    public static final String TITLE_SCHUDELEDFLIGHTS = "VUELOS AGENDADOS";
    public static final String TITLE_FLIGHTSCALENDAR = "AGENDA DE HORARIOS";
    public static final String TITLE_RESSCHUDELEFLIGHT = "REPROG. DE VUELO";
    public static final String TITLE_CANCELFLIGHT = "CANCELAR VUELO";
    public static final String TITLE_REFUSEFLIGHT = "RECHAZAR VUELO";
    public static final String TITLE_REPORTS = "REPORTES";
    
    public static final String TITLE_FLIGHTQUERY = "CONSULTAR VUELO";
    public static final String TITLE_DECLINEFLIGHTS = "VUELOS RECHAZADOS";
    public static final String TITLE_ORDERINGFLIGHTS = "SOLICITAR VUELOS";
    public static final String TITLE_REPROGRAMFLIGHTS = "REPROGRAMAR VUELOS";
    public static final String TITLE_ABORTFLIGHTS = "CANCELAR VUELOS";
    
    public static final String TITLE_CHART = "GRAFICA DE VUELOS";
    
    public static final String TITLE_SETTINGS = "SETTINGS";
    public static final String TITLE_ABOUT = "ACERCA DE";
    public static final String TITLE_HOME = "HOME";
    
    //Icon ToolBar
    public static final String ICON_LOGIN = "login_30px.png";
    public static final String ICON_REGISTER = "register_30px.png";
    public static final String ICON_REQUEST = "request_30px.png";
    public static final String ICON_SCHUDELEFLIGHT = "register_request_30px.png";
    public static final String ICON_FLIGHTREQUESTED = "request_30px.png";
    public static final String ICON_SCHUDELEDFLIGHTS = "file_30px.png";
    public static final String ICON_FLIGHTSCALENDAR = "agenda_30px.png";
    public static final String ICON_RESSCHUDELEFLIGHT = "reprogram_30px.png";
    public static final String ICON_CANCELFLIGHT = "cancel_fly_30px.png";
    public static final String ICON_REFUSEFLIGHT = "refuse_request_30px.png";
    public static final String ICON_REPORTS = "reports_30px.png";
    
    public static final String ICON_FLIGHTQUERY = "search_30px.png";
    public static final String ICON_DECLINEFLIGHTS = "cancel_fly_30px.png";
    public static final String ICON_ORDERINGFLIGHTS = "register_request_30px.png";
    public static final String ICON_REPROGRAMFLIGHTS = "reprogram_30px.png";
    
    public static final String ICON_SETTINGS = "wrench_30px.png";
    public static final String ICON_ABOUT = "AcercaDe.png";
    public static final String ICON_HOME = "home_30px.png";
    
    //Constants jComboBox
    public static final String ITEM_SELECT = "-Select-";
    
    //Paths Serializable Object
    public static final String PATH_OUTPUT_SERIALIZABLE = System.getProperty("user.dir").concat("\\output\\file.dat");
}
