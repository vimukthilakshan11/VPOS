/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v.solution;

import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import v.DB.DB;

/**
 *
 * @author Vimukthi Lakshan
 */
public class Customer extends javax.swing.JPanel {

    /**
     * Creates new form customer
     */
    public Customer() {
        initComponents();
        customerdata();
    }
    ResultSet rs;
    DefaultTableModel dtm;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_status = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_fname = new javax.swing.JTextField();
        txt_lname = new javax.swing.JTextField();
        txt_mobile = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_balance = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_nic = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_note = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rad_active = new javax.swing.JRadioButton();
        rad_inactive = new javax.swing.JRadioButton();
        txt_joingdate = new rojeru_san.componentes.RSDateChooser();
        btn_clear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_customer = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("First Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Last Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mobile Number :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address :");

        txt_fname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_lname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lnameActionPerformed(evt);
            }
        });

        txt_mobile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_add.setBackground(new java.awt.Color(93, 167, 219));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/save.png"))); // NOI18N
        btn_add.setText("Add Customer");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(93, 167, 219));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/update.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(93, 167, 219));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/delete.png"))); // NOI18N
        btn_delete.setText("Delete Selected");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Balance :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("E-Mail :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Joined Date :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("NIC :");

        txt_balance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_balance.setText("0");

        txt_email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_nic.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_note.setColumns(20);
        txt_note.setRows(5);
        jScrollPane1.setViewportView(txt_note);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Note :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Status :");

        grp_status.add(rad_active);
        rad_active.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rad_active.setSelected(true);
        rad_active.setText("Active");

        grp_status.add(rad_inactive);
        rad_inactive.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rad_inactive.setText("Inactive");

        txt_joingdate.setPlaceholder("Select joined Date");

        btn_clear.setBackground(new java.awt.Color(93, 167, 219));
        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/cleaning.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fname, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(txt_lname)
                            .addComponent(txt_mobile)
                            .addComponent(txt_address)
                            .addComponent(txt_nic)
                            .addComponent(txt_joingdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_balance)
                                    .addComponent(txt_email)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(rad_active)
                                        .addGap(10, 10, 10)
                                        .addComponent(rad_inactive)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_nic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txt_joingdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rad_active)
                    .addComponent(rad_inactive))
                .addGap(27, 27, 27)
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(93, 167, 219));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        table_customer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cus. Id", "Name", "Address", "Mobile", "NIC", "Joing Date", "E-Mail", "Balance", "Status"
            }
        ));
        table_customer.setGridColor(new java.awt.Color(93, 167, 219));
        table_customer.setSelectionBackground(new java.awt.Color(93, 167, 219));
        table_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_customerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_customer);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/v/solution/image/satisfaction.png"))); // NOI18N
        jLabel12.setText("CUSTOMER");
        jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Search Customer :");

        txt_search.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lnameActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String query = "SELECT * FROM customer WHERE nic = '" + txt_nic.getText() + "' AND status = '1'";
        int alreadyStatus = 0;
        try {
            rs = DB.search(query);
            if (rs.next()) {
                alreadyStatus = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (alreadyStatus == 0) {
            if (txt_address.getText().equals("") || txt_balance.getText().equals("") || txt_email.getText().equals("") || txt_fname.getText().equals("") || txt_lname.getText().equals("") || txt_mobile.getText().equals("") || txt_nic.getText().equals("") || txt_joingdate.getPlaceholder().equals("Select joined Date")) {
                JOptionPane.showMessageDialog(this, "Missiong Details");
            } else {

                String activeStatus = "";
                if (rad_active.isSelected()) {
                    activeStatus = "1";
                } else {
                    activeStatus = "0";
                }
                String query2 = "INSERT INTO `customer`(`FName`, `LName`, `Address`, `TelephoneNo`, `NIC`, `JoinedDate`, `Email`, `Balance`, `Note`, `ActiveStatus`) VALUES ("
                        + "'" + txt_fname.getText() + "',"
                        + "'" + txt_lname.getText() + "','" + txt_address.getText() + "',"
                        + "'" + txt_mobile.getText() + "','" + txt_nic.getText() + "',"
                        + "'" + txt_joingdate.currentYear + "-" + txt_joingdate.currentMonth + "-" + txt_joingdate.realDay + "','" + txt_email.getText() + "',"
                        + "'" + txt_balance.getText() + "','" + txt_note.getText() + "',"
                        + "'" + activeStatus + "')";
                try {
                    DB.push(query2);
                    JOptionPane.showMessageDialog(this, "successfully saved");
                    clear();
                } catch (Exception ex) {
                    Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "This Customer is Already Exists");
        }


    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        String query = "SELECT * FROM customer WHERE nic = '" + txt_nic.getText() + "' AND status = '1'";
        int alreadyStatus = 0;
        try {
            rs = DB.search(query);
            if (rs.next()) {
                alreadyStatus = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (alreadyStatus == 1) {

            int option = JOptionPane.showConfirmDialog(this, "SURE ?");
            String activeStatus = null;
            if (rad_active.isSelected()) {
                activeStatus = "1";
            } else {
                activeStatus = "0";
            }

            if (option == 0) {

                String query3 = "UPDATE `customer` SET "
                        + "`FName`='" + txt_fname.getText() + "',"
                        + "`LName`='" + txt_lname.getText() + "',"
                        + "`Address`='" + txt_address.getText() + "',"
                        + "`TelephoneNo`='" + txt_mobile.getText() + "',"
                        + "`NIC`='" + txt_nic.getText() + "',"
                        + "`JoinedDate`='" + txt_joingdate.currentYear + "-" + txt_joingdate.currentMonth + "-" + txt_joingdate.realDay + "',"
                        + "`Email`='" + txt_email.getText() + "',"
                        + "`Balance`='" + txt_balance.getText() + "',"
                        + "`Note`='" + txt_note.getText() + "',"
                        + "`ActiveStatus`='" + activeStatus + "' "
                        + "WHERE nic = '" + txt_nic.getText() + "'";

                try {
                    DB.push(query3);
                    JOptionPane.showMessageDialog(this, "Successfully Updated");
                    customerdata();
                    clear();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } else {
            JOptionPane.showMessageDialog(this, "Nothing To Update");
        }


    }//GEN-LAST:event_btn_updateActionPerformed

    private void table_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_customerMouseClicked
        // TODO add your handling code here:
        String activeStatus = "";
        String cId = "";
        int selectedRow = table_customer.getSelectedRow();
        dtm = (DefaultTableModel) table_customer.getModel();
        cId = dtm.getValueAt(selectedRow, 0).toString();
        String query = "SELECT * FROM customer WHERE Id = '" + cId + "' AND status= '1'";
        try {
            rs = DB.search(query);
            if (rs.next()) {
                txt_fname.setText(rs.getString("FName"));
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("JoinedDate"));
                txt_joingdate.setDatoFecha(date);
                txt_lname.setText(rs.getString("LName"));
                txt_address.setText(rs.getString("Address"));
                txt_balance.setText(rs.getString("Balance"));
                txt_email.setText(rs.getString("Email"));
                txt_mobile.setText(rs.getString("TelephoneNo"));
                txt_nic.setText(rs.getString("NIC"));
                txt_note.setText(rs.getString("Note"));
                activeStatus = rs.getString("ActiveStatus");
            }
        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (activeStatus.equals("1")) {
            rad_active.doClick();
        } else {
            rad_inactive.doClick();
        }
    }//GEN-LAST:event_table_customerMouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
        String query = txt_search.getText();
        filtertablesubCat(query);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
         dtm = (DefaultTableModel) table_customer.getModel();
        int r = -1;
        r = table_customer.getSelectedRow();
        if (r == -1) {
            JOptionPane.showMessageDialog(this, "First Select A Customer In A Table");
        } else {
        
        int option = JOptionPane.showConfirmDialog(this, "SURE ?");

        if (option == 0) {
            String cId = null;
            int selectedRow = table_customer.getSelectedRow();
            dtm = (DefaultTableModel) table_customer.getModel();
            cId = dtm.getValueAt(selectedRow, 0).toString();

            String query = "UPDATE customer SET status = '0' WHERE Id = " + cId + "";
            try {
                DB.push(query);
                JOptionPane.showMessageDialog(this, "Successfully Deleted");
                customerdata();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup grp_status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rad_active;
    private javax.swing.JRadioButton rad_inactive;
    private javax.swing.JTable table_customer;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_balance;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fname;
    private rojeru_san.componentes.RSDateChooser txt_joingdate;
    private javax.swing.JTextField txt_lname;
    private javax.swing.JTextField txt_mobile;
    private javax.swing.JTextField txt_nic;
    private javax.swing.JTextArea txt_note;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        txt_fname.setText(null);
        txt_joingdate.setPlaceholder("Select joined Date");
        txt_lname.setText(null);
        txt_address.setText(null);
        txt_balance.setText("0");
        txt_email.setText(null);
        txt_mobile.setText(null);
        txt_nic.setText(null);
        txt_note.setText(null);
        rad_active.doClick();
    }

    private void customerdata() {

        dtm = (DefaultTableModel) table_customer.getModel();
        dtm.setRowCount(0);
        try {

            String query = "SELECT * FROM customer WHERE status = '1'";
            ResultSet rs = DB.search(query);
            while (rs.next()) {

                Vector v = new Vector();
                String ccode = rs.getString("Id");
                String fname = rs.getString("FName");
                String lname = rs.getString("LName");
                String address = rs.getString("address");
                String nic = rs.getString("nic");
                String mobile = rs.getString("TelephoneNo");
                String email = rs.getString("Email");
                String balance = rs.getString("Balance");
                String activestatus = rs.getString("ActiveStatus");

                v.add(ccode);
                v.add(fname + " " + lname);

                v.add(address);
                v.add(nic);
                v.add(mobile);
                v.add(email);
                v.add(mobile);
                v.add(balance);
                v.add(activestatus);

                dtm.addRow(v);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void filtertablesubCat(String query) {
        dtm = (DefaultTableModel) table_customer.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        table_customer.setRowSorter(tr);

        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}
