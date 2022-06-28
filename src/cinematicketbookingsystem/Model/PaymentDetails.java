
package cinematicketbookingsystem.Model;


public class PaymentDetails {

    private int id;
    private int bookingId;
    private String paymentMethod;

    public PaymentDetails() {
    }

    public PaymentDetails(int id, int bookingId, String paymentMethod) {
        this.id = id;
        this.bookingId = bookingId;
        this.paymentMethod = paymentMethod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    
    
}
