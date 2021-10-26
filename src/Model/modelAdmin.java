package Model;

import Classes.clsAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author Booh
 */
public class modelAdmin {

    dataDB DataDB;
    
    public modelAdmin() {
        
        DataDB = new dataDB();
        
    }
    
    //--------------------------------------------------------------------------
    
    public boolean createAdmin(clsAdmin Admin){
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())){
            String query = "INSERT INTO `tb_admin`(`email_admin`) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, Admin.getEmail_admin());
            
            int AffectedRows = preparedStatement.executeUpdate();
            
            if(AffectedRows>0){
                System.out.println("Admin registered.");
            }
            return false;
        }
        catch (Exception e) {
            System.out.println("Error saving: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public clsAdmin readAdmin(String id){
        try (Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query ="SELECT `id`, `email_admin` FROM `tb_admin` WHERE email_admin = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, id);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            if(rs.next()){
                clsAdmin admin_obtained = new clsAdmin(
                rs.getInt("id"),
                rs.getString("email_admin"));
                return admin_obtained;
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateAdmin(clsAdmin Admin) {
        
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "UPDATE `tb_admin` SET `email_admin`= ? WHERE email_admin = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            
            preparedStatement.setString(1, Admin.getEmail_admin());
            
            preparedStatement.executeUpdate();
            
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteAdmin(clsAdmin Admin) {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "DELETE FROM `tb_admin` WHERE email_admin = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, Admin.getEmail_admin());
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteAdminTable() {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "truncate table `tb_admin`";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean compareAdmin() {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT * FROM `tb_airline_staff` AS ast INNER JOIN tb_admin AS ad WHERE ad.email_admin=ast.email";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public boolean compareAdminAirport() {
        try(Connection connection = DriverManager.getConnection(DataDB.getUrl(), DataDB.getUser(), DataDB.getPass())) {
            String query = "SELECT ast.id_Airport_staff, ast.name, ast.last_name, ast.phone, ast.email, ast.user_staff, ast.password_staff FROM `tb_airport_staff` AS ast INNER JOIN tb_admin AS ad WHERE ad.email_admin=ast.email";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //preparedStatement.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsAdmin> AdminList(){
        
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
            System.out.println("Error querying:" + e.getMessage());
            return null;
        }
    }
    
    //--------------------------------------------------------------------------
}
