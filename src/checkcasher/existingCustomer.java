/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkcasher;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.derby.drda.NetworkServerControl;

/**
 *
 * @author deepp
 */
public class existingCustomer extends javax.swing.JFrame {

    /**
     * Creates new form existingCustomer
     */
    public existingCustomer() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        personPicture = new javax.swing.JLabel();
        idPicture = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        feeField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        checkPicture = new javax.swing.JLabel();
        snapBtn = new javax.swing.JButton();
        showcheckBtn = new javax.swing.JButton();
        cashBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        payAmount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        checkamountField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Search Customer ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("First name");

        jLabel3.setText("Contact");

        jLabel7.setText("ID");

        personPicture.setBackground(new java.awt.Color(153, 255, 255));
        personPicture.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 0)));

        idPicture.setBackground(new java.awt.Color(153, 255, 255));
        idPicture.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 0)));

        searchBtn.setBackground(new java.awt.Color(255, 255, 0));
        searchBtn.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        backBtn.setText("< Back ");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Fee Percentage");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("%");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Date ");

        checkPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        snapBtn.setText("Snap");
        snapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snapBtnActionPerformed(evt);
            }
        });

        showcheckBtn.setText("Select");
        showcheckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showcheckBtnActionPerformed(evt);
            }
        });

        cashBtn.setBackground(new java.awt.Color(0, 255, 51));
        cashBtn.setText("Cash it !");
        cashBtn.setPreferredSize(new java.awt.Dimension(71, 23));
        cashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Pay amount");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("$");

        payAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        payAmount.setForeground(new java.awt.Color(255, 0, 0));
        payAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        payAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setText("Enter check details");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("$");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Check Amount");

        checkamountField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkamountFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(personPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(snapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(showcheckBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(payAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cashBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))))))
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(411, 411, 411)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53)
                        .addComponent(feeField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkamountField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(dateField))))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkamountField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(feeField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snapBtn)
                            .addComponent(showcheckBtn))
                        .addGap(18, 18, 18)
                        .addComponent(cashBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchBtn)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //Date and Time
    DateFormat df = new SimpleDateFormat("MM/dd/yyyy.hh:mm:ss");
    Date da = new Date();
    String todaysDate = df.format(da).substring(0,10);
    String fixedFee = "2"; //change default fee here.

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new mainMenu().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            String host = "jdbc:derby://localhost:1527/checkCasherDB";
            String username = "deep";
            String password = "deep";
   
            Connection con;
            con = DriverManager.getConnection("jdbc:derby:checkCasherDB;create=true;user=deep;password=deep");      
            System.setProperty("derby.system.home", "/home/janbodnar/.derby");
            String contact;
            boolean check;
            int id ;
            Image personimage, idimage;           
            contact = contactField.getText().toUpperCase();
                                               
            String selectName = "SELECT * FROM customers WHERE contact = ?";         
            PreparedStatement pstmt = null;
            pstmt = con.prepareStatement(selectName);           
            pstmt.setString(1, contact);                                         
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                do {
                    int idNo = rs.getInt("id");
                    String idString;
                    idString = Integer.toString(idNo);
                    String fname;
                    byte[] personPic = rs.getBytes("personsnap");
                    byte[] idPic = rs.getBytes("idsnap");
                    fname= rs.getString("firstname");
                    
                   
                    
                    firstnameField.setText(fname);
                    
                                       
                    idField.setText(idString);
                   
                    personimage = Toolkit.getDefaultToolkit().createImage(personPic);
                    Image pimage = personimage.getScaledInstance(personPicture.getWidth(), personPicture.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon pimageIcon = new ImageIcon(pimage);
                    personPicture.setIcon(pimageIcon);

                    idimage = Toolkit.getDefaultToolkit().createImage(idPic);
                    Image iimage = idimage.getScaledInstance(idPicture.getWidth(), idPicture.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon iimageIcon = new ImageIcon(iimage);
                    idPicture.setIcon(iimageIcon);
                    
                    System.out.println("Retrieved Data!!!!!!!");

                    // successfully in. do the right things.
                } while (rs.next());
            snapBtn.setEnabled(true);                          
            }
            else {
                JOptionPane.showMessageDialog(null, "No such customer found !");
                System.out.println("no data");
                // no results back. warn the user.
            }
            rs.close();                       // Close the ResultSet       
            pstmt.close();
           
        }catch (SQLException ex) {
            Logger.getLogger(existingCustomer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error in connectivity");
        } catch (Exception ex) {
            Logger.getLogger(existingCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
// TODO add your handling code here:
                          
                                        
// TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        idField.setEditable(false);
        cashBtn.setEnabled(false);
        snapBtn.setEnabled(false);
        showcheckBtn.setEnabled(false);
        dateField.setEditable(false);        
        dateField.setText(todaysDate);
        feeField.setText(fixedFee);
        firstnameField.setEditable(false);

    }//GEN-LAST:event_formWindowOpened

    private void checkamountFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkamountFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkamountFieldActionPerformed

    private void snapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snapBtnActionPerformed
        new videoCapture2().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        showcheckBtn.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_snapBtnActionPerformed
    private static java.sql.Timestamp getCurrentTimeStamp() {

        java.util.Date today = new java.util.Date();
        return new java.sql.Timestamp(today.getTime());
    }
    private void showcheckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showcheckBtnActionPerformed
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("check.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(checkPicture.getWidth(), checkPicture.getHeight(),
        Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(dimg);
        checkPicture.setIcon(imageIcon);             
        cashBtn.setEnabled(true);      // TODO add your handling code here:
    }//GEN-LAST:event_showcheckBtnActionPerformed

    private void cashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashBtnActionPerformed
        try {
            String host = "jdbc:derby://localhost:1527/checkCasherDB";
            String username = "deep";
            String password = "deep";
         
            Connection con;
            con = DriverManager.getConnection("jdbc:derby:checkCasherDB;create=true;user=deep;password=deep");      
            System.setProperty("derby.system.home", "/home/janbodnar/.derby");
            double checkAmount, paidAmount, fee;
            DecimalFormat formatter = new DecimalFormat("#0.00");
            String checkValue, feeValue, idString, amountPaid;
            int id;
            InputStream is;
            is = new FileInputStream(new File("check.jpg"));
            checkValue = checkamountField.getText();
            checkAmount = 0;
            fee = 0;            
            try {
                checkAmount = Double.parseDouble(formatter.format(Double.parseDouble(checkValue)));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Check amount value not Valid");
            }
            feeValue = feeField.getText();
            try {
                fee = Double.parseDouble(feeValue);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Fee value not Valid");
            }
            idString = idField.getText();
            id = Integer.parseInt(idString);
            
            paidAmount = checkAmount - (checkAmount * fee)/100;
            paidAmount= Double.parseDouble(formatter.format(paidAmount));
            amountPaid = Double.toString(paidAmount);                       
            PreparedStatement pstmt;
            pstmt = con.prepareStatement("INSERT INTO checks VALUES(?,?,?,?,?)");
            pstmt.setInt(1, id);
            pstmt.setBinaryStream(2, is);
            pstmt.setTimestamp(3, getCurrentTimeStamp());
            pstmt.setDouble(4, checkAmount);
            pstmt.setDouble(5, paidAmount);
            pstmt.executeUpdate();
            if(!amountPaid.equals("0")){
                 payAmount.setText(amountPaid);
            }
            else{
                JOptionPane.showMessageDialog(null, "Error");
            }
           
            //JOptionPane.showMessageDialog(null, "--- Check Cashed ---");
            pstmt.close();
            is.close();
            con.close();
           
            cashBtn.setEnabled(false);
            showcheckBtn.setEnabled(false);
            snapBtn.setEnabled(false);

        } catch (SQLException ex) {
            Logger.getLogger(newCustomer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(existingCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(existingCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(existingCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_cashBtnActionPerformed

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
            java.util.logging.Logger.getLogger(existingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(existingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(existingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(existingCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new existingCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cashBtn;
    private javax.swing.JLabel checkPicture;
    private javax.swing.JTextField checkamountField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField feeField;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idPicture;
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
    private javax.swing.JLabel payAmount;
    private javax.swing.JLabel personPicture;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton showcheckBtn;
    private javax.swing.JButton snapBtn;
    // End of variables declaration//GEN-END:variables
}
