/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class NewClass {
    

    String nama;
    int nip,gol,gapok,lembur,jamker,tl,galem,gaber,tun,pjk,ul,GP,tg;
    float x=0.15f, y=0.1f;
    /**
     * Creates new form formcrud
     */
    public formcrud() {
        initComponents();
        kosong();
        load_table();
        
        add(gol1);
        add(gol2);
        add(gol3);
        add(gol4);
        add(gol5);
    }
    
    public void load_data(){
        nama = tnama.getText();
        nip = Integer.parseInt(tnip.getText());
    }
    
     private void load_table(){
        // membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("NIP");
        model.addColumn("NAMA");
        model.addColumn("GOLONGAN");
        model.addColumn("GAJI POKOK");
        model.addColumn("LEMBUR");
        model.addColumn("JAM KERJA");
        model.addColumn("JAM LEMBUR");
        model.addColumn("GAJI PEGAWAI");
        model.addColumn("GAJI LEMBUR");
        model.addColumn("TOTAL GAJI PEGAWAI");
        model.addColumn("GAJI BERSIH");
        
        
        //menampilkan data database kedalam tabel
        try {
            int no=1;
            String sql = "select * from pegawai";
            java.sql.Connection conn=(Connection)connection.konekDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),
                res.getString(5), res.getString(6),res.getString(7), res.getString(8), res.getString(9),
                res.getString(10), res.getString(11),});
            }
            tabel.setModel(model);
        } catch (Exception e) {
        }
        }
     
     private void kosong(){
        tnip.setText(null);
        tnama.setText(null);
        tgapok.setText(null);
        tlembur.setText(null);
        tjaker.setText(null);
        tjalem.setText(null);
        tgapeg.setText(null);
        tgalem.setText(null);
        ttotal.setText(null);
        tgaber.setText(null);
     }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        tnip = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        tgapok = new javax.swing.JTextField();
        tlembur = new javax.swing.JTextField();
        tjaker = new javax.swing.JTextField();
        tjalem = new javax.swing.JTextField();
        tgapeg = new javax.swing.JTextField();
        tgalem = new javax.swing.JTextField();
        ttotal = new javax.swing.JTextField();
        tgaber = new javax.swing.JTextField();
        bgsimpan = new javax.swing.JTextField();
        bgkeluar = new javax.swing.JTextField();
        bgproses = new javax.swing.JTextField();
        gol1 = new javax.swing.JRadioButton();
        gol2 = new javax.swing.JRadioButton();
        gol3 = new javax.swing.JRadioButton();
        gol4 = new javax.swing.JRadioButton();
        gol5 = new javax.swing.JRadioButton();
        jTextField12 = new javax.swing.JTextField();
        hitung1 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        hitung2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("NIP");

        jTextField2.setText("Nama Pegawai");

        jTextField3.setText("Golongan");

        jTextField4.setText("Gaji Pokok");

        jTextField5.setText("Lembur");

        jTextField6.setText("Jam Kerja");

        jTextField7.setText("Jam Lembur");

        jTextField8.setText("Gaji Pegawai");

        jTextField9.setText("Gaji Lembur");

        jTextField10.setText("Total Gaji");

        jTextField11.setText("Gaji Bersih");

        tnip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnipActionPerformed(evt);
            }
        });

        tnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnamaActionPerformed(evt);
            }
        });

        bgsimpan.setText("SIMPAN");
        bgsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgsimpanActionPerformed(evt);
            }
        });

        bgkeluar.setText("KELUAR");
        bgkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgkeluarActionPerformed(evt);
            }
        });

        bgproses.setText("PROSES");
        bgproses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgprosesActionPerformed(evt);
            }
        });

        gol1.setText("1");
        gol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gol1ActionPerformed(evt);
            }
        });

        gol2.setText("2");
        gol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gol2ActionPerformed(evt);
            }
        });

        gol3.setText("3");
        gol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gol3ActionPerformed(evt);
            }
        });

        gol4.setText("4");
        gol4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gol4ActionPerformed(evt);
            }
        });

        gol5.setText("5");
        gol5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gol5ActionPerformed(evt);
            }
        });

        jTextField12.setText("hitung");

        hitung1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung1ActionPerformed(evt);
            }
        });

        jTextField13.setText("hitung1");

        hitung2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung2ActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIP", "NAMA", "GOLONGAN ", "GAJI POKOK", "LEMBUR", "JAM KERJA", "JAM LEMBUR", "GAJI PEGAWAI", "GAJI LEMBUR", "TOTAL GAJI PEGAWAI", "GAJI BERSIH"
            }
        ));
        tabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hitung1)
                    .addComponent(hitung2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9)
                            .addComponent(jTextField10)
                            .addComponent(jTextField11))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gol1)
                                    .addComponent(gol2))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gol4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(gol3)
                                        .addGap(35, 35, 35)
                                        .addComponent(gol5))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ttotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                .addComponent(tgalem, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tgapeg, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tjalem, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tjaker, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tlembur, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tnama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tgapok, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tnip, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(tgaber, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField12)
                                    .addContainerGap(356, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addContainerGap(325, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bgkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bgsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bgproses, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hitung1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gol1)
                                    .addComponent(gol3)
                                    .addComponent(gol5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gol2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(gol4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgapok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tlembur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tjaker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tjalem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hitung2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118)
                        .addComponent(bgproses, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(bgsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgapeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(bgkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgalem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnipActionPerformed

    private void tnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnamaActionPerformed

    private void bgkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_bgkeluarActionPerformed

    private void bgprosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgprosesActionPerformed
        // TODO add your handling code here:
         try {
            String sql ="UPDATE karyawan SET nama = '"+nip+"',nama = '"+nama+"', gol = '"+gol+"', gapok = '"+gapok+"', ul = '"+tl+
                    "', jamker = '"+jamker+"', lembur = '"+lembur+"', GaPe = '"+GP+"', galem = '"+galem+
                    "', total = '"+tg+"', gaber = '"+gaber+"' WHERE nip = '"+nip+"'";
            java.sql.Connection conn=(Connection)connection.konekDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
        load_table();
        kosong();
        
    }//GEN-LAST:event_bgprosesActionPerformed

    private void bgsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgsimpanActionPerformed
        // TODO add your handling code here:
        load_data();
        try {
            String sql = "INSERT INTO karyawan VALUES ('"+nip+"','"+nama+"','"+gol+"','"+gapok+"','"+tl+"','"+jamker+"','"+lembur+
                    "','"+GP+"','"+galem+"','"+tg+"','"+gaber+"')";
            java.sql.Connection conn=(Connection)connection.konekDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
    }//GEN-LAST:event_bgsimpanActionPerformed

    private void gol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gol1ActionPerformed
        // TODO add your handling code here:
        tgapok.setText("500000");
        tlembur.setText("5000");
        gol = 1;
    }//GEN-LAST:event_gol1ActionPerformed

    private void gol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gol2ActionPerformed
        // TODO add your handling code here:
        tgapok.setText("300000");
        tlembur.setText("3000");
        gol = 2;
    }//GEN-LAST:event_gol2ActionPerformed

    private void gol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gol3ActionPerformed
        // TODO add your handling code here:
        tgapok.setText("250000");
        tlembur.setText("2000");
        gol = 3;
    }//GEN-LAST:event_gol3ActionPerformed

    private void gol4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gol4ActionPerformed
        // TODO add your handling code here:
        tgapok.setText("100000");
        tlembur.setText("1500");
        gol = 4;
    }//GEN-LAST:event_gol4ActionPerformed

    private void gol5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gol5ActionPerformed
        // TODO add your handling code here:
        tgapok.setText("50000");
        tlembur.setText("1000");
        gol = 5;
    }//GEN-LAST:event_gol5ActionPerformed

    private void hitung1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hitung1ActionPerformed

    private void hitung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung2ActionPerformed
        // TODO add your handling code here:
        gapok = Integer.parseInt(tgapok.getText());
        jamker = Integer.parseInt(tjaker.getText());
        GP = gapok*jamker;
        lembur = Integer.parseInt(tjalem.getText());
        tl = Integer.parseInt(tlembur.getText());
        galem = lembur*tl;
        tg = GP+galem;
        tun = (int) (tg*x);
        pjk = (int) ((tg*y)+tun);
        gaber = (tg + tun) - pjk;
        tgapeg.setText(""+GP);
        tgalem.setText(""+galem);
        ttotal.setText(""+tg);
        tgaber.setText(""+gaber); 
    }//GEN-LAST:event_hitung2ActionPerformed

    private void tabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelAncestorAdded

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
            java.util.logging.Logger.getLogger(formcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formcrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bgkeluar;
    private javax.swing.JTextField bgproses;
    private javax.swing.JTextField bgsimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JRadioButton gol1;
    private javax.swing.JRadioButton gol2;
    private javax.swing.JRadioButton gol3;
    private javax.swing.JRadioButton gol4;
    private javax.swing.JRadioButton gol5;
    private javax.swing.JTextField hitung1;
    private javax.swing.JTextField hitung2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tgaber;
    private javax.swing.JTextField tgalem;
    private javax.swing.JTextField tgapeg;
    private javax.swing.JTextField tgapok;
    private javax.swing.JTextField tjaker;
    private javax.swing.JTextField tjalem;
    private javax.swing.JTextField tlembur;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnip;
    private javax.swing.JTextField ttotal;
    // End of variables declaration//GEN-END:variables
}
