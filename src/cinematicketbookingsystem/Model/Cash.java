
package cinematicketbookingsystem.Model;

public class Cash extends PaymentDetails {

    public Cash(int id, int bookingId) {
        super(id, bookingId, "CASH");
    }

}
