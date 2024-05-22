package aplikasibangundatar;
import javax.swing.JOptionPane;
public class PERSEGI extends javax.swing.JFrame {
    public PERSEGI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hasil1 = new javax.swing.JLabel();
        hasil2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tpersegiaja = new javax.swing.JTextField();
        tlebarpersegiaja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bhitung = new javax.swing.JButton();
        breset = new javax.swing.JButton();
        bkembali = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hasil1.setBackground(new java.awt.Color(255, 255, 255));
        hasil1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hasil1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hasil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, 20));

        hasil2.setBackground(new java.awt.Color(255, 255, 255));
        hasil2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hasil2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hasil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 140, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERSEGI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 29, -1, 34));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PANJANG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 40));

        tpersegiaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpersegiajaActionPerformed(evt);
            }
        });
        getContentPane().add(tpersegiaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, 40));
        getContentPane().add(tlebarpersegiaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LEBAR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 60, 40));

        bhitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibangundatar/account.png"))); // NOI18N
        bhitung.setText("HITUNG");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });
        getContentPane().add(bhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 120, 30));

        breset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibangundatar/reset.png"))); // NOI18N
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });
        getContentPane().add(breset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 30, 30));

        bkembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibangundatar/return.png"))); // NOI18N
        bkembali.setText("KEMBALI");
        bkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkembaliActionPerformed(evt);
            }
        });
        getContentPane().add(bkembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 110, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("HASIL :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 50, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibangundatar/2.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        try 
        {
        int sisi        = Integer.parseInt(tpersegiaja.getText());
        int Luas        = sisi * sisi;
        int keliling    = 4 * sisi;
        
        hasil1.setText("Luas : " + Luas);
        hasil2.setText("keliling : " + keliling);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Massukkan Angka");
        }
    }//GEN-LAST:event_bhitungActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        tpersegiaja.setText("");
        tlebarpersegiaja.setText("");
    }//GEN-LAST:event_bresetActionPerformed

    private void bkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkembaliActionPerformed
        new bangudatar().setVisible(true);
        dispose();
    }//GEN-LAST:event_bkembaliActionPerformed

    private void tpersegiajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpersegiajaActionPerformed

    }//GEN-LAST:event_tpersegiajaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PERSEGI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bhitung;
    private javax.swing.JButton bkembali;
    private javax.swing.JButton breset;
    private javax.swing.JLabel hasil1;
    private javax.swing.JLabel hasil2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tlebarpersegiaja;
    private javax.swing.JTextField tpersegiaja;
    // End of variables declaration//GEN-END:variables
}
