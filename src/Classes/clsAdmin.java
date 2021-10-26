package Classes;

/**
 *
 * @author Booh
 */
public class clsAdmin {
    
    //--------------------------------------------------------------------------
    
    private int id;
    private String email_admin;

    //--------------------------------------------------------------------------
    
    public clsAdmin(int id, String email_admin) {
        this.id = id;
        this.email_admin = email_admin;
    }

    //--------------------------------------------------------------------------
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail_admin() {
        return email_admin;
    }

    public void setEmail_admin(String email_admin) {
        this.email_admin = email_admin;
    }
    
    //--------------------------------------------------------------------------
}
