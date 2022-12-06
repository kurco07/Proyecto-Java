/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas_1.Productor;

import ventanas_1.Admin.AdminOpcionesAgregar;
import ventanas_1.Admin.AdminOpcionesConsultar;
import java.awt.BorderLayout;

/**
 *
 * @author 58424
 */
public class Productor extends javax.swing.JFrame {

    /**
     * Creates new form Productor1
     */
    public Productor() {
        initComponents();
        setLocationRelativeTo(null);
        ProductorBienvenida b = new ProductorBienvenida();
        b.setSize(580,320);
        b.setLocation(0,0);
        
        FondoBlanco.removeAll();
        FondoBlanco.add(b,BorderLayout.CENTER);
        FondoBlanco.revalidate();
        FondoBlanco.repaint(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ColumnaVerde = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        ConsultarLabel = new javax.swing.JLabel();
        jLabelnOMBREeMPRESA = new javax.swing.JLabel();
        IconoConsultar1 = new javax.swing.JLabel();
        IconoConsultar = new javax.swing.JLabel();
        HomeLabel = new javax.swing.JLabel();
        IconoAgregar3 = new javax.swing.JLabel();
        ResiduoLabel = new javax.swing.JLabel();
        BtnHome = new javax.swing.JButton();
        BtnTraslado = new javax.swing.JButton();
        BtnResiduo = new javax.swing.JButton();
        Morado = new javax.swing.JPanel();
        IconoEmpresa = new javax.swing.JLabel();
        E_Transporte = new javax.swing.JLabel();
        Morado4 = new javax.swing.JPanel();
        Morado5 = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JButton();
        Morado6 = new javax.swing.JPanel();
        FilaVerde = new javax.swing.JPanel();
        jLabelAdministrador = new javax.swing.JLabel();
        jLabelBienvenidaAdmin = new javax.swing.JLabel();
        FondoBlanco = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ColumnaVerde.setBackground(new java.awt.Color(54, 33, 83));
        ColumnaVerde.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ColumnaVerde.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, -1));

        ConsultarLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ConsultarLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarLabel.setText("TRASLADO");
        ColumnaVerde.add(ConsultarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, -1));

        jLabelnOMBREeMPRESA.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabelnOMBREeMPRESA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnOMBREeMPRESA.setText("GESTOR RESIDUOS");
        ColumnaVerde.add(jLabelnOMBREeMPRESA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        IconoConsultar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen9.png"))); // NOI18N
        ColumnaVerde.add(IconoConsultar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 50, 30));

        IconoConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen5.png"))); // NOI18N
        ColumnaVerde.add(IconoConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 40, 30));

        HomeLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        HomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        HomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HomeLabel.setText("HOME");
        ColumnaVerde.add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 60, 30));

        IconoAgregar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen13.png"))); // NOI18N
        ColumnaVerde.add(IconoAgregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        ResiduoLabel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        ResiduoLabel.setForeground(new java.awt.Color(255, 255, 255));
        ResiduoLabel.setText("RESIDUO");
        ColumnaVerde.add(ResiduoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 70, -1));

        BtnHome.setBackground(new java.awt.Color(85, 55, 118));
        BtnHome.setBorder(null);
        BtnHome.setBorderPainted(false);
        BtnHome.setContentAreaFilled(false);
        BtnHome.setFocusPainted(false);
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        ColumnaVerde.add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 50));

        BtnTraslado.setBackground(new java.awt.Color(85, 55, 118));
        BtnTraslado.setBorder(null);
        BtnTraslado.setBorderPainted(false);
        BtnTraslado.setContentAreaFilled(false);
        BtnTraslado.setFocusPainted(false);
        BtnTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTrasladoActionPerformed(evt);
            }
        });
        ColumnaVerde.add(BtnTraslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, 50));

        BtnResiduo.setBackground(new java.awt.Color(85, 55, 118));
        BtnResiduo.setBorder(null);
        BtnResiduo.setBorderPainted(false);
        BtnResiduo.setContentAreaFilled(false);
        BtnResiduo.setFocusPainted(false);
        BtnResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResiduoActionPerformed(evt);
            }
        });
        ColumnaVerde.add(BtnResiduo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, 50));

        Morado.setBackground(new java.awt.Color(85, 55, 118));

        javax.swing.GroupLayout MoradoLayout = new javax.swing.GroupLayout(Morado);
        Morado.setLayout(MoradoLayout);
        MoradoLayout.setHorizontalGroup(
            MoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        MoradoLayout.setVerticalGroup(
            MoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ColumnaVerde.add(Morado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 180, 50));

        IconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen14.png"))); // NOI18N
        ColumnaVerde.add(IconoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 30, 40));

        E_Transporte.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        E_Transporte.setForeground(new java.awt.Color(255, 255, 255));
        E_Transporte.setText("        TRANSPORTE");
        E_Transporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ColumnaVerde.add(E_Transporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 140, 20));

        Morado4.setBackground(new java.awt.Color(63, 43, 100));

        javax.swing.GroupLayout Morado4Layout = new javax.swing.GroupLayout(Morado4);
        Morado4.setLayout(Morado4Layout);
        Morado4Layout.setHorizontalGroup(
            Morado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        Morado4Layout.setVerticalGroup(
            Morado4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ColumnaVerde.add(Morado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, -1));

        Morado5.setBackground(new java.awt.Color(63, 43, 100));

        javax.swing.GroupLayout Morado5Layout = new javax.swing.GroupLayout(Morado5);
        Morado5.setLayout(Morado5Layout);
        Morado5Layout.setHorizontalGroup(
            Morado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        Morado5Layout.setVerticalGroup(
            Morado5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ColumnaVerde.add(Morado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 180, 50));

        BtnEliminar.setBackground(new java.awt.Color(85, 55, 118));
        BtnEliminar.setBorder(null);
        BtnEliminar.setBorderPainted(false);
        BtnEliminar.setContentAreaFilled(false);
        BtnEliminar.setFocusPainted(false);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        ColumnaVerde.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 180, 50));

        Morado6.setBackground(new java.awt.Color(63, 43, 100));

        javax.swing.GroupLayout Morado6Layout = new javax.swing.GroupLayout(Morado6);
        Morado6.setLayout(Morado6Layout);
        Morado6Layout.setHorizontalGroup(
            Morado6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        Morado6Layout.setVerticalGroup(
            Morado6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        ColumnaVerde.add(Morado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        getContentPane().add(ColumnaVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 450));

        FilaVerde.setBackground(new java.awt.Color(122, 72, 221));

        jLabelAdministrador.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabelAdministrador.setText("Productor");

        jLabelBienvenidaAdmin.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        jLabelBienvenidaAdmin.setText("Bienvenido a nuestro Gestor de Residuos");

        javax.swing.GroupLayout FilaVerdeLayout = new javax.swing.GroupLayout(FilaVerde);
        FilaVerde.setLayout(FilaVerdeLayout);
        FilaVerdeLayout.setHorizontalGroup(
            FilaVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FilaVerdeLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(FilaVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBienvenidaAdmin))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        FilaVerdeLayout.setVerticalGroup(
            FilaVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FilaVerdeLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabelBienvenidaAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAdministrador)
                .addGap(32, 32, 32))
        );

        getContentPane().add(FilaVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 580, 130));

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout FondoBlancoLayout = new javax.swing.GroupLayout(FondoBlanco);
        FondoBlanco.setLayout(FondoBlancoLayout);
        FondoBlancoLayout.setHorizontalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(FondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 580, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        ProductorBienvenida b = new ProductorBienvenida();
        b.setSize(580,320);
        b.setLocation(0,0);
        
        FondoBlanco.removeAll();
        FondoBlanco.add(b,BorderLayout.CENTER);
        FondoBlanco.revalidate();
        FondoBlanco.repaint(); 
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void BtnTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTrasladoActionPerformed

        ProductorTraslado opc = new ProductorTraslado();
        opc.setSize(580,320);

        FondoBlanco.removeAll();
        FondoBlanco.add(opc,BorderLayout.CENTER);
        FondoBlanco.revalidate();
        FondoBlanco.repaint();
    }//GEN-LAST:event_BtnTrasladoActionPerformed

    private void BtnResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResiduoActionPerformed

        ProductorResiduo opc = new ProductorResiduo();
        opc.setSize(580,320);

        FondoBlanco.removeAll();
        FondoBlanco.add(opc,BorderLayout.CENTER);
        FondoBlanco.revalidate();
        FondoBlanco.repaint();
    }//GEN-LAST:event_BtnResiduoActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        ProductorEmpresa opc = new ProductorEmpresa();
        opc.setSize(580,320);

        FondoBlanco.removeAll();
        FondoBlanco.add(opc,BorderLayout.CENTER);
        FondoBlanco.revalidate();
        FondoBlanco.repaint();
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnResiduo;
    private javax.swing.JButton BtnTraslado;
    private javax.swing.JPanel ColumnaVerde;
    private javax.swing.JLabel ConsultarLabel;
    private javax.swing.JLabel E_Transporte;
    private javax.swing.JPanel FilaVerde;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JLabel IconoAgregar3;
    private javax.swing.JLabel IconoConsultar;
    private javax.swing.JLabel IconoConsultar1;
    private javax.swing.JLabel IconoEmpresa;
    private javax.swing.JPanel Morado;
    private javax.swing.JPanel Morado4;
    private javax.swing.JPanel Morado5;
    private javax.swing.JPanel Morado6;
    private javax.swing.JLabel ResiduoLabel;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelBienvenidaAdmin;
    private javax.swing.JLabel jLabelnOMBREeMPRESA;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
