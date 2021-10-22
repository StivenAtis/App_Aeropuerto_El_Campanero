package Classes;

/**
 *
 * @author Booh
 */
public class clsGraphFlightsRequestedScheduled_Airport {
 
    private String flight;
    private int amount;
    
    //--------------------------------------------------------------------------

    public clsGraphFlightsRequestedScheduled_Airport(String flight, int amount) {
        this.flight = flight;
        this.amount = amount;
    }

    //--------------------------------------------------------------------------
    
    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    //--------------------------------------------------------------------------
}
