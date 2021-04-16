/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momentFrames;

import frams.HomePage;
import frams.MainFrame;
import frams.PremiumHome;
import moment.Achievement;
import user.PremiumUser;
import user.User;
import usersData.UsersData;

/**i
 *
 * @author PC
 */
public class DisplayAchievement extends MainFrame {

   
    Achievement achievement;
    int userIndex;
    public DisplayAchievement(Achievement a , int userIndex) {
        
        initComponents();
        achievement=a;
        display();
        this.userIndex = userIndex;
       
    }
public void display()
{
     name.setText(achievement.getMomentName());
         descriptionTA.setText(achievement.getDescription());
       actualYear.setText(String.valueOf(achievement.getActualYear()));
       plannedYear.setText(String.valueOf(achievement.getPlannedYear()));
       rateTF.setText(String.valueOf(achievement.getImportanceRate()));
       proudPointsTF.setText(String.valueOf(achievement.getProudPoints()));
       calcHappinesTF.setText(String.valueOf(achievement.CalculateHappiness()));
}
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        achievNameLabel = new javax.swing.JLabel();
        actulYearLabel = new javax.swing.JLabel();
        plannedYearLabel = new javax.swing.JLabel();
        ImportRatePanel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        ProudPointLabel = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        actualYear = new javax.swing.JTextField();
        plannedYear = new javax.swing.JTextField();
        rateTF = new javax.swing.JTextField();
        proudPointsTF = new javax.swing.JTextField();
        calcHappinesTF = new javax.swing.JTextField();
        calcHap = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTA = new javax.swing.JTextArea();
        backGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Your Achievement");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 120, 320, 70);

        achievNameLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        achievNameLabel.setForeground(new java.awt.Color(102, 0, 51));
        achievNameLabel.setText("Achievement Name");
        jPanel1.add(achievNameLabel);
        achievNameLabel.setBounds(70, 240, 170, 20);

        actulYearLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        actulYearLabel.setForeground(new java.awt.Color(102, 0, 51));
        actulYearLabel.setText(" Actual Year");
        jPanel1.add(actulYearLabel);
        actulYearLabel.setBounds(70, 310, 130, 40);

        plannedYearLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        plannedYearLabel.setForeground(new java.awt.Color(153, 0, 51));
        plannedYearLabel.setText("Planned Year");
        jPanel1.add(plannedYearLabel);
        plannedYearLabel.setBounds(70, 390, 140, 30);

        ImportRatePanel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        ImportRatePanel.setForeground(new java.awt.Color(153, 0, 51));
        ImportRatePanel.setText(" Importance Rate");
        jPanel1.add(ImportRatePanel);
        ImportRatePanel.setBounds(70, 470, 160, 30);

        descriptionLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(102, 0, 51));
        descriptionLabel.setText(" Description");
        jPanel1.add(descriptionLabel);
        descriptionLabel.setBounds(80, 670, 130, 40);

        ProudPointLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        ProudPointLabel.setForeground(new java.awt.Color(153, 0, 51));
        ProudPointLabel.setText(" Proud Points");
        jPanel1.add(ProudPointLabel);
        ProudPointLabel.setBounds(70, 530, 150, 40);
        jPanel1.add(name);
        name.setBounds(250, 240, 200, 40);
        name.setEditable(false);
        jPanel1.add(actualYear);
        actualYear.setBounds(250, 320, 120, 50);
        actualYear.setEditable(false);
        jPanel1.add(plannedYear);
        plannedYear.setBounds(250, 390, 120, 50);
        plannedYear.setEditable(false);
        jPanel1.add(rateTF);
        rateTF.setBounds(250, 470, 60, 50);
        rateTF.setEditable(false);
        jPanel1.add(proudPointsTF);
        proudPointsTF.setBounds(250, 540, 60, 50);
        proudPointsTF.setEditable(false);

        calcHappinesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcHappinesTFActionPerformed(evt);
            }
        });
        jPanel1.add(calcHappinesTF);
        calcHappinesTF.setBounds(250, 610, 60, 50);
        calcHappinesTF.setEditable(false);

        calcHap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        calcHap.setForeground(new java.awt.Color(153, 0, 0));
        calcHap.setText("Calc Happiness");
        jPanel1.add(calcHap);
        calcHap.setBounds(80, 610, 130, 30);

        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 102, 102));
        backButton.setText("<-  BackHome");
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(240, 940, 140, 40);

        descriptionTA.setColumns(22);
        descriptionTA.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        descriptionTA.setLineWrap(true);
        descriptionTA.setRows(15);
        jScrollPane2.setViewportView(descriptionTA);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(240, 680, 260, 230);

        backGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Welpaper.jpg"))); // NOI18N
        jPanel1.add(backGroundLabel);
        backGroundLabel.setBounds(0, 0, 670, 1090);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       
        this.setVisible(false);
         if (users[userIndex] instanceof PremiumUser)
            {
                new PremiumHome(userIndex).setVisible(true);
            }
            else
            {
                new HomePage(userIndex).setVisible(true);
            }
    }//GEN-LAST:event_backButtonActionPerformed

    private void calcHappinesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcHappinesTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcHappinesTFActionPerformed

        private final UsersData usersData = UsersData.getUsersData();
        private final User [] users = usersData.getUsers();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImportRatePanel;
    private javax.swing.JLabel ProudPointLabel;
    private javax.swing.JLabel achievNameLabel;
    private javax.swing.JTextField actualYear;
    private javax.swing.JLabel actulYearLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backGroundLabel;
    private javax.swing.JLabel calcHap;
    private javax.swing.JTextField calcHappinesTF;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField plannedYear;
    private javax.swing.JLabel plannedYearLabel;
    private javax.swing.JTextField proudPointsTF;
    private javax.swing.JTextField rateTF;
    // End of variables declaration//GEN-END:variables
}
