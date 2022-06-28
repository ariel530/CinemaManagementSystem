
package cinematicketbookingsystem.Model;


public class Admin extends Users {

    private String userType;

    public Admin() {
    }

    public Admin(String email, String password, String firstName, String lastName, String address) {
        super(email, password, firstName, lastName, address);
        this.userType = "ADMIN";
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    

}
