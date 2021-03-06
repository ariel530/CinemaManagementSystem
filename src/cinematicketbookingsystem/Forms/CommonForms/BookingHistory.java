
package cinematicketbookingsystem.Forms.CommonForms;

import cinematicketbookingsystem.Forms.CustomerForms.MainCustomerView;
import cinematicketbookingsystem.Forms.AdminForms.MainAdminView;
import cinematicketbookingsystem.Forms.Login;
import cinematicketbookingsystem.Model.BookedTicketDetail;
import cinematicketbookingsystem.Utility;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class BookingHistory extends javax.swing.JFrame {

    /**
     * Creates new form TransactionHistory
     */
    public BookingHistory() {
        initComponents();
        populateHallData();
    }
    
    private void populateHallData() {
        tbl_BookingData.removeAll();
        ArrayList<BookedTicketDetail> bookedTicketDetails = null;
        if (Utility.currentUsers.getClass().getSimpleName().compareTo("Admin") == 0) {
            bookedTicketDetails = Utility.databaseInteraction.getAllBookedTicketDetail();
            
        } else {
            bookedTicketDetails = Utility.databaseInteraction.getAllBookedTicketDetailByCurrentLoginUser();
        }
        Object[][] data = new Object[bookedTicketDetails.size()][];
        for (int i = 0; i < bookedTicketDetails.size(); i++) {
            data[i] = new Object[]{i + 1, bookedTicketDetails.get(i).getId(), bookedTicketDetails.get(i).getEmail(), ("₪ : " + bookedTicketDetails.get(i).getPrice()), bookedTicketDetails.get(i).getDrinkQuantity(),bookedTicketDetails.get(i).getPopcornQuantity(),   "View"};
        }
        
        String[] columns = {
            "SNO", "Booking Id", "Customer Email", "Price", "Drink Qty","Popcorn Qty",   "View Details"
        };
        
        DefaultTableModel tmodel = new DefaultTableModel(data, columns) {
            @Override
            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }
        };
        
        tbl_BookingData.setModel(tmodel);
        tbl_BookingData.getColumn("View Details").setCellRenderer(new BookingHistory.ButtonRenderer());
        tbl_BookingData.getColumn("View Details").setCellEditor(new BookingHistory.ButtonEditor(new JCheckBox()));
        tbl_BookingData.getColumn("SNO").setMaxWidth(45);
        tbl_BookingData.getColumn("Price").setMaxWidth(95);
        tbl_BookingData.setRowHeight(30);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_MainView = new javax.swing.JButton();
        btn_Logout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_BookingData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hiistory");

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

        tbl_BookingData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_BookingData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Harry Potter", "Hall 1", "1", "04-03-2022 01:01:01", "123"},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "S No", "Name", "Hall ", "Seat Number", "Date Time", "Price"
            }
        ));
        jScrollPane1.setViewportView(tbl_BookingData);

        jLabel2.setFont(new java.awt.Font("Ink Free", 3, 36)); // NOI18N
        jLabel2.setText("Transaction History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(126, 126, 126))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_MainView, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_MainView, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MainViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainViewActionPerformed
        // TODO add your handling code here:
        this.dispose();
        if (Utility.currentUsers.getClass().getSimpleName().compareTo("Admin") == 0) {
            new MainAdminView().setVisible(true);
        } else {
            new MainCustomerView().setVisible(true);
        }
    }//GEN-LAST:event_btn_MainViewActionPerformed

    private void btn_LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_btn_LogoutActionPerformed

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
            java.util.logging.Logger.getLogger(BookingHistory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingHistory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingHistory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingHistory.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Logout;
    private javax.swing.JButton btn_MainView;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_BookingData;
    // End of variables declaration//GEN-END:variables

    class ButtonRenderer extends JButton implements TableCellRenderer {
        
        public ButtonRenderer() {
            setOpaque(true);
        }
        
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            if (isSelected) {
                setForeground(table.getSelectionForeground());
                setBackground(table.getSelectionBackground());
            } else {
                setForeground(table.getForeground());
                setBackground(UIManager.getColor("Button.background"));
            }
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }
    
    class ButtonEditor extends DefaultCellEditor {
        
        protected JButton button;
        private String label;
        private boolean isPushed;
        
        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fireEditingStopped();
                }
            });
        }
        
        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            if (isSelected) {
                button.setForeground(table.getSelectionForeground());
                button.setBackground(table.getSelectionBackground());
            } else {
                button.setForeground(table.getForeground());
                button.setBackground(table.getBackground());
            }
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            isPushed = true;
            //   JOptionPane.showMessageDialog(button, label + ""+table.getModel().getValueAt(row, 1));
            //  Utility.databaseInteraction.delteHallData((int) table.getModel().getValueAt(row, 1));
            new ViewBookingHistoryCart(((int) table.getModel().getValueAt(row, 1))).setVisible(true);
            return button;
        }
        
        @Override
        public Object getCellEditorValue() {
            if (isPushed) {
                //   JOptionPane.showMessageDialog(button, label + ": Ouch!");

            }
            isPushed = false;
            return label;
        }
        
        @Override
        public boolean stopCellEditing() {
            isPushed = false;
            return super.stopCellEditing();
            
        }
    }
}
