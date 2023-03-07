
package v.solution;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.Timer;
import v.SystemUserDetails.SystemUserDetails;


public class Home extends javax.swing.JFrame {

    JpanelLoader jpanelload = new JpanelLoader();
String userId;
    public Home(String Id) {
        userId = Id;
        initComponents();
        this.setExtendedState(Home.MAXIMIZED_BOTH);
        displyaTime();
    }



     public void displyaTime() {

        new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("HH:mm:ss");
                String displaytime = simpleDateFormat.format(new Date());
                String displaydate = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(new Date());

                lbl_date.setText(displaydate);
                lbl_time.setText(displaytime);

            }

        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home_btn_grp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel_load = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(95, 157, 247));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jToggleButton1.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton1);
        jToggleButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/customer2.png"))); // NOI18N
        jToggleButton1.setText("Customer");
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jToggleButton1.setIconTextGap(10);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton2);
        jToggleButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/supplier.png"))); // NOI18N
        jToggleButton2.setText("Supplier");
        jToggleButton2.setIconTextGap(10);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton3);
        jToggleButton3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/product2.png"))); // NOI18N
        jToggleButton3.setText("Product");
        jToggleButton3.setIconTextGap(10);
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton4);
        jToggleButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/employee.png"))); // NOI18N
        jToggleButton4.setText("Employee");
        jToggleButton4.setIconTextGap(10);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton5);
        jToggleButton5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/report.png"))); // NOI18N
        jToggleButton5.setText("Reports");
        jToggleButton5.setIconTextGap(10);

        jToggleButton7.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton7);
        jToggleButton7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/invoice.png"))); // NOI18N
        jToggleButton7.setText("Invoice");
        jToggleButton7.setIconTextGap(10);
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton8);
        jToggleButton8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/sale.png"))); // NOI18N
        jToggleButton8.setText("Sales");
        jToggleButton8.setIconTextGap(10);
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton6.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton6);
        jToggleButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/item.png"))); // NOI18N
        jToggleButton6.setText("Item");
        jToggleButton6.setIconTextGap(10);
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton9.setBackground(new java.awt.Color(93, 167, 219));
        home_btn_grp.add(jToggleButton9);
        jToggleButton9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/buy (2).png"))); // NOI18N
        jToggleButton9.setText("Purchase");
        jToggleButton9.setIconTextGap(10);
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jToggleButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton8)
                .addGap(11, 11, 11)
                .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(23, 70, 162));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(95, 157, 247));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/calendar.png"))); // NOI18N
        jLabel2.setText("DATE   :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(95, 157, 247));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/time.png"))); // NOI18N
        jLabel3.setText("TIME   :");

        lbl_time.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(95, 157, 247));

        lbl_date.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(95, 157, 247));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(573, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_time, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_load.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
        panel_load.setLayout(panel_loadLayout);
        panel_loadLayout.setHorizontalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1304, Short.MAX_VALUE)
        );
        panel_loadLayout.setVerticalGroup(
            panel_loadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panel_load);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        Customer cus = new Customer();
        jpanelload.jPanelLoader(panel_load, cus);
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        // TODO add your handling code here:
        Product prod = new Product();
        jpanelload.jPanelLoader(panel_load, prod);
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
         Supplier sup = new Supplier();
        jpanelload.jPanelLoader(panel_load, sup);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        Employee emp = new Employee();
        jpanelload.jPanelLoader(panel_load, emp);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
       Item item =  new Item();
        jpanelload.jPanelLoader(panel_load, item);
        
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        Sale sale =  new Sale();
        jpanelload.jPanelLoader(panel_load, sale);
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        Invoice invoice =  new Invoice();
        jpanelload.jPanelLoader(panel_load, invoice);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        Purchase purchase =  new Purchase(userId);
        jpanelload.jPanelLoader(panel_load, purchase);
    }//GEN-LAST:event_jToggleButton9ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home("1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup home_btn_grp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_time;
    private javax.swing.JPanel panel_load;
    // End of variables declaration//GEN-END:variables
}
