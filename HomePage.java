
package frams;

import momentFrames.AddAchievement;
import momentFrames.AddMemory;
import momentFrames.DisplayAchievement;
import momentFrames.EditMemoryFrame;
import momentFrames.EditAchievementFrame;
import TimeLine.TimeLine;
import daily.moment.app.Validation;
import momentFrames.DisplayMemory;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.io.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import moment.Achievement;
import moment.Memory;
import moment.Moment;
import user.PremiumUser;
import user.User;
import usersData.UsersData;



public  class HomePage extends MainFrame {

    public HomePage( int userIndex) {

        this.userIndex = userIndex ;
        currentUser = UsersData.getUsersData().getUser(userIndex);
        userTimeline = currentUser.getUserTimeLine();
        TimelineMoments = userTimeline.getTimelineMoments();
          timelineListBuilding();
          timelineProparity();
          initComponents(); // after  building list to be shown
          frameProparity();
          displayHomeBasedOnStatus();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingMenu = new javax.swing.JPopupMenu();
        options = new javax.swing.JMenuItem();
        userSetting = new javax.swing.JMenuItem();
        logOut = new javax.swing.JMenuItem();
        FiltertOptions = new javax.swing.JPopupMenu();
        filterAboveRate = new javax.swing.JMenuItem();
        filterBelowRate = new javax.swing.JMenuItem();
        optios = new javax.swing.JPopupMenu();
        addMoment = new javax.swing.JMenuItem();
        sort = new javax.swing.JMenuItem();
        filter = new javax.swing.JMenuItem();
        SortOptions = new javax.swing.JPopupMenu();
        sortAscending = new javax.swing.JMenuItem();
        sortDescending = new javax.swing.JMenuItem();
        momentOptions = new javax.swing.JPopupMenu();
        displayMoment = new javax.swing.JMenuItem();
        editMoment = new javax.swing.JMenuItem();
        deleteMoment = new javax.swing.JMenuItem();
        AddMomentOptions = new javax.swing.JPopupMenu();
        AddMemory = new javax.swing.JMenuItem();
        AddAchievement = new javax.swing.JMenuItem();
        Titel = new javax.swing.JLabel();
        titel2 = new javax.swing.JLabel();
        clearYearFilter = new javax.swing.JLabel();
        clearSort = new javax.swing.JLabel();
        filterYear = new javax.swing.JLabel();
        clearOrdinaryFilter = new javax.swing.JLabel();
        menu = new javax.swing.JLabel();
        CornarPanal = new javax.swing.JLabel();
        stopMRDisplaying = new javax.swing.JLabel();
        stopDisplayingHMoment = new javax.swing.JLabel();
        stopLRDisplaying = new javax.swing.JLabel();
        stopDisplayingSMoment = new javax.swing.JLabel();
        HomePanal = new javax.swing.JLabel();
        cornerPanal = new javax.swing.JPanel();

        options.setFont(new java.awt.Font("Segoe Script", 3, 15)); // NOI18N
        options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/icons8-service-64.png"))); // NOI18N
        options.setText("options");
        options.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsActionPerformed(evt);
            }
        });
        settingMenu.add(options);

        userSetting.setFont(new java.awt.Font("Segoe Script", 3, 14)); // NOI18N
        userSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/icons8-edit-user-100.png"))); // NOI18N
        userSetting.setText("User setting");
        userSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSettingActionPerformed(evt);
            }
        });
        settingMenu.add(userSetting);

        logOut.setFont(new java.awt.Font("Segoe Script", 3, 15)); // NOI18N
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/icons8-change-user-80.png"))); // NOI18N
        logOut.setText("Log Out");
        logOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        settingMenu.add(logOut);

        FiltertOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        filterAboveRate.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        filterAboveRate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/filter above.png"))); // NOI18N
        filterAboveRate.setText("Fiter Above Rate");
        filterAboveRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterAboveRateActionPerformed(evt);
            }
        });
        FiltertOptions.add(filterAboveRate);

        filterBelowRate.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        filterBelowRate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/filter below.png"))); // NOI18N
        filterBelowRate.setText("filterBelowRate");
        filterBelowRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBelowRateActionPerformed(evt);
            }
        });
        FiltertOptions.add(filterBelowRate);

        optios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addMoment.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        addMoment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/add moment.png"))); // NOI18N
        addMoment.setText("Add Moment");
        addMoment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMomentActionPerformed(evt);
            }
        });
        optios.add(addMoment);

        sort.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        sort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/sort.png"))); // NOI18N
        sort.setText("Soret by rate");
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });
        optios.add(sort);

        filter.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        filter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/filter.png"))); // NOI18N
        filter.setText("Filter");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });
        optios.add(filter);

        SortOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        sortAscending.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        sortAscending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/sort Asc.png"))); // NOI18N
        sortAscending.setText("Sort Ascending");
        sortAscending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortAscendingActionPerformed(evt);
            }
        });
        SortOptions.add(sortAscending);

        sortDescending.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        sortDescending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/Sort desc.png"))); // NOI18N
        sortDescending.setText("Sort Descending");
        sortDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortDescendingActionPerformed(evt);
            }
        });
        SortOptions.add(sortDescending);

        momentOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        displayMoment.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        displayMoment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/display.png"))); // NOI18N
        displayMoment.setText("Display Moment");
        displayMoment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayMomentActionPerformed(evt);
            }
        });
        momentOptions.add(displayMoment);

        editMoment.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        editMoment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/edit.png"))); // NOI18N
        editMoment.setText("Edit Moment");
        editMoment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMomentActionPerformed(evt);
            }
        });
        momentOptions.add(editMoment);

        deleteMoment.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        deleteMoment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/delete.png"))); // NOI18N
        deleteMoment.setText("Delete Moment");
        deleteMoment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMomentActionPerformed(evt);
            }
        });
        momentOptions.add(deleteMoment);

        AddMomentOptions.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        AddMomentOptions.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        AddMemory.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        AddMemory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/memory.png"))); // NOI18N
        AddMemory.setText("Add Memory");
        AddMemory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMemoryActionPerformed(evt);
            }
        });
        AddMomentOptions.add(AddMemory);

        AddAchievement.setFont(new java.awt.Font("Segoe Script", 3, 18)); // NOI18N
        AddAchievement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/achievement.png"))); // NOI18N
        AddAchievement.setText("Add Achievement");
        AddAchievement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAchievementActionPerformed(evt);
            }
        });
        AddMomentOptions.add(AddAchievement);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Titel.setFont(new java.awt.Font("Segoe Script", 3, 36)); // NOI18N
        Titel.setForeground(new java.awt.Color(51, 51, 51));
        Titel.setText("Daily Moment");
        getContentPane().add(Titel);
        Titel.setBounds(220, 90, 350, 90);

        titel2.setFont(new java.awt.Font("Segoe Script", 2, 24)); // NOI18N
        titel2.setForeground(new java.awt.Color(0, 51, 51));
        titel2.setText("\"Timeline\"");
        titel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(titel2);
        titel2.setBounds(260, 140, 300, 160);

        clearYearFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/clearFilter.png"))); // NOI18N
        clearYearFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearYearFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearYearFilterMouseClicked(evt);
            }
        });
        getContentPane().add(clearYearFilter);
        clearYearFilter.setBounds(570, 70, 50, 70);

        clearSort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/clear sort.png"))); // NOI18N
        clearSort.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearSort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearSortMouseClicked(evt);
            }
        });
        getContentPane().add(clearSort);
        clearSort.setBounds(570, 150, 50, 50);

        filterYear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/filter above.png"))); // NOI18N
        filterYear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterYearMouseClicked(evt);
            }
        });
        getContentPane().add(filterYear);
        filterYear.setBounds(570, 80, 50, 50);

        clearOrdinaryFilter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/clearFilter.png"))); // NOI18N
        clearOrdinaryFilter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearOrdinaryFilter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearOrdinaryFilterMouseClicked(evt);
            }
        });
        getContentPane().add(clearOrdinaryFilter);
        clearOrdinaryFilter.setBounds(570, 70, 50, 70);

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/icons8-menu-48.png"))); // NOI18N
        menu.setComponentPopupMenu(settingMenu);
        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMouseClicked(evt);
            }
        });
        getContentPane().add(menu);
        menu.setBounds(10, 0, 80, 80);

        CornarPanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/corner.jpg"))); // NOI18N
        getContentPane().add(CornarPanal);
        CornarPanal.setBounds(0, 0, 80, 1120);

        stopMRDisplaying.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/clearFilter.png"))); // NOI18N
        stopMRDisplaying.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopMRDisplaying.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMRDisplayingMouseClicked(evt);
            }
        });
        getContentPane().add(stopMRDisplaying);
        stopMRDisplaying.setBounds(570, 80, 50, 50);

        stopDisplayingHMoment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/clearFilter.png"))); // NOI18N
        stopDisplayingHMoment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopDisplayingHMoment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopDisplayingHMomentMouseClicked(evt);
            }
        });
        getContentPane().add(stopDisplayingHMoment);
        stopDisplayingHMoment.setBounds(570, 80, 50, 50);

        stopLRDisplaying.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/clearFilter.png"))); // NOI18N
        stopLRDisplaying.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopLRDisplaying.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopLRDisplayingMouseClicked(evt);
            }
        });
        getContentPane().add(stopLRDisplaying);
        stopLRDisplaying.setBounds(570, 80, 50, 50);

        stopDisplayingSMoment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/clearFilter.png"))); // NOI18N
        stopDisplayingSMoment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopDisplayingSMoment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopDisplayingSMomentMouseClicked(evt);
            }
        });
        getContentPane().add(stopDisplayingSMoment);
        stopDisplayingSMoment.setBounds(570, 80, 50, 50);

        HomePanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homeFram/backgroundWelpaper.jpg"))); // NOI18N
        getContentPane().add(HomePanal);
        HomePanal.setBounds(80, -30, 630, 1140);

        cornerPanal.setBackground(new java.awt.Color(213, 158, 148));
        cornerPanal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cornerPanal.setLayout(null);
        getContentPane().add(cornerPanal);
        cornerPanal.setBounds(0, 1060, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void TimelineListMouseClicked (MouseEvent evt)
    {
        if(!listModel.isEmpty())
        {
            ListPanel selectedmoment = timeLineList.getSelectedValue();
            selectedMomentName = selectedmoment.getMomentName();
            selectedMomentType = selectedmoment.getMomentType();
            momentOptions.show(this, 470,335 );
        }
    }
    
    
    private void optionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsActionPerformed
        optios.show(this, 9, 95);
    }//GEN-LAST:event_optionsActionPerformed

    private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
        settingMenu.show(this, 9, 95);
    }//GEN-LAST:event_menuMouseClicked

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
        SortOptions.show(this ,9 , 97);
    }//GEN-LAST:event_sortActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
       FiltertOptions.show(this, 9, 97);
    }//GEN-LAST:event_filterActionPerformed

    private void addMomentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMomentActionPerformed
        
        if(userTimeline.getNumOfMoments() != 30 )
        {
        AddMomentOptions.show(this, 9, 95);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Sorry, you can't add new moment \n storage is full now", "full storage", ERROR);
        }
    }//GEN-LAST:event_addMomentActionPerformed

    private void displayMomentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayMomentActionPerformed
       
        Moment selectedMoment = TimelineMoments[userTimeline.search(selectedMomentName)];
        this.setVisible(false);
        
        if(selectedMoment instanceof Memory)
        {
           new DisplayMemory((Memory) selectedMoment , userIndex).setVisible(true);
        }
        else
        {
           new DisplayAchievement((Achievement) selectedMoment , userIndex).setVisible(true);
        }

    }//GEN-LAST:event_displayMomentActionPerformed

    private void editMomentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMomentActionPerformed
       
        Moment selectedMemory = TimelineMoments[userTimeline.search(selectedMomentName)];
        if(selectedMomentType.equals("Memory"))
        {
            this.setVisible(false);
            new EditMemoryFrame((Memory)selectedMemory , userIndex).setVisible(true);
        }
        else
        {
            this.setVisible(false);
           new EditAchievementFrame((Achievement)selectedMemory , userIndex).setVisible(true);
        }
    }//GEN-LAST:event_editMomentActionPerformed

    private void deleteMomentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMomentActionPerformed
       
        String dialogMessage  ="Do you want to delete "+selectedMomentName+" moment";
        int choise = JOptionPane.showConfirmDialog(menu, dialogMessage ,"Delete" ,INFORMATION_MESSAGE);
        
        if (choise == JOptionPane.YES_OPTION)
        {
            Runnable runSound = () -> this.playSound();
            
            Runnable runDeletion = () -> {
                userTimeline.deleteMoment(selectedMomentName);
                fillList();
            };
          Thread soundT = new Thread(runSound); 
          Thread deletionT = new Thread(runDeletion); 
          soundT.start();
          deletionT.start();
        }
    }//GEN-LAST:event_deleteMomentActionPerformed

    private void filterAboveRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterAboveRateActionPerformed
         
        if( status.sorted ==0 && ! status.displayHappiest && ! status.displaySaddest && ! status.displayMRMoment && ! status.displayLRMoment)
        {
             try
            {
             String fiterRate = JOptionPane.showInputDialog(this,"Enter the rate" , "filter above rate", INFORMATION_MESSAGE);
             Validation.validationPoints(fiterRate);
             filteredListAboveRate(Integer.parseInt(fiterRate));
             clearOrdinaryFilter.show();
             status.filtered = true;
             status.ratedAFilter = Integer.parseInt(fiterRate);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Enter number please" );
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage() ); 
            }
       }
        else
        {      
            JOptionPane.showMessageDialog(this, "please , Cancel other operation");    
        }
    }//GEN-LAST:event_filterAboveRateActionPerformed

    private void filterBelowRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBelowRateActionPerformed
      
        if( status.sorted ==0 && ! status.displayHappiest && ! status.displaySaddest && ! status.displayMRMoment && ! status.displayLRMoment)
        {
            try
            {
             String fiterRate = JOptionPane.showInputDialog(this,"Enter the rate" , "filter above rate", INFORMATION_MESSAGE);
             Validation.validationPoints(fiterRate);
             filteredListbelowRate(Integer.parseInt(fiterRate));
             clearOrdinaryFilter.show();
             status.filtered = true;
             status.ratedBFilter = Integer.parseInt(fiterRate);
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Enter number please");
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage()); 
            }

        }
        else
        {
              JOptionPane.showMessageDialog(this, "please , Cancel other operation");
        }
    }//GEN-LAST:event_filterBelowRateActionPerformed

    private void clearYearFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearYearFilterMouseClicked
      fillList();
      clearYearFilter.show(false);
      filterYear.show();
      status.filtered =  false;
    }//GEN-LAST:event_clearYearFilterMouseClicked

    private void sortAscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortAscendingActionPerformed
       
        if(!status.filtered && ! status.displayHappiest && ! status.displaySaddest && ! status.displayMRMoment && ! status.displayLRMoment)
        {
         userTimeline.sortMomentAscending();
         fillList();
         filterYear.show();
         clearSort.show();
         status.sorted = 1;   
       }
        else
        {
              JOptionPane.showMessageDialog(this, "please , Cancel other operation");
        }
    }//GEN-LAST:event_sortAscendingActionPerformed

    private void clearSortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearSortMouseClicked
     
       clearSort.show(false);
       filterYear.show(false);
       clearYearFilter.show(false);
       userTimeline.sortWithOriginalOrder();
       fillList();
       status.sorted = 0;
    }//GEN-LAST:event_clearSortMouseClicked

    private void sortDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortDescendingActionPerformed
        if(!status.filtered && ! status.displayHappiest && ! status.displaySaddest && ! status.displayMRMoment && ! status.displayLRMoment)
        {
        filterYear.show();
        clearSort.show();
        userTimeline.sortMomentDescending();  
        fillList();
        status.sorted = -1;
        }
        else
        {
           JOptionPane.showMessageDialog(this, "please , Cancel other operation");
        }
    }//GEN-LAST:event_sortDescendingActionPerformed

    private void filterYearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterYearMouseClicked

        try{
            String year = JOptionPane.showInputDialog(this,"Enter the year you want to filter based on" , "filter with year", INFORMATION_MESSAGE );
           
            Validation.ValidateYear(year);
            Validation.ValidateActualYears(year);
            
            int filterYear = Integer.parseInt(year);
            clearYearFilter.show();
            this.filterYear.show(false);
            filterListBasedOnYear(filterYear);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
       
    }//GEN-LAST:event_filterYearMouseClicked

    private void clearOrdinaryFilterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearOrdinaryFilterMouseClicked
        
             clearOrdinaryFilter.show(false);
               fillList();
               status.filtered =  false;
    }//GEN-LAST:event_clearOrdinaryFilterMouseClicked

    private void userSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSettingActionPerformed
            
        this.setVisible(false);
        new UserFrame(currentUser).setVisible(true);
    }//GEN-LAST:event_userSettingActionPerformed

    private void AddMemoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMemoryActionPerformed
      
        this.setVisible(false);
        new AddMemory(userTimeline, userIndex).setVisible(true);
    }//GEN-LAST:event_AddMemoryActionPerformed

    private void AddAchievementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAchievementActionPerformed
          
        this.setVisible(false);
        new AddAchievement(userTimeline, userIndex).setVisible(true);
    }//GEN-LAST:event_AddAchievementActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        this.setVisible(false);
        new WelcomPage().setVisible(true);
    }//GEN-LAST:event_logOutActionPerformed

    private void stopMRDisplayingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMRDisplayingMouseClicked
        status.displayMRMoment = false;
        stopMRDisplaying.show(false);
        fillList();
    }//GEN-LAST:event_stopMRDisplayingMouseClicked

    private void stopLRDisplayingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopLRDisplayingMouseClicked
        status.displayLRMoment = false;
        stopLRDisplaying.show(false);
        fillList();
    }//GEN-LAST:event_stopLRDisplayingMouseClicked

    private void stopDisplayingHMomentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopDisplayingHMomentMouseClicked
        status.displayHappiest = false;
        stopDisplayingHMoment.show(false);
        fillList();
    }//GEN-LAST:event_stopDisplayingHMomentMouseClicked

    private void stopDisplayingSMomentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopDisplayingSMomentMouseClicked
        status.displaySaddest = false;
        stopDisplayingSMoment.show(false);
        fillList();
    }//GEN-LAST:event_stopDisplayingSMomentMouseClicked
    
    private void frameProparity()
    {
        setSize(700, 1028);
        clearYearFilter.show(false);
        clearSort.show(false);
        filterYear.show(false);
        clearOrdinaryFilter.show(false);
        stopDisplayingHMoment.setVisible(false);
        stopDisplayingSMoment.setVisible(false);
        stopLRDisplaying.setVisible(false);
        stopMRDisplaying.setVisible(false);
    }

    
    private void timelineListBuilding()
    {
        timeLineScrollPane = new JScrollPane();
        timeLineList = new JList<>();
        listModel = new DefaultListModel();
       
       // fillList();
        timeLineList.setCellRenderer(new CustomCellRenderer());

        getContentPane().add(timeLineScrollPane);  
        timeLineList.setModel(listModel);  
        }
    
    private void timelineProparity(){
        
        timeLineList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  //select only one row
        timeLineList.setFixedCellHeight(150);
        timeLineList.setFixedCellWidth(180);
        
        timeLineList.setLayoutOrientation( JList.HORIZONTAL_WRAP);
        
        
        timeLineScrollPane.setViewportView(timeLineList);     //to add list to scroll pane
        timeLineScrollPane.setBounds(180, 290, 370, 600);
        timeLineScrollPane.setBackground(new Color(0,0,0));
        timeLineScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        timeLineList.setSize(470, 600);
       
        timeLineList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
       
        timeLineList.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimelineListMouseClicked(evt);
            }
        });
        
    }

   
    protected void fillList()
    {
        listModel.removeAllElements();
        
       TimelineMoments = userTimeline.getTimelineMoments();
        int numOfMomnets = userTimeline.getNumOfMoments();
        
         timeLineList.setVisibleRowCount(numOfMomnets -1);
       
         for(int index=0;index<numOfMomnets;index++)
         {
           currentMoment =new ListPanel();
            fillListPanel(index ,TimelineMoments[index].getMomentName(),
                        TimelineMoments[index].getImportanceRate(), TimelineMoments[index].getActualYear() );
           
           listModel.addElement(currentMoment);
       }
    }
    
    
    protected void fillListPanel(int index ,String momentName ,int rate ,int year )
    {
           String momentType ;
           String momentYear = String.valueOf(year );
           String momentRate = String.valueOf(rate );
           
           if ( TimelineMoments[index] instanceof Memory)
           {
               momentType = "Memory";
           }
           else
           {
               momentType = "Achievement";
           }
           
           currentMoment = new ListPanel();
           currentMoment.fillPanel(momentName, momentType, momentRate, momentYear);
    }
    
     private void filterListBasedOnYear(int filterYear)
        {
            listModel.removeAllElements();
             int numOfMomnets = userTimeline.getNumOfMoments() , countListMoments = 0;

             for(int index=0;index<numOfMomnets;index++)
             {
                  if(filterYear== TimelineMoments[index].getActualYear())
                    {
                      currentMoment=new ListPanel();
                      fillListPanel(index ,TimelineMoments[index].getMomentName(),
                            TimelineMoments[index].getImportanceRate(), TimelineMoments[index].getActualYear() );

                         listModel.addElement(currentMoment);
                         countListMoments++;
                    }
                
              }
            timeLineList.setVisibleRowCount(countListMoments -1);
        }
    
    private void filteredListbelowRate( int fiterRate){
      
            listModel.removeAllElements();
            int numOfMomnets = userTimeline.getNumOfMoments() , countListMoments=0;

            for(int index=0;index<numOfMomnets;index++)
            {
                if(TimelineMoments[index].getImportanceRate()< fiterRate)
                    {
                      currentMoment=new ListPanel();
                      fillListPanel(index ,TimelineMoments[index].getMomentName(),
                            TimelineMoments[index].getImportanceRate(), TimelineMoments[index].getActualYear() );

                         listModel.addElement(currentMoment);
                         countListMoments++;
                    }

            }
           timeLineList.setVisibleRowCount(countListMoments -1);
        
    }
    
      private void filteredListAboveRate( int fiterRate){
         
            listModel.removeAllElements();
            int numOfMomnets = userTimeline.getNumOfMoments() , countListMoments=0 ;

             for(int index=0;index<numOfMomnets;index++)
              {
                  if(TimelineMoments[index].getImportanceRate()> fiterRate)
                    {
                      currentMoment=new ListPanel();
                      fillListPanel(index ,TimelineMoments[index].getMomentName(),
                            TimelineMoments[index].getImportanceRate(), TimelineMoments[index].getActualYear() );

                         listModel.addElement(currentMoment);
                         countListMoments++;
                    }

             }
                timeLineList.setVisibleRowCount(countListMoments -1);
          
    }
      
    private void playSound() 
    {
        FileInputStream path ;
        try
        {
           path = new FileInputStream("music\\\\\\\\deleteSound.mp3") ;
           Player deleteSound =  new Player(path);
           deleteSound.play();
        }
        catch (FileNotFoundException ex)
        {
           System.out.println(ex.getMessage());
        }
        catch(JavaLayerException ex )
        {
          System.out.println(ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    
    
    void AddMenuItem(Component comp){
     optios.add(comp);
    }
    
    protected void displayHomeBasedOnStatus()
    {
        if(status.sorted !=0)
        {
            if (status.sorted == -1)
            {
               filterYear.show();
               clearSort.show();
               userTimeline.sortMomentDescending();  
            }
            else
            {
                filterYear.show();
                clearSort.show();
                userTimeline.sortMomentAscending();
            }
             fillList();
        }
        else if( status.filtered )
        {
            if (status.ratedBFilter !=0)
            {
                filteredListbelowRate(status.ratedBFilter);
                clearOrdinaryFilter.show();
            }
            else
            {
                filteredListAboveRate(status.ratedAFilter);
                clearOrdinaryFilter.show();
            }
        }
        
        if( !(currentUser instanceof PremiumUser ) && !status.filtered && status.sorted == 0)
        {
            fillList();
        }
        
    }
      
    
    protected CurrentStatus status = CurrentStatus.GetCurrentStatus();
    private final int userIndex;
    private String selectedMomentName ;
    private String selectedMomentType ;
    protected final  User currentUser;
    protected final TimeLine userTimeline;
    protected Moment[] TimelineMoments;
    protected DefaultListModel listModel;
    private JScrollPane timeLineScrollPane;    
    protected JList<ListPanel> timeLineList;
    protected ListPanel currentMoment;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AddAchievement;
    private javax.swing.JMenuItem AddMemory;
    private javax.swing.JPopupMenu AddMomentOptions;
    private javax.swing.JLabel CornarPanal;
    private javax.swing.JPopupMenu FiltertOptions;
    private javax.swing.JLabel HomePanal;
    private javax.swing.JPopupMenu SortOptions;
    private javax.swing.JLabel Titel;
    private javax.swing.JMenuItem addMoment;
    protected javax.swing.JLabel clearOrdinaryFilter;
    private javax.swing.JLabel clearSort;
    private javax.swing.JLabel clearYearFilter;
    private javax.swing.JPanel cornerPanal;
    private javax.swing.JMenuItem deleteMoment;
    private javax.swing.JMenuItem displayMoment;
    private javax.swing.JMenuItem editMoment;
    private javax.swing.JMenuItem filter;
    private javax.swing.JMenuItem filterAboveRate;
    private javax.swing.JMenuItem filterBelowRate;
    private javax.swing.JLabel filterYear;
    private javax.swing.JMenuItem logOut;
    private javax.swing.JLabel menu;
    private javax.swing.JPopupMenu momentOptions;
    private javax.swing.JMenuItem options;
    private javax.swing.JPopupMenu optios;
    private javax.swing.JPopupMenu settingMenu;
    private javax.swing.JMenuItem sort;
    private javax.swing.JMenuItem sortAscending;
    private javax.swing.JMenuItem sortDescending;
    protected javax.swing.JLabel stopDisplayingHMoment;
    protected javax.swing.JLabel stopDisplayingSMoment;
    protected javax.swing.JLabel stopLRDisplaying;
    protected javax.swing.JLabel stopMRDisplaying;
    private javax.swing.JLabel titel2;
    private javax.swing.JMenuItem userSetting;
    // End of variables declaration//GEN-END:variables
}
    
