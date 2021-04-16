
package momentFrames;

import TimeLine.PremiumTimeLine;
import TimeLine.TimeLine;
import javax.swing.JOptionPane;
import Timeline.*;
import daily.moment.app.Validation;
import frams.HomePage;
import frams.MainFrame;
import frams.PremiumHome;
import moment.*;

public class AddAchievement extends MainFrame {

   private TimeLine timeline ;
   private int userindex;
   private Achievement achievement ;
  
    public AddAchievement( TimeLine timeline , int userindex )
    {
        initComponents( );
       hideWarningLabels ();
        this.timeline = timeline ;
        this.userindex = userindex;                               
    }

   
    @SuppressWarnings("unchecked")
            
    private final void  hideWarningLabels (){
          
           m1.setVisible(false);
           m2.setVisible(false);
           m3.setVisible(false);
           m4.setVisible(false);
           m5.setVisible(false);
           m6.setVisible(false);
           m7.setVisible(false);
           m8.setVisible(false);
           m9.setVisible(false);
           m10.setVisible(false);
           m11.setVisible(false);
           m12.setVisible(false);
    }       
            
   private void filldata (){

      String momentName =  jTextField3 .getText();
      int nameRepeat =  timeline.countNumOfMomentWithSameName(momentName);
      if(nameRepeat>0)
      {
          momentName  = momentName.concat(" "+(nameRepeat+1));
      }
      String description =  jTextArea1.getText()  ;
      int actualyear  =Integer.parseInt(jTextField4.getText()) ;
      int importanceRate =   Integer.parseInt (jTextField6.getText());
      int proudPoints = Integer.parseInt(jTextField2.getText()) ;
      int plannedYear  = Integer.parseInt( jTextField1 .getText()) ;
      achievement = new Achievement ( momentName, description, actualyear , importanceRate , proudPoints ,plannedYear );  
       
    }
         
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        m1 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        m3 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        m5 = new javax.swing.JLabel();
        m6 = new javax.swing.JLabel();
        m7 = new javax.swing.JLabel();
        m8 = new javax.swing.JLabel();
        m9 = new javax.swing.JLabel();
        m10 = new javax.swing.JLabel();
        m11 = new javax.swing.JLabel();
        m12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelIcon = new javax.swing.JLabel();
        BackGroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 0, 0, 960));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Proud points");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 110, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Planned year");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 610, 70, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Achievement name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setText("Actual year");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Description");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 720, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 51));
        jLabel8.setText("Importance Rate");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 180, 40));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 110, 40));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 70, 50));

        Add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 153, 153));
        Add.setText("Add");
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 940, 100, 40));

        jTextArea1.setColumns(22);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(25);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 700, 250, 190));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, -1, -1));

        m1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m1.setForeground(new java.awt.Color(255, 0, 0));
        m1.setText("Please, Enter Letters Only");
        getContentPane().add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, -1, -1));

        m2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        m2.setForeground(new java.awt.Color(255, 0, 0));
        m2.setText("Please , Enter Correct Year");
        getContentPane().add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        m3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m3.setForeground(new java.awt.Color(255, 0, 0));
        m3.setText("This Field Can Not Be Empty ");
        getContentPane().add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 910, -1, -1));

        m4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        m4.setForeground(new java.awt.Color(255, 0, 0));
        m4.setText("Please , Enter Number From 1 To 5");
        getContentPane().add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, 250, 20));

        m5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m5.setForeground(new java.awt.Color(255, 0, 0));
        m5.setText("Please , Enter Number From 1 To 5");
        getContentPane().add(m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, -1, -1));

        m6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m6.setForeground(new java.awt.Color(255, 0, 0));
        m6.setText("Please, Enter Correct Year");
        getContentPane().add(m6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        m7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m7.setForeground(new java.awt.Color(255, 0, 0));
        m7.setText("This Field Can Not Be Empty");
        getContentPane().add(m7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        m8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m8.setForeground(new java.awt.Color(255, 0, 0));
        m8.setText("This Field Can Not Be Empty");
        getContentPane().add(m8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        m9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m9.setForeground(new java.awt.Color(255, 0, 0));
        m9.setText("Please , Enter Letters Only ");
        getContentPane().add(m9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 910, -1, -1));

        m10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m10.setForeground(new java.awt.Color(255, 0, 0));
        m10.setText("This File Can Not Be Empty");
        getContentPane().add(m10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 570, -1, -1));

        m11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m11.setForeground(new java.awt.Color(255, 0, 0));
        m11.setText("This File Can Not Be Empty");
        getContentPane().add(m11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 670, -1, -1));

        m12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        m12.setForeground(new java.awt.Color(255, 0, 0));
        m12.setText("This File Can Not  Be Empty");
        getContentPane().add(m12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Script", 3, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Add Achievement");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 119, 310, 70));

        cancelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Cancel Add.png"))); // NOI18N
        cancelIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelIconMouseClicked(evt);
            }
        });
        getContentPane().add(cancelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        BackGroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Welpaper.jpg"))); // NOI18N
        getContentPane().add(BackGroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 680, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   private boolean name = false;
   private boolean actual_Year = false;
   private boolean rate  = false;
   private boolean Points = false;
   private boolean year = false;
   private boolean name_Space = false;
   private boolean actual_Year_Space  = false;
   private boolean Description_Space  = false;
   private boolean rate_Space  = false;
   private boolean Points_Space  = false;
   private boolean year_Space  = false;
      
    
    private void validate_name() {
        try {
            Validation.validationOnlyLetters(jTextField3.getText());
            m1.setVisible(false);
            name = true;
           }
        catch (Exception e) {
            m1.setText(e.getMessage());
            m1.setVisible(true);
            m7.setVisible(false);
            name = false;
          
        }
          
    }

    private void validateA_year() {
     
        try {
            Validation.ValidateYear(jTextField4.getText());
            Validation.ValidateActualYears(jTextField4.getText());
            m2.setVisible(false);
            actual_Year = true;
          
        } catch (Exception e) {
            m2.setText(e.getMessage());
            m2.setVisible(true);
            m8.setVisible(false);
            actual_Year = false;
           
        }
          
    }


    private void validatrate() {
        try {
            Validation.validationPoints(jTextField6.getText());
            m4.setVisible(false);
            rate = true;
           
        } catch (Exception e) {
            m4.setText(e.getMessage());
            m4.setVisible(true);
            m10.setVisible(false);
            rate = false;
           
        }
         
    }

    private void validatepoints() {
        try {
            Validation.validationPoints(jTextField2.getText());
            m5.setVisible(false);
            Points = true;
           

        } catch (Exception e) {
            m5.setText(e.getMessage());
            m5.setVisible(true);
            m11.setVisible(false);
            Points = false;
        }
    }

   private void validate_plannedYear() {
        try {
            Validation.ValidateYear(jTextField1.getText());
            m6.setVisible(false);
            year = true;
           
        } catch (Exception e) {
            m6.setText(e.getMessage());
            m6.setVisible(true);
            m12.setVisible(false);
            year = false;
          
        }
        
    }

    private void validate_nameSpace() {
        try {
            Validation.validationSpace(jTextField3.getText());
            m7.setVisible(false);
            name_Space = true;
           

        } catch (Exception e) {
            m7.setText(e.getMessage());
            m7.setVisible(true);
            m1.setVisible(false);

            name_Space = false;
       
        }
    }

    private void validate_actualyear_Space() {
        try {
            Validation.validationSpace(jTextField4.getText());
            m8.setVisible(false);
            actual_Year_Space = true;
          
        } catch (Exception e) {
            m8.setText(e.getMessage());
            m8.setVisible(true);
            m2.setVisible(false);
            actual_Year_Space = false;
           
        }
   
    }

    private void validate_descriptionSpace() {
        try {
            Validation.validationSpace(jTextArea1.getText());
            m3.setVisible(false);
            Description_Space = true;
           
        } catch (Exception e) {
            m3.setText(e.getMessage());
            m3.setVisible(true);
            m9.setVisible(false);
            Description_Space = false;
         
        }
         
    }

   private void validate_rateSpace() {
        try {
            Validation.validationSpace(jTextField6.getText());
            m10.setVisible(false);
            rate_Space = true;
         
        } catch (Exception e) {
            m10.setText(e.getMessage());
            m10.setVisible(true);
            m4.setVisible(false);
            rate_Space = false;
           
        }
        
    }

   private void validate_pointsSpace() {
        try {
            Validation.validationSpace(jTextField2.getText());
            m11.setVisible(false);
            Points_Space = true;
          
        } catch (Exception e) {
            m11.setText(e.getMessage());
            m11.setVisible(true);
            m5.setVisible(false);
            Points_Space = false;
           
        }
       
    }

   private void validate_yearSpace() {
        try {
            Validation.validationSpace(jTextField1.getText());
            m12.setVisible(false);
            year_Space = true;
          
        } catch (Exception e) {
            m12.setText(e.getMessage());
            m12.setVisible(true);
            m6.setVisible(false);
            year_Space = false;
          
        }
       
    }
    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
 
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
 
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        validate_name();
        validateA_year();
        validatrate();
        validatepoints();
        validate_plannedYear();
        validate_nameSpace ();
        validate_actualyear_Space();
        validate_descriptionSpace();
        validate_rateSpace();
        validate_pointsSpace();
        validate_yearSpace();
        
       if ( name==true && actual_Year==true &&  rate==true && Points==true && year==true 
            && name_Space==true && actual_Year_Space == true && Description_Space == true 
            && rate_Space==true && Points_Space==true && year_Space==true)
       {  
            filldata();
            timeline.addMoment(achievement);
            this.setVisible(false);
           
            if (timeline instanceof PremiumTimeLine)
            {
                new PremiumHome(userindex).setVisible(true);
            }
            else
            {
                new HomePage(userindex).setVisible(true);
            }
       }
        
   
    }//GEN-LAST:event_AddActionPerformed

    private void cancelIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelIconMouseClicked

        this.setVisible(false);
        if (timeline instanceof PremiumTimeLine)
            {
                new PremiumHome(userindex).setVisible(true);
            }
            else
            {
                new HomePage(userindex).setVisible(true);
            }
    }//GEN-LAST:event_cancelIconMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel BackGroundLabel;
    private javax.swing.JLabel cancelIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m10;
    private javax.swing.JLabel m11;
    private javax.swing.JLabel m12;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private javax.swing.JLabel m5;
    private javax.swing.JLabel m6;
    private javax.swing.JLabel m7;
    private javax.swing.JLabel m8;
    private javax.swing.JLabel m9;
    // End of variables declaration//GEN-END:variables

    private Object jTextArea1getText() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
