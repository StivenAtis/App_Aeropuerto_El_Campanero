package Model;

import Classes.clsDeniedFlights;
import Classes.clsFlightCancelationAirline;
import Classes.clsFlightRequirements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Booh
 */
public class modelFlight_Airline {

    dataDB DataDB;
    
    public modelFlight_Airline() {
        
        DataDB = new dataDB();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createFlightRequirement(clsFlightRequirements FlightRequirement){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_flight_requeriment_airline`(`code_flight`, `model_plane`, `Type_flight`, `flight_selection`, `capacity_plane`, `crew_plane`, `date_flight`, `time_flight`, `destination`, `id_airline`) VALUES (?,?,?,?,?,?,?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, FlightRequirement.getCodigoVuelo());
            preparedStatement.setString(2, FlightRequirement.getModeloAvion());
            preparedStatement.setString(3, FlightRequirement.getTipoVuelo());
            preparedStatement.setString(4, FlightRequirement.getSalidaLlegada());
            preparedStatement.setString(5, FlightRequirement.getCapacidadCarga());
            preparedStatement.setString(6, FlightRequirement.getTripulación());
            preparedStatement.setString(7, FlightRequirement.getFecha());
            preparedStatement.setString(8, FlightRequirement.getHora());
            preparedStatement.setString(9, FlightRequirement.getDestino());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("FlightRequirements registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createFlightDeined(clsDeniedFlights FlightRequirement){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_flight_declined`(`code_flight`, `Type_flight`, `flight_selection`, `date_flight`, `time_flight`, `model_plane`, `capacity_plane`, "
                           + "`crew_plane`, `destiny`, `description`, `id_airline`) VALUES (?,?,?,?,?,?,?,?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, FlightRequirement.getCodigoVueloAgenda());
            preparedStatement.setString(2, FlightRequirement.getTipoVuelo());
            preparedStatement.setString(3, FlightRequirement.getLlegadaSalida());
            preparedStatement.setString(4, FlightRequirement.getFecha());
            preparedStatement.setString(5, FlightRequirement.getHora());
            preparedStatement.setString(6, FlightRequirement.getModeloAvion());
            preparedStatement.setString(7, FlightRequirement.getCapacidadAvion());
            preparedStatement.setString(8, FlightRequirement.getTripulación());
            preparedStatement.setString(9, FlightRequirement.getDestino());
            preparedStatement.setString(10, FlightRequirement.getDespricion());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("FlightDeined registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createFlightCanceled(clsFlightCancelationAirline FlightRequirement){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_flight_cancelation`(`code_flight`, `model_plane`, `type_flight`, `flight_selection`, `capacity`, `crew_plane`, "
                          + "`date_flight`, `time_flight`, `destination`, `description`, `id_airline`) VALUES (?,?,?,?,?,?,?,?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, FlightRequirement.getCodigoVuelo());
            preparedStatement.setString(2, FlightRequirement.getModeloAvion());
            preparedStatement.setString(3, FlightRequirement.getTipoVuelo());
            preparedStatement.setString(4, FlightRequirement.getSalidaLlegada());
            preparedStatement.setString(5, FlightRequirement.getCapacidadCarga());
            preparedStatement.setString(6, FlightRequirement.getTripulación());
            preparedStatement.setString(7, FlightRequirement.getFecha());
            preparedStatement.setString(8, FlightRequirement.getHora());
            preparedStatement.setString(9, FlightRequirement.getDestino());
            preparedStatement.setString(10, FlightRequirement.getDescripcion());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("FlightDeined registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsFlightRequirements readFlightRequirements(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `model_plane`, `Type_flight`, `flight_selection`, `capacity_plane`, `crew_plane`, `date_flight`, `time_flight`, `destination` FROM `tb_flight_requeriment_airline` "
                    + "   WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsFlightRequirements Flight_obtained = new clsFlightRequirements(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("model_plane"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("capacity_plane"),
                rs.getString("crew_plane"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("destination"));
                return Flight_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsDeniedFlights readFlightDenied(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `Type_flight`, `flight_selection`, `date_flight`, `time_flight`, `model_plane`, `capacity_plane`, "
                          + "`crew_plane`, `destiny`, `description`, `id_airline` FROM `tb_flight_declined` WHERE code_flight = ?";
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
    
     public clsFlightCancelationAirline readFlightCancelation(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `code_flight`, `model_plane`, `type_flight`, `flight_selection`, `capacity`, "
                          + "`crew_plane`, `date_flight`, `time_flight`, `destination`, `description`, `id_airline` FROM `tb_flight_cancelation` WHERE code_flight = ?";
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
                rs.getString("capacity"),
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
    
    public boolean updateFlightResquest(clsFlightRequirements vuelo) {
        
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "UPDATE `tb_flight_requeriment_airline` SET `date_flight` = ?,`time_flight`= ? WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, vuelo.getFecha());
            preparedStatement.setString(2, vuelo.getHora());
            preparedStatement.setString(3, vuelo.getCodigoVuelo());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateFlightResquestCoplete(clsFlightRequirements vuelo) {
        
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "UPDATE `tb_flight_requeriment_airline` SET `model_plane`=?,`Type_flight`=?,`flight_selection`=?,`capacity_plane`=?,`crew_plane`=?,`date_flight`=?,`time_flight`=?,`destination`=? WHERE code_flight=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, vuelo.getModeloAvion());
            preparedStatement.setString(2, vuelo.getTipoVuelo());
            preparedStatement.setString(3, vuelo.getSalidaLlegada());
            preparedStatement.setString(4, vuelo.getCapacidadCarga());
            preparedStatement.setString(5, vuelo.getTripulación());
            preparedStatement.setString(6, vuelo.getFecha());
            preparedStatement.setString(7, vuelo.getHora());
            preparedStatement.setString(8, vuelo.getDestino());
            preparedStatement.setString(9, vuelo.getCodigoVuelo());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteFlight(clsFlightRequirements Flight) {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "DELETE FROM `tb_flight_requeriment_airline` WHERE code_flight = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Flight.getCodigoVuelo());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    //Lista:
    
    public LinkedList<clsFlightRequirements> FlightList(){
        
        LinkedList<clsFlightRequirements> FlightRequirements = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `code_flight`, `model_plane`, `Type_flight`, `flight_selection`, `capacity_plane`, `crew_plane`, `date_flight`, `time_flight`, `destination` FROM `tb_flight_requeriment_airline`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsFlightRequirements FRequirements = new clsFlightRequirements(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("model_plane"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("capacity_plane"),
                rs.getString("crew_plane"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("destination"));
                
                FlightRequirements.add(FRequirements);
            }
            return FlightRequirements;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsFlightCancelationAirline> FlightListCancelation(){
        
        LinkedList<clsFlightCancelationAirline> FlightRequirements = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `code_flight`, `model_plane`, `type_flight`, `flight_selection`, `capacity`, `crew_plane`, `date_flight`, `time_flight`, `destination`, `description`, `id_airline` FROM `tb_flight_cancelation`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsFlightCancelationAirline FRequirements = new clsFlightCancelationAirline(
                rs.getInt("id"),
                rs.getString("code_flight"),
                rs.getString("model_plane"),
                rs.getString("Type_flight"),
                rs.getString("flight_selection"),
                rs.getString("capacity"),
                rs.getString("crew_plane"),
                rs.getString("date_flight"),
                rs.getString("time_flight"),
                rs.getString("destination"),
                rs.getString("description"),
                rs.getString("id_airline"));
                
                FlightRequirements.add(FRequirements);
            }
            return FlightRequirements;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
