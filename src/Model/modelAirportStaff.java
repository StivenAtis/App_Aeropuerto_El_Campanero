package Model;

import Classes.clsAdmin;
import Classes.clsAirportStaff;
import Classes.clsAirportStaffDelete;
import Classes.clsLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

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
    
    public boolean createAirportStaffDelete(clsAirportStaffDelete AirportStaff){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_airport_staff_delete`(`id_Airport_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `description`, `id_airport`) VALUES (?,?,?,?,?,?,?,?,'1')";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, AirportStaff.getIdentification());
            preparedStatement.setString(2, AirportStaff.getName());
            preparedStatement.setString(3, AirportStaff.getLastName());
            preparedStatement.setString(4, AirportStaff.getPhone());
            preparedStatement.setString(5, AirportStaff.getEmail());
            preparedStatement.setString(6, AirportStaff.getUser());
            preparedStatement.setString(7, AirportStaff.getPassword());
            preparedStatement.setString(8, AirportStaff.getDescription());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("AirportStaffDelete registered.");
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
    
    public clsAirportStaff readAirportStaff(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `id_Airport_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff` FROM `tb_airport_staff` WHERE id_Airport_staff=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsAirportStaff login_obtained = new clsAirportStaff(
                rs.getInt("id"),
                rs.getString("id_Airport_staff"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("user_staff"),
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
    
    public clsAirportStaff readAirportStaffEmail(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `id_Airport_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff` FROM `tb_airport_staff` WHERE email=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsAirportStaff login_obtained = new clsAirportStaff(
                rs.getInt("id"),
                rs.getString("id_Airport_staff"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("user_staff"),
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
    
    public boolean updateAirportUser(clsAirportStaff user) {
        
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "UPDATE `tb_airport_staff` SET `id_Airport_staff`=?,`name`=?,`last_name`=?,`phone`=?,`email`=?,`user_staff`=?,`password_staff`=? WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, user.getIdentification());
            preparedStatement.setString(2, user.getName());
            preparedStatement.setString(3, user.getLastName());
            preparedStatement.setString(4, user.getPhone());
            preparedStatement.setString(5, user.getEmail());
            preparedStatement.setString(6, user.getUser());
            preparedStatement.setString(7, user.getPassword());
            preparedStatement.setString(8, user.getEmail());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteUser(clsAirportStaff user) {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "DELETE FROM `tb_airport_staff` WHERE id_Airport_staff= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getIdentification());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsAirportStaff> AdminAirportList(){
        
        LinkedList<clsAirportStaff> Admin = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT ast.id, ast.id_Airport_staff, ast.name, ast.last_name, ast.phone, ast.email, ast.user_staff, ast.password_staff FROM `tb_airport_staff` AS ast INNER JOIN tb_admin AS ad WHERE ad.email_admin=ast.email";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsAirportStaff FRAdmin = new clsAirportStaff(
                rs.getInt("id"),
                rs.getString("id_Airport_staff"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("user_staff"),
                rs.getString("password_staff"));
                
                Admin.add(FRAdmin);
            }
            return Admin;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsAirportStaff> AirportStaffList(){
        
        LinkedList<clsAirportStaff> Admin = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT id, id_Airport_staff, name, last_name, phone, email, user_staff, password_staff FROM `tb_airport_staff`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsAirportStaff FRAdmin = new clsAirportStaff(
                rs.getInt("id"),
                rs.getString("id_Airport_staff"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("user_staff"),
                rs.getString("password_staff"));
                
                Admin.add(FRAdmin);
            }
            return Admin;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsAdmin> AdminLogin(){
        
        LinkedList<clsAdmin> Admin = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `email_admin` FROM `tb_admin`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsAdmin FRAdmin = new clsAdmin(
                rs.getInt("id"),
                rs.getString("email_admin"));            
                Admin.add(FRAdmin);
            }
            return Admin;
        } catch (Exception e) {
            System.out.println("Error querying: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
