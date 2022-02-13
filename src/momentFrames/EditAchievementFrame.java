
package momentFrames;

import daily.moment.app.Validation;
import frams.HomePage;
import frams.PremiumHome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import moment.Achievement;
import user.PremiumUser;
import user.User;
import usersData.UsersData;


public class EditAchievementFrame extends EditMomentFrame implements ActionListener{

     private JLabel proudPoints ,plannedYear,proudPointsValidation,plannedYearValidation,header;
     private JTextField plannedYearText ,proudPointsText;
     JButton saveMoment;
     boolean checkName,checkLocation,checkDescription,checkRate,checkYear,checkProudPoints,checkPlannedYear;
     Achievement achievement;
     int userIndex;
    
        private final UsersData usersData = UsersData.getUsersData();
        private final User [] users = usersData.getUsers();
    
    public EditAchievementFrame(Achievement currentAchievement, int userIndex) {
       
        this.userIndex =userIndex;
       achievement = currentAchievement;
        addLabels();
        addText();
        textProperties();
        labelsProperties();
        savaButtonProperties();
        hideappearingLabel();
        backIcon();
        backGround(); 
        fillText();
    }

    
    
      public void fillText( ) {
          
       nameText.setText(achievement.getMomentName());
       actualYearText.setText(String.valueOf(achievement.getActualYear()));
       rateText.setText(String.valueOf(achievement.getImportanceRate()));   
       plannedYearText.setText(String.valueOf(achievement.getPlannedYear()));
       proudPointsText.setText(String.valueOf(achievement.getProudPoints()));
       descriptionText.setText(achievement.getDescription());
    }
     
    
     public void editAchievement(Achievement achievement)
    {  
       achievement.editAchievement(nameText.getText(),Integer.parseInt(actualYearText.getText())
                                    ,descriptionText.getText(),Integer.parseInt(rateText.getText())
                                    , Integer.parseInt(proudPointsText.getText()), Integer.parseInt(plannedYearText.getText()));

    }
    
      
      
      
    
    @Override
    public void addLabels() {
       
       
        plannedYear=new JLabel("Planned Year");
        proudPoints=new JLabel("Proud Points");
        plannedYearValidation=new JLabel();
        proudPointsValidation=new JLabel();
        header=new JLabel("Achievement");
        
        //add
        backPanal.add(plannedYear);
        backPanal.add(proudPoints);
        backPanal.add(plannedYearValidation);
        backPanal.add(proudPointsValidation);
        backPanal.add(header);
       
    }

    
    
    @Override
    public void addText() {
        plannedYearText = new JTextField();
        proudPointsText= new JTextField();
    
        
        
        //add
        backPanal.add(plannedYearText);
        backPanal.add(proudPointsText);
       
    }
    
    
    
    
  @Override
    public void textProperties() {
        
        
        //font
        plannedYearText.setFont(new java.awt.Font("Sylfaen", 0, 20)); 
        proudPointsText.setFont(new java.awt.Font("Sylfaen", 0, 20));
        
       
        //Bound
        plannedYearText.setBounds(530,410, 80, 40);
        proudPointsText.setBounds(260,530, 80, 40);
        nameText.setBounds(280, 300, 260,40);
        rateText.setBounds(530,530, 80, 40);
      
    }
    
     @Override
    public void labelsProperties() {
       plannedYear.setFont(new java.awt.Font("Times New Roman", 0, 20));
       proudPoints.setFont(new java.awt.Font("Times New Roman", 0, 20));
       header.setFont(new java.awt.Font("Segoe Script", 3, 36)); 
        //color
       proudPointsValidation.setForeground(new java.awt.Color(255, 0, 0));
       plannedYearValidation.setForeground(new java.awt.Color(255, 0, 0));
    
       
       
       
       
       
        plannedYear.setBounds(390,410,150,40);
        proudPoints.setBounds(150, 530, 150, 40);
        plannedYearValidation.setBounds(400, 460, 260, 30);
        proudPointsValidation.setBounds(150, 580, 260, 30);
        rateValidation.setBounds(410, 580, 260, 30);
        header.setBounds(235, 90, 270, 200);
        momentName.setBounds(170,300,100,40);
        nameValidationLabel.setBounds(295,210 ,262 ,300);
        momentRate.setBounds(390, 530, 150, 40);
    }
    
    
    @Override
    public void hideappearingLabel() {
        nameValidationLabel.show(false);
        actualYearvalidation.show(false);
        rateValidation.show(false);
        descriptionValidation.show(false);
    }
    

    @Override
    public void savaButtonProperties() {
        saveMoment=new JButton("Save");
        saveMoment.setBackground(new java.awt.Color(255, 153, 153));
        saveMoment.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); 
        saveMoment.setBounds(280, 900, 140, 40);
        
        //action
        saveMoment.addActionListener(this);
        //Add Button
        backPanal.add(saveMoment);
    }

   @Override
    public void backGround() {
        
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/backgroundWelpaper.jpg")));
        cornerBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/corner.jpg")));
        backPanal.add(backgroundLabel);
        backPanal.add(cornerBackground);
        backgroundLabel.setBounds(90,0, 630, 1088);
        cornerBackground.setBounds(0, 0, 95, 1121);
    }
     public boolean validationOnlyLetters(JTextField text,JLabel validation) {
        
          try
          {
              Validation.validationSpace(text.getText());
              Validation.validationOnlyLetters(text.getText());
          }
          catch(Exception exception)
          {
            validation.setText(exception.getMessage());
            validation.show();
            return false;
          }
          
            validation.show(false); 
            return true;
      }
     
     
    public boolean validationActualYear() {
        
        try
        {
            Validation.validationSpace(actualYearText.getText());
            Validation.ValidateYear(actualYearText.getText());
            Validation.ValidateActualYears(actualYearText.getText());
        }
        catch(Exception exception)
        {
             actualYearvalidation.setText(exception.getMessage());
             actualYearvalidation.show(true);
             return false;
        }
             actualYearvalidation.show(false);
             return true;
    }
    
    public boolean validationPlannedYear() {
        try
        {
            Validation.validationSpace(plannedYearText.getText());
            Validation.ValidateYear(plannedYearText.getText());
        }
        catch(Exception exception)
        {
             plannedYearValidation.setText(exception.getMessage());
             plannedYearValidation.show(true);
             return false;
        }
        plannedYearValidation.show(false);
        return true;
    }
        
        
     public boolean validationspace(JTextField text,JLabel validation) {
       try
       {
            Validation.validationSpace(text.getText());
       }
       catch(Exception exception)
       {
           validation.setText(exception.getMessage());
            validation.show();
            return false;
       }
            validation.show(false);
            return true;
       
    }
     
      public boolean validationPoints(JTextField point, JLabel validation) {
            
            try
            {
                Validation.validationSpace(point.getText());
                Validation.validationPoints(point.getText()); 
            }
            catch(Exception exception)
            {
            validation.setText(exception.getMessage());
            validation.show(true);
            return false;
            }
            validation.show(false); 
            return true;
        }
     
     
      public boolean validationDescribtion() {
       try
       {
            Validation.validationSpace(descriptionText.getText());
       }
       catch(Exception exception)
       {
           descriptionValidation.setText(exception.getMessage());
           descriptionValidation.show();
            return false;
       }
            descriptionValidation.show(false);
            return true;
       
    }
     
     
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    checkName=validationOnlyLetters(nameText,nameValidationLabel);
    checkYear=validationActualYear();
    checkRate=validationPoints(rateText,rateValidation);
    checkPlannedYear=validationPlannedYear();
    checkProudPoints=validationPoints(proudPointsText, proudPointsValidation);
    checkDescription=validationDescribtion();
    
    
    if(checkName == true && checkYear == true && checkRate==true  && checkPlannedYear==true && checkProudPoints==true && checkDescription==true)
    {
        editAchievement(achievement);
        this.setVisible(false);
         if (users[userIndex] instanceof PremiumUser)
            {
                new PremiumHome(userIndex).setVisible(true);
            }
            else
            {
                new HomePage(userIndex).setVisible(true);
            }
    }
  }
      private void backIcon()
    {
          backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/backIcon (2).png"))); 
          backPanal.add(backIcon);
          backIcon.setBounds(0, 30, 70, 70);
          backIcon.addMouseListener(new java.awt.event.MouseAdapter() { 
              public void mouseClicked(java.awt.event.MouseEvent evt)
              {
                  backIconMouseClicked(evt);
              }
});   
    }
   
       private void backIconMouseClicked(java.awt.event.MouseEvent evt) {                                        
          
           this.setVisible(false);
           if (users[userIndex] instanceof PremiumUser)
            {
                new PremiumHome(userIndex).setVisible(true);
            }
            else
            {
                new HomePage(userIndex).setVisible(true);
            }
    }   
      
 }
