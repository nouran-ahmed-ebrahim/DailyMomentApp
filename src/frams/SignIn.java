
package frams;

import java.awt.*; 
import user.*;
import usersData.UsersData;
import daily.moment.app.Validation;
import javax.swing.JOptionPane;


public class SignIn extends MainFrame {
     UsersData userdata;
     

   
    public SignIn() {

        this.userdata = UsersData.getUsersData();
        Container C = getContentPane();
        C.setBackground(new Color(153 - 153 - 153));
        initComponents();
        unVisible_labels();
    }
     
    private void unVisible_labels() {
        passLabel.setVisible(false);
        userLabel.setVisible(false);
    }
    
    boolean Validate_username = false;
    boolean Validate_password = false;
    
    @SuppressWarnings("unchecked")
    
    public boolean validatePass() {
        try {
            Validation.validationSpace(PasswordText.getText());
            passLabel.setVisible(false);
        } catch (Exception e) {
            passLabel.setText(e.getMessage());
            passLabel.show();
            return false;            
        }
        return true;
    }
    
    public boolean validateUserNickName() {
        try {
            Validation.validationSpace(NickNameText.getText());
            userLabel.setVisible(false);
        } catch (Exception e) {
            userLabel.setText(e.getMessage());
            userLabel.show();
            return false;            
        }
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SignInLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        NickNameText = new javax.swing.JTextField();
        logIn = new javax.swing.JButton();
        PasswordText = new javax.swing.JTextField();
        back = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        SignInLabel.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        SignInLabel.setForeground(new java.awt.Color(0, 102, 102));
        SignInLabel.setText("Sign In");
        jPanel2.add(SignInLabel);
        SignInLabel.setBounds(220, 160, 150, 50);

        UsernameLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(0, 102, 102));
        UsernameLabel.setText("Nick name   ");
        jPanel2.add(UsernameLabel);
        UsernameLabel.setBounds(80, 370, 140, 30);
        jPanel2.add(userLabel);
        userLabel.setBounds(250, 410, 240, 30);

        PasswordLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(0, 102, 102));
        PasswordLabel.setText("Password ");
        jPanel2.add(PasswordLabel);
        PasswordLabel.setBounds(70, 470, 140, 30);
        jPanel2.add(passLabel);
        passLabel.setBounds(250, 520, 250, 30);

        NickNameText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NickNameText.setForeground(new java.awt.Color(0, 102, 102));
        NickNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NickNameTextActionPerformed(evt);
            }
        });
        jPanel2.add(NickNameText);
        NickNameText.setBounds(210, 360, 250, 40);

        logIn.setBackground(new java.awt.Color(248, 230, 224));
        logIn.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        logIn.setForeground(new java.awt.Color(0, 102, 102));
        logIn.setText("log In");
        logIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logInMouseClicked(evt);
            }
        });
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        jPanel2.add(logIn);
        logIn.setBounds(230, 670, 160, 50);

        PasswordText.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PasswordText.setForeground(new java.awt.Color(0, 102, 102));
        jPanel2.add(PasswordText);
        PasswordText.setBounds(210, 460, 260, 40);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/icons8-home-page-55.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel2.add(back);
        back.setBounds(520, 70, 110, 70);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Welpaper.jpg"))); // NOI18N
        backGround.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.add(backGround);
        backGround.setBounds(0, -20, 700, 1120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NickNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NickNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NickNameTextActionPerformed

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
       
    }//GEN-LAST:event_logInActionPerformed

    private void logInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logInMouseClicked
        
        Validate_username = validateUserNickName();
        Validate_password = validatePass();
        
        
        
        if (Validate_username == true&&Validate_password == true){
           int index = userdata.findUser(NickNameText.getText() , PasswordText.getText());
           if(index != -1)
           {
                this.setVisible(false);

                User currentUser = userdata.getUsers()[index] ;

                if (currentUser instanceof OrdinaryUsers)
                {
                    new HomePage(index).setVisible(true);
                }
                else
                {
                    new PremiumHome(index).setVisible(true);
                }
           }
           else 
           {
               JOptionPane.showMessageDialog(this, "Incorrect username or password" );
           }
           
        }
    }//GEN-LAST:event_logInMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked

      this.setVisible(false);
       new WelcomPage().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NickNameText;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PasswordText;
    private javax.swing.JLabel SignInLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel backGround;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logIn;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
