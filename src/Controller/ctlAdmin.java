package Controller;

import Classes.clsAdmin;
import Model.modelAdmin;
import java.util.LinkedList;

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
    
    public boolean deleteAdminTable(){
        
        return modelAdmin.deleteAdminTable();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean compareAdminAirline(){
        
        return modelAdmin.compareAdmin();
    }
    
    //--------------------------------------------------------------------------
    
    public boolean compareAdminAirport(){
        
        return modelAdmin.compareAdminAirport();
    }
    
    //--------------------------------------------------------------------------
    
     public LinkedList<clsAdmin> listAdmin(){
         
        return modelAdmin.AdminList();
    }
    
    //--------------------------------------------------------------------------
}
