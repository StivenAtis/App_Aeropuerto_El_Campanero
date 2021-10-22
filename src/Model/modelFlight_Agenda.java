package Model;

import Classes.clsDeniedFlights;
import Classes.clsFlightAgenda;
import Classes.clsFlightAgendaReprogramation;
import Classes.clsFlightCancelationAgenda;
import Classes.clsFlightCancelationAirline;
import Classes.clsGraphFlightsRequestedScheduled_Airport;
import Classes.clsTimeTable;
import Classes.clsType_Flight;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Booh
 */
public class modelFlight_Agenda {
    
    dataDB DataDB;
    
    //--------------------------------------------------------------------------
    
    public modelFlight_Agenda() {
        
        DataDB = new dataDB();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createFlightAgenda(clsFlightAgenda FlightAgenda){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_flight`(`code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `id_airline`) VALUES (?,?,?,?,?,?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, FlightAgenda.getCodigoVueloAgenda());
            preparedStatement.setString(2, FlightAgenda.getTipoVuelo());
            preparedStatement.setString(3, FlightAgenda.getClaseVuelo());
            preparedStatement.setString(4, FlightAgenda.getTripulación());
            preparedStatement.setString(5, FlightAgenda.getDestino());
            preparedStatement.setString(6, FlightAgenda.getPista());
            preparedStatement.setString(7, FlightAgenda.getFecha());
            preparedStatement.setString(8, FlightAgenda.getTiempo());

            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Flight registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createFlightAgendaReprogramation (clsFlightAgendaReprogramation FlightAgenda){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_flight_reprogramation`(`code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `description`, `id_airline`) VALUES (?,?,?,?,?,?,?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, FlightAgenda.getCodigoVueloAgenda());
            preparedStatement.setString(2, FlightAgenda.getTipoVuelo());
            preparedStatement.setString(3, FlightAgenda.getClaseVuelo());
            preparedStatement.setString(4, FlightAgenda.getTripulación());
            preparedStatement.setString(5, FlightAgenda.getDestino());
            preparedStatement.setString(6, FlightAgenda.getPista());
            preparedStatement.setString(7, FlightAgenda.getFecha());
            preparedStatement.setString(8, FlightAgenda.getTiempo());
            preparedStatement.setString(9, FlightAgenda.getDescripcion());

            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Flight registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createFlightAgendaCancelation (clsFlightCancelationAgenda FlightAgenda){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_flight_cancelation_agenda`(`code_flight`, `type_flight`, `flight_selection`, "
                           + "`crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `description`, `id_airline`) VALUES (?,?,?,?,?,?,?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, FlightAgenda.getCodigoVueloAgenda());
            preparedStatement.setString(2, FlightAgenda.getTipoVuelo());
            preparedStatement.setString(3, FlightAgenda.getClaseVuelo());
            preparedStatement.setString(4, FlightAgenda.getTripulación());
            preparedStatement.setString(5, FlightAgenda.getDestino());
            preparedStatement.setString(6, FlightAgenda.getPista());
            preparedStatement.setString(7, FlightAgenda.getFecha());
            preparedStatement.setString(8, FlightAgenda.getTiempo());
            preparedStatement.setString(9, FlightAgenda.getDescripcion());

            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Flight registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createFlightAgendaTable (clsTimeTable FlightAgenda){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_timetable`(`codigo`,`date`, `time`, `runway_takeoff`, `runway_landing`) VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, FlightAgenda.getCodigo());
            preparedStatement.setString(2, FlightAgenda.getDate());
            preparedStatement.setString(3, FlightAgenda.getTime());
            preparedStatement.setString(4, FlightAgenda.getRunway_takeoff());
            preparedStatement.setString(5, FlightAgenda.getRunway_landing());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Agenda item registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createTypeFlight (clsType_Flight Flight){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_type_flight`(`code_flight`, `type_flight`) VALUES (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, Flight.getCodeFlight());
            preparedStatement.setString(2, Flight.getType());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Flight item registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightAgenda readFlightAgenda(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `id_airline` FROM `tb_flight` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsFlightAgenda Flight_obtained = new clsFlightAgenda(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("crew_plane"),
                rs.getString("destination"),
                rs.getString("runway"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("id_airline"));
                return Flight_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsDeniedFlights readDeniedFlightsAgenda(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `Type_flight`, `flight_selection`, `date_flight`, `time_flight`, `model_plane`, `capacity_plane`, `crew_plane`, `destiny`, `description`, `id_airline` "
                          + "FROM `tb_flight_declined` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsDeniedFlights Flight_obtained = new clsDeniedFlights(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("model_plane"),
                rs.getString("capacity_plane"),
                rs.getString("crew_plane"),
                rs.getString("destiny"),
                rs.getString("description"),
                rs.getString("id_airline"));
                return Flight_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightCancelationAgenda readFlightAgendaCancelatio(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, "
                          + "`time_flight`, `description`, `id_airline` FROM `tb_flight_cancelation_agenda` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsFlightCancelationAgenda Flight_obtained = new clsFlightCancelationAgenda(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("crew_plane"),
                rs.getString("destination"),
                rs.getString("runway"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("description"),
                rs.getString("id_airline"));
                return Flight_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightAgendaReprogramation readFlightAgendaReprogramation(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, "
                          + "`time_flight`, `description`, `id_airline` FROM `tb_flight_reprogramation` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsFlightAgendaReprogramation Flight_obtained = new clsFlightAgendaReprogramation(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("crew_plane"),
                rs.getString("destination"),
                rs.getString("runway"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("description"),
                rs.getString("id_airline"));
                return Flight_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightCancelationAirline readFlightCancelationAirline(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `model_plane`, `Type_flight`, `flight_selection`, `capacity_plane`, `crew_plane`, `date_flight`, `time_flight`, `destination`, `description`, `id_airline` FROM `tb_flight_cancelation_airline` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsFlightCancelationAirline Flight_obtained = new clsFlightCancelationAirline(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("model_plane"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("capacity_plane"),
                rs.getString("crew_plane"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("destination"),
                rs.getString("description"),
                rs.getString("id_airline"));
                return Flight_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsTimeTable readAgendaTable(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `codigo`, `date`, `time`, `runway_takeoff`, `runway_landing` FROM `tb_timetable` WHERE codigo = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsTimeTable Flight_obtained = new clsTimeTable(
                rs.getInt("id"),
                rs.getString("codigo"),
                rs.getString("date"),
                rs.getString("time"),
                rs.getString("runway_takeoff"),
                rs.getString("runway_landing"));
                return Flight_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsType_Flight readTypeFlight(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `type_flight` FROM `tb_type_flight` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsType_Flight Flight_obtained = new clsType_Flight(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("type_flight"));
                return Flight_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateFlightAgenda(clsFlightAgenda vuelo) {
        
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            
            String query = "UPDATE `tb_flight` SET `runway`= ?,`date_flight`= ?,`time_flight`= ? WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, vuelo.getPista());
            preparedStatement.setString(2, vuelo.getFecha());
            preparedStatement.setString(3, vuelo.getTiempo());
            preparedStatement.setString(4, vuelo.getCodigoVueloAgenda());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteFlight(clsFlightAgenda Flight) {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "DELETE FROM `tb_flight` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Flight.getCodigoVueloAgenda());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteAgendaTable(clsTimeTable Flight) {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "DELETE FROM `tb_timetable` WHERE codigo = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Flight.getCodigo());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteTypeFlight (clsType_Flight Flight) {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "DELETE FROM `tb_type_flight` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Flight.getCodeFlight());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsFlightAgenda> FlightList(){
        
        LinkedList<clsFlightAgenda> FlightAgenda = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `id_airline` FROM `tb_flight`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsFlightAgenda FRAgenda = new clsFlightAgenda(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("crew_plane"),
                rs.getString("destination"),
                rs.getString("runway"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("id_airline"));
                
                FlightAgenda.add(FRAgenda);
            }
            return FlightAgenda;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsDeniedFlights> FlightDeniedList(){
        
        LinkedList<clsDeniedFlights> FlightDenied = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `code_flight`, `Type_flight`, `flight_selection`, `date_flight`, `time_flight`, `model_plane`, `capacity_plane`, `crew_plane`, `destiny`, `description`, `id_airline` FROM `tb_flight_declined`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsDeniedFlights FRAgenda = new clsDeniedFlights(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("model_plane"),
                rs.getString("capacity_plane"),
                rs.getString("crew_plane"),
                rs.getString("destiny"),
                rs.getString("description"),
                rs.getString("id_airline"));
                
                FlightDenied.add(FRAgenda);
            }
            return FlightDenied;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsFlightCancelationAgenda> FlightCancelationList(){
        
        LinkedList<clsFlightCancelationAgenda> FlightDenied = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `code_flight`, `type_flight`, `flight_selection`, `crew_plane`, `destination`, `runway`, `date_flight`, `time_flight`, `description`, `id_airline` FROM `tb_flight_cancelation_agenda`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsFlightCancelationAgenda FRAgenda = new clsFlightCancelationAgenda(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("crew_plane"),
                rs.getString("destination"),
                rs.getString("runway"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("description"),
                rs.getString("id_airline"));
                
                FlightDenied.add(FRAgenda);
            }
            return FlightDenied;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsFlightCancelationAirline> FlightCancelationAirlineList(){
        
        LinkedList<clsFlightCancelationAirline> FlightDenied = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `code_flight`, `model_plane`, `Type_flight`, `flight_selection`, `capacity_plane`, `crew_plane`, `date_flight`, `time_flight`, `destination`, `description`, `id_airline` FROM `tb_flight_cancelation_airline`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsFlightCancelationAirline FRAgenda = new clsFlightCancelationAirline(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("model_plane"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("capacity_plane"),
                rs.getString("crew_plane"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("destination"),
                rs.getString("description"),
                rs.getString("id_airline"));
                
                FlightDenied.add(FRAgenda);
            }
            return FlightDenied;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsTimeTable> TimeTableList(){
        
        LinkedList<clsTimeTable> FlightDenied = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `codigo`, `date`, `time`, `runway_takeoff`, `runway_landing` FROM `tb_timetable`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsTimeTable FRAgenda = new clsTimeTable(
                rs.getInt("id"),
                rs.getString("codigo"),
                rs.getString("date"),
                rs.getString("time"),
                rs.getString("runway_takeoff"),
                rs.getString("runway_landing"));
                
                FlightDenied.add(FRAgenda);
            }
            return FlightDenied;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsGraphFlightsRequestedScheduled_Airport> ChartOfFlight(){
        
        LinkedList<clsGraphFlightsRequestedScheduled_Airport> petsSpecies = new LinkedList<>();
        
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT type_flight, COUNT(*) AS amount FROM `tb_type_flight` GROUP BY type_flight;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsGraphFlightsRequestedScheduled_Airport petSpecies = new clsGraphFlightsRequestedScheduled_Airport("Tipo de vuelo: " + rs.getString("type_flight"), rs.getInt("amount"));
                
                petsSpecies.add(petSpecies);
            }
            return petsSpecies;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
