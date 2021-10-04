package Classes;

/**
 *
 * @author Booh
 */
public class clsTimeTable {

    //--------------------------------------------------------------------------
    
    private int id;
    private String codigo;
    private String date;
    private String time;
    private String runway_takeoff;
    private String runway_landing;

    //--------------------------------------------------------------------------

    public clsTimeTable(int id, String codigo, String date, String time, String runway_takeoff, String runway_landing) {
        this.id = id;
        this.codigo = codigo;
        this.date = date;
        this.time = time;
        this.runway_takeoff = runway_takeoff;
        this.runway_landing = runway_landing;
    }

    //--------------------------------------------------------------------------
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRunway_takeoff() {
        return runway_takeoff;
    }

    public void setRunway_takeoff(String runway_takeoff) {
        this.runway_takeoff = runway_takeoff;
    }

    public String getRunway_landing() {
        return runway_landing;
    }

    public void setRunway_landing(String runway_landing) {
        this.runway_landing = runway_landing;
    }

    //--------------------------------------------------------------------------
}
