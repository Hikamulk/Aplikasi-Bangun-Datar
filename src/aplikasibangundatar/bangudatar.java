package aplikasibangundatar;
public class bangudatar extends javax.swing.JFrame {
    public bangudatar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bt_persegipanjang = new javax.swing.JButton();
        bt_persegi = new javax.swing.JButton();
        bt_lingkaran = new javax.swing.JButton();
        bt_segitiga = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 164, 68));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLIKASI BANGUN DATAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 270, 36));

        bt_persegipanjang.setBackground(new java.awt.Color(204, 255, 255));
        bt_persegipanjang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_persegipanjang.setText("PERSEGI PANJANG");
        bt_persegipanjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_persegipanjangActionPerformed(evt);
            }
        });
        getContentPane().add(bt_persegipanjang, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        bt_persegi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_persegi.setText("PERSEGI");
        bt_persegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_persegiActionPerformed(evt);
            }
        });
        getContentPane().add(bt_persegi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 140, -1));

        bt_lingkaran.setBackground(new java.awt.Color(204, 255, 255));
        bt_lingkaran.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_lingkaran.setText("LINGKARAN");
        bt_lingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_lingkaranActionPerformed(evt);
            }
        });
        getContentPane().add(bt_lingkaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 140, -1));

        bt_segitiga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt_segitiga.setText("SEGITIGA");
        bt_segitiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_segitigaActionPerformed(evt);
            }
        });
        getContentPane().add(bt_segitiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 140, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibangundatar/2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_persegipanjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_persegipanjangActionPerformed
     new PERSEGIPANJANG().setVisible(true);
    }//GEN-LAST:event_bt_persegipanjangActionPerformed

    private void bt_persegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_persegiActionPerformed
     new PERSEGI().setVisible(true);
    }//GEN-LAST:event_bt_persegiActionPerformed

    private void bt_lingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_lingkaranActionPerformed
      new LINGKARAN().setVisible(true);
    }//GEN-LAST:event_bt_lingkaranActionPerformed

    private void bt_segitigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_segitigaActionPerformed
     new SEGITIGA().setVisible(true);
    }//GEN-LAST:event_bt_segitigaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bangudatar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_lingkaran;
    private javax.swing.JButton bt_persegi;
    private javax.swing.JButton bt_persegipanjang;
    private javax.swing.JButton bt_segitiga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
