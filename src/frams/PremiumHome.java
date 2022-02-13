package frams;

import TimeLine.PremiumTimeLine;
import daily.moment.app.Validation;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.isNaN;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.JPopupMenu;

/**
 *
 * @author Menna Allah
 */
public class PremiumHome extends HomePage {

    public PremiumHome(int UserIndex) {
        super(UserIndex);
        addComponents();
    }

    private void addComponents() {

        rateAverage.setFont(new Font("Segoe Script", 3, 18)); // NOI18N // NOI18N
        rateAverage.setIcon(new ImageIcon(getClass().getResource("/homeFram/average-.png"))); // NOI18N
        rateAverage.setText("Average importance rate");
        rateAverage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rateAverage.addActionListener((ActionEvent evt) -> {
            rateAverageActionPerformed(evt);
        });
        AddMenuItem(rateAverage);

        allMoments.setFont(new Font("Segoe Script", 3, 18)); // NOI18N
        allMoments.setIcon(new ImageIcon(getClass().getResource("/homeFram/check-all.png"))); // NOI18N
        allMoments.setText("For all moments");
        allMoments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allMoments.addActionListener((ActionEvent evt) -> {
            allMomentsActionPerformed(evt);
        });
        Average.add(allMoments);

        inYear.setFont(new Font("Segoe Script", 3, 18)); // NOI18N
        inYear.setIcon(new ImageIcon(getClass().getResource("/homeFram/select-all.png"))); // NOI18N
        inYear.setText("In a specific year");
        inYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inYear.addActionListener((ActionEvent evt) -> {
            inYearActionPerformed(evt);
        });
        Average.add(inYear);

        topRate.setFont(new Font("Segoe Script", 3, 18)); // NOI18N
        topRate.setIcon(new ImageIcon(getClass().getResource("/homeFram/star.png"))); // NOI18N
        topRate.setText("Top rated moment");
        topRate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        topRate.addActionListener((ActionEvent evt) -> {
            topRateActionPerformed(evt);
        });

        AddMenuItem(topRate);

        leastRate.setFont(new Font("Segoe Script", 3, 18)); // NOI18N
        leastRate.setIcon(new ImageIcon(getClass().getResource("/homeFram/filled-star.png"))); // NOI18N
        leastRate.setText("Least rated moment");
        leastRate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leastRate.addActionListener((ActionEvent evt) -> {
            leastRateActionPerformed(evt);
        });

        AddMenuItem(leastRate);

        happiestMoment.setFont(new Font("Segoe Script", 3, 18)); // NOI18N
        happiestMoment.setIcon(new ImageIcon(getClass().getResource("/homeFram/happy.png"))); // NOI18N
        happiestMoment.setText("Happiest moment");
        happiestMoment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        happiestMoment.addActionListener((ActionEvent evt) -> {
            happiestMomentActionPerformed(evt);
        });

        AddMenuItem(happiestMoment);

        saddestMoment.setFont(new Font("Segoe Script", 3, 18)); // NOI18N
        saddestMoment.setIcon(new ImageIcon(getClass().getResource("/homeFram/sad.png"))); // NOI18N
        saddestMoment.setText("Saddest moment");
        saddestMoment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saddestMoment.addActionListener((ActionEvent evt) -> {
            saddestMomentActionPerformed(evt);
        });
        AddMenuItem(saddestMoment);

    }

    private void rateAverageActionPerformed(ActionEvent evt) {
        Average.show(this, 9, 97);
    }

    void allMomentsActionPerformed(ActionEvent evt) {

        double average = ((PremiumTimeLine) userTimeline).getAverageByRateForAllMoments();
        icon = new ImageIcon(getClass().getResource("/homeFram/average-.png"));

        JOptionPane.showMessageDialog(this, average, "Average for all momments", INFORMATION_MESSAGE, icon);

    }

    void inYearActionPerformed(ActionEvent evt) {

        String year = JOptionPane.showInputDialog(this, "Enter the year", "Average in year", INFORMATION_MESSAGE);
        try {

            Validation.ValidateYear(year);
            Validation.ValidateActualYears(year);
            double average = ((PremiumTimeLine) userTimeline).getAverageByYear(Integer.parseInt(year));

            if (isNaN(average)) {
                icon = new ImageIcon(getClass().getResource("/homeFram/icons8-warning-48.png"));
                JOptionPane.showMessageDialog(this, "The year you entered does not exist", "Invalid year", WARNING_MESSAGE, icon);
            } else {
                icon = new ImageIcon(getClass().getResource("/homeFram/average-.png"));
                JOptionPane.showMessageDialog(this, average, "Average for moments in " + year, INFORMATION_MESSAGE, icon);
            }

        } catch (Exception e) {
            icon = new ImageIcon(getClass().getResource("/homeFram/icons8-warning-48.png"));
            JOptionPane.showMessageDialog(this, e.getMessage(), "Invalid year", WARNING_MESSAGE, icon);
        }

    }

    void topRateActionPerformed(ActionEvent evt) {
       
        if ( status.sorted == 0&& !status.displayHappiest && ! status.displaySaddest  && ! status.displayLRMoment && ! status.filtered)
        { 
             status.displayMRMoment = true;
             TopRate = ((PremiumTimeLine) userTimeline).getTopRated();
             fillWithRate(TopRate);
             stopMRDisplaying.show();
        }
        else
        {
           JOptionPane.showMessageDialog(this, "please , Cancel other operation");          
        }
    }

    void leastRateActionPerformed(ActionEvent evt) {
       
        if ( status.sorted == 0 && ! status.displayHappiest && ! status.displaySaddest && ! status.displayMRMoment && ! status.filtered)
        {
             status.displayLRMoment =  true;
             LeastRate = ((PremiumTimeLine) userTimeline).getleastRate();
             fillWithRate(LeastRate);
             stopLRDisplaying.show();
        }
        else
        {
           JOptionPane.showMessageDialog(this, "please , Cancel other operation");        
        }
    }

    
    void happiestMomentActionPerformed(ActionEvent evt) {
        
        if( status.sorted ==0 && ! status.displaySaddest && ! status.displayMRMoment && ! status.displayLRMoment && ! status.filtered)
        {    
            status.displayHappiest = true;
            HappiestMoment = ((PremiumTimeLine) userTimeline).getHappiestMoment();
            fillWithHappiness(HappiestMoment);
            stopDisplayingHMoment.show();
        }
        else
        {
           JOptionPane.showMessageDialog(this, "please , Cancel other operation");         
        }
    }

    void saddestMomentActionPerformed(ActionEvent evt) {
       
        if( status.sorted ==0 && ! status.displayHappiest && ! status.displayMRMoment && ! status.displayLRMoment && ! status.filtered)
        {
             status.displaySaddest = true;
             SaddestMoment = ((PremiumTimeLine) userTimeline).getLeastHappiness();
             fillWithHappiness(SaddestMoment);
             stopDisplayingSMoment.show();
        }
        else
        {
           JOptionPane.showMessageDialog(this, "please , Cancel other operation");  
        }
    }

    private void fillWithRate(int importanceRate) {
        int momentsCount = 0;
        listModel.removeAllElements();

        TimelineMoments = userTimeline.getTimelineMoments();
        int numOfMomnets = userTimeline.getNumOfMoments();


        for (int index = 0; index < numOfMomnets; index++) {
            if (TimelineMoments[index].getImportanceRate() == importanceRate) {
                currentMoment = new ListPanel();
                fillListPanel(index, TimelineMoments[index].getMomentName(),
                 TimelineMoments[index].getImportanceRate(), TimelineMoments[index].getActualYear());

                listModel.addElement(currentMoment);
                momentsCount++;
            }
        }
           timeLineList.setVisibleRowCount(momentsCount - 1);

    }

    private void fillWithHappiness(int calcHappiness) {
        int momentsCount = 0;
        listModel.removeAllElements();

        TimelineMoments = userTimeline.getTimelineMoments();
        int numOfMomnets = userTimeline.getNumOfMoments();

        for (int index = 0; index < numOfMomnets; index++) {
            if (TimelineMoments[index].getCalcHappiness() == calcHappiness) {
                currentMoment = new ListPanel();

                fillListPanel(index, TimelineMoments[index].getMomentName(),
                        TimelineMoments[index].getImportanceRate(), TimelineMoments[index].getActualYear());

                listModel.addElement(currentMoment);
                momentsCount++;
            }
        }
        timeLineList.setVisibleRowCount(momentsCount - 1);
    }
    
    @Override
     protected void displayHomeBasedOnStatus()
    {
       super.displayHomeBasedOnStatus();
       
       if(status.displayHappiest)
       {
           fillWithHappiness(HappiestMoment);
           stopDisplayingHMoment.show();
       }
       else if(status.displaySaddest)
       {
            fillWithHappiness(SaddestMoment);
            stopDisplayingSMoment.show();
       }
       else if (status.displayMRMoment)
       {
           fillWithRate(TopRate);
           stopMRDisplaying.show();
       }
       else if ( status.displayLRMoment)
       {
           fillWithRate(LeastRate);
           stopLRDisplaying.show();         
       }
       else if ( status.sorted == 0&& !status.displayHappiest && ! status.displaySaddest  
                  && ! status.displayLRMoment && ! status.filtered && ! status.displayMRMoment)
       {
           fillList();
       }
    } 

    private static int HappiestMoment , SaddestMoment , TopRate ,LeastRate;
    private final JPopupMenu Average = new JPopupMenu();
    private final JMenuItem rateAverage = new JMenuItem();
    private final JMenuItem allMoments = new JMenuItem();
    private final JMenuItem inYear = new JMenuItem();
    private final JMenuItem topRate = new JMenuItem();
    private final JMenuItem leastRate = new JMenuItem();
    private final JMenuItem happiestMoment = new JMenuItem();
    private final JMenuItem saddestMoment = new JMenuItem();
    private final JOptionPane dialog = new JOptionPane();
    private Icon icon;
}
