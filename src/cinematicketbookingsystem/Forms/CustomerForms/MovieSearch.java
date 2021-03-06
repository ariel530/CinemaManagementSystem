
package cinematicketbookingsystem.Forms.CustomerForms;

import cinematicketbookingsystem.Forms.Login;
import cinematicketbookingsystem.Model.Movie;
import cinematicketbookingsystem.Utility;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MovieSearch extends javax.swing.JFrame {

    /**
     * Creates new form MovieSearch
     */
    ArrayList<Movie> movieList = null;
    
    public MovieSearch() {
        initComponents();
        movieList = Utility.databaseInteraction.getMoviesDataForCustomer();
        populateForm();
    }
    
    public void populateForm() {
        cmb_movieName.removeAllItems();
        if (!movieList.isEmpty()) {
            try {
                for (Movie temp : movieList) {
                    cmb_movieName.addItem(temp.getM_Name());
                }
                cmb_movieName.setSelectedIndex(0);
                //   fillOtherMovieInfo();
                
            } catch (Exception ex) {
                JOptionPane.showConfirmDialog(null, "Something went wrong", "Form Populating Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Currently No movie available to booked!", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void fillOtherMovieInfo() {
        cmb_DateTime.removeAllItems();
        cmb_TicketType.removeAllItems();
        cmb_HallName.removeAllItems();
        btn_Search.setEnabled(false);
        if (!movieList.isEmpty()) {
            try {
                cmb_DateTime.addItem(movieList.get(cmb_movieName.getSelectedIndex()).getM_Date() + " - " + movieList.get(cmb_movieName.getSelectedIndex()).getM_Time());
                cmb_TicketType.addItem(Utility.databaseInteraction.getTicketTypeDataById(movieList.get(cmb_movieName.getSelectedIndex()).getM_TId()).getT_Name());
                cmb_HallName.addItem(Utility.databaseInteraction.getHallDataById(movieList.get(cmb_movieName.getSelectedIndex()).getM_HId()).getH_Name());
                btn_Search.setEnabled(true);
                scaleImage(movieList.get(cmb_movieName.getSelectedIndex()).getM_ImagePath(), lbl_MovieImage, lbl_MovieImage.getWidth(), lbl_MovieImage.getHeight());
            } catch (Exception ex) {
                // JOptionPane.showConfirmDialog(null, ex.getStackTrace(), "Form Populating Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);

            }
        } else {
            JOptionPane.showConfirmDialog(null, "Currently No movie available to booked!", "Error", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void scaleImage(String location, JLabel label, int width, int height) {
        ImageIcon icon = new ImageIcon(location);
        Image img = icon.getImage();
        
        Image imgScale = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        btn_Search = new javax.swing.JButton();
        btn_Logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_MainView = new javax.swing.JButton();
        cmb_HallName = new javax.swing.JComboBox<>();
        cmb_movieName = new javax.swing.JComboBox<>();
        cmb_TicketType = new javax.swing.JComboBox<>();
        cmb_DateTime = new javax.swing.JComboBox<>();
        lbl_MovieImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Movie");

        jLabel1.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jLabel1.setText("Search Movies");

        btn_Search.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 24)); // NOI18N
        btn_Search.setText("Search");
        btn_Search.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel2.setText("Movies Name");

        jLabel3.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel3.setText("Ticket Type");

        jLabel4.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel4.setText("Date Time");

        jLabel5.setFont(new java.awt.Font("Ink Free", 3, 18)); // NOI18N
        jLabel5.setText("Hall Name");

        btn_MainView.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        btn_MainView.setText("Main");
        btn_MainView.setBorder(new javax.swing.border.MatteBorder(null));
        btn_MainView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_MainView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MainViewActionPerformed(evt);
            }
        });

        cmb_HallName.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        cmb_HallName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hall 1", "Hall 2", " " }));

        cmb_movieName.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        cmb_movieName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Harry Potter", "Avengers - End Game" }));
        cmb_movieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_movieNameActionPerformed(evt);
            }
        });

        cmb_TicketType.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        cmb_TicketType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Silver", "Diamond" }));

        cmb_DateTime.setFont(new java.awt.Font("Ink Free", 0, 18)); // NOI18N
        cmb_DateTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 April", "2021 - 10:10:10" }));

        lbl_MovieImage.setText("                   Movie Image");
        lbl_MovieImage.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        lbl_MovieImage.setMaximumSize(new java.awt.Dimension(22, 77));
        lbl_MovieImage.setMinimumSize(new java.awt.Dimension(22, 77));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_HallName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_movieName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_TicketType, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_MovieImage, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_MainView, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Logout, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btn_MainView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmb_movieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmb_TicketType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmb_DateTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmb_HallName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_MovieImage, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CinemaHallView(movieList.get(cmb_movieName.getSelectedIndex()).getM_Id()).setVisible(true);

    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void btn_MainViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainViewActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainCustomerView().setVisible(true);
    }//GEN-LAST:event_btn_MainViewActionPerformed

    private void cmb_movieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_movieNameActionPerformed
        // TODO add your handling code here:
        fillOtherMovieInfo();
    }//GEN-LAST:event_cmb_movieNameActionPerformed

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
            java.util.logging.Logger.getLogger(MovieSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_MainView;
    private javax.swing.JButton btn_Search;
    private java.awt.Choice choice1;
    private javax.swing.JComboBox<String> cmb_DateTime;
    private javax.swing.JComboBox<String> cmb_HallName;
    private javax.swing.JComboBox<String> cmb_TicketType;
    private javax.swing.JComboBox<String> cmb_movieName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_MovieImage;
    // End of variables declaration//GEN-END:variables
}
