
package cinematicketbookingsystem.Model;


public class Customer extends  Users{
    private String userType;

    public Customer() {
    }

    public Customer(String email, String password, String firstName, String lastName, String address) {
        super(email, password, firstName, lastName, address);
        this.userType="CUSTOMER";
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
    
}
