
package cinematicketbookingsystem.Model;

public class Card extends PaymentDetails {

    private String cardHolderName;
    private String ccvNumber;
    private String cardNumber ;

    public Card(String cardHolderName, String ccvNumber, String cardNumber) {
        this.cardHolderName = cardHolderName;
        this.ccvNumber = ccvNumber;
        this.cardNumber = cardNumber;
    }

    public Card( int id, int bookingId, String cardHolderName, String ccvNumber, String cardNumber) {
        super(id, bookingId, "CARD");
        this.cardHolderName = cardHolderName;
        this.ccvNumber = ccvNumber;
        this.cardNumber = cardNumber;
    }

    
    
    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCcvNumber() {
        return ccvNumber;
    }

    public void setCcvNumber(String ccvNumber) {
        this.ccvNumber = ccvNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

   
    
    
}
