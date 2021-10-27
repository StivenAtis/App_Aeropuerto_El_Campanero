package Controller;

import Classes.clsAdmin;
import Classes.clsAirlineStaff;
import Classes.clsAirlineStaffDelete;
import Classes.clsAirportStaff;
import Classes.clsLogin;
import Model.modelAirlineStaff;
import java.util.LinkedList;

/**
 *
 * @author Booh
 */
public class ctlAirlineStaff {
    
    modelAirlineStaff modelStaff;
    
    //--------------------------------------------------------------------------

    public ctlAirlineStaff() {
    
        modelStaff = new modelAirlineStaff();
    }
    
    //--------------------------------------------------------------------------
    
    public void createStaff(clsAirlineStaff AirportStaff){
        
        modelStaff.createAirlineStaff((clsAirlineStaff) AirportStaff);
    }
    
    //--------------------------------------------------------------------------
    
    public void createStaffDelete(clsAirlineStaffDelete AirportStaff){
        
        modelStaff.createAirlineStaffDelete((clsAirlineStaffDelete) AirportStaff);
    }
    
    //--------------------------------------------------------------------------
    
    public clsLogin readStaff(String id){
        
        return modelStaff.readEmailAirlineStaff(id);    
    }
    
    //--------------------------------------------------------------------------
    
    public clsAirlineStaff readStaffA(String id){
        
        return modelStaff.readAirlineStaff(id);    
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateUser (clsAirlineStaff user){
        
            return modelStaff.updateAirlineUser((clsAirlineStaff) user);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteUser(clsAirlineStaff user){
        
        return modelStaff.deleteUser((clsAirlineStaff) user);
    }
    
    //--------------------------------------------------------------------------
    
     public LinkedList<clsAirlineStaff> listAdminA(){
         
        return modelStaff.AdminAirlineList();
    }
    
    //--------------------------------------------------------------------------
    
    public LinkedList<clsAdmin> listAdminValidation(){
         
        return modelStaff.AdminLogin();
    }
    
    //--------------------------------------------------------------------------
}
