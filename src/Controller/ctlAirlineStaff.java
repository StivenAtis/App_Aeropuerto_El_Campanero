package Controller;

import Classes.clsAirlineStaff;
import Classes.clsLogin;
import Model.modelAirlineStaff;

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
    
    public clsLogin readStaff(String id){
        
        return modelStaff.readEmailAirlineStaff(id);    
    }
    
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
    
    
    //--------------------------------------------------------------------------
}
