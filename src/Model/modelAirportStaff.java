package Model;

import Classes.clsAirportStaff;
import Classes.clsLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Booh
 */
public class modelAirportStaff {
    
    dataDB DataDB;

    public modelAirportStaff() {
        DataDB = new dataDB();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createAirportStaff(clsAirportStaff AirportStaff){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_airport_staff`(`id_Airport_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `id_airport`) VALUES ('0',?,?,'0',?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            //preparedStatement.setString(1, AirportStaff.getId());
            preparedStatement.setString(1, AirportStaff.getName());
            preparedStatement.setString(2, AirportStaff.getLastName());
            preparedStatement.setString(3, AirportStaff.getEmail());
            preparedStatement.setString(4, AirportStaff.getUser());
            preparedStatement.setString(5, AirportStaff.getPassword());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("AirportStaff registered.");
            }
            return false;
        } catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsLogin readEmailAirportStaff(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `email`, `password_staff` FROM `tb_airport_staff` WHERE email = ?";
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
}
