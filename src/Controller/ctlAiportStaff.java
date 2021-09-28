package Controller;

import Classes.clsAirportStaff;
import Classes.clsLogin;
import Model.modelAirportStaff;

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
    
    
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
}
