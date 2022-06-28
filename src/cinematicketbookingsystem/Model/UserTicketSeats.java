
package cinematicketbookingsystem.Model;


public class UserTicketSeats {

    private int UTS_Id;
    private int UTS_BId;
    private int UTS_MId;
    private int UTS_SeatNumber;

    public UserTicketSeats() {
    }

    public UserTicketSeats(int UTS_Id, int UTS_BId, int UTS_MId, int UTS_SeatNumber) {
        this.UTS_Id = UTS_Id;
        this.UTS_BId = UTS_BId;
        this.UTS_MId = UTS_MId;
        this.UTS_SeatNumber = UTS_SeatNumber;
    }

    public int getUTS_Id() {
        return UTS_Id;
    }

    public void setUTS_Id(int UTS_Id) {
        this.UTS_Id = UTS_Id;
    }

    public int getUTS_BId() {
        return UTS_BId;
    }

    public void setUTS_BId(int UTS_BId) {
        this.UTS_BId = UTS_BId;
    }

    public int getUTS_MId() {
        return UTS_MId;
    }

    public void setUTS_MId(int UTS_MId) {
        this.UTS_MId = UTS_MId;
    }

    public int getUTS_SeatNumber() {
        return UTS_SeatNumber;
    }

    public void setUTS_SeatNumber(int UTS_SeatNumber) {
        this.UTS_SeatNumber = UTS_SeatNumber;
    }

}
