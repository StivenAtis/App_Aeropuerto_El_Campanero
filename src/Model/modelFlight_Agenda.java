package Model;

import Classes.clsDeniedFlights;
import Classes.clsFlightAgenda;
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
}
