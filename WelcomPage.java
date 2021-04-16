
package frams;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;


public class WelcomPage extends MainFrame {

    
    public WelcomPage() {
               
        initComponents();
        setSize(680, 1070);
        hideAllComponents();
        appearComponants();
    }
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appName = new javax.swing.JLabel();
        signUpIcon = new javax.swing.JLabel();
        signInIcon = new javax.swing.JLabel();
        logInLabel = new javax.swing.JLabel();
        signUplabel = new javax.swing.JLabel();
        quote1 = new javax.swing.JLabel();
        quote2 = new javax.swing.JLabel();
        quote3 = new javax.swing.JLabel();
        quote4 = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        appName.setFont(new java.awt.Font("Segoe Script", 0, 36)); // NOI18N
        appName.setForeground(new java.awt.Color(102, 0, 51));
        appName.setText("Daily Moment");
        getContentPane().add(appName);
        appName.setBounds(160, 130, 300, 90);

        signUpIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/sign up icon.png"))); // NOI18N
        signUpIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpIconMouseClicked(evt);
            }
        });
        getContentPane().add(signUpIcon);
        signUpIcon.setBounds(390, 670, 90, 150);

        signInIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Log in icon.png"))); // NOI18N
        signInIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInIconMouseClicked(evt);
            }
        });
        getContentPane().add(signInIcon);
        signInIcon.setBounds(150, 670, 110, 160);

        logInLabel.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        logInLabel.setText("Log in");
        getContentPane().add(logInLabel);
        logInLabel.setBounds(160, 800, 70, 30);

        signUplabel.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        signUplabel.setText("Sign Up");
        getContentPane().add(signUplabel);
        signUplabel.setBounds(390, 790, 80, 29);

        quote1.setFont(new java.awt.Font("Segoe Script", 1, 26)); // NOI18N
        quote1.setForeground(new java.awt.Color(51, 0, 0));
        quote1.setText("We are  Pieces of what we remamber.");
        getContentPane().add(quote1);
        quote1.setBounds(30, 360, 590, 40);

        quote2.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        quote2.setForeground(new java.awt.Color(51, 0, 51));
        quote2.setText(" We hold the hopes & fears.");
        getContentPane().add(quote2);
        quote2.setBounds(120, 420, 380, 40);

        quote3.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        quote3.setForeground(new java.awt.Color(102, 0, 51));
        quote3.setText("As long as there is memories,");
        getContentPane().add(quote3);
        quote3.setBounds(120, 480, 370, 40);

        quote4.setFont(new java.awt.Font("Segoe Script", 1, 23)); // NOI18N
        quote4.setForeground(new java.awt.Color(153, 0, 51));
        quote4.setText("There is no true loss");
        getContentPane().add(quote4);
        quote4.setBounds(170, 530, 280, 50);

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Welpaper.jpg"))); // NOI18N
        getContentPane().add(Wallpaper);
        Wallpaper.setBounds(0, -30, 681, 1091);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpIconMouseClicked
       try
       {
        this.setVisible(false);
        new SignUp().setVisible(true);
       }
       catch (Exception ex)
       {
            JOptionPane.showMessageDialog(this, ex.getMessage());
       }
        
    }//GEN-LAST:event_signUpIconMouseClicked

    private void signInIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInIconMouseClicked
        this.setVisible(false);
        new SignIn().setVisible(true);
    }//GEN-LAST:event_signInIconMouseClicked

    private void hideAllComponents()
    {
        quote1.setVisible(false);
        quote2.setVisible(false);
        quote3.setVisible(false);
        quote4.setVisible(false);
        signInIcon.setVisible(false);
        logInLabel.setVisible(false);
        signUpIcon.setVisible(false);
        signUplabel.setVisible(false);
    }

    private void appearComponants(){
     
        appearQuote1();
        appearQuote2();
        appearQuote3();
        appearQuote4();
        appearOtherComponants();
    }
   
    private void appearQuote1(){
         
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                quote1.setVisible(true);
            }
        }, 800);
    }
    private void appearQuote2(){
         
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                quote2.setVisible(true);
            }
        }, 1800);
    }
    private void appearQuote3(){
         
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                quote3.setVisible(true);
            }
        }, 2700);
    }
 
    private void appearQuote4(){
         
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                quote4.setVisible(true);
            }
        }, 3600);
    }
     
    private void appearOtherComponants(){
         
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                signInIcon.setVisible(true);
                logInLabel.setVisible(true);
                signUpIcon.setVisible(true);
                signUplabel.setVisible(true);
            }
        }, 4200);
    }
    
    private Timer timer = new Timer();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JLabel appName;
    private javax.swing.JLabel logInLabel;
    private javax.swing.JLabel quote1;
    private javax.swing.JLabel quote2;
    private javax.swing.JLabel quote3;
    private javax.swing.JLabel quote4;
    private javax.swing.JLabel signInIcon;
    private javax.swing.JLabel signUpIcon;
    private javax.swing.JLabel signUplabel;
    // End of variables declaration//GEN-END:variables
}
