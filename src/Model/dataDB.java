package Model;

/**
 *
 * @author Booh
 */
public class dataDB {
    
    private final String url;
    private final String user;
    private final String pass;

    public dataDB() {
        this.url = "jdbc:mysql://localhost:3306/aeropuerto_campanero_db";
        this.user = "root";
        this.pass = "";
    }

    //--------------------------------------------------------------------------

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
    
    //--------------------------------------------------------------------------
}
