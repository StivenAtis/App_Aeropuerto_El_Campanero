package Classes;

/**
 *
 * @author Booh
 */
public class clsAirlineStaffDelete {
    
     private int Id;
    private String identification;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String user;
    private String password;
    private String description;
    private String id_airport;

    //--------------------------------------------------------------------------

    public clsAirlineStaffDelete(int Id, String identification, String name, String lastName, String phone, String email, String user, String password, String description, String id_airport) {
        this.Id = Id;
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.user = user;
        this.password = password;
        this.description = description;
        this.id_airport = id_airport;
    }
    
    //--------------------------------------------------------------------------
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId_airport() {
        return id_airport;
    }

    public void setId_airport(String id_airport) {
        this.id_airport = id_airport;
    }
    
    //--------------------------------------------------------------------------
}
