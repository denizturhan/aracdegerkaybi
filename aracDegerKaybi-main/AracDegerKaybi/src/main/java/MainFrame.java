
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    public double calculateWithNumber(double factor) {
        String value = JOptionPane.showInputDialog(null, "Adet Giriniz");
        int number = Integer.parseInt(value);
        double price = Double.parseDouble(txtCarPrice.getText());
        double t = (number * factor * price) / 100;
        String newT = String.format(Locale.US, "%.2f", t);
        return Double.parseDouble(newT);
    }

    public double calculateWithDiscretion(double factor) {
        String value = JOptionPane.showInputDialog(null, "Eksper Takdir Değeri Giriniz (1-5)");
        double discretion = Double.parseDouble(value);
        if (discretion < 1 || discretion > 5) {
            JOptionPane.showMessageDialog(null, "Eksper Takdir Değeri 1 ile 5 arasında olmalıdır!");
            return 0;
        } else {
            double price = Double.parseDouble(txtCarPrice.getText());
            double t = (discretion * factor * price) / 100;
            String newT = String.format(Locale.US, "%.2f", t);
            return Double.parseDouble(newT);
        }
    }

    DefaultTableModel model;

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cbSaseDuzeltme = new javax.swing.JCheckBox();
        cbTavanSaciDuzeltme = new javax.swing.JCheckBox();
        cbSaseKesme = new javax.swing.JCheckBox();
        cbOrtaDirekDuzeltme = new javax.swing.JCheckBox();
        cbArkaPanelDuzeltme = new javax.swing.JCheckBox();
        cbHavuzSaciDuzeltme = new javax.swing.JCheckBox();
        cbArkaCamurlukDuzeltme = new javax.swing.JCheckBox();
        cbMarspiyelDuzeltme = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        cbOrtaDirekDegisim = new javax.swing.JCheckBox();
        cbMarspiyelDegisim = new javax.swing.JCheckBox();
        cbArkaCamurlukDegisim = new javax.swing.JCheckBox();
        cbHavuzSaciDegisim = new javax.swing.JCheckBox();
        cbArkaPanelDegisim = new javax.swing.JCheckBox();
        cbTavanSaciDegisim = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        cbBoyaUygulananAksam = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        cbKaynakYapilanKaporta = new javax.swing.JCheckBox();
        cbDuzeltmeYapilanKaporta = new javax.swing.JCheckBox();
        cbDegisenKaporta = new javax.swing.JCheckBox();
        lblTitle = new javax.swing.JLabel();
        lblAracDegeri = new javax.swing.JLabel();
        txtCarPrice = new javax.swing.JTextField();
        txtCarKM = new javax.swing.JTextField();
        lblAracKM = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        lblValue = new javax.swing.JLabel();
        lblNewCarValue = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCarValue = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kazalı Araç Değer Kaybı Hesaplayıcı v1.0");

        cbSaseDuzeltme.setText("ŞASE DÜZELTME");
        cbSaseDuzeltme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaseDuzeltmeActionPerformed(evt);
            }
        });

        cbTavanSaciDuzeltme.setText("TAVAN SACI DÜZELTME");
        cbTavanSaciDuzeltme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTavanSaciDuzeltmeActionPerformed(evt);
            }
        });

        cbSaseKesme.setText("ŞASE KESME ");
        cbSaseKesme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaseKesmeActionPerformed(evt);
            }
        });

        cbOrtaDirekDuzeltme.setText("ORTA DİREK DÜZELTME ");
        cbOrtaDirekDuzeltme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrtaDirekDuzeltmeActionPerformed(evt);
            }
        });

        cbArkaPanelDuzeltme.setText("ARKA PANEL DÜZELTME ");
        cbArkaPanelDuzeltme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArkaPanelDuzeltmeActionPerformed(evt);
            }
        });

        cbHavuzSaciDuzeltme.setText("HAVUZ SACI DÜZELTME ");
        cbHavuzSaciDuzeltme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHavuzSaciDuzeltmeActionPerformed(evt);
            }
        });

        cbArkaCamurlukDuzeltme.setText("ARKA ÇAMURLUK DÜZELTME ");
        cbArkaCamurlukDuzeltme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArkaCamurlukDuzeltmeActionPerformed(evt);
            }
        });

        cbMarspiyelDuzeltme.setText("MARŞPİYEL DÜZELTME ");
        cbMarspiyelDuzeltme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMarspiyelDuzeltmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSaseDuzeltme)
                    .addComponent(cbTavanSaciDuzeltme)
                    .addComponent(cbSaseKesme)
                    .addComponent(cbOrtaDirekDuzeltme)
                    .addComponent(cbArkaPanelDuzeltme)
                    .addComponent(cbHavuzSaciDuzeltme)
                    .addComponent(cbArkaCamurlukDuzeltme)
                    .addComponent(cbMarspiyelDuzeltme))
                .addGap(0, 108, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSaseDuzeltme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSaseKesme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTavanSaciDuzeltme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbOrtaDirekDuzeltme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbArkaPanelDuzeltme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbHavuzSaciDuzeltme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbArkaCamurlukDuzeltme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMarspiyelDuzeltme)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Düzeltme", jPanel1);

        cbOrtaDirekDegisim.setText("ORTA DİREK DEĞİŞİM ");
        cbOrtaDirekDegisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrtaDirekDegisimActionPerformed(evt);
            }
        });

        cbMarspiyelDegisim.setText("MARŞPİYEL DEĞİŞİM");
        cbMarspiyelDegisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMarspiyelDegisimActionPerformed(evt);
            }
        });

        cbArkaCamurlukDegisim.setText("ARKA ÇAMURLUK DEĞİŞİM");
        cbArkaCamurlukDegisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArkaCamurlukDegisimActionPerformed(evt);
            }
        });

        cbHavuzSaciDegisim.setText("HAVUZ SACI DEĞİŞİM");
        cbHavuzSaciDegisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHavuzSaciDegisimActionPerformed(evt);
            }
        });

        cbArkaPanelDegisim.setText("ARKA PANEL DEĞİŞİM");
        cbArkaPanelDegisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbArkaPanelDegisimActionPerformed(evt);
            }
        });

        cbTavanSaciDegisim.setText("TAVAN SACI DEĞİŞİM");
        cbTavanSaciDegisim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTavanSaciDegisimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbOrtaDirekDegisim)
                    .addComponent(cbArkaCamurlukDegisim)
                    .addComponent(cbMarspiyelDegisim)
                    .addComponent(cbHavuzSaciDegisim)
                    .addComponent(cbArkaPanelDegisim)
                    .addComponent(cbTavanSaciDegisim))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbOrtaDirekDegisim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbMarspiyelDegisim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbArkaCamurlukDegisim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbHavuzSaciDegisim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbArkaPanelDegisim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTavanSaciDegisim)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Değişim", jPanel2);

        cbBoyaUygulananAksam.setText("BOYA UYGULANAN AKSAM");
        cbBoyaUygulananAksam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBoyaUygulananAksamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbBoyaUygulananAksam)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbBoyaUygulananAksam)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Boya", jPanel3);

        cbKaynakYapilanKaporta.setText("KAYNAK YAPILAN KAPORTA AKSAMI");
        cbKaynakYapilanKaporta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKaynakYapilanKaportaActionPerformed(evt);
            }
        });

        cbDuzeltmeYapilanKaporta.setText("DÜZELTME YAPILAN KAPORTA AKSAMI");
        cbDuzeltmeYapilanKaporta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDuzeltmeYapilanKaportaActionPerformed(evt);
            }
        });

        cbDegisenKaporta.setText("DEĞİŞEN KAPORTA AKSAMI ");
        cbDegisenKaporta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDegisenKaportaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbKaynakYapilanKaporta)
                    .addComponent(cbDuzeltmeYapilanKaporta)
                    .addComponent(cbDegisenKaporta))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbKaynakYapilanKaporta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDuzeltmeYapilanKaporta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDegisenKaporta)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Diğer", jPanel5);

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setText("Kazalı Araç Değer Kaybı Hesaplayıcı v1.0");

        lblAracDegeri.setText("Araç Değeri :");

        lblAracKM.setText("Araç KM :");

        btnCalculate.setText("Değer Hesapla");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblValue.setForeground(new java.awt.Color(204, 0, 0));
        lblValue.setText("Değer Kaybı :  ₺");

        lblNewCarValue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblNewCarValue.setForeground(new java.awt.Color(0, 153, 0));
        lblNewCarValue.setText("Yeni Araç Değeri : ₺");

        tableCarValue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İşlem", "Deger"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableCarValue);
        if (tableCarValue.getColumnModel().getColumnCount() > 0) {
            tableCarValue.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAracKM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCarKM, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAracDegeri)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCarPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(179, 179, 179))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValue, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNewCarValue, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(69, 69, 69))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAracDegeri)
                            .addComponent(txtCarPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAracKM)
                            .addComponent(txtCarKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNewCarValue))
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSaseDuzeltmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaseDuzeltmeActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbSaseDuzeltme.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithDiscretion(0.7));
            String data[] = {cbSaseDuzeltme.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbSaseDuzeltmeActionPerformed

    private void cbSaseKesmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaseKesmeActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbSaseKesme.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithDiscretion(0.75));
            String data[] = {cbSaseKesme.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbSaseKesmeActionPerformed

    private void cbTavanSaciDuzeltmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTavanSaciDuzeltmeActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbTavanSaciDuzeltme.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithDiscretion(0.7));
            String data[] = {cbTavanSaciDuzeltme.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbTavanSaciDuzeltmeActionPerformed

    private void cbOrtaDirekDuzeltmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrtaDirekDuzeltmeActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbOrtaDirekDuzeltme.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithDiscretion(0.7));
            String data[] = {cbOrtaDirekDuzeltme.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbOrtaDirekDuzeltmeActionPerformed

    private void cbArkaPanelDuzeltmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArkaPanelDuzeltmeActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbArkaPanelDuzeltme.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithDiscretion(0.7));
            String data[] = {cbArkaPanelDuzeltme.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbArkaPanelDuzeltmeActionPerformed

    private void cbHavuzSaciDuzeltmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHavuzSaciDuzeltmeActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbHavuzSaciDuzeltme.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithDiscretion(0.7));
            String data[] = {cbHavuzSaciDuzeltme.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbHavuzSaciDuzeltmeActionPerformed

    private void cbArkaCamurlukDuzeltmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArkaCamurlukDuzeltmeActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbArkaCamurlukDuzeltme.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithDiscretion(0.7));
            String data[] = {cbArkaCamurlukDuzeltme.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbArkaCamurlukDuzeltmeActionPerformed

    private void cbMarspiyelDuzeltmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMarspiyelDuzeltmeActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbMarspiyelDuzeltme.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithDiscretion(0.7));
            String data[] = {cbMarspiyelDuzeltme.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbMarspiyelDuzeltmeActionPerformed

    private void cbOrtaDirekDegisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrtaDirekDegisimActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbOrtaDirekDegisim.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(3));
            String data[] = {cbOrtaDirekDegisim.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbOrtaDirekDegisimActionPerformed

    private void cbMarspiyelDegisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMarspiyelDegisimActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbMarspiyelDegisim.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(3));
            String data[] = {cbMarspiyelDegisim.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbMarspiyelDegisimActionPerformed

    private void cbArkaCamurlukDegisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArkaCamurlukDegisimActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbArkaCamurlukDegisim.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(3.5));
            String data[] = {cbArkaCamurlukDegisim.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbArkaCamurlukDegisimActionPerformed

    private void cbHavuzSaciDegisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHavuzSaciDegisimActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbHavuzSaciDegisim.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(3));
            String data[] = {cbHavuzSaciDegisim.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbHavuzSaciDegisimActionPerformed

    private void cbArkaPanelDegisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbArkaPanelDegisimActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbArkaPanelDegisim.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(2.5));
            String data[] = {cbArkaPanelDegisim.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbArkaPanelDegisimActionPerformed

    private void cbTavanSaciDegisimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTavanSaciDegisimActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbTavanSaciDegisim.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(4.5));
            String data[] = {cbTavanSaciDegisim.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbTavanSaciDegisimActionPerformed

    private void cbBoyaUygulananAksamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBoyaUygulananAksamActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbBoyaUygulananAksam.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(0.75));
            String data[] = {cbBoyaUygulananAksam.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbBoyaUygulananAksamActionPerformed

    private void cbKaynakYapilanKaportaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKaynakYapilanKaportaActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbKaynakYapilanKaporta.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(1.2));
            String data[] = {cbKaynakYapilanKaporta.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbKaynakYapilanKaportaActionPerformed

    private void cbDuzeltmeYapilanKaportaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDuzeltmeYapilanKaportaActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbDuzeltmeYapilanKaporta.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(1.2));
            String data[] = {cbDuzeltmeYapilanKaporta.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbDuzeltmeYapilanKaportaActionPerformed

    private void cbDegisenKaportaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDegisenKaportaActionPerformed
        String carPrice = txtCarPrice.getText();
        String carKM = txtCarKM.getText();
        boolean state = false;
        if (carPrice.isEmpty() || carKM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lütfen önce Araç Değeri ve KM bilgisi giriniz.");
            cbDegisenKaporta.setSelected(state);
        } else {
            String s = String.valueOf(calculateWithNumber(1));
            String data[] = {cbDegisenKaporta.getText(), s};
            DefaultTableModel model = (DefaultTableModel) tableCarValue.getModel();
            model.addRow(data);
        }
    }//GEN-LAST:event_cbDegisenKaportaActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        double t = 0;
        for (int i = 0; i < tableCarValue.getRowCount(); i++) {
            t += Double.parseDouble(tableCarValue.getValueAt(i, 1).toString());
        }
        double carKM = Double.parseDouble(txtCarKM.getText());
        double degerKaybi;

        if (carKM < 15000) {
            degerKaybi = t;
        } else {
            degerKaybi = (t - ((t * (carKM - 15000) / 75000) / 2));
        }

        lblValue.setText("Değer Kaybı : " + String.format(Locale.US, "%.2f", degerKaybi) + " ₺");

        double carValue = Double.parseDouble(txtCarPrice.getText());
        double newCarValue = carValue - degerKaybi;

        lblNewCarValue.setText("Yeni Araç Değeri : " + String.format(Locale.US, "%.2f", newCarValue) + " ₺");
    }//GEN-LAST:event_btnCalculateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JCheckBox cbArkaCamurlukDegisim;
    private javax.swing.JCheckBox cbArkaCamurlukDuzeltme;
    private javax.swing.JCheckBox cbArkaPanelDegisim;
    private javax.swing.JCheckBox cbArkaPanelDuzeltme;
    private javax.swing.JCheckBox cbBoyaUygulananAksam;
    private javax.swing.JCheckBox cbDegisenKaporta;
    private javax.swing.JCheckBox cbDuzeltmeYapilanKaporta;
    private javax.swing.JCheckBox cbHavuzSaciDegisim;
    private javax.swing.JCheckBox cbHavuzSaciDuzeltme;
    private javax.swing.JCheckBox cbKaynakYapilanKaporta;
    private javax.swing.JCheckBox cbMarspiyelDegisim;
    private javax.swing.JCheckBox cbMarspiyelDuzeltme;
    private javax.swing.JCheckBox cbOrtaDirekDegisim;
    private javax.swing.JCheckBox cbOrtaDirekDuzeltme;
    private javax.swing.JCheckBox cbSaseDuzeltme;
    private javax.swing.JCheckBox cbSaseKesme;
    private javax.swing.JCheckBox cbTavanSaciDegisim;
    private javax.swing.JCheckBox cbTavanSaciDuzeltme;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAracDegeri;
    private javax.swing.JLabel lblAracKM;
    private javax.swing.JLabel lblNewCarValue;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTable tableCarValue;
    private javax.swing.JTextField txtCarKM;
    private javax.swing.JTextField txtCarPrice;
    // End of variables declaration//GEN-END:variables

}
