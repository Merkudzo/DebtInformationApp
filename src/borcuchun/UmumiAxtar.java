
package borcuchun;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class UmumiAxtar extends javax.swing.JFrame {
    DefaultTableModel tablemodel=new DefaultTableModel();
    Connection conn=null;
    
    public UmumiAxtar() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setFocusable(true);
        
        Object sutunun_adi[]={"ID","Tarix","Adı","Soyadı","Şəxsin qısa təsviri", "Alınan mal - BORC","Qaytarılan məbləğ"};
        tablemodel.setColumnIdentifiers(sutunun_adi);
        jTableUmumi.setModel(tablemodel);
        jTableUmumi.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTableUmumi.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableUmumi.getColumnModel().getColumn(2).setPreferredWidth(110);
        jTableUmumi.getColumnModel().getColumn(3).setPreferredWidth(110);
        jTableUmumi.getColumnModel().getColumn(4).setPreferredWidth(130);
        jTableUmumi.getColumnModel().getColumn(5).setPreferredWidth(135);
        jTableUmumi.getColumnModel().getColumn(6).setPreferredWidth(135);
        
        
        tableda_cap();
        
        
        jTableUmumi.getTableHeader().setFont(new java.awt.Font("Arial", 1, 14));
        jTableUmumi.getTableHeader().setForeground(Color.BLACK);
        jTableUmumi.setRowHeight(23); 
        jTableUmumi.setShowGrid(true); 
        jTableUmumi.setFont(new java.awt.Font("Times New Roman", 0, 14));
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUmumi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        axtar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jTableUmumi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(jTableUmumi);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AXTAR:");

        axtar.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        axtar.setForeground(new java.awt.Color(102, 0, 255));
        axtar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                axtarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(axtar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(axtar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
        );

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

    private void axtarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_axtarKeyReleased
        DefaultTableModel table=(DefaultTableModel) jTableUmumi.getModel();
        String search = axtar.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTableUmumi.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_axtarKeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UmumiAxtar().setVisible(true);
            }
        });
    }
    public void tableda_cap(){
        SQLiteConnection connection = new SQLiteConnection();
        String sql="SELECT * FROM borc_aldiqlarim ORDER BY ad,soyad,adlandirma" ;
        try {
            conn=DriverManager.getConnection(connection.url);
            Statement stmnt =conn.createStatement();
            ResultSet rs=stmnt.executeQuery(sql);
            
            Object setirler[]=new Object[7]; 
            while(rs.next()){
                setirler[0]=rs.getInt("ID");
                setirler[1]=rs.getString("tarix");
                setirler[2]=rs.getString("ad");
                setirler[3]=rs.getString("soyad");
                setirler[4]=rs.getString("adlandirma");
                setirler[5]=rs.getDouble("alinan_borc");
                setirler[6]=rs.getDouble("qaytarilan_borc");             
                tablemodel.addRow(setirler);
            }
                       
        } catch (Exception e) {
        }      
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField axtar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUmumi;
    // End of variables declaration//GEN-END:variables
}
