
package borcuchun;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class YeniBorcDaxilEtme extends javax.swing.JFrame {
    BorcMelumatPage borcmelumatpage = new BorcMelumatPage();
    
    public YeniBorcDaxilEtme() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setFocusable(true);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jad = new javax.swing.JTextField();
        jsoyad = new javax.swing.JTextField();
        jadlandirma = new javax.swing.JTextField();
        j_alinanmal = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        j_qaytarilanborc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtarix = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jad.setForeground(new java.awt.Color(102, 102, 255));

        jsoyad.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jsoyad.setForeground(new java.awt.Color(102, 102, 255));

        jadlandirma.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jadlandirma.setForeground(new java.awt.Color(153, 153, 153));
        jadlandirma.setText("Məs. 'Göyçaylı Səid'");
        jadlandirma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jadlandirmaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jadlandirmaFocusLost(evt);
            }
        });

        j_alinanmal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        j_alinanmal.setForeground(new java.awt.Color(255, 0, 0));
        j_alinanmal.setText("0");
        j_alinanmal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j_alinanmalKeyTyped(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cancel.setForeground(new java.awt.Color(102, 0, 255));
        cancel.setText("<<<         imtina et");
        cancel.setFocusable(false);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        save.setForeground(new java.awt.Color(102, 0, 255));
        save.setText("yadda saxla");
        save.setFocusable(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        j_qaytarilanborc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        j_qaytarilanborc.setForeground(new java.awt.Color(102, 102, 255));
        j_qaytarilanborc.setText("0");
        j_qaytarilanborc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                j_qaytarilanborcKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Adı:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Soyadı:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Şəxsə qısa tanınma əlavə et:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alınan MAL (BORC):");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Qaytarılan borc (Məbləğ):");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tarix:");

        jtarix.setDateFormatString("dd/MM/yyyy");
        jtarix.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Diqqət !   Mütləq oxu!");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(j_alinanmal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j_qaytarilanborc, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jad, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE))
                            .addComponent(jsoyad)))
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jtarix, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 100, Short.MAX_VALUE))
                            .addComponent(jadlandirma)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancel, save});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtarix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jadlandirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(j_alinanmal)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(j_qaytarilanborc))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {j_alinanmal, j_qaytarilanborc, jad, jadlandirma, jsoyad, jtarix});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancel, save});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j_qaytarilanborcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_qaytarilanborcKeyTyped
        char nomre=evt.getKeyChar();
        if(Character.isLetter(nomre) || evt.isAltDown() || evt.isShiftDown() || Character.isWhitespace(nomre))
        evt.consume();
    }//GEN-LAST:event_j_qaytarilanborcKeyTyped

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        borcmelumatpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void j_alinanmalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j_alinanmalKeyTyped
        char nomre=evt.getKeyChar();
        if(Character.isLetter(nomre) || evt.isAltDown() || evt.isShiftDown() || Character.isWhitespace(nomre))
        evt.consume();
    }//GEN-LAST:event_j_alinanmalKeyTyped

    private void jadlandirmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jadlandirmaFocusLost
        if(jadlandirma.getText().equalsIgnoreCase(""))
        {
            jadlandirma.setText("Məs. 'Göyçaylı Səid'");
            jadlandirma.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_jadlandirmaFocusLost

    private void jadlandirmaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jadlandirmaFocusGained
        if(jadlandirma.getText().equalsIgnoreCase("Məs. 'Göyçaylı Səid'"))
        {
            jadlandirma.setText("");
            jadlandirma.setForeground(new java.awt.Color(102, 102, 255));
        }
    }//GEN-LAST:event_jadlandirmaFocusGained

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        SQLiteConnection connection = new SQLiteConnection();
        int yoxlama=0; // şəxs əvvəlcə daxil edilməyibsə 0 qəbul edilir!
        
        String Tarix=((JTextField)jtarix.getDateEditor().getUiComponent()).getText();
        String Ad=jad.getText();
        String Soyad=jsoyad.getText();
        String Adlandirma=jadlandirma.getText();
        double AlinanBorc=Double.valueOf(j_alinanmal.getText());
        double QaytarilanBorc=0;
        if(!j_qaytarilanborc.getText().equals(""))
            QaytarilanBorc=Double.valueOf(j_qaytarilanborc.getText());
        
        // for ilə yoxlayıram ki, əgər əvvəlcə daxil etdiyim borcluların içində indi daxil edəcəyim üst üstə düşməsin
        for(int i=0; i<connection.comboboxda_cap().size(); i=i+3)
            if(Ad.equalsIgnoreCase(connection.comboboxda_cap().get(i).toString()) &&
                    Soyad.equalsIgnoreCase(connection.comboboxda_cap().get(i+1).toString()) &&
                    Adlandirma.equalsIgnoreCase(connection.comboboxda_cap().get(i+2).toString()))
            {
                yoxlama=1;
            }
        
        
        if(Tarix.equalsIgnoreCase("") || Ad.equalsIgnoreCase("") || Soyad.equalsIgnoreCase("") || Adlandirma.equalsIgnoreCase("") 
                || Adlandirma.equalsIgnoreCase("Məs. 'Göyçaylı Səid'") || AlinanBorc==0 || j_alinanmal.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(this, "Zəhmət olmasa xanaları düzgün doldurun!\nXanaları doldurmamış 'Diqqət! Mütləq oxu!' bölməsini oxuyun.",
                    "XƏBƏRDARLIQ MESAJI", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else
        {   
            if(yoxlama==1)//yoxlama nədir yuxarıda qeyd olunub
            {
            JOptionPane.showMessageDialog(this, "DİQQƏT !!!\nDaxil etdiyiniz şəxs hal hazırda sizin bazanızda "
                    + "vardır!\nZəhmət olmasa məlumatları dəqiqləşdirin.", "XƏTA MESAJI", JOptionPane.ERROR_MESSAGE);
            }
            
            else
            {
                connection.yeniBorcElave(Tarix, Ad, Soyad, Adlandirma, AlinanBorc, QaytarilanBorc);
                JOptionPane.showMessageDialog(null, "DİQQƏT!\nMəlumat daxil edildi.");
                
                borcmelumatpage.setVisible(true);
                dispose();
            }
        } 
    }//GEN-LAST:event_saveActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        String x="DİQQƏT!  Adı, soyadı, və şəxsin qısa təsvirini yazan zaman tam diqqətli olun... \n" +
        "Əgər MAL alınan zaman şəxsə ödəniş olunmayıbsa o zaman \"Qaytarılan borc (Məbləğ)\"\n" +
        "bölməsini boş qoymaq olar. Qalan bütün xanalar isə mütləq doldurulmalıdır!\n"+
        "RƏQƏM daxil edərkən kəsr hissəni(yəni qəpik daxil etsəniz) nöqtədən istifadə edin!";
        JOptionPane.showMessageDialog(this, x, "DİQQƏT", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(YeniBorcDaxilEtme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YeniBorcDaxilEtme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YeniBorcDaxilEtme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YeniBorcDaxilEtme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YeniBorcDaxilEtme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField j_alinanmal;
    private javax.swing.JTextField j_qaytarilanborc;
    private javax.swing.JTextField jad;
    private javax.swing.JTextField jadlandirma;
    private javax.swing.JTextField jsoyad;
    private com.toedter.calendar.JDateChooser jtarix;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
