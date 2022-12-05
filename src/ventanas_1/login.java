/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas_1;

import java.awt.Color;

/**
 *
 * @author 58424
 */
public class login extends javax.swing.JFrame {

int xMouse = 0, yMouse = 0;
    public login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    metodosql login = new metodosql();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CuadroMorado = new javax.swing.JPanel();
        jLabelnOMBREeMPRESA = new javax.swing.JLabel();
        jLabelnOMBREeMPRESA1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelIcono = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        CuadroCierre = new javax.swing.JPanel();
        CERRAR = new javax.swing.JLabel();
        jPanelFondoBlanco = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelInicio = new javax.swing.JLabel();
        TxtIngresarUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CONTRASEÑA = new javax.swing.JLabel();
        CampoPass = new javax.swing.JPasswordField();
        jSeparatorPass = new javax.swing.JSeparator();
        Header = new javax.swing.JPanel();
        BtnIngresar = new javax.swing.JButton();
        BtnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CuadroMorado.setBackground(new java.awt.Color(63, 43, 100));

        jLabelnOMBREeMPRESA.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabelnOMBREeMPRESA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnOMBREeMPRESA.setText("GESTOR DE RESIDUOS");

        jLabelnOMBREeMPRESA1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabelnOMBREeMPRESA1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnOMBREeMPRESA1.setText("basureteca");

        jLabelIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.png"))); // NOI18N

        javax.swing.GroupLayout CuadroMoradoLayout = new javax.swing.GroupLayout(CuadroMorado);
        CuadroMorado.setLayout(CuadroMoradoLayout);
        CuadroMoradoLayout.setHorizontalGroup(
            CuadroMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMoradoLayout.createSequentialGroup()
                .addGroup(CuadroMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroMoradoLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(CuadroMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CuadroMoradoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelnOMBREeMPRESA)))
                    .addGroup(CuadroMoradoLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabelIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMoradoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(CuadroMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CuadroMoradoLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CuadroMoradoLayout.createSequentialGroup()
                        .addComponent(jLabelnOMBREeMPRESA1)
                        .addGap(94, 94, 94))))
        );
        CuadroMoradoLayout.setVerticalGroup(
            CuadroMoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroMoradoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelIcono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelnOMBREeMPRESA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelnOMBREeMPRESA1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        getContentPane().add(CuadroMorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 320, 460));

        CuadroCierre.setBackground(new java.awt.Color(255, 255, 255));
        CuadroCierre.setPreferredSize(new java.awt.Dimension(40, 40));

        CERRAR.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        CERRAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CERRAR.setText("X");
        CERRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CERRAR.setPreferredSize(new java.awt.Dimension(40, 40));
        CERRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CERRARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CERRARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CERRARMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CuadroCierreLayout = new javax.swing.GroupLayout(CuadroCierre);
        CuadroCierre.setLayout(CuadroCierreLayout);
        CuadroCierreLayout.setHorizontalGroup(
            CuadroCierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCierreLayout.createSequentialGroup()
                .addComponent(CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        CuadroCierreLayout.setVerticalGroup(
            CuadroCierreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CuadroCierreLayout.createSequentialGroup()
                .addComponent(CERRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(CuadroCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 30));

        jPanelFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        jLabelUsuario.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsuario.setText("Usuario");

        jLabelInicio.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelInicio.setText("INICIAR SESIÓN");

        TxtIngresarUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        TxtIngresarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        TxtIngresarUsuario.setText("Ingrese su usuario");
        TxtIngresarUsuario.setBorder(null);
        TxtIngresarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtIngresarUsuarioMousePressed(evt);
            }
        });

        CONTRASEÑA.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        CONTRASEÑA.setForeground(new java.awt.Color(0, 0, 0));
        CONTRASEÑA.setText("Contraseña");

        CampoPass.setText("**********");
        CampoPass.setBorder(null);
        CampoPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoPassMousePressed(evt);
            }
        });
        CampoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPassActionPerformed(evt);
            }
        });

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BtnIngresar.setBackground(new java.awt.Color(63, 43, 100));
        BtnIngresar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setText("INGRESAR");
        BtnIngresar.setBorder(null);
        BtnIngresar.setBorderPainted(false);
        BtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIngresarActionPerformed(evt);
            }
        });

        BtnRegistrar.setBackground(new java.awt.Color(63, 43, 100));
        BtnRegistrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        BtnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistrar.setText("REGISTRAR");
        BtnRegistrar.setBorder(null);
        BtnRegistrar.setBorderPainted(false);

        javax.swing.GroupLayout jPanelFondoBlancoLayout = new javax.swing.GroupLayout(jPanelFondoBlanco);
        jPanelFondoBlanco.setLayout(jPanelFondoBlancoLayout);
        jPanelFondoBlancoLayout.setHorizontalGroup(
            jPanelFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoBlancoLayout.createSequentialGroup()
                .addGroup(jPanelFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoBlancoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoBlancoLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanelFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelInicio)
                                    .addGroup(jPanelFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TxtIngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanelFondoBlancoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelFondoBlancoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparatorPass)
                            .addGroup(jPanelFondoBlancoLayout.createSequentialGroup()
                                .addGroup(jPanelFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelFondoBlancoLayout.setVerticalGroup(
            jPanelFondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoBlancoLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabelInicio)
                .addGap(18, 18, 18)
                .addComponent(jLabelUsuario)
                .addGap(18, 18, 18)
                .addComponent(TxtIngresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CONTRASEÑA)
                .addGap(18, 18, 18)
                .addComponent(CampoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelFondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
      
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
    setLocation(evt.getXOnScreen() - xMouse, evt.getYOnScreen() - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void CERRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRARMouseClicked
    System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CERRARMouseClicked

    private void CERRARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRARMouseEntered
   CuadroCierre.setBackground(Color.red);
   CERRAR.setForeground(Color.white);
    }//GEN-LAST:event_CERRARMouseEntered

    private void CERRARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CERRARMouseExited
     CuadroCierre.setBackground(Color. white);
     CERRAR.setForeground(Color.black);
    }//GEN-LAST:event_CERRARMouseExited

    private void TxtIngresarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtIngresarUsuarioMousePressed
     
     if (TxtIngresarUsuario.getText().equals("Ingrese su usuario")) {  
        TxtIngresarUsuario.setText("");
        TxtIngresarUsuario.setForeground(Color.black);
    }
     
     if(String.valueOf(CampoPass.getPassword()).isEmpty()){
     CampoPass.setText("**********");
     CampoPass.setForeground(Color.gray);
    }//GEN-LAST:event_TxtIngresarUsuarioMousePressed
   }
    private void CampoPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoPassMousePressed
     
    if
    (String.valueOf(CampoPass.getPassword()).equals("**********")){
     CampoPass.setText("");
     CampoPass.setForeground(Color.black);     
    }
    if(TxtIngresarUsuario.getText().isEmpty()){

    TxtIngresarUsuario.setText("Ingrese su usuario");
     TxtIngresarUsuario.setForeground(Color.gray);
    }
    }//GEN-LAST:event_CampoPassMousePressed

    private void CampoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPassActionPerformed

    private void BtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIngresarActionPerformed
        String usuario = TxtIngresarUsuario.getText();
        String clave = CampoPass.getText();
        if (login.iniciarSesion(usuario, clave)) {
                       System.out.println("Inicio sesion exitosa");
        } else {
                       System.out.println("Inicio de sesion fallida");
 

        }
    }//GEN-LAST:event_BtnIngresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        Menu.main(args);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIngresar;
    private javax.swing.JButton BtnRegistrar;
    private javax.swing.JLabel CERRAR;
    private javax.swing.JLabel CONTRASEÑA;
    private javax.swing.JPasswordField CampoPass;
    private javax.swing.JPanel CuadroCierre;
    private javax.swing.JPanel CuadroMorado;
    private javax.swing.JPanel Header;
    private javax.swing.JTextField TxtIngresarUsuario;
    private javax.swing.JLabel jLabelIcono;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelnOMBREeMPRESA;
    private javax.swing.JLabel jLabelnOMBREeMPRESA1;
    private javax.swing.JPanel jPanelFondoBlanco;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparatorPass;
    // End of variables declaration//GEN-END:variables
}
