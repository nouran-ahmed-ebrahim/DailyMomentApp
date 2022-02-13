
package frams;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;


public class ListPanel extends JPanel{

    private JLabel momentName ,momentType ,momnetRate ,MomentYear;

    public ListPanel() {
         
        addComponants();
        LabelsStyle();       
        panalStyle();
       
    }
    public void fillPanel(String momentName, String momentType, String rate, String year) {
        
        this.momentName.setText(momentName);
        this.momentType.setText(momentType);
        this.momnetRate.setText(rate);
        this.MomentYear.setText(year);
    }
      
    private void addComponants()
    {
        momentName = new JLabel();
        momentType = new JLabel();
        momnetRate =new JLabel();
        MomentYear=new JLabel();
        add(momentName);
        add(momentType);
        add(MomentYear);
        add(momnetRate);
    }
    
    private void panalStyle()
    {
        setSize(200, 150); 
        setBackground(new Color(255,206,195));
    }
    
    private void LabelsStyle()
    {
        momentName.setFont(new java.awt.Font("Century Schoolbook", 3, 20));
        momentType.setFont(new java.awt.Font("Century Schoolbook", 3, 20));
        MomentYear.setFont(new java.awt.Font("Century Schoolbook", 3, 20));
        momnetRate.setFont(new java.awt.Font("Century Schoolbook", 3, 20));
        
    }
    
    public String getMomentName() {
        return momentName.getText();
    }

    public String getMomentType() {
        return momentType.getText();
    }

    public String getRate() {
        return momnetRate.getText();
    }

    public String getYear() {
        return MomentYear.getText();
    }

}
