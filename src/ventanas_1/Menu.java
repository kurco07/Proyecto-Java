/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas_1;

/**
 *
 * @author 58424
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menú
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        IconoTranposrte = new javax.swing.JLabel();
        jLabelnOMBREeMPRESA = new javax.swing.JLabel();
        jLabelIcono = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        IconoAdmin = new javax.swing.JLabel();
        BtnIcono = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnProductor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BtnTransporte = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(85, 55, 118));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(63, 43, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoTranposrte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen9.png"))); // NOI18N
        jPanel1.add(IconoTranposrte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jLabelnOMBREeMPRESA.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabelnOMBREeMPRESA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnOMBREeMPRESA.setText("GESTOR DE RESIDUOS");
        jPanel1.add(jLabelnOMBREeMPRESA, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N
        jPanel1.add(jLabelIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 160, 130));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 180, 10));

        jPanel2.setBackground(new java.awt.Color(63, 43, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen11.png"))); // NOI18N
        IconoAdmin.setText("jLabel3");
        jPanel2.add(IconoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 34, -1));

        BtnIcono.setBackground(new java.awt.Color(63, 43, 100));
        BtnIcono.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        BtnIcono.setForeground(new java.awt.Color(255, 255, 255));
        BtnIcono.setText("ADMINISTRADOR ");
        BtnIcono.setBorder(null);
        BtnIcono.setBorderPainted(false);
        BtnIcono.setContentAreaFilled(false);
        BtnIcono.setFocusPainted(false);
        BtnIcono.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnIcono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIconoActionPerformed(evt);
            }
        });
        jPanel2.add(BtnIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 250, 50));

        jPanel5.setBackground(new java.awt.Color(122, 72, 221));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen12.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 58, 40));

        BtnProductor.setBackground(new java.awt.Color(122, 72, 221));
        BtnProductor.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        BtnProductor.setForeground(new java.awt.Color(255, 255, 255));
        BtnProductor.setText("Productor");
        BtnProductor.setBorder(null);
        BtnProductor.setBorderPainted(false);
        BtnProductor.setContentAreaFilled(false);
        BtnProductor.setFocusPainted(false);
        BtnProductor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnProductor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProductorActionPerformed(evt);
            }
        });
        jPanel5.add(BtnProductor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 250, 50));

        jPanel4.setBackground(new java.awt.Color(85, 55, 118));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnTransporte.setBackground(new java.awt.Color(85, 55, 118));
        BtnTransporte.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        BtnTransporte.setForeground(new java.awt.Color(255, 255, 255));
        BtnTransporte.setText("          EMPRESA TRANSPORTISTA");
        BtnTransporte.setBorder(null);
        BtnTransporte.setBorderPainted(false);
        BtnTransporte.setContentAreaFilled(false);
        BtnTransporte.setFocusPainted(false);
        BtnTransporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnTransporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTransporteActionPerformed(evt);
            }
        });
        jPanel4.add(BtnTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 180, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 250, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTransporteActionPerformed
       login ventana = new login();
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnTransporteActionPerformed

    private void BtnIconoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIconoActionPerformed
       login ventana = new login();
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnIconoActionPerformed

    private void BtnProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProductorActionPerformed
       login ventana = new login();
       ventana.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BtnProductorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIcono;
    private javax.swing.JButton BtnProductor;
    private javax.swing.JButton BtnTransporte;
    private javax.swing.JLabel IconoAdmin;
    private javax.swing.JLabel IconoTranposrte;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelnOMBREeMPRESA;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
