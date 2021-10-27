package Controller;

import Classes.clsAdmin;
import Classes.clsAirportStaff;
import Classes.clsAirportStaffDelete;
import Classes.clsLogin;
import Model.modelAirportStaff;
import java.util.LinkedList;

/**
 *
 * @author Booh
 */
public class ctlAiportStaff {
    
    modelAirportStaff modelStaff;
    
    //--------------------------------------------------------------------------

    public ctlAiportStaff() {
    
        modelStaff = new modelAirportStaff();
    }
    
    //--------------------------------------------------------------------------
    
    public void createStaff(clsAirportStaff AirportStaff){
        
        modelStaff.createAirportStaff((clsAirportStaff) AirportStaff);
    }
    
    //--------------------------------------------------------------------------
    
    public void createStaffDelete(clsAirportStaffDelete AirportStaff){
        
        modelStaff.createAirportStaffDelete((clsAirportStaffDelete) AirportStaff);
    }
    
    //--------------------------------------------------------------------------
    
    public clsLogin readStaff(String id){
        
        return modelStaff.readEmailAirportStaff(id);    
    }
    
    //--------------------------------------------------------------------------
    
    public clsAirportStaff readStaffA(String id){
        
        return modelStaff.readAirportStaff(id);    
    }
    
    //--------------------------------------------------------------------------
    
    public clsAirportStaff readStaffEmail(String id){
        
        return modelStaff.readAirportStaffEmail(id);    
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateUser (clsAirportStaff user){
        
            return modelStaff.updateAirportUser((clsAirportStaff) user);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteUser(clsAirportStaff user){
        
        return modelStaff.deleteUser((clsAirportStaff) user);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteUserEmail(clsAirportStaff user){
        
        return modelStaff.deleteUserEmail((clsAirportStaff) user);
    }
    
    //--------------------------------------------------------------------------
    
     public LinkedList<clsAirportStaff> listAdminA(){
         
        return modelStaff.AdminAirportList();
    }
    
    //--------------------------------------------------------------------------
     
     public LinkedList<clsAirportStaff> listAirportStaffA(){
         
        return modelStaff.AirportStaffList();
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsAdmin> listAdminValidation(){
         
        return modelStaff.AdminLogin();
    }
    
    //--------------------------------------------------------------------------
}
