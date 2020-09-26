
package borcuchun;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.text.MessageFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author said.memmedov // email said.mammadov.94@gmail.com // Tel: 050-544-58-93
 */
public class BorcMelumatPage extends javax.swing.JFrame {
    DefaultTableModel tablemodel = new DefaultTableModel();
    Connection conn=null;
    double kecid_borc=0;     // qalıq borcları hesablayarkən istifadə edirəm
    String secilmis_borclu;  // comboboxda ArrayListən gələn üç məlumatın birləşməsidir
    int saygac=0;            // ArrayListdə ad, soyad, adlanma neçənci siradan başlayır onu bildirir. aşağıda for -da istifadə olunub
    
    public BorcMelumatPage() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setFocusable(true);
        
        sehifenin_goruntusu();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        yeni_borc = new javax.swing.JButton();
        ode = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        borclularin_siyahisi = new javax.swing.JComboBox<>();
        goster = new javax.swing.JButton();
        cap_et = new javax.swing.JButton();
        adi_goster = new javax.swing.JLabel();
        Jlabelcemialinanmal = new javax.swing.JLabel();
        Jlabelcemiqaytarilanborc = new javax.swing.JLabel();
        Jlabelcemiqaliqborc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        axtar = new javax.swing.JTextField();
        umumi_axtar = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        sil = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        redaktePanel = new javax.swing.JPanel();
        redakteAlinanMal = new javax.swing.JTextField();
        redakteTarix = new javax.swing.JTextField();
        redakteQaytarilanBorc = new javax.swing.JTextField();
        redakte_label = new javax.swing.JLabel();
        redakteİmtina = new javax.swing.JButton();
        redakteTesdiq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CƏMİ:");

        yeni_borc.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        yeni_borc.setForeground(new java.awt.Color(102, 0, 255));
        yeni_borc.setText("+  yeni borc");
        yeni_borc.setFocusable(false);
        yeni_borc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeni_borcActionPerformed(evt);
            }
        });

        ode.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ode.setForeground(new java.awt.Color(102, 0, 255));
        ode.setText("ödə və ya yenidən mal al ");
        ode.setFocusable(false);
        ode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Borc-Ödəniş məlumat səhifəsi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jTable.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarix:", "Alınan mal (BORC):", "Qaytarılan BORC:", "QALIQ borc:", "IDl"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable.setMinimumSize(new java.awt.Dimension(80, 0));
        jTable.setName(""); // NOI18N
        jScrollPane1.setViewportView(jTable);

        borclularin_siyahisi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        borclularin_siyahisi.setForeground(new java.awt.Color(102, 0, 255));
        borclularin_siyahisi.setMaximumRowCount(5);
        borclularin_siyahisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borclularin_siyahisiActionPerformed(evt);
            }
        });

        goster.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        goster.setForeground(new java.awt.Color(102, 0, 255));
        goster.setText("göstər");
        goster.setFocusable(false);
        goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterActionPerformed(evt);
            }
        });

        cap_et.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cap_et.setForeground(new java.awt.Color(102, 0, 255));
        cap_et.setText("çap et");
        cap_et.setFocusable(false);
        cap_et.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cap_etActionPerformed(evt);
            }
        });

        adi_goster.setFont(new java.awt.Font("Times New Roman", 3, 20)); // NOI18N
        adi_goster.setForeground(new java.awt.Color(255, 255, 255));
        adi_goster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Jlabelcemialinanmal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jlabelcemialinanmal.setForeground(new java.awt.Color(255, 255, 255));
        Jlabelcemialinanmal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Jlabelcemiqaytarilanborc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jlabelcemiqaytarilanborc.setForeground(new java.awt.Color(255, 255, 255));
        Jlabelcemiqaytarilanborc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Jlabelcemiqaliqborc.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Jlabelcemiqaliqborc.setForeground(new java.awt.Color(255, 255, 255));
        Jlabelcemiqaliqborc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AXTAR:");

        axtar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        axtar.setForeground(new java.awt.Color(102, 0, 255));
        axtar.setToolTipText("");
        axtar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                axtarKeyReleased(evt);
            }
        });

        umumi_axtar.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        umumi_axtar.setForeground(new java.awt.Color(102, 0, 255));
        umumi_axtar.setText("ümumi axtar");
        umumi_axtar.setFocusable(false);
        umumi_axtar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umumi_axtarActionPerformed(evt);
            }
        });

        edit.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        edit.setForeground(new java.awt.Color(102, 0, 255));
        edit.setText("redaktə et");
        edit.setFocusable(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        sil.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        sil.setForeground(new java.awt.Color(255, 0, 0));
        sil.setText("sil");
        sil.setFocusable(false);
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        refresh.setForeground(new java.awt.Color(102, 0, 255));
        refresh.setText("səhifəni yenilə");
        refresh.setFocusable(false);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adi_goster, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(borclularin_siyahisi, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(goster)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(refresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(umumi_axtar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(axtar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Jlabelcemialinanmal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Jlabelcemiqaytarilanborc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(yeni_borc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ode, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(edit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sil)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(cap_et))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Jlabelcemiqaliqborc, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Jlabelcemiqaliqborc, Jlabelcemiqaytarilanborc});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(borclularin_siyahisi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(goster))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(refresh)
                        .addComponent(umumi_axtar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adi_goster, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(axtar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabelcemialinanmal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabelcemiqaytarilanborc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jlabelcemiqaliqborc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yeni_borc)
                    .addComponent(ode)
                    .addComponent(cap_et)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sil))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cap_et, edit, ode, sil});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {goster, refresh, umumi_axtar});

        redaktePanel.setBackground(new java.awt.Color(153, 153, 255));

        redakteAlinanMal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        redakteAlinanMal.setForeground(new java.awt.Color(102, 0, 255));
        redakteAlinanMal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                redakteAlinanMalKeyTyped(evt);
            }
        });

        redakteTarix.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        redakteTarix.setForeground(new java.awt.Color(102, 0, 255));
        redakteTarix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                redakteTarixKeyTyped(evt);
            }
        });

        redakteQaytarilanBorc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        redakteQaytarilanBorc.setForeground(new java.awt.Color(102, 0, 255));
        redakteQaytarilanBorc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                redakteQaytarilanBorcKeyTyped(evt);
            }
        });

        redakte_label.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        redakte_label.setForeground(new java.awt.Color(255, 0, 51));
        redakte_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        redakte_label.setText("DİQQƏT! Seçilmiş sətri redaktə etmək üçün aşağıdakı məlumatları tam doldur.");

        redakteİmtina.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        redakteİmtina.setForeground(new java.awt.Color(102, 0, 255));
        redakteİmtina.setText("imtina");
        redakteİmtina.setFocusable(false);
        redakteİmtina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redakteİmtinaActionPerformed(evt);
            }
        });

        redakteTesdiq.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        redakteTesdiq.setForeground(new java.awt.Color(102, 0, 255));
        redakteTesdiq.setText("təsdiq");
        redakteTesdiq.setFocusable(false);
        redakteTesdiq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redakteTesdiqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout redaktePanelLayout = new javax.swing.GroupLayout(redaktePanel);
        redaktePanel.setLayout(redaktePanelLayout);
        redaktePanelLayout.setHorizontalGroup(
            redaktePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redaktePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(redaktePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(redaktePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(redakteTarix, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redakteAlinanMal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redakteQaytarilanBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(redakteTesdiq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redakteİmtina)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(redaktePanelLayout.createSequentialGroup()
                        .addComponent(redakte_label, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addGap(283, 283, 283))))
        );

        redaktePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {redakteTesdiq, redakteİmtina});

        redaktePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {redakteAlinanMal, redakteQaytarilanBorc});

        redaktePanelLayout.setVerticalGroup(
            redaktePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redaktePanelLayout.createSequentialGroup()
                .addComponent(redakte_label, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(redaktePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redakteTarix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redakteAlinanMal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redakteQaytarilanBorc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redakteTesdiq, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redakteİmtina)))
        );

        redaktePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {redakteAlinanMal, redakteQaytarilanBorc, redakteTarix});

        redaktePanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {redakteTesdiq, redakteİmtina});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(redaktePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(redaktePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borclularin_siyahisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borclularin_siyahisiActionPerformed
        
        
    }//GEN-LAST:event_borclularin_siyahisiActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterActionPerformed
        SQLiteConnection connection = new SQLiteConnection();
        saygac=0;
        // Əvvəlcə GÖSTƏR düyməsini sıxanda Comboboxda hansı adı seçmişəmsə
        // o adı götürüb SQLİTEconnectiondan gələn ad soyad və adlanma-nı
        // birləşdirib müqayisə edirəm əgər düz gəlirsə sql-dən gələn məlumatları
        //aşağıda olan ad, soyad, adlandirmaya əlavə edirəm  >>>
        
        secilmis_borclu=borclularin_siyahisi.getSelectedItem().toString();
        for(int i=0; i<connection.comboboxda_cap().size(); i=i+3 )
        {
            String a=connection.comboboxda_cap().get(i).toString();
            String b=connection.comboboxda_cap().get(i+1).toString();
            String c=connection.comboboxda_cap().get(i+2).toString();
            String abc=a+" "+b+" "+c;
            
            if(abc.equalsIgnoreCase(secilmis_borclu))
            {
                break;
            }
            saygac=saygac+3;
        }
        // yuxarıda dediyim əlavə etmək bax bunu nəzərdə tuturam
        // aşağıdakı bu üç məlumat mənə həm table-da həm də qalıq çıxardanda lazım olacaq
        String ad=connection.comboboxda_cap().get(saygac).toString();
        String soyad=connection.comboboxda_cap().get(saygac+1).toString();
        String adlandirma=connection.comboboxda_cap().get(saygac+2).toString();
        
        // Əvvəlcə tableda olan məlumat təmizlənir
        while(tablemodel.getRowCount()>0)
        {
            for(int i=0; i< tablemodel.getRowCount(); i++)
            {
                tablemodel.removeRow(i);
            }
        }
        //sonra isə yeni məlumatlar çap edilir ekranda
        tableda_cap(ad, soyad, adlandirma);
        // <<< bura kimi
       
        
        
        // TABLE-ın  yuxarısında mərkəzdə adı, soyadı, adlandırmasını çap edir 
        adi_goster.setText((String) borclularin_siyahisi.getSelectedItem()+" haqqında MƏLUMATLAR");
        
        
        // Table-in həm sonunda Hər şeyi cəmləyib göstərir 
        // Həmçinin Table-ın aşağı hissəsində Jlabel kimi çap edir
        int setirsayi=jTable.getRowCount();
        double cemialinanmal=0.0; 
        double cemiqaytarilanborc=0.0; 
        for(int k=0; k<setirsayi; k++)
        {
            double a=(double) tablemodel.getValueAt(k, 1);
            double b=(double) tablemodel.getValueAt(k, 2);
            cemialinanmal=cemialinanmal+a;
            cemiqaytarilanborc=cemiqaytarilanborc+b;   
        }

        Jlabelcemialinanmal.setText(String.valueOf(cemialinanmal));
        Jlabelcemiqaytarilanborc.setText(String.valueOf(cemiqaytarilanborc));
        double cemiqaliqborc=(double) jTable.getValueAt(setirsayi-1, 3);
        Jlabelcemiqaliqborc.setText(String.valueOf(cemiqaliqborc));
        
        Object cemi[]=new Object[4];
        cemi[0]="CƏMİ :";
        cemi[1]=cemialinanmal;
        cemi[2]=cemiqaytarilanborc;
        cemi[3]=cemiqaliqborc;
        tablemodel.addRow(cemi);
        
    }//GEN-LAST:event_gosterActionPerformed

    private void cap_etActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cap_etActionPerformed
        try {
            MessageFormat header=new MessageFormat(secilmis_borclu+" haqqında ümumi HESABAT");
            MessageFormat footer=new MessageFormat("Təhvil verdi: ______________                                       Təhvil aldı:______________");
            jTable.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cap_etActionPerformed

    private void yeni_borcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeni_borcActionPerformed
        YeniBorcDaxilEtme yeniBorcDaxilEtme =new YeniBorcDaxilEtme();
        
        yeniBorcDaxilEtme.setVisible(true);
        dispose();
    }//GEN-LAST:event_yeni_borcActionPerformed

    private void odeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odeActionPerformed
        
        // Comboboxda seçilmiş şəxsin adını ödəmə səhifəsində çapa verir həmçinin eyni anda ödəmə səhifəsini açır.
        new BorcOdeme(secilmis_borclu, saygac).setVisible(true);
        dispose();
    }//GEN-LAST:event_odeActionPerformed

    private void axtarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_axtarKeyReleased
        DefaultTableModel table=(DefaultTableModel) jTable.getModel();
        String search = axtar.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        jTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_axtarKeyReleased

    private void umumi_axtarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umumi_axtarActionPerformed
        UmumiAxtar umumiaxtar=new UmumiAxtar();
        umumiaxtar.setVisible(true);
    }//GEN-LAST:event_umumi_axtarActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        redaktePanel.setVisible(true);
        int cerge=jTable.getSelectedRow();
        if(tablemodel.getValueAt(cerge, 0).toString().equals("CƏMİ :"))
            JOptionPane.showMessageDialog(this, "DİQQƏT !!!\nBu sətri redaktə etmək olmaz!", "XƏTA MESAJI", JOptionPane.ERROR_MESSAGE);
        else
        {
            redakteTarix.setText(tablemodel.getValueAt(cerge, 0).toString());
            redakteAlinanMal.setText(String.valueOf(tablemodel.getValueAt(cerge, 1)));
            redakteQaytarilanBorc.setText(String.valueOf(tablemodel.getValueAt(cerge, 2)));
        }
    }//GEN-LAST:event_editActionPerformed

    private void redakteTesdiqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redakteTesdiqActionPerformed
        SQLiteConnection connection=new SQLiteConnection();
        
        String DeyisilecekTarix=redakteTarix.getText();
        double alinanmal=Double.valueOf(redakteAlinanMal.getText());
        double qaytarilanborc=Double.valueOf(redakteQaytarilanBorc.getText());
        int id=(int) jTable.getValueAt(jTable.getSelectedRow(), 4);
        
        String parol="merkudzo";
        String alinanparol=JOptionPane.showInputDialog("Dəyişiklikləri yadda saxlamaq üçün şifrəni daxil et:");
        
        if(parol.equals(alinanparol))
        {
            connection.Update(DeyisilecekTarix, alinanmal, qaytarilanborc, id); 
            JOptionPane.showMessageDialog(this, "DİQQƏT !!!\nMəlumat dəyişdirildi", "MƏLUMAT MESAJI", JOptionPane.INFORMATION_MESSAGE);
            redaktePanel.setVisible(false);
        }
        else
            JOptionPane.showMessageDialog(this, "DİQQƏT !!!\nŞifrəni səhv daxil etdin!\nMəlumat yaddaşa yazılmadı.", "XƏTA MESAJI", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_redakteTesdiqActionPerformed

    private void redakteİmtinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redakteİmtinaActionPerformed
        redaktePanel.setVisible(false);
    }//GEN-LAST:event_redakteİmtinaActionPerformed

    private void redakteTarixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_redakteTarixKeyTyped
        char nomre=evt.getKeyChar();
        if(Character.isLetter(nomre) || evt.isAltDown() || evt.isShiftDown() || Character.isWhitespace(nomre))
        evt.consume();
    }//GEN-LAST:event_redakteTarixKeyTyped

    private void redakteAlinanMalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_redakteAlinanMalKeyTyped
        char nomre=evt.getKeyChar();
        if(Character.isLetter(nomre) || evt.isAltDown() || evt.isShiftDown() || Character.isWhitespace(nomre))
        evt.consume();
    }//GEN-LAST:event_redakteAlinanMalKeyTyped

    private void redakteQaytarilanBorcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_redakteQaytarilanBorcKeyTyped
        char nomre=evt.getKeyChar();
        if(Character.isLetter(nomre) || evt.isAltDown() || evt.isShiftDown() || Character.isWhitespace(nomre))
        evt.consume();
    }//GEN-LAST:event_redakteQaytarilanBorcKeyTyped

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        SQLiteConnection connection = new SQLiteConnection();
        int cerge=jTable.getSelectedRow();
        int silinecek_id = 0;
        if(null!=tablemodel.getValueAt(cerge, 4))
            silinecek_id=(int) tablemodel.getValueAt(cerge, 4);
        
        if(tablemodel.getValueAt(cerge, 0).toString().equals("CƏMİ :"))
            JOptionPane.showMessageDialog(this, "DİQQƏT !!!\nBu sətri SİLMƏK olmaz!", "XƏTA MESAJI", JOptionPane.ERROR_MESSAGE);
        else
        {
            String parol="merkudzo";
            String alinanparol=JOptionPane.showInputDialog("DIQQƏT!!!\nSeçilmiş cərgə silinəcək!\nSilməyi davam etmək üçün şifrəni daxil et:");
            if(parol.equals(alinanparol))
            {
                connection.Delete(silinecek_id);  tablemodel.removeRow(cerge);
                JOptionPane.showMessageDialog(this, "DİQQƏT !!!\nSeçilmiş cərgə silindi!", "MƏLUMAT MESAJI", JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(this, "DİQQƏT !!!\nŞifrəni səhv daxil etdin!\nSeçilmiş cərgə silinmədi.", "XƏTA MESAJI", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_silActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        borclularin_siyahisi.removeAllItems();
        
        dispose();
        this.setVisible(true);
        sehifenin_goruntusu();
    }//GEN-LAST:event_refreshActionPerformed

    
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
            java.util.logging.Logger.getLogger(BorcMelumatPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorcMelumatPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorcMelumatPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorcMelumatPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorcMelumatPage().setVisible(true);
            }
        });
    }
    
    public void tableda_cap(String ad, String soyad, String adlandirma){
        SQLiteConnection connection = new SQLiteConnection();
        String sql="SELECT * FROM borc_aldiqlarim WHERE ad like ? AND soyad like ? AND adlandirma like ?" ;
        try {
            conn=DriverManager.getConnection(connection.url);
            PreparedStatement stmnt =conn.prepareStatement(sql);
            stmnt.setString(1, ad);
            stmnt.setString(2, soyad);
            stmnt.setString(3, adlandirma);
            ResultSet rs=stmnt.executeQuery();
            
            Object setirler[]=new Object[5]; 
            while(rs.next()){
                setirler[0]=rs.getString("tarix");
                setirler[1]=rs.getDouble("alinan_borc");
                setirler[2]=rs.getDouble("qaytarilan_borc");
                setirler[4]=rs.getInt("id");
                tablemodel.addRow(setirler);
                
            }
            int setirsayi=tablemodel.getRowCount();
            // Məbləğ qaytarılarkən qalıqda nə qədər pul qaldığını table.da göstərir aşağıdakı əmrlər
            kecid_borc=0;
            for(int i=0; i<setirsayi; i++)
                {
                    double AlinanBorc=(double) tablemodel.getValueAt(i, 1);
                    double odenenBorc=(double) tablemodel.getValueAt(i, 2);
                    double sonQaliq=AlinanBorc-odenenBorc+kecid_borc;
                    
                    tablemodel.setValueAt(sonQaliq, i, 3);
                    kecid_borc=sonQaliq;
                }
                       
        } catch (Exception e) {
        }      
}

    public void sehifenin_goruntusu()
    {
        Object sutunun_adi[]={"Tarix","Alınan mal - BORC","Qaytarılan məbləğ","Qalıq Borc","ID"};
        tablemodel.setColumnIdentifiers(sutunun_adi);
        jTable.setModel(tablemodel);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(104);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        // aşağıdakı əmrlər Sqliteconnectionda düzəltdiyim  Arraylistdən
        // məlumatı alıb ÜÇ veriləni birləşdirib adların ümumi siyahısında çap edir >>>>
        SQLiteConnection connection = new SQLiteConnection();
        String ad, soyad, adlandirma;
        for(int i=0; i<connection.comboboxda_cap().size(); i=i+3)
        { 
            ad=connection.comboboxda_cap().get(i).toString();
            soyad=connection.comboboxda_cap().get(i+1).toString();
            adlandirma=connection.comboboxda_cap().get(i+2).toString();
            String ucunun_birlesmesi=ad+" "+soyad+" "+adlandirma;
            borclularin_siyahisi.addItem(ucunun_birlesmesi);
        } 
        // <<<<< bura kimi !
        
        
        // Burada JTable görüntüsünü düzəltmişəm istəyə uyğun
          jTable.getTableHeader().setFont(new java.awt.Font("Arial", 1, 16));
          jTable.getTableHeader().setForeground(Color.BLACK);
          jTable.setRowHeight(23); 
          jTable.setShowGrid(true); 
          jTable.setFont(new java.awt.Font("Times New Roman", 0, 14));
        

          redaktePanel.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabelcemialinanmal;
    private javax.swing.JLabel Jlabelcemiqaliqborc;
    private javax.swing.JLabel Jlabelcemiqaytarilanborc;
    private javax.swing.JLabel adi_goster;
    private javax.swing.JTextField axtar;
    private javax.swing.JComboBox<String> borclularin_siyahisi;
    private javax.swing.JButton cap_et;
    private javax.swing.JButton edit;
    private javax.swing.JButton goster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton ode;
    private javax.swing.JTextField redakteAlinanMal;
    private javax.swing.JPanel redaktePanel;
    private javax.swing.JTextField redakteQaytarilanBorc;
    private javax.swing.JTextField redakteTarix;
    private javax.swing.JButton redakteTesdiq;
    private javax.swing.JLabel redakte_label;
    private javax.swing.JButton redakteİmtina;
    private javax.swing.JButton refresh;
    private javax.swing.JButton sil;
    private javax.swing.JButton umumi_axtar;
    private javax.swing.JButton yeni_borc;
    // End of variables declaration//GEN-END:variables
}
