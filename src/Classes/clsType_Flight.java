package Classes;

/**
 *
 * @author Booh
 */
public class clsType_Flight {

    //--------------------------------------------------------------------------
    
    private int id;
    private String codeFlight;
    private String type;

    //--------------------------------------------------------------------------
    
    public clsType_Flight(int id, String codeFlight, String type) {
        this.id = id;
        this.codeFlight = codeFlight;
        this.type = type;
    }

    //--------------------------------------------------------------------------
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeFlight() {
        return codeFlight;
    }

    public void setCodeFlight(String codeFlight) {
        this.codeFlight = codeFlight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //--------------------------------------------------------------------------
}
