package cinematicketbookingsystem.Forms.CustomerForms;

import cinematicketbookingsystem.Forms.Login;
import cinematicketbookingsystem.Model.Cart;
import cinematicketbookingsystem.Model.Movie;
import cinematicketbookingsystem.Utility;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CinemaHallView extends javax.swing.JFrame {

    /**
     * Creates new form CinemaHallView
     */
    Movie movieData = null;

    public CinemaHallView(int movieId) {
        initComponents();
        movieData = Utility.databaseInteraction.getMoviesDataById(movieId);
        if (movieData == null) {
            JOptionPane.showConfirmDialog(null, "Something went wrong", "Movie Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else {
            lbl_MovieName.setText(movieData.getM_Name());
            lbl_DateTime.setText(movieData.getM_Date().toLocaleString() + " - " + movieData.getM_Time());
            lbl_Price.setText("₪ : " + movieData.getM_Price());
            lbl_HallName.setText(Utility.databaseInteraction.getHallDataById(movieData.getM_HId()).getH_Name());
            lbl_TicketType.setText(Utility.databaseInteraction.getTicketTypeDataById(movieData.getM_TId()).getT_Name());
            ArrayList<Integer> bookedSeat = Utility.databaseInteraction.getAllUserTicketsSeatBookedSeatNumbersByMovieId(movieId);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber1, 50, btn_SeatNumber1.getHeight() - 30);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber2, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber3, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber4, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber5, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber6, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber7, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber8, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber9, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber10, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber11, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber12, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber13, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber14, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber15, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber16, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber17, 50, btn_SeatNumber1.getHeight() - 8);
            scaleImage("MovieImages\\empty.png", btn_SeatNumber18, 50, btn_SeatNumber1.getHeight() - 8);

            for (Integer seatNumber : bookedSeat) {
                switch (seatNumber) {
                    case 1:
                        btn_SeatNumber1.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber1, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 2:
                        btn_SeatNumber2.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber2, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 3:
                        btn_SeatNumber3.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber3, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 4:
                        btn_SeatNumber4.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber4, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 5:
                        btn_SeatNumber5.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber5, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 6:
                        btn_SeatNumber6.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber6, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 7:
                        btn_SeatNumber7.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber7, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 8:
                        btn_SeatNumber8.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber8, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 9:
                        btn_SeatNumber9.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber9, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 10:
                        btn_SeatNumber10.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber10, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 11:
                        btn_SeatNumber11.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber11, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 12:
                        btn_SeatNumber12.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber12, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 13:
                        btn_SeatNumber13.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber13, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 14:
                        btn_SeatNumber14.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber14, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 15:
                        btn_SeatNumber15.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber15, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 16:
                        btn_SeatNumber16.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber6, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 17:
                        btn_SeatNumber17.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber17, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                    case 18:
                        btn_SeatNumber18.setBackground(Color.red);
                        scaleImage("MovieImages\\booked.png", btn_SeatNumber18, 50, btn_SeatNumber1.getHeight() - 8);
                        break;
                }
            }

            for (Cart cart : Utility.cartData) {
                if (cart.getMovie().getM_Id() == movieId) {
                    switch (cart.getSeatNumber()) {
                        case 1:
                            btn_SeatNumber1.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber1, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 2:
                            btn_SeatNumber2.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber2, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 3:
                            btn_SeatNumber3.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber3, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 4:
                            btn_SeatNumber4.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber4, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 5:
                            btn_SeatNumber5.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber5, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 6:
                            btn_SeatNumber6.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber6, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 7:
                            btn_SeatNumber7.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber7, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 8:
                            btn_SeatNumber8.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber8, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 9:
                            btn_SeatNumber9.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber9, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 10:
                            btn_SeatNumber10.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber10, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 11:
                            btn_SeatNumber11.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber11, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 12:
                            btn_SeatNumber12.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber12, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 13:
                            btn_SeatNumber13.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber13, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 14:
                            btn_SeatNumber14.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber14, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 15:
                            btn_SeatNumber15.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber15, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 16:
                            btn_SeatNumber16.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber6, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 17:
                            btn_SeatNumber17.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber17, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                        case 18:
                            btn_SeatNumber18.setBackground(Color.red);
                            scaleImage("MovieImages\\booked.png", btn_SeatNumber18, 50, btn_SeatNumber1.getHeight() - 8);
                            break;
                    }
                }
            }

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_TicketType = new javax.swing.JLabel();
        lbl_MovieName = new javax.swing.JLabel();
        lbl_DateTime = new javax.swing.JLabel();
        lbl_HallName = new javax.swing.JLabel();
        btn_MainView = new javax.swing.JButton();
        btn_Logout = new javax.swing.JButton();
        btn_SeatNumber3 = new javax.swing.JButton();
        btn_SeatNumber1 = new javax.swing.JButton();
        btn_SeatNumber4 = new javax.swing.JButton();
        btn_SeatNumber6 = new javax.swing.JButton();
        btn_SeatNumber2 = new javax.swing.JButton();
        btn_SeatNumber5 = new javax.swing.JButton();
        btn_SeatNumber10 = new javax.swing.JButton();
        btn_SeatNumber9 = new javax.swing.JButton();
        btn_SeatNumber7 = new javax.swing.JButton();
        btn_SeatNumber8 = new javax.swing.JButton();
        btn_SeatNumber14 = new javax.swing.JButton();
        btn_SeatNumber13 = new javax.swing.JButton();
        btn_SeatNumber11 = new javax.swing.JButton();
        btn_SeatNumber12 = new javax.swing.JButton();
        btn_SeatNumber18 = new javax.swing.JButton();
        btn_SeatNumber17 = new javax.swing.JButton();
        btn_SeatNumber15 = new javax.swing.JButton();
        btn_SeatNumber16 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbl_Price = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema Hall View");

        jLabel1.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jLabel1.setText("Cinema Hall View");

        jLabel5.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel5.setText("Hall Name");

        jLabel2.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel2.setText("Movies Name");

        jLabel3.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel3.setText("Ticket Type");

        jLabel4.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel4.setText("Date Time");

        lbl_TicketType.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        lbl_TicketType.setForeground(new java.awt.Color(255, 51, 51));
        lbl_TicketType.setText("Diamond");

        lbl_MovieName.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        lbl_MovieName.setForeground(new java.awt.Color(255, 51, 102));
        lbl_MovieName.setText("Harry Potter");

        lbl_DateTime.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        lbl_DateTime.setForeground(new java.awt.Color(255, 51, 51));
        lbl_DateTime.setText("4 April, 2021 - 10:10:10");

        lbl_HallName.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        lbl_HallName.setForeground(new java.awt.Color(255, 51, 51));
        lbl_HallName.setText("Hall 1");

        btn_MainView.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        btn_MainView.setText("Main");
        btn_MainView.setBorder(new javax.swing.border.MatteBorder(null));
        btn_MainView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MainView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MainViewActionPerformed(evt);
            }
        });

        btn_Logout.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        btn_Logout.setText("Logout");
        btn_Logout.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        btn_SeatNumber3.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber3.setText("Seat No 3");
        btn_SeatNumber3.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber3ActionPerformed(evt);
            }
        });

        btn_SeatNumber1.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinematicketbookingsystem/Icons/empty.png"))); // NOI18N
        btn_SeatNumber1.setText("Seat No 1");
        btn_SeatNumber1.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber1ActionPerformed(evt);
            }
        });

        btn_SeatNumber4.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber4.setText("Seat No 4");
        btn_SeatNumber4.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber4ActionPerformed(evt);
            }
        });

        btn_SeatNumber6.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber6.setText("Seat No 6");
        btn_SeatNumber6.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber6ActionPerformed(evt);
            }
        });

        btn_SeatNumber2.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber2.setText("Seat No 2");
        btn_SeatNumber2.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber2ActionPerformed(evt);
            }
        });

        btn_SeatNumber5.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber5.setText("Seat No 5");
        btn_SeatNumber5.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber5ActionPerformed(evt);
            }
        });

        btn_SeatNumber10.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber10.setText("Seat No 10");
        btn_SeatNumber10.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber10ActionPerformed(evt);
            }
        });

        btn_SeatNumber9.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber9.setText("Seat No 9");
        btn_SeatNumber9.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber9ActionPerformed(evt);
            }
        });

        btn_SeatNumber7.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber7.setText("Seat No 7");
        btn_SeatNumber7.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber7ActionPerformed(evt);
            }
        });

        btn_SeatNumber8.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber8.setText("Seat No 8");
        btn_SeatNumber8.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber8ActionPerformed(evt);
            }
        });

        btn_SeatNumber14.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber14.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber14.setText("Seat No 14");
        btn_SeatNumber14.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber14ActionPerformed(evt);
            }
        });

        btn_SeatNumber13.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber13.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber13.setText("Seat No 13");
        btn_SeatNumber13.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber13ActionPerformed(evt);
            }
        });

        btn_SeatNumber11.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber11.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber11.setText("Seat No 11");
        btn_SeatNumber11.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber11ActionPerformed(evt);
            }
        });

        btn_SeatNumber12.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber12.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber12.setText("Seat No 12");
        btn_SeatNumber12.setToolTipText("");
        btn_SeatNumber12.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber12ActionPerformed(evt);
            }
        });

        btn_SeatNumber18.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber18.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber18.setText("Seat No 18");
        btn_SeatNumber18.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber18ActionPerformed(evt);
            }
        });

        btn_SeatNumber17.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber17.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber17.setText("Seat No 17");
        btn_SeatNumber17.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber17ActionPerformed(evt);
            }
        });

        btn_SeatNumber15.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber15.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber15.setText("Seat No 15");
        btn_SeatNumber15.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber15ActionPerformed(evt);
            }
        });

        btn_SeatNumber16.setBackground(new java.awt.Color(51, 255, 51));
        btn_SeatNumber16.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_SeatNumber16.setText("Seat No 16");
        btn_SeatNumber16.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SeatNumber16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SeatNumber16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SeatNumber16ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel10.setText("Price");

        lbl_Price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_Price.setForeground(new java.awt.Color(255, 51, 51));
        lbl_Price.setText("₪: 123.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_MainView, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_MovieName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_TicketType, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_HallName, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_SeatNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(378, 378, 378)
                                .addComponent(btn_SeatNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_SeatNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SeatNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btn_SeatNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SeatNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_SeatNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SeatNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btn_SeatNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SeatNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_SeatNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SeatNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btn_SeatNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SeatNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_SeatNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SeatNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btn_SeatNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_SeatNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_MainView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_MovieName)
                            .addComponent(jLabel4)
                            .addComponent(lbl_DateTime))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_TicketType)
                            .addComponent(jLabel5)
                            .addComponent(lbl_HallName))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbl_Price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SeatNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SeatNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SeatNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SeatNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_SeatNumber15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SeatNumber18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void scaleImage(String location, JButton button, int width, int height) {
        ImageIcon icon = new ImageIcon(location);
        Image img = icon.getImage();

        Image imgScale = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        button.setIcon(scaledIcon);

    }

    private void btn_MainViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainViewActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainCustomerView().setVisible(true);

    }//GEN-LAST:event_btn_MainViewActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void btn_SeatNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber3ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber3.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 3).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(3)) {
                btn_SeatNumber3.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber3ActionPerformed

    public boolean isMovieAndSeatInCart(int seatNumber) {
        for (Cart cart : Utility.cartData) {
            if (cart.getMovie().getM_Id() == movieData.getM_Id() && cart.getSeatNumber() == seatNumber) {
                Utility.cartData.remove(cart);
                return true;
            }
        }
        return false;
    }

    private void btn_SeatNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber1ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber1.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 1).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(1)) {
                btn_SeatNumber1.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btn_SeatNumber1ActionPerformed

    private void btn_SeatNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber4ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber4.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 4).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(4)) {
                btn_SeatNumber4.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber4ActionPerformed

    private void btn_SeatNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber6ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber6.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 6).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(6)) {
                btn_SeatNumber6.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber6ActionPerformed

    private void btn_SeatNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber2ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber2.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 2).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(2)) {
                btn_SeatNumber2.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber2ActionPerformed

    private void btn_SeatNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber5ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber5.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 5).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(5)) {
                btn_SeatNumber5.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber5ActionPerformed

    private void btn_SeatNumber10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber10ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber10.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 10).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(10)) {
                btn_SeatNumber10.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber10ActionPerformed

    private void btn_SeatNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber9ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber9.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 9).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(9)) {
                btn_SeatNumber9.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber9ActionPerformed

    private void btn_SeatNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber7ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber7.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 7).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(7)) {
                btn_SeatNumber7.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber7ActionPerformed

    private void btn_SeatNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber8ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber8.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 8).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(8)) {
                btn_SeatNumber8.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber8ActionPerformed

    private void btn_SeatNumber14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber14ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber14.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 14).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(14)) {
                btn_SeatNumber14.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber14ActionPerformed

    private void btn_SeatNumber13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber13ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber13.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 13).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(13)) {
                btn_SeatNumber13.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber13ActionPerformed

    private void btn_SeatNumber11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber11ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber11.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 11).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(11)) {
                btn_SeatNumber11.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber11ActionPerformed

    private void btn_SeatNumber12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber12ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber12.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 12).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(12)) {
                btn_SeatNumber12.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber12ActionPerformed

    private void btn_SeatNumber18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber18ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber18.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 18).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(18)) {
                btn_SeatNumber18.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber18ActionPerformed

    private void btn_SeatNumber17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber17ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber17.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 17).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(17)) {
                btn_SeatNumber17.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber17ActionPerformed

    private void btn_SeatNumber15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber15ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber15.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 155).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(15)) {
                btn_SeatNumber15.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber15ActionPerformed

    private void btn_SeatNumber16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SeatNumber16ActionPerformed
        // TODO add your handling code here:
        if (btn_SeatNumber16.getBackground() != Color.red) {
            this.dispose();
            new CinemaSeatTicketView(movieData.getM_Id(), 16).setVisible(true);
        } else {
            if (isMovieAndSeatInCart(16)) {
                btn_SeatNumber16.setBackground(Color.GREEN);
            } else {
                JOptionPane.showConfirmDialog(null, "This Seat is already booked", "Already Booked Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_SeatNumber16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CinemaHallView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CinemaHallView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CinemaHallView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CinemaHallView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CinemaHallView(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_MainView;
    private javax.swing.JButton btn_SeatNumber1;
    private javax.swing.JButton btn_SeatNumber10;
    private javax.swing.JButton btn_SeatNumber11;
    private javax.swing.JButton btn_SeatNumber12;
    private javax.swing.JButton btn_SeatNumber13;
    private javax.swing.JButton btn_SeatNumber14;
    private javax.swing.JButton btn_SeatNumber15;
    private javax.swing.JButton btn_SeatNumber16;
    private javax.swing.JButton btn_SeatNumber17;
    private javax.swing.JButton btn_SeatNumber18;
    private javax.swing.JButton btn_SeatNumber2;
    private javax.swing.JButton btn_SeatNumber3;
    private javax.swing.JButton btn_SeatNumber4;
    private javax.swing.JButton btn_SeatNumber5;
    private javax.swing.JButton btn_SeatNumber6;
    private javax.swing.JButton btn_SeatNumber7;
    private javax.swing.JButton btn_SeatNumber8;
    private javax.swing.JButton btn_SeatNumber9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_DateTime;
    private javax.swing.JLabel lbl_HallName;
    private javax.swing.JLabel lbl_MovieName;
    private javax.swing.JLabel lbl_Price;
    private javax.swing.JLabel lbl_TicketType;
    // End of variables declaration//GEN-END:variables
}
