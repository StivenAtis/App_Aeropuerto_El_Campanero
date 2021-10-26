package Controller;

import Classes.clsAirportStaff;
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
    
    public clsLogin readStaff(String id){
        
        return modelStaff.readEmailAirportStaff(id);    
    }
    
    //--------------------------------------------------------------------------
    
    public clsAirportStaff readStaffA(String id){
        
        return modelStaff.readAirportStaff(id);    
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateUser (clsAirportStaff user){
        
            return modelStaff.updateAirportUser((clsAirportStaff) user);
    }
    
    //--------------------------------------------------------------------------
    
     public LinkedList<clsAirportStaff> listAdminA(){
         
        return modelStaff.AdminAirportList();
    }
    
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
}
