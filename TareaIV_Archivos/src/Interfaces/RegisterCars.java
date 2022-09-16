package Interfaces;


public class RegisterCars extends javax.swing.JDialog {

    /**
     * Creates new form RegisterCars
     */
    public RegisterCars(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGMaxSpeed = new javax.swing.ButtonGroup();
        pnlHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle = new javax.swing.JLabel();
        lblSubtitle1 = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        studentsName = new javax.swing.JLabel();
        pnlMainBackground = new javax.swing.JPanel();
        lblPrice = new javax.swing.JLabel();
        inputPrice = new javax.swing.JFormattedTextField();
        separator1 = new javax.swing.JSeparator();
        lblNumberPlate = new javax.swing.JLabel();
        inputNumberPlate = new javax.swing.JTextField();
        separator2 = new javax.swing.JSeparator();
        lblBrand = new javax.swing.JLabel();
        brandChoice = new java.awt.Choice();
        lblColors = new javax.swing.JLabel();
        colorChoice = new java.awt.Choice();
        pnlCarColor = new javax.swing.JPanel();
        carBorder = new javax.swing.JLabel();
        btnSmall = new javax.swing.JButton();
        lblForce = new javax.swing.JLabel();
        inputForce = new javax.swing.JTextField();
        lblMaxSpeed = new javax.swing.JLabel();
        radioButton100 = new javax.swing.JRadioButton();
        radioButton150 = new javax.swing.JRadioButton();
        radioButton200 = new javax.swing.JRadioButton();
        btn4x4 = new javax.swing.JButton();
        btnAddCar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        lblCapacity1 = new javax.swing.JLabel();
        radioButtonNo = new javax.swing.JRadioButton();
        radioButtonYes = new javax.swing.JRadioButton();
        lblBrandSelected = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(103, 12, 43));
        pnlHeader.setForeground(new java.awt.Color(153, 0, 51));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lao MN", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Car");
        pnlHeader.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 60));

        lblSubtitle.setFont(new java.awt.Font("Lao MN", 2, 36)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle.setText("Enterprise");
        pnlHeader.add(lblSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 90));

        lblSubtitle1.setFont(new java.awt.Font("Lao MN", 1, 48)); // NOI18N
        lblSubtitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle1.setText("Registro de Carros");
        pnlHeader.add(lblSubtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 460, 90));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 130));

        pnlFooter.setBackground(new java.awt.Color(103, 12, 43));
        pnlFooter.setForeground(new java.awt.Color(153, 0, 51));
        pnlFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentsName.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        studentsName.setForeground(new java.awt.Color(255, 255, 255));
        studentsName.setText("Murillo Anchia Pamela");
        pnlFooter.add(studentsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        getContentPane().add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1100, 70));

        pnlMainBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrice.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblPrice.setText("Precio");
        pnlMainBackground.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        inputPrice.setBackground(new java.awt.Color(245, 245, 245));
        inputPrice.setBorder(null);
        inputPrice.setForeground(new java.awt.Color(51, 51, 51));
        inputPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤#,##0.00"))));
        inputPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        inputPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPriceActionPerformed(evt);
            }
        });
        pnlMainBackground.add(inputPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 210, 50));
        pnlMainBackground.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 250, 10));

        lblNumberPlate.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblNumberPlate.setForeground(new java.awt.Color(0, 0, 0));
        lblNumberPlate.setText("Número de placa");
        pnlMainBackground.add(lblNumberPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        inputNumberPlate.setBackground(new java.awt.Color(245, 245, 245));
        inputNumberPlate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        inputNumberPlate.setForeground(new java.awt.Color(51, 51, 51));
        inputNumberPlate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputNumberPlate.setBorder(null);
        pnlMainBackground.add(inputNumberPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 210, 50));
        pnlMainBackground.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 250, 10));

        lblBrand.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(0, 0, 0));
        lblBrand.setText("Marcas");
        pnlMainBackground.add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        pnlMainBackground.add(brandChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, 30));

        lblColors.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblColors.setForeground(new java.awt.Color(0, 0, 0));
        lblColors.setText("Colores");
        pnlMainBackground.add(lblColors, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));
        pnlMainBackground.add(colorChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 170, 30));

        pnlCarColor.setBackground(new java.awt.Color(0, 204, 204));
        pnlCarColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/carroTrans.png"))); // NOI18N
        pnlCarColor.add(carBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 210));

        pnlMainBackground.add(pnlCarColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        btnSmall.setBackground(new java.awt.Color(249, 240, 240));
        btnSmall.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        btnSmall.setForeground(new java.awt.Color(153, 0, 51));
        btnSmall.setText("Liviano");
        btnSmall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        btnSmall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmallActionPerformed(evt);
            }
        });
        pnlMainBackground.add(btnSmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 180, 60));

        lblForce.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblForce.setForeground(new java.awt.Color(0, 0, 0));
        lblForce.setText("Potencia");
        pnlMainBackground.add(lblForce, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        inputForce.setBackground(new java.awt.Color(245, 245, 245));
        inputForce.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        inputForce.setForeground(new java.awt.Color(51, 51, 51));
        inputForce.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputForce.setBorder(null);
        inputForce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputForceActionPerformed(evt);
            }
        });
        pnlMainBackground.add(inputForce, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 130, 80, 50));

        lblMaxSpeed.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblMaxSpeed.setForeground(new java.awt.Color(0, 0, 0));
        lblMaxSpeed.setText("Velocidad Máxima");
        pnlMainBackground.add(lblMaxSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, -1, -1));

        radioButton100.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        radioButton100.setForeground(new java.awt.Color(0, 0, 0));
        radioButton100.setText("100");
        radioButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton100ActionPerformed(evt);
            }
        });
        pnlMainBackground.add(radioButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        radioButton150.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        radioButton150.setForeground(new java.awt.Color(0, 0, 0));
        radioButton150.setText("150");
        radioButton150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton150ActionPerformed(evt);
            }
        });
        pnlMainBackground.add(radioButton150, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        radioButton200.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        radioButton200.setForeground(new java.awt.Color(0, 0, 0));
        radioButton200.setText("200");
        radioButton200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton200ActionPerformed(evt);
            }
        });
        pnlMainBackground.add(radioButton200, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, -1, -1));

        btn4x4.setBackground(new java.awt.Color(249, 240, 240));
        btn4x4.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        btn4x4.setForeground(new java.awt.Color(153, 0, 51));
        btn4x4.setText("Todo Terreno");
        btn4x4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        btn4x4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4x4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4x4ActionPerformed(evt);
            }
        });
        pnlMainBackground.add(btn4x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 50, 180, 60));

        btnAddCar.setBackground(new java.awt.Color(153, 0, 51));
        btnAddCar.setFont(new java.awt.Font("Lao MN", 1, 24)); // NOI18N
        btnAddCar.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCar.setText("Añadir Carro");
        btnAddCar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnAddCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });
        pnlMainBackground.add(btnAddCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 200, 70));

        lblError.setBackground(new java.awt.Color(255, 255, 255));
        lblError.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(0, 0, 153));
        lblError.setText("Alguno de los campos no ha sido rellenado correctamente");
        pnlMainBackground.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        lblCapacity.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblCapacity.setForeground(new java.awt.Color(0, 0, 0));
        lblCapacity.setText("Capacidad");
        pnlMainBackground.add(lblCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        jSpinner1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMainBackground.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, -1, -1));

        lblCapacity1.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblCapacity1.setForeground(new java.awt.Color(0, 0, 0));
        lblCapacity1.setText("Disponible");
        pnlMainBackground.add(lblCapacity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, -1, -1));

        radioButtonNo.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        radioButtonNo.setForeground(new java.awt.Color(0, 0, 0));
        radioButtonNo.setText("No");
        radioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNoActionPerformed(evt);
            }
        });
        pnlMainBackground.add(radioButtonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, -1, -1));

        radioButtonYes.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        radioButtonYes.setForeground(new java.awt.Color(0, 0, 0));
        radioButtonYes.setText("Sí");
        radioButtonYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonYesActionPerformed(evt);
            }
        });
        pnlMainBackground.add(radioButtonYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));

        lblBrandSelected.setFont(new java.awt.Font("Lao MN", 1, 24)); // NOI18N
        lblBrandSelected.setForeground(new java.awt.Color(0, 0, 0));
        lblBrandSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBrandSelected.setText("Marca");
        lblBrandSelected.setToolTipText("");
        pnlMainBackground.add(lblBrandSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 350, 90));

        getContentPane().add(pnlMainBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1100, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4x4ActionPerformed

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddCarActionPerformed

    private void btnSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSmallActionPerformed

    private void inputPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPriceActionPerformed

    private void radioButton150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton150ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButton150ActionPerformed

    private void radioButton200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButton200ActionPerformed

    private void radioButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton100ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButton100ActionPerformed

    private void inputForceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputForceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputForceActionPerformed

    private void radioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonNoActionPerformed

    private void radioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioButtonYesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterCars dialog = new RegisterCars(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGMaxSpeed;
    private java.awt.Choice brandChoice;
    private javax.swing.JButton btn4x4;
    private javax.swing.JButton btnAddCar;
    private javax.swing.JButton btnSmall;
    private javax.swing.JLabel carBorder;
    private java.awt.Choice colorChoice;
    private javax.swing.JTextField inputForce;
    private javax.swing.JTextField inputNumberPlate;
    private javax.swing.JFormattedTextField inputPrice;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblBrandSelected;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblCapacity1;
    private javax.swing.JLabel lblColors;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblForce;
    private javax.swing.JLabel lblMaxSpeed;
    private javax.swing.JLabel lblNumberPlate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblSubtitle1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCarColor;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMainBackground;
    private javax.swing.JRadioButton radioButton100;
    private javax.swing.JRadioButton radioButton150;
    private javax.swing.JRadioButton radioButton200;
    private javax.swing.JRadioButton radioButtonNo;
    private javax.swing.JRadioButton radioButtonYes;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JLabel studentsName;
    // End of variables declaration//GEN-END:variables
}
