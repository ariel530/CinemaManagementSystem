
package cinematicketbookingsystem.Model;


public class Cart {

    private Movie movie;
    private int seatNumber;

    public Cart() {
    }

    public Cart(Movie movie, int seatNumber) {
        this.movie = movie;
        this.seatNumber = seatNumber;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

}
