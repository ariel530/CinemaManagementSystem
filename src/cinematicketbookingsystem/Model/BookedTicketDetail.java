
package cinematicketbookingsystem.Model;


public class BookedTicketDetail {

    private int id;
    private String email;
    private double price;
    private double drinkQuantity;
    private double popcornQuantity;

    public BookedTicketDetail(int id, String email, double price) {
        this.id = id;
        this.email = email;
        this.price = price;
    }

    public BookedTicketDetail(int id, String email, double price, double drinkQuantity, double popcornQuantity) {
        this.id = id;
        this.email = email;
        this.price = price;
        this.drinkQuantity = drinkQuantity;
        this.popcornQuantity = popcornQuantity;
    }

    
    public BookedTicketDetail() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDrinkQuantity() {
        return drinkQuantity;
    }

    public void setDrinkQuantity(double drinkQuantity) {
        this.drinkQuantity = drinkQuantity;
    }

    public double getPopcornQuantity() {
        return popcornQuantity;
    }

    public void setPopcornQuantity(double popcornQuantity) {
        this.popcornQuantity = popcornQuantity;
    }

    
}
