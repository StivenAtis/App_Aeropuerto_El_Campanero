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
        
    //Constants jTable Customers
    public static final int ID_CUSTOMER = 0;
    public static final int NAME_CUSTOMER = 1;
    public static final int LASTNAME_CUSTOMER = 2;
    public static final int ADDRESS_CUSTOMER = 3;
    public static final int PHONE_CUSTOMER = 4;
    public static final int EMAIL_CUSTOMER = 5;
    
    //Constants jTable Pets
    public static final int ID_PET = 0;
    public static final int CODE_PET = 1;
    public static final int NAME_PET = 2;
    public static final int AGE_PET = 3;
    public static final int WEIGHT_PET = 4;
    public static final int SPECIE_PET = 5;
    public static final int OWNER_ID_PET = 6;
    public static final int OWNER_FULLNAME_PET = 7;
    
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
    
    public static final String PANEL_SCHUDELEDFLIGHTSAIRLINE = "pnlScheduledFlightsAirline";
    public static final String PANEL_FLIGHTSREQUIREDAIRLINE = "pnlFlightsRequiredAirline";
    public static final String PANEL_FLIGHTQUERY = "pnlFlightQuery";
    public static final String PANEL_DECLINEFLIGHTS = "pnlDeclinedFlights";
    public static final String PANEL_ORDERINGFLIGHTS = "pnlFlightOrderingAirline";
    public static final String PANEL_REPROGRAMFLIGHTS = "pnlReprogramFlightAirline";
    public static final String PANEL_ABORTFLIGHTS = "pnlAbortFlightAirline";
    public static final String PANEL_REPORTSAIRLINE = "pnlReportsAirline";
    
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
