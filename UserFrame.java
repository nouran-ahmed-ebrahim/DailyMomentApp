
package frams;
import daily.moment.app.Validation;
import user.PremiumUser;
import user.User;
public class UserFrame extends javax.swing.JFrame {
    
         User user;
         boolean checkPassword,checkName,checkNickname;
         
    public UserFrame(User currentUser) {
        initComponents();
        this.setVisible(true);
        hideLabel();
       user= currentUser;
        fillText(user);
       
    }

    private void fillText (User user)
    {
        userNameText.setText(user.getUserName());
        nickNameText.setText(user.getNickName());
        PasswordText.setText(user.getPassword());
    }
    
   
    private void updateData(User user)
    {
        user.fillUserData(userNameText.getText(), PasswordText.getText(), nickNameText.getText());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        userNameText = new javax.swing.JTextField();
        nickNameText = new javax.swing.JTextField();
        PasswordText = new javax.swing.JPasswordField();
        UserNameLabel = new javax.swing.JLabel();
        nickNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        saveInformation = new javax.swing.JButton();
        personImage = new javax.swing.JLabel();
        nameValidationLabel = new javax.swing.JLabel();
        passwordValidationLabel = new javax.swing.JLabel();
        nickNameValidationLabel = new javax.swing.JLabel();
        backIcon = new javax.swing.JLabel();
        cornerBack = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User setting");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 900));
        jPanel1.setLayout(null);

        userNameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(userNameText);
        userNameText.setBounds(260, 440, 270, 40);

        nickNameText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(nickNameText);
        nickNameText.setBounds(260, 640, 270, 40);

        PasswordText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextActionPerformed(evt);
            }
        });
        jPanel1.add(PasswordText);
        PasswordText.setBounds(260, 530, 270, 40);

        UserNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 25)); // NOI18N
        UserNameLabel.setText("Name");
        jPanel1.add(UserNameLabel);
        UserNameLabel.setBounds(140, 440, 90, 34);

        nickNameLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 25)); // NOI18N
        nickNameLabel.setText("Nick Name");
        jPanel1.add(nickNameLabel);
        nickNameLabel.setBounds(110, 640, 140, 34);

        passwordLabel.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 25)); // NOI18N
        passwordLabel.setText("Password");
        jPanel1.add(passwordLabel);
        passwordLabel.setBounds(120, 540, 120, 20);

        saveInformation.setBackground(new java.awt.Color(225, 153, 153));
        saveInformation.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        saveInformation.setText("Save");
        saveInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveInformationActionPerformed(evt);
            }
        });
        jPanel1.add(saveInformation);
        saveInformation.setBounds(270, 830, 130, 40);

        personImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/icons8-user-100 (1).png"))); // NOI18N
        jPanel1.add(personImage);
        personImage.setBounds(230, 130, 350, 240);

        nameValidationLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        nameValidationLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(nameValidationLabel);
        nameValidationLabel.setBounds(260, 490, 300, 20);

        passwordValidationLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        passwordValidationLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(passwordValidationLabel);
        passwordValidationLabel.setBounds(180, 590, 450, 20);

        nickNameValidationLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 13)); // NOI18N
        nickNameValidationLabel.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(nickNameValidationLabel);
        nickNameValidationLabel.setBounds(260, 690, 300, 20);

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/backIcon (2).png"))); // NOI18N
        backIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backIconMouseClicked(evt);
            }
        });
        jPanel1.add(backIcon);
        backIcon.setBounds(0, 40, 80, 80);

        cornerBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/corner.jpg"))); // NOI18N
        jPanel1.add(cornerBack);
        cornerBack.setBounds(0, 0, 80, 1120);

        backgroundImage.setBackground(new java.awt.Color(225, 153, 153));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/backgroundWelpaper.jpg"))); // NOI18N
        backgroundImage.setMaximumSize(new java.awt.Dimension(630, 800));
        backgroundImage.setMinimumSize(new java.awt.Dimension(630, 800));
        backgroundImage.setPreferredSize(new java.awt.Dimension(630, 1000));
        jPanel1.add(backgroundImage);
        backgroundImage.setBounds(80, -60, 630, 1210);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1089, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveInformationActionPerformed
      checkName=validationName();
      checkPassword= validationPassowrd();
      checkNickname=validationNickname();
       if(checkName==true &&checkNickname==true&&checkPassword==true)
       {
           updateData(user);
           this.setVisible(false);
        if (user instanceof PremiumUser)
            {
                new PremiumHome(user.getId()-1).setVisible(true);
            }
            else
            {
                new HomePage(user.getId()-1).setVisible(true);
            }
       }
    }//GEN-LAST:event_saveInformationActionPerformed

    private void PasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextActionPerformed

    private void backIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backIconMouseClicked
           this.setVisible(false);
           
            if (user instanceof PremiumUser)
            {
                new PremiumHome(user.getId()-1).setVisible(true);
            }
            else
            {
                new HomePage(user.getId()-1).setVisible(true);
            }
    }//GEN-LAST:event_backIconMouseClicked

    public boolean validationName() {
      try
       {
            Validation.validationSpace(userNameText.getText());
            Validation.validationOnlyLetters(userNameText.getText());
       }
       catch(Exception exception)
       {
          nameValidationLabel.setText(exception.getMessage());
          
          nameValidationLabel.show();
            return false;
       }
            nameValidationLabel.show(false);
            return true;
    }
    
    
    
     public boolean validationNickname() {
     try
       {
            Validation.validationSpace(nickNameText.getText());
            Validation.validationUpdateNickname(nickNameText.getText() , user.getId()-1);
       }
       catch(Exception exception)
       {
           nickNameValidationLabel.setText(exception.getMessage());
           nickNameValidationLabel.show();
            return false;
       }
           nickNameValidationLabel.show(false);
            return true;
    }
     
     
    public boolean validationPassowrd() {
         try
       {
            Validation.validationSpace(PasswordText.getText());
             Validation.validationPassowrd(PasswordText.getText());
       }
       catch(Exception exception)
       {
           passwordValidationLabel.setText(exception.getMessage());
           passwordValidationLabel.show();
            return false;
       }
           passwordValidationLabel.show(false);
            return true;
    }
    
    
    
   public void hideLabel()
   {
       nameValidationLabel.show(false);
       passwordValidationLabel.show(false);
       nickNameValidationLabel.show(false);
       
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordText;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JLabel backIcon;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel cornerBack;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nameValidationLabel;
    private javax.swing.JLabel nickNameLabel;
    private javax.swing.JTextField nickNameText;
    private javax.swing.JLabel nickNameValidationLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordValidationLabel;
    private javax.swing.JLabel personImage;
    private javax.swing.JButton saveInformation;
    private javax.swing.JTextField userNameText;
    // End of variables declaration//GEN-END:variables
}
