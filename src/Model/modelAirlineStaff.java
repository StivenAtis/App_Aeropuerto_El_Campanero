package Model;

import Classes.clsAdmin;
import Classes.clsAirlineStaff;
import Classes.clsAirlineStaffDelete;
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
public class modelAirlineStaff {
    
    dataDB DataDB;
    
    //--------------------------------------------------------------------------
    
    public modelAirlineStaff() {
        
        DataDB = new dataDB();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createAirlineStaff(clsAirlineStaff AirlineStaff){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_airline_staff`(`id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `id_airline`) VALUES ('0',?,?,'0',?,?,?,'1')";
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
    
    public boolean createAirlineStaffDelete(clsAirlineStaffDelete AirportStaff){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_airline_staff_delete`(`id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `description`, `id_airline`) VALUES (?,?,?,?,?,?,?,?,'1')";
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
    
    public clsAirlineStaff readAirlineStaff(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff` FROM `tb_airline_staff` WHERE id_airline_staff = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsAirlineStaff login_obtained = new clsAirlineStaff(
                rs.getInt("id"),
                rs.getString("id_airline_staff"),
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
    
    public clsAirlineStaff readAirlineStaffEmail(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff` FROM `tb_airline_staff` WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsAirlineStaff login_obtained = new clsAirlineStaff(
                rs.getInt("id"),
                rs.getString("id_airline_staff"),
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
    
    public clsAirlineStaffDelete readAirlineStaffEmailDelete(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `description`, `id_airline` FROM `tb_airline_staff_delete` WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsAirlineStaffDelete login_obtained = new clsAirlineStaffDelete(
                rs.getInt("id"),
                rs.getString("id_airline_staff"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("user_staff"),
                rs.getString("password_staff"),
                rs.getString("description"),
                rs.getString("id_airline"));
                return login_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    
    public boolean updateAirlineUser(clsAirlineStaff user) {
        
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "UPDATE `tb_airline_staff` SET `id_airline_staff`=?,`name`=?,`last_name`=?,`phone`=?,`email`=?,`user_staff`=?,`password_staff`=? WHERE email = ?";
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
    
    public boolean deleteUser(clsAirlineStaff user) {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "DELETE FROM `tb_airline_staff` WHERE id_airline_staff = ?";
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
    
    public boolean deleteUserEmail(clsAirlineStaff user) {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "DELETE FROM `tb_airline_staff` WHERE email = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, user.getEmail());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsAirlineStaff> AdminAirlineList(){
        
        LinkedList<clsAirlineStaff> Admin = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT ast.id, ast.id_airline_staff, ast.name, ast.last_name, ast.phone, ast.email, ast.user_staff, ast.password_staff FROM `tb_airline_staff` AS ast INNER JOIN tb_admin AS ad WHERE ad.email_admin=ast.email";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsAirlineStaff FRAdmin = new clsAirlineStaff(
                rs.getInt("id"),
                rs.getString("id_airline_staff"),
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
    
    public LinkedList<clsAirlineStaff> AirlineStaffList(){
        
        LinkedList<clsAirlineStaff> Admin = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff` FROM `tb_airline_staff`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsAirlineStaff FRAdmin = new clsAirlineStaff(
                rs.getInt("id"),
                rs.getString("id_airline_staff"),
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
    
    public LinkedList<clsAirlineStaffDelete> AirlineStaffListDelete(){
        
        LinkedList<clsAirlineStaffDelete> Admin = new LinkedList<>();
        
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT `id`, `id_airline_staff`, `name`, `last_name`, `phone`, `email`, `user_staff`, `password_staff`, `description`, `id_airline` FROM `tb_airline_staff_delete`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                clsAirlineStaffDelete FRAdmin = new clsAirlineStaffDelete(
                rs.getInt("id"),
                rs.getString("id_airline_staff"),
                rs.getString("name"),
                rs.getString("last_name"),
                rs.getString("phone"),
                rs.getString("email"),
                rs.getString("user_staff"),
                rs.getString("password_staff"),
                rs.getString("description"),
                rs.getString("id_airline"));
                
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
