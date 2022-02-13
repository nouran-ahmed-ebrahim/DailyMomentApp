package frams;

import user.*;
import usersData.UsersData;
import daily.moment.app.Validation;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JOptionPane;
import user.userFactory.UsersFactory;

public class SignUp extends MainFrame {

    UsersData userdata;
    User user;
    int counter = 0;
    
    public SignUp (){
        this.userdata = UsersData.getUsersData();
        Container C = getContentPane();
        C.setBackground(new Color(153 - 153 - 153));
        initComponents();
        unVisible_labels();
    }
    
    private void unVisible_labels() {
        
        passLabel.setVisible(false);
        nickLabel.setVisible(false);
        userLabel.setVisible(false);
        confirmLabel.setVisible(false);
    }
    
    boolean Validate_username = false;
    boolean Validate_nickname = false;
    boolean Validate_password = false;
    boolean ValidatConfirm = false;
    
    @SuppressWarnings("unchecked")
    
    public boolean Validate_pass() {
        try {
            Validation.validationSpace(Textpassword.getText());
            Validation.validationPassowrd(Textpassword.getText());
            passLabel.setVisible(false);
        } catch (Exception e) {
            passLabel.setText(e.getMessage());
            passLabel.show();
            return false;            
        }
        return true;
    }
    
    private boolean Validate_nick() {
        try {
            Validation.validationSpace(TextNickName.getText());
            Validation.validationNicknameUniquness(TextNickName.getText());
            nickLabel.setVisible(false);
        } catch (Exception e) {
            nickLabel.setText(e.getMessage());
            nickLabel.show();
            return false;
        }
        
        return true;
    }
    
    private boolean ValidateCondfirmPass() {
        try {
          
            Validation.validationSpace(TextConfirmPassword.getText());
            Validation.validationPassowrdConfirmation( Textpassword.getText() ,TextConfirmPassword.getText());
            confirmLabel.setVisible(false);
        } catch (Exception e) {
            confirmLabel.setText(e.getMessage());
            confirmLabel.show();
            return false;            
        }
        return true;
    }
    
    private boolean validateUsername() {
        try {
            Validation.validationSpace(TextUserName.getText());
            Validation.validationOnlyLetters(TextUserName.getText());
            userLabel.setVisible(false);
        } catch (Exception e) {
            userLabel.setText(e.getMessage());
            userLabel.show();
            return false;            
        }
        return true;
    }
    
    private boolean ValidateCard(String credit){
           try {
            Validation.validationSpace(credit);
            Validation.onlyNumber(credit);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() ); 
            return false;            
        }
        return true;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        LabelSignup = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        LabelNickName = new javax.swing.JLabel();
        nickLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        confirmLabel = new javax.swing.JLabel();
        TextUserName = new javax.swing.JTextField();
        TextNickName = new javax.swing.JTextField();
        Textpassword = new javax.swing.JPasswordField();
        TextConfirmPassword = new javax.swing.JPasswordField();
        ordinaryButton = new javax.swing.JButton();
        primeButton = new javax.swing.JButton();
        backHome = new javax.swing.JLabel();
        WallPaper = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Welpaper.jpg"))); // NOI18N
        jLabel1.setText("SignUp");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(214748364, 214748364));

        jPanel1.setLayout(null);

        LabelSignup.setBackground(new java.awt.Color(255, 229, 229));
        LabelSignup.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        LabelSignup.setForeground(new java.awt.Color(0, 102, 102));
        LabelSignup.setText("SignUp");
        jPanel1.add(LabelSignup);
        LabelSignup.setBounds(250, 140, 170, 40);

        UserNameLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        UserNameLabel.setForeground(new java.awt.Color(0, 102, 102));
        UserNameLabel.setText("Username");
        jPanel1.add(UserNameLabel);
        UserNameLabel.setBounds(90, 290, 110, 30);
        jPanel1.add(userLabel);
        userLabel.setBounds(270, 330, 280, 20);

        LabelNickName.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        LabelNickName.setForeground(new java.awt.Color(0, 102, 102));
        LabelNickName.setText("Nickname");
        jPanel1.add(LabelNickName);
        LabelNickName.setBounds(90, 370, 110, 30);
        jPanel1.add(nickLabel);
        nickLabel.setBounds(270, 410, 280, 30);

        PasswordLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(0, 102, 102));
        PasswordLabel.setText("Password");
        jPanel1.add(PasswordLabel);
        PasswordLabel.setBounds(80, 470, 110, 30);
        jPanel1.add(passLabel);
        passLabel.setBounds(280, 510, 300, 30);

        ConfirmPasswordLabel.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        ConfirmPasswordLabel.setForeground(new java.awt.Color(0, 102, 102));
        ConfirmPasswordLabel.setText("Confirm Password");
        jPanel1.add(ConfirmPasswordLabel);
        ConfirmPasswordLabel.setBounds(50, 580, 180, 30);
        jPanel1.add(confirmLabel);
        confirmLabel.setBounds(280, 630, 300, 30);

        TextUserName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextUserName.setForeground(new java.awt.Color(0, 102, 102));
        TextUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(TextUserName);
        TextUserName.setBounds(250, 290, 270, 30);

        TextNickName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TextNickName.setForeground(new java.awt.Color(0, 102, 102));
        TextNickName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNickNameActionPerformed(evt);
            }
        });
        jPanel1.add(TextNickName);
        TextNickName.setBounds(250, 370, 260, 30);

        Textpassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Textpassword.setForeground(new java.awt.Color(0, 102, 102));
        Textpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextpasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Textpassword);
        Textpassword.setBounds(250, 470, 260, 30);

        TextConfirmPassword.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        TextConfirmPassword.setForeground(new java.awt.Color(0, 102, 102));
        TextConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextConfirmPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(TextConfirmPassword);
        TextConfirmPassword.setBounds(260, 580, 250, 30);

        ordinaryButton.setBackground(new java.awt.Color(248, 230, 224));
        ordinaryButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ordinaryButton.setForeground(new java.awt.Color(0, 102, 102));
        ordinaryButton.setText("  ordinary user");
        ordinaryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordinaryButtonMouseClicked(evt);
            }
        });
        ordinaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordinaryButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ordinaryButton);
        ordinaryButton.setBounds(130, 770, 180, 50);

        primeButton.setBackground(new java.awt.Color(248, 230, 224));
        primeButton.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        primeButton.setForeground(new java.awt.Color(0, 102, 102));
        primeButton.setText("prime user");
        primeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                primeButtonMouseEntered(evt);
            }
        });
        primeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeButtonActionPerformed(evt);
            }
        });
        primeButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                primeButtonPropertyChange(evt);
            }
        });
        jPanel1.add(primeButton);
        primeButton.setBounds(330, 770, 170, 50);

        backHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/icons8-home-page-55.png"))); // NOI18N
        backHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHomeMouseClicked(evt);
            }
        });
        jPanel1.add(backHome);
        backHome.setBounds(510, 80, 100, 60);

        WallPaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Welpaper.jpg"))); // NOI18N
        jPanel1.add(WallPaper);
        WallPaper.setBounds(0, 0, 690, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primeButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_primeButtonPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_primeButtonPropertyChange

    private void primeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_primeButtonActionPerformed

    private void primeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeButtonMouseEntered

    }//GEN-LAST:event_primeButtonMouseEntered

    private void primeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primeButtonMouseClicked
       
        Validate_username = validateUsername();
        Validate_nickname = Validate_nick();
        ValidatConfirm = ValidateCondfirmPass();
        Validate_password = Validate_pass();
        boolean validate_credit=false;

        if (Validate_username == true && Validate_nickname == true && ValidatConfirm == true && Validate_password == true) {
            String credit = JOptionPane.showInputDialog(this ,"enter the credit card number");
            validate_credit=ValidateCard(credit);

            if (validate_credit) {
               user = new UsersFactory().getUser("prime");
               user.fillUserData(TextUserName.getText(), Textpassword.getText(), TextNickName.getText());
               userdata.addUser(user);
               int index = User.getNumberOfUser()-1;
               this.setVisible(false);
               new PremiumHome(index).setVisible(true);
            }
                       
        }

    }//GEN-LAST:event_primeButtonMouseClicked

    private void ordinaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordinaryButtonActionPerformed

    }//GEN-LAST:event_ordinaryButtonActionPerformed

    private void ordinaryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordinaryButtonMouseClicked
        
        Validate_username = validateUsername();
        Validate_nickname = Validate_nick();
        ValidatConfirm = ValidateCondfirmPass();
        Validate_password = Validate_pass();

        if (Validate_username == true && Validate_nickname == true && ValidatConfirm == true && Validate_password == true) {
       
            user = new UsersFactory().getUser("ordinary");
            user.fillUserData(TextUserName.getText(), Textpassword.getText(), TextNickName.getText());
            userdata.addUser(user);
            int index = User.getNumberOfUser()-1;
            this.setVisible(false);
            new HomePage(index).setVisible(true);
        }
    }//GEN-LAST:event_ordinaryButtonMouseClicked

    private void TextConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextConfirmPasswordActionPerformed

    private void TextpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextpasswordActionPerformed

    private void TextNickNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNickNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNickNameActionPerformed

    private void TextUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextUserNameActionPerformed

    private void backHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backHomeMouseClicked
       this.setVisible(false);
       new WelcomPage().setVisible(true);
    }//GEN-LAST:event_backHomeMouseClicked
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConfirmPasswordLabel;
    private javax.swing.JLabel LabelNickName;
    private javax.swing.JLabel LabelSignup;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JPasswordField TextConfirmPassword;
    private javax.swing.JTextField TextNickName;
    private javax.swing.JTextField TextUserName;
    private javax.swing.JPasswordField Textpassword;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JLabel WallPaper;
    private javax.swing.JLabel backHome;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nickLabel;
    private javax.swing.JButton ordinaryButton;
    private javax.swing.JLabel passLabel;
    private javax.swing.JButton primeButton;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
