/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung_nilai_akhir;

/**
 *
 * @author rizki
 */
public class FormNilaiAkhir extends javax.swing.JFrame {

    /**
     * Creates new form FormNilaiAkhir
     */
    public FormNilaiAkhir() {
        initComponents();
        nonaktif();
        hapus();
    }
    
    public void nonaktif(){
        tf_nama.setEnabled(false);
    }
    
    public void aktif(){
        tf_nama.setEnabled(true);
    }
    
    public void hapus(){
        tf_nama.setText("");
        tf_nilaipresensi.setText("");
        tf_nilaitugas.setText("");
        tf_nilaikuis.setText("");
        tf_nilaiuts.setText("");
        tf_nilaiuas.setText("");
        tf_nilaiakhir.setText("");
        tf_grade.setText("");      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_hapus = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tf_nilaitugas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_nilaikuis = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_nilaiuts = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nilaiuas = new javax.swing.JTextField();
        tf_nama = new javax.swing.JTextField();
        bt_proses = new javax.swing.JButton();
        tf_nilaipresensi = new javax.swing.JTextField();
        tf_nilaiakhir = new javax.swing.JTextField();
        cb_nim = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_grade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_hapus.setText("Hapus");
        bt_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hapusActionPerformed(evt);
            }
        });

        jLabel7.setText("Nilai UAS");

        tf_nilaitugas.setText("jTextField3");

        jLabel1.setText("NIM Mahasiswa");

        tf_nilaikuis.setText("jTextField4");

        jLabel2.setText("Nama Lengkap");

        tf_nilaiuts.setText("jTextField5");

        jLabel3.setText("Nilai Presensi");

        tf_nilaiuas.setText("jTextField6");

        tf_nama.setText("jTextField1");

        bt_proses.setText("Proses");
        bt_proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_prosesActionPerformed(evt);
            }
        });

        tf_nilaipresensi.setText("jTextField2");

        tf_nilaiakhir.setText("jTextField7");

        cb_nim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih NIM", "10010201", "10010202" }));
        cb_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_nimActionPerformed(evt);
            }
        });

        jLabel8.setText("Nilai Akhir");

        jLabel4.setText("Nilai Tugas");

        jLabel9.setText("Grade");

        jLabel5.setText("Nilai Kuis");

        tf_grade.setText("jTextField8");

        jLabel6.setText("Nilai UTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_grade, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addComponent(tf_nilaiakhir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_hapus))
                            .addComponent(bt_proses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nilaiuas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nilaiuts, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nilaikuis, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nilaipresensi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nilaitugas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_nim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nilaipresensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nilaitugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nilaikuis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_nilaiuts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_nilaiuas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_proses, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nilaiakhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(bt_hapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hapusActionPerformed
        // TODO add your handling code here:
        hapus();
        nonaktif();
        cb_nim.setSelectedItem("Pilih NIM");
    }//GEN-LAST:event_bt_hapusActionPerformed

    private void bt_prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_prosesActionPerformed
        // TODO add your handling code here:
        double nilaipresensi = Double.parseDouble(tf_nilaipresensi.getText());
        double nilaitugas = Double.parseDouble(tf_nilaitugas.getText());
        double nilaikuis = Double.parseDouble(tf_nilaikuis.getText());
        double nilaiuts = Double.parseDouble(tf_nilaiuts.getText());
        double nilaiuas = Double.parseDouble(tf_nilaiuas.getText());

        double nilaiakhir = (nilaipresensi * 0.15) + (nilaitugas * 0.15) + (nilaikuis * 0.10) + (nilaiuts * 0.25) + (nilaiuas * 0.35);
        tf_nilaiakhir.setText(String.valueOf(nilaiakhir));

        if (nilaiakhir > 80){
            tf_grade.setText("A");
        } else if (nilaiakhir > 70){
            tf_grade.setText("B");
        } else if (nilaiakhir > 60){
            tf_grade.setText("C");
        } else if (nilaiakhir > 50){
            tf_grade.setText("D");
        } else{
            tf_grade.setText("E");
        }
    }//GEN-LAST:event_bt_prosesActionPerformed

    private void cb_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_nimActionPerformed
        // TODO add your handling code here:
        if(cb_nim.getSelectedItem().equals("10010201")) {
            tf_nama.setText("Budi");
            tf_nilaipresensi.setText("100");
            tf_nilaitugas.setText("90");
            tf_nilaikuis.setText("90");
            tf_nilaiuts.setText("80");
            tf_nilaiuas.setText("75");
            aktif();
        } else if(cb_nim.getSelectedItem().equals("10010202")) {
            tf_nama.setText("Siti");
            tf_nilaipresensi.setText("100");
            tf_nilaitugas.setText("90");
            tf_nilaikuis.setText("80");
            tf_nilaiuts.setText("75");
            tf_nilaiuas.setText("80");
            aktif();
        } else {
            tf_nama.setText("");
            tf_nilaiakhir.setText("");
            nonaktif();
        }
    }//GEN-LAST:event_cb_nimActionPerformed

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
            java.util.logging.Logger.getLogger(FormNilaiAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNilaiAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNilaiAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNilaiAkhir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNilaiAkhir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_hapus;
    private javax.swing.JButton bt_proses;
    private javax.swing.JComboBox<String> cb_nim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tf_grade;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_nilaiakhir;
    private javax.swing.JTextField tf_nilaikuis;
    private javax.swing.JTextField tf_nilaipresensi;
    private javax.swing.JTextField tf_nilaitugas;
    private javax.swing.JTextField tf_nilaiuas;
    private javax.swing.JTextField tf_nilaiuts;
    // End of variables declaration//GEN-END:variables
}
