package Controller;

import Classes.clsAdmin;
import Model.modelAdmin;

/**
 *
 * @author Booh
 */
public class ctlAdmin {

    modelAdmin modelAdmin;
    
    //--------------------------------------------------------------------------

    public ctlAdmin() {
        modelAdmin = new modelAdmin();
    }

    //--------------------------------------------------------------------------
    
    public void createAdmin(clsAdmin Admin){
        
            modelAdmin.createAdmin((clsAdmin) Admin);
    }
    
    //--------------------------------------------------------------------------
    
    public clsAdmin readAdmin(String Admin){
        
        return modelAdmin.readAdmin(Admin);       
    }
    
    //--------------------------------------------------------------------------
    
    public boolean updateAdmin(clsAdmin Admin){
        
            return modelAdmin.updateAdmin((clsAdmin) Admin);
    }
    
    //--------------------------------------------------------------------------
    
    public boolean deleteAdmin(clsAdmin Admin){
        
        return modelAdmin.deleteAdmin((clsAdmin) Admin);
    }
    
    //--------------------------------------------------------------------------
}
