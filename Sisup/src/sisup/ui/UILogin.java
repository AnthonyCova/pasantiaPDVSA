/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.ui;

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sisup.controladores.Login;

/**
 *
 * @author Liz
 */
public class UILogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public UILogin() {
        initComponents();
        inicializarComponentes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_body = new javax.swing.JPanel();
        pnl_header = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_content = new javax.swing.JPanel();
        lbl_bienvenido = new javax.swing.JLabel();
        pnl_info = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        txt_clave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("/sisup/recursos/favicon.png").getImage());
        setName("Sistema de Supervisión de Parada de Poliducto"); // NOI18N
        setPreferredSize(new java.awt.Dimension(708, 500));
        setResizable(false);

        pnl_body.setOpaque(false);

        pnl_header.setOpaque(false);

        lbl_titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(204, 0, 0));
        lbl_titulo.setText("SISTEMA DE SUPERVISION DE PARADA DE POLIDUCTO");

        javax.swing.GroupLayout pnl_headerLayout = new javax.swing.GroupLayout(pnl_header);
        pnl_header.setLayout(pnl_headerLayout);
        pnl_headerLayout.setHorizontalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_headerLayout.setVerticalGroup(
            pnl_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_content.setOpaque(false);

        lbl_bienvenido.setFont(new java.awt.Font("Arial", 0, 42)); // NOI18N
        lbl_bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bienvenido.setText("BIENVENIDO");

        pnl_info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnl_info.setOpaque(false);

        txt_usuario.setText("USUARIO");
        txt_usuario.setBorder(null);
        txt_usuario.setName(""); // NOI18N
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                onClickUsuario(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        txt_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                onExitUsuario(evt);
            }
        });
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
        });

        btn_ingresar.setBackground(null);
        btn_ingresar.setForeground(null);
        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/btn_ingresar.png"))); // NOI18N
        btn_ingresar.setBorder(null);
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setContentAreaFilled(false);
        btn_ingresar.setFocusPainted(false);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        txt_clave.setText("jPasswordField1");
        txt_clave.setBorder(null);
        txt_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_claveActionPerformed(evt);
            }
        });
        txt_clave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                onClickClave(evt);
            }
        });

        javax.swing.GroupLayout pnl_infoLayout = new javax.swing.GroupLayout(pnl_info);
        pnl_info.setLayout(pnl_infoLayout);
        pnl_infoLayout.setHorizontalGroup(
            pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_infoLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_infoLayout.createSequentialGroup()
                        .addGroup(pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_infoLayout.createSequentialGroup()
                        .addComponent(btn_ingresar)
                        .addGap(26, 26, 26))))
        );
        pnl_infoLayout.setVerticalGroup(
            pnl_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_infoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(txt_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_ingresar)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_contentLayout = new javax.swing.GroupLayout(pnl_content);
        pnl_content.setLayout(pnl_contentLayout);
        pnl_contentLayout.setHorizontalGroup(
            pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_bienvenido)
                .addGap(34, 34, 34)
                .addComponent(pnl_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        pnl_contentLayout.setVerticalGroup(
            pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_contentLayout.createSequentialGroup()
                .addContainerGap(173, Short.MAX_VALUE)
                .addGroup(pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_contentLayout.createSequentialGroup()
                        .addComponent(lbl_bienvenido)
                        .addGap(145, 145, 145)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_bodyLayout = new javax.swing.GroupLayout(pnl_body);
        pnl_body.setLayout(pnl_bodyLayout);
        pnl_bodyLayout.setHorizontalGroup(
            pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_bodyLayout.setVerticalGroup(
            pnl_bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bodyLayout.createSequentialGroup()
                .addComponent(pnl_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(pnl_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        if (ValidarCampos() && login.ValidarDatosLogin(txt_usuario.getText().toString(),txt_clave.getPassword().toString())){
            uiDashboard = new UIDashboard();
            uiDashboard.setVisible(true);
            /*UIMantenimientos2 m = new UIMantenimientos2();
            m.setVisible(true);*/
            this.setVisible(false);
            //login.MostrarDashboard();
        } 
        else MostrarMensajeError();
        
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_claveActionPerformed
        txt_clave.setText("");
    }//GEN-LAST:event_txt_claveActionPerformed

    private void onClickUsuario(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onClickUsuario
        if(txt_usuario.getText().equals("USUARIO"))
            txt_usuario.setText("");
    }//GEN-LAST:event_onClickUsuario

    private void onExitUsuario(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_onExitUsuario
        if(txt_usuario.getText().equals(""))
            txt_usuario.setText("USUARIO");
    }//GEN-LAST:event_onExitUsuario

    private void onClickClave(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_onClickClave
        txt_clave.setText("");
    }//GEN-LAST:event_onClickClave

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if(txt_usuario.getText().equals("USUARIO"))
            txt_usuario.setText("");
    }//GEN-LAST:event_txt_usuarioKeyPressed

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
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UILogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UILogin().setVisible(true);
            }
        });
    }
    
 /*@Override
public void paint(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    g2.setPaint(Color.gray);
    int x = 5;
    int y = 7;
    Color color1 = getBackground( );
    Color color2 = color1.darker( );
    // fill RoundRectangle2D.Double
    GradientPaint redtowhite = new GradientPaint(x, y, color1, 100, y,
        color2);
    g2.setPaint(redtowhite);
    g2.fill(new RoundRectangle2D.Double(x, y, getWidth(), 100, 10, 10));
    g2.setPaint(Color.black);

  }*/
 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel lbl_bienvenido;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_body;
    private javax.swing.JPanel pnl_content;
    private javax.swing.JPanel pnl_header;
    private javax.swing.JPanel pnl_info;
    private javax.swing.JPasswordField txt_clave;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
    //Variables Logica
    Login login = new Login();
    UIDashboard uiDashboard;
    
    //Imagenes de fondo
    ImagenPanel fondoHeader;
    ImagenPanel fondoContent;
    ImageIcon iconoFrame;

    private boolean ValidarCampos() {
        return !(txt_usuario.getText().equals("") || txt_usuario.getText().equals("USUARIO"));
    }
    
    public void MostrarMensajeError(){
        JOptionPane.showMessageDialog(null, "Datos Inválidos", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    private void inicializarComponentes() {
        /*FONDO UNO
        fondoHeader = new ImagenPanel("/sisup/recursos/fondoTitulo.png");
        fondoHeader.setSize(new Dimension(711, 44));
        fondoHeader.setVisible(true);
        fondoHeader.setLayout(null);
        pnl_header.setBounds(0, 0, 711, 44);
                
        fondoContent = new ImagenPanel("/sisup/recursos/sisor3.png");
        fondoContent.setSize(new Dimension(710, 485));
        fondoContent.setVisible(true);
        fondoContent.setLayout(null);
        pnl_content.setBounds(0, 0, 710, 465);*/
        
        /*FONDO DOS*/
        /*fondoHeader = new ImagenPanel("/sisup/recursos/fondoTitulo.png");
        fondoHeader.setSize(new Dimension(711, 46));
        fondoHeader.setVisible(true);
        fondoHeader.setLayout(null);
        pnl_header.setBounds(0, 0, 711, 46);*/
                
        fondoContent = new ImagenPanel("/sisup/recursos/sisor4.png");
        fondoContent.setSize(new Dimension(750, 473));
        fondoContent.setVisible(true);
        fondoContent.setLayout(null);
        pnl_content.setBounds(0, 0, 750, 473);
        
        pnl_body.add(fondoContent);
        
        fondoContent.add(pnl_content);
        
        //Centrar el frame
        this.setLocationRelativeTo(null);
        
        //Cambiar Icono
        setIconImage(new ImageIcon("/sisup/recursos/favicon.png").getImage());
        
        Image image;
        try {
            image = ImageIO.read(getClass().getResource("/sisup/recursos/favicon.png"));
            setIconImage(image);
        } catch (IOException ex) {
            Logger.getLogger(UILogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
