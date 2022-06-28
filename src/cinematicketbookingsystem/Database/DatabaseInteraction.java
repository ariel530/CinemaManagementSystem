package cinematicketbookingsystem.Database;

import cinematicketbookingsystem.Model.Movie;
import cinematicketbookingsystem.Model.Hall;
import cinematicketbookingsystem.Model.TicketType;
import cinematicketbookingsystem.Model.Customer;
import cinematicketbookingsystem.Model.BookedTicketDetail;
import cinematicketbookingsystem.Model.Cart;
import cinematicketbookingsystem.Model.PaymentDetails;
import cinematicketbookingsystem.Model.Users;
import cinematicketbookingsystem.Model.Admin;
import cinematicketbookingsystem.Model.Card;
import cinematicketbookingsystem.Model.UserTicketSeats;
import cinematicketbookingsystem.Utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DatabaseInteraction {

    public Connection createConnection() {
        Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/cinematicketbookingsystem", "root", "root");

            System.out.println("Connection create");

        } catch (Exception ex) {
            System.out.println("Connection not create " + ex.getMessage());
        }
        return con;
    }

    public static void main(String[] args) {
        DatabaseInteraction db = new DatabaseInteraction();
        db.insertHallName("Hall 1");
        db.insertHallName("Hall 2");
        for (Hall hall : db.getAllHallData()) {
            System.out.println(hall.getH_Id() + " " + hall.getH_Name());
        }
        db.delteHallData(1);
        for (Hall hall : db.getAllHallData()) {
            System.out.println(hall.getH_Id() + " " + hall.getH_Name());
        }
    }

    public Users validateLoginCredention(String email, String password) {
        Users tempUser = null;
        try {
            Connection tempCon = createConnection();
            String query = "select * from userstable where U_Email=? and U_Password=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                if (rst.getString("U_UserType").compareTo("ADMIN") == 0) {
                    tempUser = new Admin(rst.getString("U_Email"), rst.getString("U_Password"), rst.getString("U_FirstName"), rst.getString("U_LastName"), rst.getString("U_Address"));
                } else {
                    tempUser = new Customer(rst.getString("U_Email"), rst.getString("U_Password"), rst.getString("U_FirstName"), rst.getString("U_LastName"), rst.getString("U_Address"));
                }
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tempUser;
    }

    public Users validateLoginCredention(String email) {
        Users tempUser = null;
        try {
            Connection tempCon = createConnection();
            String query = "select * from userstable where U_Email=? ";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, email);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                if (rst.getString("U_UserType").compareTo("ADMIN") == 0) {
                    tempUser = new Admin(rst.getString("U_Email"), rst.getString("U_Password"), rst.getString("U_FirstName"), rst.getString("U_LastName"), rst.getString("U_Address"));
                } else {
                    tempUser = new Customer(rst.getString("U_Email"), rst.getString("U_Password"), rst.getString("U_FirstName"), rst.getString("U_LastName"), rst.getString("U_Address"));
                }
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return tempUser;
    }

    public int validateAndGetHallNameIdExist(String hallName) {
        int hallId = -1;
        try {
            Connection tempCon = createConnection();
            String query = "select H_Id from halltable where H_Name=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, hallName);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                hallId = rst.getInt("H_Id");
            }
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return hallId;
    }

    public int insertHallName(String hallName) {
        int updatedRows = -1;
        try {
            Connection tempCon = createConnection();
            String query = "insert into halltable(H_Name) values(?)";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, hallName);
            updatedRows = stmt.executeUpdate();
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return updatedRows;
    }

    public ArrayList<Hall> getAllHallData() {
        ArrayList<Hall> hallData = new ArrayList<Hall>();
        try {
            Connection tempCon = createConnection();
            String query = "select * from halltable where H_IsDeleted=false";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                Hall hall = new Hall(rst.getInt("H_Id"), rst.getString("H_Name"));
                hallData.add(hall);
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return hallData;
    }

    public int delteHallData(int hallId) {
        int deletedRows = -1;
        try {
            Connection tempCon = createConnection();
            String query = "update halltable set H_IsDeleted = true where H_Id=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, hallId);
            deletedRows = stmt.executeUpdate();
            tempCon.close();
            delteMovieDataByHallId(hallId);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return deletedRows;
    }

    public int delteMovieDataByHallId(int hallId) {
        int deletedRows = -1;
        try {
            Connection tempCon = createConnection();
            String query = "update halltable set M_IsDeleted = true where M_HId=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, hallId);
            deletedRows = stmt.executeUpdate();
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return deletedRows;
    }

    public int delteMovieDataById(int movieId) {
        int deletedRows = -1;
        try {
            Connection tempCon = createConnection();
            String query = "update moviestable set M_IsDeleted = true where M_Id=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, movieId);
            deletedRows = stmt.executeUpdate();
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return deletedRows;
    }

    public ArrayList<TicketType> getAllTicketTypeData() {
        ArrayList<TicketType> ticketTypeData = new ArrayList<TicketType>();
        try {
            Connection tempCon = createConnection();
            String query = "select * from tickettypetable where T_IsDeleted=false";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                TicketType hall = new TicketType(rst.getInt("T_Id"), rst.getString("T_Name"));
                ticketTypeData.add(hall);
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ticketTypeData;
    }

    public TicketType getTicketTypeDataById(int id) {
        TicketType ticketTypeData = null;
        try {
            Connection tempCon = createConnection();
            String query = "select * from tickettypetable where T_Id=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                ticketTypeData = new TicketType(rst.getInt("T_Id"), rst.getString("T_Name"));
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ticketTypeData;
    }

    public Hall getHallDataById(int id) {
        Hall hallData = null;
        try {
            Connection tempCon = createConnection();
            String query = "select * from halltable where H_Id=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                hallData = new Hall(rst.getInt("H_Id"), rst.getString("H_Name"));
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return hallData;
    }

    public int getTicketTypeNameId(String ticketTypeName) {
        int ticketTypeId = -1;
        try {
            Connection tempCon = createConnection();
            String query = "select T_Id from tickettypetable where T_Name=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, ticketTypeName);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                ticketTypeId = rst.getInt("T_Id");
            }
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return ticketTypeId;
    }

    public int insertMovieData(Movie movie) {
        int updatedRows = -1;
        try {
            Connection tempCon = createConnection();
            String query = "insert into moviestable(M_NAME,M_DATE,M_TIME,M_PRICE,M_TID,M_HID,M_IMAGEPATH,M_ISDELETED) values(?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, movie.getM_Name());
            stmt.setDate(2, movie.getM_Date());
            stmt.setString(3, movie.getM_Time());
            stmt.setDouble(4, movie.getM_Price());
            stmt.setInt(5, movie.getM_TId());
            stmt.setInt(6, movie.getM_HId());
            stmt.setString(7, movie.getM_ImagePath());
            stmt.setBoolean(8, false);

            updatedRows = stmt.executeUpdate();
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return updatedRows;
    }

    public int updateCustomerData(Customer customer) {
        int updatedRows = -1;
        try {
            Connection tempCon = createConnection();
            String query = "update userstable set U_Password=?,U_FirstName=? , U_LastName=?,  U_Address=? where U_Email=?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, customer.getPassword());
            stmt.setString(2, customer.getFirstName());
            stmt.setString(3, customer.getLastName());
            stmt.setString(4, customer.getAddress());
            stmt.setString(5, customer.getEmail());

            updatedRows = stmt.executeUpdate();
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return updatedRows;
    }

    public int insertCustomerData(Customer customer) {
        int updatedRows = -1;
        try {
            Connection tempCon = createConnection();
            String query = "insert into userstable values(?,?,?,?,?,?)";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, customer.getEmail());
            stmt.setString(2, customer.getPassword());
            stmt.setString(3, customer.getFirstName());
            stmt.setString(4, customer.getLastName());
            stmt.setString(5, customer.getAddress());
            stmt.setString(6, "CUSTOMER");

            updatedRows = stmt.executeUpdate();
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return updatedRows;
    }

    public ArrayList<Movie> getMoviesDataForCustomer() {
        ArrayList<Movie> moviesData = new ArrayList<Movie>();
        try {
            Connection tempCon = createConnection();
            String query = "select * from moviestable where M_Date >=CURRENT_DATE and M_IsDeleted=false";
            PreparedStatement stmt = tempCon.prepareStatement(query);

            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                Movie movie = new Movie(rst.getInt("M_Id"), rst.getString("M_Name"), rst.getDate("M_Date"), rst.getString("M_Time"), rst.getDouble("M_Price"), rst.getInt("M_TId"), rst.getInt("M_HId"), rst.getString("M_ImagePath"), rst.getBoolean("M_IsDeleted"));
                moviesData.add(movie);
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return moviesData;
    }

    public ArrayList<Movie> getAllMoviesData() {
        ArrayList<Movie> moviesData = new ArrayList<Movie>();
        try {
            Connection tempCon = createConnection();
            String query = "select * from moviestable where M_IsDeleted=false";
            PreparedStatement stmt = tempCon.prepareStatement(query);

            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                Movie movie = new Movie(rst.getInt("M_Id"), rst.getString("M_Name"), rst.getDate("M_Date"), rst.getString("M_Time"), rst.getDouble("M_Price"), rst.getInt("M_TId"), rst.getInt("M_HId"), rst.getString("M_ImagePath"), rst.getBoolean("M_IsDeleted"));
                moviesData.add(movie);
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return moviesData;
    }

    public Movie getMoviesDataById(int id) {
        Movie moviesData = null;
        try {
            Connection tempCon = createConnection();
            String query = "select * from moviestable where M_Id = ?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                moviesData = new Movie(rst.getInt("M_Id"), rst.getString("M_Name"), rst.getDate("M_Date"), rst.getString("M_Time"), rst.getDouble("M_Price"), rst.getInt("M_TId"), rst.getInt("M_HId"), rst.getString("M_ImagePath"), rst.getBoolean("M_IsDeleted"));

            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return moviesData;
    }

    public ArrayList<UserTicketSeats> getAllUserTicketsSeatByMovieId(int id) {
        ArrayList<UserTicketSeats> userTicketSeats = new ArrayList<>();
        try {
            Connection tempCon = createConnection();
            String query = "select * from userticketseattable where UTS_MId =?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                UserTicketSeats tempUserTicketSeats = new UserTicketSeats(rst.getInt("UTS_Id"), rst.getInt("UTS_BId"), rst.getInt("UTS_MId"), rst.getInt("UTS_SeatNumber"));
                userTicketSeats.add(tempUserTicketSeats);
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userTicketSeats;
    }

    public ArrayList<Integer> getAllUserTicketsSeatBookedSeatNumbersByMovieId(int id) {
        ArrayList<Integer> userTicketSeats = new ArrayList<>();
        try {
            Connection tempCon = createConnection();
            String query = "select UTS_SeatNumber from userticketseattable where UTS_MId =?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                userTicketSeats.add(rst.getInt("UTS_SeatNumber"));
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userTicketSeats;
    }

    public double calculateTotalCartPrice() {
        double total = 0;
        for (Cart cart : Utility.cartData) {
            total += cart.getMovie().getM_Price();
        }
        return total;
    }

    public int insertBookingDetails(int drinkQuanitity, int popcornQuantity) {
        int updatedRows = -1;
        try {
            Connection tempCon = createConnection();
            String query = "insert into bookedticketstable values(default,?,?,?,?)";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, Utility.currentUsers.getEmail());
            stmt.setDouble(2, calculateTotalCartPrice() + drinkQuanitity * Utility.DRINKPRICE + popcornQuantity * Utility.POPCORNPRICE);
            stmt.setDouble(3, drinkQuanitity);
            stmt.setDouble(4, popcornQuantity);

            stmt.executeUpdate();
            updatedRows = getMaxBookingId();
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return updatedRows;
    }

    public int getMaxBookingId() {
        int bookingId = -1;
        try {
            Connection tempCon = createConnection();
            String query = "select max(BT_Id) from bookedticketstable";
            PreparedStatement stmt = tempCon.prepareStatement(query);

            ResultSet rst = stmt.executeQuery();

            while (rst.next()) {
                bookingId = rst.getInt(1);
            }
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return bookingId;
    }

    public int insertCartDetails(int drinkQuanitity, int popcornQuantity) {
        int bookingId = -1;
        try {
            bookingId = insertBookingDetails(drinkQuanitity, popcornQuantity);
            if (bookingId == -1) {
                return bookingId;
            }
            Connection tempCon = createConnection();
            for (Cart cart : Utility.cartData) {
                String query = "insert into userticketseattable values(default,?,?,?)";
                PreparedStatement stmt = tempCon.prepareStatement(query);
                stmt.setInt(1, bookingId);
                stmt.setInt(2, cart.getMovie().getM_Id());
                stmt.setInt(3, cart.getSeatNumber());

                stmt.executeUpdate();
            }
            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return bookingId;
    }

    public int insertPaymentDetails(PaymentDetails paymentDetails, int drinkQuanitity, int popcornQuantity) {
        int updatedRows = -1;
        try {
            int bookingId = insertCartDetails(drinkQuanitity, popcornQuantity);
            if (bookingId == -1) {
                return bookingId;
            }
            Connection tempCon = createConnection();
            String query = "";
            if (paymentDetails.getPaymentMethod().compareTo("CARD") == 0) {
                query = "insert into paymentdetailtable values(default,?,?,?,?,'CARD')";
            } else {
                query = "insert into paymentdetailtable(P_BTId,P_PaymentMethod) values(?,'CASH')";
            }
            PreparedStatement stmt = tempCon.prepareStatement(query);
            if (paymentDetails.getPaymentMethod().compareTo("CARD") == 0) {
                stmt.setInt(1, bookingId);
                stmt.setString(2, ((Card) paymentDetails).getCardHolderName());
                stmt.setString(3, ((Card) paymentDetails).getCcvNumber());
                stmt.setString(4, ((Card) paymentDetails).getCardNumber());
            } else {
                stmt.setInt(1, bookingId);
            }

            updatedRows = stmt.executeUpdate();

            tempCon.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return updatedRows;
    }

    public ArrayList<BookedTicketDetail> getAllBookedTicketDetailByCurrentLoginUser() {
        ArrayList<BookedTicketDetail> bookedTicketDetails = new ArrayList<>();
        try {

            Connection tempCon = createConnection();
            String query = "select * from bookedticketstable where BT_UId =?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setString(1, Utility.currentUsers.getEmail());
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                bookedTicketDetails.add(new BookedTicketDetail(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5)));
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bookedTicketDetails;
    }

    public ArrayList<BookedTicketDetail> getAllBookedTicketDetail() {
        ArrayList<BookedTicketDetail> bookedTicketDetails = new ArrayList<>();
        try {

            Connection tempCon = createConnection();
            String query = "select * from bookedticketstable";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                bookedTicketDetails.add(new BookedTicketDetail(rst.getInt(1), rst.getString(2), rst.getDouble(3), rst.getDouble(4), rst.getDouble(5)));
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return bookedTicketDetails;
    }

    public ArrayList<Cart> getCartDataByBookingId(int bookingId) {
        ArrayList<Cart> cartData = new ArrayList<>();
        try {
            Connection tempCon = createConnection();
            String query = "select UTS_MId,UTS_SeatNumber from userticketseattable where UTS_BId =?";
            PreparedStatement stmt = tempCon.prepareStatement(query);
            stmt.setInt(1, bookingId);
            ResultSet rst = stmt.executeQuery();
            while (rst.next()) {
                int movieId = rst.getInt("UTS_MId");
                int seatNumber = rst.getInt("UTS_SeatNumber");
                // userTicketSeats.add(rst.getInt("UTS_SeatNumber"));
                cartData.add(new Cart(getMoviesDataById(movieId), seatNumber));
            }
            tempCon.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cartData;
    }
}
