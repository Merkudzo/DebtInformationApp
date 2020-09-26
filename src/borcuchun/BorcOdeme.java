
package borcuchun;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class BorcOdeme extends javax.swing.JFrame {
    int siranomresi; // bunu Borc Məlumat page-dən götürmüşəm ki, şəxsin Arraylistdə sıra nömrəsi neçədən başlayır bilim
    double TabledaSonQaliq;
    BorcMelumatPage borcmelumatpage=new BorcMelumatPage();
        
    
    public BorcOdeme() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setFocusable(true);
    }
    
    
    // BorcMelumatPage -dən seçilmiş şəxsin adını yuxarıda çap edir.
    public BorcOdeme(String shexs, int saygac) {
        initComponents();
        pulOdenecekShexs.setText(shexs);
        siranomresi=saygac; // bunu Borc Məlumat page-dən götürmüşəm ki, şəxsin Arraylistdə sıra nömrəsi neçədən başlayır bilim
        
        
        this.setLocationRelativeTo(null);
        jPanel1.setFocusable(true);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imtina = new javax.swing.JButton();
        save = new javax.swing.JButton();
        pulOdenecekShexs = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        J_yenidenAlinanMal = new javax.swing.JTextField();
        J_odenenMebleg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtarix = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        imtina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        imtina.setForeground(new java.awt.Color(102, 0, 255));
        imtina.setText("<<<    imtina et");
        imtina.setFocusable(false);
        imtina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imtinaActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(102, 0, 255));
        save.setText("yadda saxla");
        save.setFocusable(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        pulOdenecekShexs.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        pulOdenecekShexs.setForeground(new java.awt.Color(255, 0, 0));
        pulOdenecekShexs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("YENİDƏN alınan mal - BORC:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ödənən MƏBLƏĞ:");

        J_yenidenAlinanMal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        J_yenidenAlinanMal.setForeground(new java.awt.Color(255, 0, 0));
        J_yenidenAlinanMal.setText("0");
        J_yenidenAlinanMal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                J_yenidenAlinanMalKeyTyped(evt);
            }
        });

        J_odenenMebleg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        J_odenenMebleg.setForeground(new java.awt.Color(102, 0, 255));
        J_odenenMebleg.setText("0");
        J_odenenMebleg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                J_odenenMeblegKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TARİX:");

        jtarix.setForeground(new java.awt.Color(102, 0, 255));
        jtarix.setDateFormatString("dd/MM/yyyy");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DİQQƏT! Əgər yenidən mal alınmayıbsa bura '0' olaraq da qalmalıdır!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(imtina)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pulOdenecekShexs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(J_yenidenAlinanMal)
                                        .addComponent(jtarix, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(J_odenenMebleg, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {imtina, save});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pulOdenecekShexs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtarix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(J_yenidenAlinanMal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(J_odenenMebleg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imtina)
                    .addComponent(save))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {J_odenenMebleg, J_yenidenAlinanMal});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {imtina, save});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        SQLiteConnection connection = new SQLiteConnection();
        String Tarix=((JTextField)jtarix.getDateEditor().getUiComponent()).getText();
        String ad=connection.comboboxda_cap().get(siranomresi).toString();
        String soyad=connection.comboboxda_cap().get(siranomresi+1).toString();
        String adlandirma=connection.comboboxda_cap().get(siranomresi+2).toString();
        double YenidenAlinanMal=0;
        if(!J_yenidenAlinanMal.getText().equals(""))        
            YenidenAlinanMal=Double.valueOf(J_yenidenAlinanMal.getText());
        double odenenmebleg=0;
        if(!J_odenenMebleg.getText().equals(""))
            odenenmebleg=Double.valueOf(J_odenenMebleg.getText());
        
        
        if(Tarix.equals("")){
            JOptionPane.showMessageDialog(this, "DİQQƏT !!!\nTarix xanası mütləq doldurulmalıdır!", "XƏTA MESAJI", JOptionPane.ERROR_MESSAGE);}
        else{
            if(YenidenAlinanMal==0 && odenenmebleg==0){
                JOptionPane.showMessageDialog(this, "DİQQƏT !!!\n'Yenidən alınan mal-BORC' və 'Ödənən məbləğ' "
                        + "xanaları eyni anda 0 ola bilməz!", "XƏTA MESAJI", JOptionPane.ERROR_MESSAGE);}
            else
            {
                connection.yeniBorcElave(Tarix, ad, soyad, adlandirma, YenidenAlinanMal, odenenmebleg);
                JOptionPane.showMessageDialog(null, "DİQQƏT!\nMəlumat daxil edildi.");
                
                dispose();
                borcmelumatpage.setVisible(true);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void imtinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imtinaActionPerformed
        borcmelumatpage.setVisible(true);
        dispose();
    }//GEN-LAST:event_imtinaActionPerformed

    private void J_yenidenAlinanMalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_yenidenAlinanMalKeyTyped
        char nomre=evt.getKeyChar();
        if(Character.isLetter(nomre) || evt.isAltDown() || evt.isShiftDown() || Character.isWhitespace(nomre))
        evt.consume();
    }//GEN-LAST:event_J_yenidenAlinanMalKeyTyped

    private void J_odenenMeblegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_odenenMeblegKeyTyped
        char nomre=evt.getKeyChar();
        if(Character.isLetter(nomre) || evt.isAltDown() || evt.isShiftDown() || Character.isWhitespace(nomre))
        evt.consume();
    }//GEN-LAST:event_J_odenenMeblegKeyTyped

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
            java.util.logging.Logger.getLogger(BorcOdeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorcOdeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorcOdeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorcOdeme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorcOdeme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField J_odenenMebleg;
    private javax.swing.JTextField J_yenidenAlinanMal;
    private javax.swing.JButton imtina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser jtarix;
    private javax.swing.JLabel pulOdenecekShexs;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
