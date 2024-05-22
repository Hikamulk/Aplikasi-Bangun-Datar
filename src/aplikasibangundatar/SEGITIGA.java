package aplikasibangundatar;
import javax.swing.JOptionPane;
public class SEGITIGA extends javax.swing.JFrame {
    public SEGITIGA() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfsisiC = new javax.swing.JTextField();
        tfsisiB = new javax.swing.JTextField();
        tfsisiA = new javax.swing.JTextField();
        sisiB = new javax.swing.JLabel();
        sisiC = new javax.swing.JLabel();
        sisiA = new javax.swing.JLabel();
        bhitung = new javax.swing.JButton();
        hasil1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tftinggi = new javax.swing.JTextField();
        tfalas = new javax.swing.JTextField();
        bkembali = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hasil2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        breset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(tfsisiC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, 30));
        getContentPane().add(tfsisiB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 100, 30));
        getContentPane().add(tfsisiA, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, 30));

        sisiB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sisiB.setForeground(new java.awt.Color(255, 255, 255));
        sisiB.setText("SISI C");
        getContentPane().add(sisiB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, 30));

        sisiC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sisiC.setForeground(new java.awt.Color(255, 255, 255));
        sisiC.setText("SISI B");
        getContentPane().add(sisiC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, 30));

        sisiA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sisiA.setForeground(new java.awt.Color(255, 255, 255));
        sisiA.setText("SISI A");
        getContentPane().add(sisiA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 30));

        bhitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibangundatar/account.png"))); // NOI18N
        bhitung.setText("HITUNG");
        bhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhitungActionPerformed(evt);
            }
        });
        getContentPane().add(bhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 110, 30));

        hasil1.setBackground(new java.awt.Color(255, 255, 255));
        hasil1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hasil1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hasil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 260, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TINGGI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 30));
        getContentPane().add(tftinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 100, 30));
        getContentPane().add(tfalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 100, 30));

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

        hasil2.setBackground(new java.awt.Color(255, 255, 255));
        hasil2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hasil2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(hasil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 260, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEGITIGA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ALAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibangundatar/2.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        breset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasibangundatar/reset.png"))); // NOI18N
        breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresetActionPerformed(evt);
            }
        });
        getContentPane().add(breset, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 30, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SISI A");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhitungActionPerformed
        try {
        double alas     = Double.parseDouble(tfalas.getText());
        double tinggi   = Double.parseDouble(tftinggi.getText());
        double SisiA    = Double.parseDouble(tfsisiA.getText());
        double SisiB    = Double.parseDouble(tfsisiB.getText());
        double SisiC    = Double.parseDouble(tfsisiC.getText());
        
        double luas     = 0.5 * alas * tinggi;
        double keliling = SisiA + SisiB + SisiC;
        
        hasil1.setText("Luas : " + luas);
        hasil2.setText("Keliling : " + keliling);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Masukkan Angka");
        }
    }//GEN-LAST:event_bhitungActionPerformed

    private void bkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkembaliActionPerformed
        new bangudatar().setVisible(true);
        dispose();
    }//GEN-LAST:event_bkembaliActionPerformed

    private void bresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresetActionPerformed
        tfalas.setText("");
        tftinggi.setText("");
        tfsisiA.setText("");
        tfsisiB.setText("");
        tfsisiC.setText("");
    }//GEN-LAST:event_bresetActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SEGITIGA().setVisible(true);
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel sisiA;
    private javax.swing.JLabel sisiB;
    private javax.swing.JLabel sisiC;
    private javax.swing.JTextField tfalas;
    private javax.swing.JTextField tfsisiA;
    private javax.swing.JTextField tfsisiB;
    private javax.swing.JTextField tfsisiC;
    private javax.swing.JTextField tftinggi;
    // End of variables declaration//GEN-END:variables
}
