
package momentFrames;

import frams.MainFrame;


public abstract class EditMomentFrame extends MainFrame {


    public EditMomentFrame() {
            initComponents();
        this.setVisible(true);
    }
public abstract void hideappearingLabel();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backPanal = new javax.swing.JPanel();
        momentName = new javax.swing.JLabel();
        momentAcualYear = new javax.swing.JLabel();
        momentRate = new javax.swing.JLabel();
        momentDescription = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        actualYearText = new javax.swing.JTextField();
        rateText = new javax.swing.JTextField();
        nameValidationLabel = new javax.swing.JLabel();
        actualYearvalidation = new javax.swing.JLabel();
        rateValidation = new javax.swing.JLabel();
        cornerBackground = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        backIcon = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionText = new javax.swing.JTextArea();
        descriptionValidation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edit Moment");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("Moment"); // NOI18N
        setResizable(false);

        backPanal.setPreferredSize(new java.awt.Dimension(600, 900));
        backPanal.setLayout(null);

        momentName.setFont(new java.awt.Font("Times New Roman", 0, 26)); // NOI18N
        momentName.setText("Name");
        backPanal.add(momentName);
        momentName.setBounds(170, 240, 100, 40);

        momentAcualYear.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        momentAcualYear.setText("Actual Year");
        backPanal.add(momentAcualYear);
        momentAcualYear.setBounds(150, 410, 130, 40);

        momentRate.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        momentRate.setText("Importance Rate");
        backPanal.add(momentRate);
        momentRate.setBounds(390, 410, 140, 30);

        momentDescription.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        momentDescription.setText("Description");
        backPanal.add(momentDescription);
        momentDescription.setBounds(140, 690, 130, 40);

        nameText.setFont(new java.awt.Font("Cambria", 0, 20)); // NOI18N
        nameText.setMaximumSize(new java.awt.Dimension(30, 20));
        nameText.setMinimumSize(new java.awt.Dimension(30, 20));
        nameText.setPreferredSize(new java.awt.Dimension(30, 20));
        backPanal.add(nameText);
        nameText.setBounds(280, 240, 260, 40);

        actualYearText.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        actualYearText.setName(""); // NOI18N
        actualYearText.setPreferredSize(new java.awt.Dimension(30, 20));
        backPanal.add(actualYearText);
        actualYearText.setBounds(260, 410, 80, 40);

        rateText.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        backPanal.add(rateText);
        rateText.setBounds(530, 410, 80, 40);

        nameValidationLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        nameValidationLabel.setForeground(new java.awt.Color(255, 0, 0));
        nameValidationLabel.setText("jLabel1");
        backPanal.add(nameValidationLabel);
        nameValidationLabel.setBounds(280, 290, 260, 18);

        actualYearvalidation.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        actualYearvalidation.setForeground(new java.awt.Color(255, 0, 0));
        actualYearvalidation.setText("jLabel2");
        backPanal.add(actualYearvalidation);
        actualYearvalidation.setBounds(150, 460, 260, 30);

        rateValidation.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        rateValidation.setForeground(new java.awt.Color(255, 0, 0));
        rateValidation.setText("jLabel3");
        backPanal.add(rateValidation);
        rateValidation.setBounds(400, 460, 260, 30);
        backPanal.add(cornerBackground);
        cornerBackground.setBounds(10, 180, 0, 0);
        backPanal.add(backgroundLabel);
        backgroundLabel.setBounds(70, 70, 0, 0);
        backPanal.add(backIcon);
        backIcon.setBounds(0, 30, 70, 70);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        descriptionText.setColumns(20);
        descriptionText.setFont(new java.awt.Font("Sylfaen", 0, 20)); // NOI18N
        descriptionText.setLineWrap(true);
        descriptionText.setRows(5);
        descriptionText.setWrapStyleWord(true);
        descriptionText.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(descriptionText);

        backPanal.add(jScrollPane1);
        jScrollPane1.setBounds(260, 620, 310, 210);

        descriptionValidation.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 13)); // NOI18N
        descriptionValidation.setForeground(new java.awt.Color(255, 0, 0));
        descriptionValidation.setText("jLabel1");
        backPanal.add(descriptionValidation);
        descriptionValidation.setBounds(290, 840, 240, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanal, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
   
    public abstract void addLabels();
    public abstract void addText();
    public abstract void labelsProperties();
    public abstract void textProperties();
    public abstract void savaButtonProperties();
    protected abstract void backGround();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField actualYearText;
    protected javax.swing.JLabel actualYearvalidation;
    protected javax.swing.JLabel backIcon;
    protected javax.swing.JPanel backPanal;
    protected javax.swing.JLabel backgroundLabel;
    protected javax.swing.JLabel cornerBackground;
    protected javax.swing.JTextArea descriptionText;
    protected javax.swing.JLabel descriptionValidation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel momentAcualYear;
    private javax.swing.JLabel momentDescription;
    protected javax.swing.JLabel momentName;
    protected javax.swing.JLabel momentRate;
    protected javax.swing.JTextField nameText;
    protected javax.swing.JLabel nameValidationLabel;
    protected javax.swing.JTextField rateText;
    protected javax.swing.JLabel rateValidation;
    // End of variables declaration//GEN-END:variables
}
