
package cinematicketbookingsystem.Forms.CustomerForms;

import cinematicketbookingsystem.Forms.CommonForms.BookingHistory;
import cinematicketbookingsystem.Forms.Login;


public class MainCustomerView extends javax.swing.JFrame {

    /**
     * Creates new form MainCustomerView
     */
    public MainCustomerView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Logout = new javax.swing.JButton();
        btn_Cart = new javax.swing.JButton();
        btn_SearchMovie = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_History = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer View");

        btn_Logout.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        btn_Logout.setText("Logout");
        btn_Logout.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogoutActionPerformed(evt);
            }
        });

        btn_Cart.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        btn_Cart.setText("Cart");
        btn_Cart.setBorder(new javax.swing.border.MatteBorder(null));
        btn_Cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CartActionPerformed(evt);
            }
        });

        btn_SearchMovie.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        btn_SearchMovie.setText("Search Moive");
        btn_SearchMovie.setBorder(new javax.swing.border.MatteBorder(null));
        btn_SearchMovie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_SearchMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchMovieActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jLabel1.setText("Movie Booking");
        jLabel1.setToolTipText("");

        btn_History.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 3, 18)); // NOI18N
        btn_History.setText("History");
        btn_History.setBorder(new javax.swing.border.MatteBorder(null));
        btn_History.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_History.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Cart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_SearchMovie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_History, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_SearchMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Cart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_History, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_LogoutActionPerformed

    private void btn_CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CartActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new CartForm().setVisible(true);
    }//GEN-LAST:event_btn_CartActionPerformed

    private void btn_SearchMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchMovieActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MovieSearch().setVisible(true);
    }//GEN-LAST:event_btn_SearchMovieActionPerformed

    private void btn_HistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HistoryActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new BookingHistory().setVisible(true);
    }//GEN-LAST:event_btn_HistoryActionPerformed

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
            java.util.logging.Logger.getLogger(MainCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainCustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cart;
    private javax.swing.JButton btn_History;
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_SearchMovie;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
