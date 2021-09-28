package Model;

import Classes.clsAirlineStaff;
import Classes.clsLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Booh
 */
public class modelAirlineStaff {
    
    dataDB DataDB;
    
    //--------------------------------------------------------------------------
    
    public modelAirlineStaff() {
        
        DataDB = new dataDB();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createAirlineStaff(clsAirlineStaff AirlineStaff){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_airline_staff`(`id_Airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `id_airline`) VALUES ('0',?,?,'0',?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, AirlineStaff.getName());
            preparedStatement.setString(2, AirlineStaff.getLastName());
            preparedStatement.setString(3, AirlineStaff.getEmail());
            preparedStatement.setString(4, AirlineStaff.getUser());
            preparedStatement.setString(5, AirlineStaff.getPassword());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("AirlineStaff registered.");
            }
            return false;
        } catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsLogin readEmailAirlineStaff(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `email`, `password_staff` FROM `tb_airline_staff` WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsLogin login_obtained = new clsLogin(
                rs.getString("email"),
                rs.getString("password_staff"));
                return login_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
}
