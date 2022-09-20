package Interfaces;

import LogicFolder.CarManager;
import Objects.LightCar;
import Objects.OffRoad;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;


public class ChangeCars extends javax.swing.JDialog {

    private CarManager carManager = new CarManager();
    private String selectedBrand;
    private String selectedColor;
    private Integer maxSpeedSelected;
    private Boolean availabilitySelected;
    
    public ChangeCars(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        setLocationRelativeTo(null);

        changeLightElements(false);
        change4x4Elements(false);
        
        lblErrorNoNM.setVisible(false);
        lblError.setVisible(false);
        lblSuccess.setVisible(false);
        
        fillColorComboBox();
        fillBrandComboBox();
        
        btnLight.setOpaque(true);
        btn4x4.setOpaque(true);
        btnChangeCar.setOpaque(true);
        btnExit.setOpaque(true);
        btnSearchNumberPlate.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupMaxSpeed = new javax.swing.ButtonGroup();
        btnGroupYesNo = new javax.swing.ButtonGroup();
        pnlHeader = new javax.swing.JPanel();
        lblSubtitle = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSubtitle1 = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        studentsName = new javax.swing.JLabel();
        pnlHeader1 = new javax.swing.JPanel();
        pnlFooter1 = new javax.swing.JPanel();
        studentsName1 = new javax.swing.JLabel();
        pnlMainBackground = new javax.swing.JPanel();
        lblPrice = new javax.swing.JLabel();
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
        btnLight = new javax.swing.JButton();
        lblForce = new javax.swing.JLabel();
        inputForce = new javax.swing.JTextField();
        lblMaxSpeed = new javax.swing.JLabel();
        radioButton100 = new javax.swing.JRadioButton();
        radioButton150 = new javax.swing.JRadioButton();
        radioButton200 = new javax.swing.JRadioButton();
        btn4x4 = new javax.swing.JButton();
        btnChangeCar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblCapacity = new javax.swing.JLabel();
        spinnerCapacity = new javax.swing.JSpinner();
        lblAvailable = new javax.swing.JLabel();
        radioButtonNo = new javax.swing.JRadioButton();
        radioButtonYes = new javax.swing.JRadioButton();
        lblBrandSelected = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        lblSuccess = new javax.swing.JLabel();
        btnSearchNumberPlate = new javax.swing.JButton();
        txtPrice = new javax.swing.JLabel();
        lblErrorNoNM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlHeader.setBackground(new java.awt.Color(103, 12, 43));
        pnlHeader.setForeground(new java.awt.Color(153, 0, 51));
        pnlHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubtitle.setFont(new java.awt.Font("Lao MN", 2, 36)); // NOI18N
        lblSubtitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle.setText("Enterprise");
        pnlHeader.add(lblSubtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 190, 90));

        lblTitle.setFont(new java.awt.Font("Lao MN", 1, 48)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Car");
        pnlHeader.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 90, 60));

        lblSubtitle1.setFont(new java.awt.Font("Lao MN", 1, 48)); // NOI18N
        lblSubtitle1.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitle1.setText("Cambio de Carros");
        pnlHeader.add(lblSubtitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 430, 90));

        getContentPane().add(pnlHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 130));

        pnlFooter.setBackground(new java.awt.Color(103, 12, 43));
        pnlFooter.setForeground(new java.awt.Color(153, 0, 51));
        pnlFooter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentsName.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        studentsName.setForeground(new java.awt.Color(255, 255, 255));
        studentsName.setText("Murillo Anchia Pamela");
        pnlFooter.add(studentsName, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, -1));

        getContentPane().add(pnlFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1100, 70));

        pnlHeader1.setBackground(new java.awt.Color(103, 12, 43));
        pnlHeader1.setForeground(new java.awt.Color(153, 0, 51));
        pnlHeader1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 130));

        pnlFooter1.setBackground(new java.awt.Color(103, 12, 43));
        pnlFooter1.setForeground(new java.awt.Color(153, 0, 51));
        pnlFooter1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentsName1.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        studentsName1.setForeground(new java.awt.Color(255, 255, 255));
        studentsName1.setText("Murillo Anchia Pamela");
        pnlFooter1.add(studentsName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, -1));

        getContentPane().add(pnlFooter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 1100, 70));

        pnlMainBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPrice.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblPrice.setText("Precio");
        pnlMainBackground.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));
        pnlMainBackground.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 250, 10));

        lblNumberPlate.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblNumberPlate.setForeground(new java.awt.Color(0, 0, 0));
        lblNumberPlate.setText("Número de placa");
        pnlMainBackground.add(lblNumberPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        inputNumberPlate.setBackground(new java.awt.Color(245, 245, 245));
        inputNumberPlate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        inputNumberPlate.setForeground(new java.awt.Color(51, 51, 51));
        inputNumberPlate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputNumberPlate.setBorder(null);
        inputNumberPlate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                inputNumberPlateMousePressed(evt);
            }
        });
        pnlMainBackground.add(inputNumberPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 210, 40));
        pnlMainBackground.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 250, 10));

        lblBrand.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblBrand.setForeground(new java.awt.Color(0, 0, 0));
        lblBrand.setText("Marcas");
        pnlMainBackground.add(lblBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        brandChoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brandChoiceItemStateChanged(evt);
            }
        });
        pnlMainBackground.add(brandChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 170, 30));

        lblColors.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblColors.setForeground(new java.awt.Color(0, 0, 0));
        lblColors.setText("Colores");
        pnlMainBackground.add(lblColors, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        colorChoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                colorChoiceItemStateChanged(evt);
            }
        });
        pnlMainBackground.add(colorChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 170, 30));

        pnlCarColor.setBackground(new java.awt.Color(255, 255, 255));
        pnlCarColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        carBorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/carroTransparent.png"))); // NOI18N
        pnlCarColor.add(carBorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 210));

        pnlMainBackground.add(pnlCarColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        btnLight.setBackground(new java.awt.Color(249, 240, 240));
        btnLight.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        btnLight.setForeground(new java.awt.Color(153, 0, 51));
        btnLight.setText("Liviano");
        btnLight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0), 2));
        btnLight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLightActionPerformed(evt);
            }
        });
        pnlMainBackground.add(btnLight, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 180, 60));

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

        btnGroupMaxSpeed.add(radioButton100);
        radioButton100.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        radioButton100.setForeground(new java.awt.Color(0, 0, 0));
        radioButton100.setText("100");
        radioButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton100ActionPerformed(evt);
            }
        });
        pnlMainBackground.add(radioButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, -1, -1));

        btnGroupMaxSpeed.add(radioButton150);
        radioButton150.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        radioButton150.setForeground(new java.awt.Color(0, 0, 0));
        radioButton150.setText("150");
        radioButton150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButton150ActionPerformed(evt);
            }
        });
        pnlMainBackground.add(radioButton150, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        btnGroupMaxSpeed.add(radioButton200);
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

        btnChangeCar.setBackground(new java.awt.Color(153, 0, 51));
        btnChangeCar.setFont(new java.awt.Font("Lao MN", 1, 24)); // NOI18N
        btnChangeCar.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeCar.setText("Cambiar Carro");
        btnChangeCar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnChangeCar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangeCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeCarActionPerformed(evt);
            }
        });
        pnlMainBackground.add(btnChangeCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 200, 70));

        lblError.setBackground(new java.awt.Color(255, 255, 255));
        lblError.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblError.setForeground(new java.awt.Color(0, 0, 153));
        lblError.setText("Alguno de los campos no ha sido rellenado correctamente");
        pnlMainBackground.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 510, -1, -1));

        lblCapacity.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblCapacity.setForeground(new java.awt.Color(0, 0, 0));
        lblCapacity.setText("Capacidad");
        pnlMainBackground.add(lblCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        spinnerCapacity.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        spinnerCapacity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spinnerCapacity.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlMainBackground.add(spinnerCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, -1, -1));

        lblAvailable.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblAvailable.setForeground(new java.awt.Color(0, 0, 0));
        lblAvailable.setText("Disponible");
        pnlMainBackground.add(lblAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, -1, -1));

        btnGroupYesNo.add(radioButtonNo);
        radioButtonNo.setFont(new java.awt.Font("Lao Sangam MN", 0, 18)); // NOI18N
        radioButtonNo.setForeground(new java.awt.Color(0, 0, 0));
        radioButtonNo.setText("No");
        radioButtonNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonNoActionPerformed(evt);
            }
        });
        pnlMainBackground.add(radioButtonNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, -1, -1));

        btnGroupYesNo.add(radioButtonYes);
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
        lblBrandSelected.setText("Toyota");
        lblBrandSelected.setToolTipText("");
        pnlMainBackground.add(lblBrandSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, 350, 50));

        btnExit.setBackground(new java.awt.Color(153, 0, 51));
        btnExit.setFont(new java.awt.Font("Lao MN", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlMainBackground.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 200, 70));

        lblSuccess.setFont(new java.awt.Font("Lao Sangam MN", 0, 24)); // NOI18N
        lblSuccess.setForeground(new java.awt.Color(0, 0, 0));
        lblSuccess.setText("Se ha cambiado el carro con éxito");
        pnlMainBackground.add(lblSuccess, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 383, 380, 30));

        btnSearchNumberPlate.setBackground(new java.awt.Color(153, 0, 51));
        btnSearchNumberPlate.setFont(new java.awt.Font("Lao MN", 1, 20)); // NOI18N
        btnSearchNumberPlate.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchNumberPlate.setText("Buscar placa");
        btnSearchNumberPlate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSearchNumberPlate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchNumberPlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchNumberPlateActionPerformed(evt);
            }
        });
        pnlMainBackground.add(btnSearchNumberPlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 160, 40));

        txtPrice.setBackground(new java.awt.Color(245, 245, 245));
        txtPrice.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtPrice.setForeground(new java.awt.Color(0, 0, 0));
        txtPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlMainBackground.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 210, 40));

        lblErrorNoNM.setBackground(new java.awt.Color(255, 255, 255));
        lblErrorNoNM.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        lblErrorNoNM.setForeground(new java.awt.Color(0, 0, 153));
        lblErrorNoNM.setText("Placa no registrada");
        pnlMainBackground.add(lblErrorNoNM, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        getContentPane().add(pnlMainBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1100, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean displayCarInfo(String numberPlate) {
        lblErrorNoNM.setVisible(false);
        lblError.setVisible(false);
        boolean validNM = false;
        if (validNumberPlate(numberPlate)) {
            validNM = true;
            
            HashMap<String, String> carHashMap = carManager.getCarData(numberPlate);
            for (String key : carHashMap.keySet()) {
                System.out.println(key + ": " + carHashMap.get(key));
            }
                    
            
            txtPrice.setText( carHashMap.get("Price") );
            
            changeCarColor( carHashMap.get("Color") );
            colorChoice.select( carHashMap.get("Color") );
            selectedColor = carHashMap.get("Color");
            
            brandChoice.select( carHashMap.get("Brand") );
            lblBrandSelected.setText( carHashMap.get("Brand") );
            selectedBrand = carHashMap.get("Brand");
            
            if ( carHashMap.get("Type").equals("LightCar") ) {
                changeLightElements(true);
                inputForce.setText( carHashMap.get("Force") );
                
                if (carHashMap.get("MaxVelocity") == "100") {
                    radioButton100.setSelected(true);
                } else if (carHashMap.get("MaxSpeed") == "150") {
                    radioButton150.setSelected(true);
                } else {
                    radioButton200.setSelected(true);
                }
                
            } else {
                change4x4Elements(true);
                spinnerCapacity.setValue(carHashMap.get("Capacity"));
                if (carHashMap.get("Available") == "true") {
                    radioButtonYes.setSelected(true);
                } else {
                    radioButtonNo.setSelected(true);
                }
            }
        }
        
        return validNM;
        
    }
    
    
    public void fillColorComboBox() {
        HashMap<String, Color> filling = carManager.getColorList();
        for (String colorName : filling.keySet()) {
            colorChoice.addItem(colorName);
        }
    }

    public void fillBrandComboBox() {
        ArrayList filling = carManager.getBrandList();
        for (int brand = 1; filling.size() > brand; brand++) {
            if (filling.get(brand).toString().length() > 3);
            brandChoice.addItem(filling.get(brand).toString());
        }
    }

    public void changeLightElements(boolean state) {
        lblForce.setVisible(state);
        inputForce.setVisible(state);
        lblMaxSpeed.setVisible(state);
        radioButton100.setVisible(state);
        radioButton150.setVisible(state);
        radioButton200.setVisible(state);
    }

    public void change4x4Elements(boolean state) {
        lblCapacity.setVisible(state);
        spinnerCapacity.setVisible(state);
        lblAvailable.setVisible(state);
        radioButtonYes.setVisible(state);
        radioButtonNo.setVisible(state);
    }

    public int isInteger(String numberString) {
        try {
            return Integer.parseInt(numberString); 
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    public boolean validNumberPlate(String newNumberPlate) {
        boolean valid = false;
        if (carManager.doesItExist(newNumberPlate) == true) {
            valid = true;
        }
        return valid;
    }
    
    
    public boolean confirmCarChanged() {
        boolean success = false;
        
        int carPrice = isInteger(txtPrice.getText());
        int force = isInteger( inputForce.getText() );
        int capacity = (int) spinnerCapacity.getModel().getValue();
        String carNumberPlate = inputNumberPlate.getText();
        
        if ( validNumberPlate(carNumberPlate) ) {
            carManager.deleteCar(carNumberPlate);
            if ( lblForce.isVisible() == true && force != -1 ) {
                carManager.addLightCar(new LightCar(carNumberPlate, carPrice, selectedBrand, "LightCar", selectedColor, force, maxSpeedSelected ) );
                success = true;
            } else if ( lblCapacity.isVisible() ) {
                carManager.addOffRoadCar(new OffRoad(carNumberPlate, carPrice, selectedBrand, "OffRoad", selectedColor, capacity, availabilitySelected ) );
                success = true;
            }
        }

        return success;
    }
    
    public void changeCarColor(String colorWanted) {
        HashMap<String, String> colorHashMap = carManager.getColorList();
        String colorString = colorHashMap.get(colorWanted).toString();
        colorString = colorString.replaceAll("[^0-9]", " ");
        colorString = colorString.trim();
        colorString = colorString.replaceAll(" + ", ", ");

        String[] color = colorString.split(", ");

        pnlCarColor.setBackground(new Color(Integer.parseInt(color[0]), Integer.parseInt(color[1]), Integer.parseInt(color[2])));
    }
    
    
    private void inputNumberPlateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputNumberPlateMousePressed
        lblSuccess.setVisible(false);
        lblError.setVisible(false);
        lblErrorNoNM.setVisible(false);
    }//GEN-LAST:event_inputNumberPlateMousePressed

    private void brandChoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brandChoiceItemStateChanged
        selectedBrand = (String) brandChoice.getSelectedItem();
        lblBrandSelected.setText(selectedBrand);
    }//GEN-LAST:event_brandChoiceItemStateChanged

    private void colorChoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_colorChoiceItemStateChanged
        selectedColor = (String) colorChoice.getSelectedItem();
        changeCarColor(selectedColor);

    }//GEN-LAST:event_colorChoiceItemStateChanged

    private void btnLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLightActionPerformed
        changeLightElements(true);
        change4x4Elements(false);
    }//GEN-LAST:event_btnLightActionPerformed

    private void inputForceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputForceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputForceActionPerformed

    private void radioButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton100ActionPerformed
        maxSpeedSelected = 100;
    }//GEN-LAST:event_radioButton100ActionPerformed

    private void radioButton150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton150ActionPerformed
        maxSpeedSelected = 150;
    }//GEN-LAST:event_radioButton150ActionPerformed

    private void radioButton200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButton200ActionPerformed
        maxSpeedSelected = 200;
    }//GEN-LAST:event_radioButton200ActionPerformed

    private void btn4x4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4x4ActionPerformed
        changeLightElements(false);
        change4x4Elements(true);
    }//GEN-LAST:event_btn4x4ActionPerformed

    private void btnChangeCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeCarActionPerformed
        boolean success = confirmCarChanged();
        if (success == false) {
            lblError.setVisible(true);
        } else {
            lblSuccess.setVisible(true);
        }
    }//GEN-LAST:event_btnChangeCarActionPerformed

    private void radioButtonNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonNoActionPerformed
        availabilitySelected = false;
    }//GEN-LAST:event_radioButtonNoActionPerformed

    private void radioButtonYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonYesActionPerformed
        availabilitySelected = true;
    }//GEN-LAST:event_radioButtonYesActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSearchNumberPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchNumberPlateActionPerformed
        boolean validNM = displayCarInfo(inputNumberPlate.getText());
        if (validNM == false) {
            lblErrorNoNM.setVisible(true);
        }
    }//GEN-LAST:event_btnSearchNumberPlateActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChangeCars dialog = new ChangeCars(new javax.swing.JFrame(), true);
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
    private java.awt.Choice brandChoice;
    private javax.swing.JButton btn4x4;
    private javax.swing.JButton btnChangeCar;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGroupMaxSpeed;
    private javax.swing.ButtonGroup btnGroupYesNo;
    private javax.swing.JButton btnLight;
    private javax.swing.JButton btnSearchNumberPlate;
    private javax.swing.JLabel carBorder;
    private java.awt.Choice colorChoice;
    private javax.swing.JTextField inputForce;
    private javax.swing.JTextField inputNumberPlate;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblBrandSelected;
    private javax.swing.JLabel lblCapacity;
    private javax.swing.JLabel lblColors;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblErrorNoNM;
    private javax.swing.JLabel lblForce;
    private javax.swing.JLabel lblMaxSpeed;
    private javax.swing.JLabel lblNumberPlate;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JLabel lblSubtitle1;
    private javax.swing.JLabel lblSuccess;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCarColor;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlFooter1;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlHeader1;
    private javax.swing.JPanel pnlMainBackground;
    private javax.swing.JRadioButton radioButton100;
    private javax.swing.JRadioButton radioButton150;
    private javax.swing.JRadioButton radioButton200;
    private javax.swing.JRadioButton radioButtonNo;
    private javax.swing.JRadioButton radioButtonYes;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSpinner spinnerCapacity;
    private javax.swing.JLabel studentsName;
    private javax.swing.JLabel studentsName1;
    private javax.swing.JLabel txtPrice;
    // End of variables declaration//GEN-END:variables
}
