
package momentFrames;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import moment.Memory;
import daily.moment.app.Validation;
import frams.HomePage;
import frams.PremiumHome;
import user.PremiumUser;
import user.User;
import usersData.UsersData;


public class EditMemoryFrame extends EditMomentFrame implements ActionListener{
  
    private JLabel happinessPoints ,sadnessPoints,location ,happinessPointsValidation,sadnessPointsValidation,locationValidation,header;
    private JTextField happinessPointsText ,sadnessPointsText,locationText;
    JButton saveMoment;
    boolean checkName,checkHappiness,checkSadness,checkLocation,checkDescription,checkRate,checkYear;
    Memory memory;
    int userIndex;
    private final UsersData usersData = UsersData.getUsersData();
    private final User [] users = usersData.getUsers();
    
    public EditMemoryFrame(Memory currentMemory , int userIndex ) {  
        
        this.userIndex = userIndex;
        memory = currentMemory;
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

    
    public void fillText() {
       
       nameText.setText(memory.getMomentName());
       actualYearText.setText(String.valueOf(memory.getActualYear()));
       rateText.setText(String.valueOf(memory.getImportanceRate()));
       happinessPointsText.setText(String.valueOf(memory.getHappinessPoints()));
       sadnessPointsText.setText(String.valueOf(memory.getSadnessPoints()));
       locationText.setText(memory.getLocation());
       descriptionText.setText(memory.getDescription());
    }
     
    
     public void editMemory(Memory memory)
    {
        memory.editMemory(nameText.getText(),Integer.parseInt(actualYearText.getText())
                         ,descriptionText.getText(),Integer.parseInt(rateText.getText()) 
                         ,Integer.parseInt(happinessPointsText.getText()),Integer.parseInt(sadnessPointsText.getText())
                         ,locationText.getText());
    }

    @Override
    protected void backGround() {
         
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/backgroundWelpaper.jpg")));
        cornerBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/corner.jpg")));
        backPanal.add(backgroundLabel);
        backPanal.add(cornerBackground);
        backgroundLabel.setBounds(90,0, 630, 1088);
        cornerBackground.setBounds(0, 0, 95, 1121);
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
      
      
      
    @Override
    public void labelsProperties() {
        //font
        happinessPoints.setFont(new java.awt.Font("Times New Roman", 0, 20));
        sadnessPoints.setFont(new java.awt.Font("Times New Roman", 0, 20));
        location.setFont(new java.awt.Font("Times New Roman", 0, 23));
        happinessPointsValidation.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13));
        sadnessPointsValidation.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13));
        locationValidation.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13));
        header.setFont(new java.awt.Font("Segoe Script", 3, 36)); 
        
        
        //color
        happinessPointsValidation.setForeground(new java.awt.Color(255, 0, 0));
        sadnessPointsValidation.setForeground(new java.awt.Color(255, 0, 0));
        locationValidation.setForeground(new java.awt.Color(255, 0, 0)); 
        header.setForeground(new java.awt.Color(51, 51, 51));
        
        
        
        //Bounds
        happinessPoints.setBounds(110, 510, 180, 40);
        sadnessPoints.setBounds(400, 510, 150, 40);
        location.setBounds(170, 320, 130, 40);
        happinessPointsValidation.setBounds(130, 560, 260, 30);
        sadnessPointsValidation.setBounds(400, 560, 260, 30);
        locationValidation.setBounds(280, 363, 260, 30);
        header.setBounds(290, 50, 200, 200);
    }

     
    
    
    
    
    @Override
    public void addLabels() {
        happinessPoints=new JLabel("Happiness Points");
        sadnessPoints=new JLabel("Sadness Points");
        location=new JLabel("Location");
        happinessPointsValidation=new JLabel();
        sadnessPointsValidation=new JLabel();
        locationValidation=new JLabel();
        header=new JLabel("Memory");
        //add
        backPanal.add(happinessPoints);
        backPanal.add(sadnessPoints);
        backPanal.add(location);
       // backPanal.add(getDescriptionLabel);
        backPanal.add(happinessPointsValidation);
        backPanal.add(sadnessPointsValidation);
        backPanal.add(locationValidation);
        backPanal.add(header);
        
        
        
      
    }

    @Override
    public void textProperties() {
        //Font
        happinessPointsText.setFont(new java.awt.Font("Sylfaen", 0, 20)); 
        sadnessPointsText.setFont(new java.awt.Font("Sylfaen", 0, 20)); 
        locationText.setFont(new java.awt.Font("Sylfaen", 0, 20)); 

        
       //Bound
       happinessPointsText.setBounds(260,510, 80, 40);
       sadnessPointsText.setBounds(530,510, 80, 40);
       locationText.setBounds(280, 320, 260, 40);
;
   
    }

    
    
    @Override
    public void addText() {
        happinessPointsText = new JTextField();
        sadnessPointsText= new JTextField();
        locationText = new  JTextField();
         backPanal.add(happinessPointsText);
         backPanal.add(sadnessPointsText);
         backPanal.add(locationText);

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
    public void hideappearingLabel() {
       locationValidation.show(false);
       sadnessPointsValidation.show(false);
       happinessPointsValidation.show(false);
       nameValidationLabel.show(false);
       actualYearvalidation.show(false);
       rateValidation.show(false);
       descriptionValidation.show(false);
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
    
                         

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        checkName=validationOnlyLetters(nameText,nameValidationLabel);
        checkYear=validationActualYear();
        checkRate=validationPoints(rateText,rateValidation);
        checkLocation=validationspace(locationText, locationValidation);
        checkHappiness=validationPoints(happinessPointsText, happinessPointsValidation);
        checkSadness=validationPoints(sadnessPointsText, sadnessPointsValidation);
        checkDescription=validationDescribtion();
        if(checkName==true && checkYear==true &&checkRate==true && checkLocation==true && checkHappiness==true &&checkSadness==true &&checkDescription==true)
        {
            editMemory(memory);
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


   

    
    
      
    } 
   



  
   
    
    
   
    
    
       
       
    
