/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.ui;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Liz
 */
public class UIAgregarBomba extends javax.swing.JInternalFrame {
    private int bomba;

    /**
     * Creates new form UIAgregarBomba
     * @param modo
     */
    public UIAgregarBomba() {
        initComponents();
        btn_editar.setVisible(false);
    }
    
    public UIAgregarBomba(int bomba) {
        initComponents();
        this.bomba = bomba;
        ModoEdicion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_agregarBomba = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_accion = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        pnl_usuario = new javax.swing.JPanel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        txt_tag = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_descripcion = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Agregar Nueva Bomba");

        lbl_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/agregarNuevaBomba.png"))); // NOI18N
        lbl_titulo.setText("Agregar Bomba");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cerrar.setBackground(new java.awt.Color(204, 204, 255));
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/atras.png"))); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 14, 14, 14));
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_cerrar.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btn_cerrar.setOpaque(false);
        btn_cerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_cerrar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(204, 204, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/agregarNuevaBomba2.png"))); // NOI18N
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 14, 14, 14));
        btn_agregar.setBorderPainted(false);
        btn_agregar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_agregar.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btn_agregar.setOpaque(false);
        btn_agregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_agregar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(204, 204, 255));
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/agregarNuevaBomba2.png"))); // NOI18N
        btn_editar.setText("Editar");
        btn_editar.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 14, 14, 14));
        btn_editar.setBorderPainted(false);
        btn_editar.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_editar.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btn_editar.setOpaque(false);
        btn_editar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_editar.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_accionLayout = new javax.swing.GroupLayout(pnl_accion);
        pnl_accion.setLayout(pnl_accionLayout);
        pnl_accionLayout.setHorizontalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_accionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_editar)
                .addGap(18, 18, 18)
                .addComponent(btn_agregar)
                .addGap(18, 18, 18)
                .addComponent(btn_cerrar)
                .addContainerGap())
        );
        pnl_accionLayout.setVerticalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar)
                    .addComponent(btn_agregar)
                    .addComponent(btn_editar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_usuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la bomba"));

        lbl_nombres.setText("TAG:");

        lbl_apellidos.setText("Descripción:");

        txt_tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tagActionPerformed(evt);
            }
        });

        txt_descripcion.setColumns(20);
        txt_descripcion.setRows(5);
        jScrollPane1.setViewportView(txt_descripcion);

        javax.swing.GroupLayout pnl_usuarioLayout = new javax.swing.GroupLayout(pnl_usuario);
        pnl_usuario.setLayout(pnl_usuarioLayout);
        pnl_usuarioLayout.setHorizontalGroup(
            pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_usuarioLayout.createSequentialGroup()
                        .addComponent(lbl_nombres)
                        .addGap(52, 52, 52)
                        .addComponent(txt_tag, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_usuarioLayout.createSequentialGroup()
                        .addComponent(lbl_apellidos)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        pnl_usuarioLayout.setVerticalGroup(
            pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_usuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_tag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_apellidos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_agregarBombaLayout = new javax.swing.GroupLayout(pnl_agregarBomba);
        pnl_agregarBomba.setLayout(pnl_agregarBombaLayout);
        pnl_agregarBombaLayout.setHorizontalGroup(
            pnl_agregarBombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_agregarBombaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_agregarBombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_accion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_agregarBombaLayout.setVerticalGroup(
            pnl_agregarBombaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agregarBombaLayout.createSequentialGroup()
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_agregarBomba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_agregarBomba, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        agregarDatosBomba(1);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void txt_tagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tagActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        agregarDatosBomba(0);
    }//GEN-LAST:event_btn_editarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_accion;
    private javax.swing.JPanel pnl_agregarBomba;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JPanel pnl_usuario;
    private javax.swing.JTextArea txt_descripcion;
    private javax.swing.JTextField txt_tag;
    // End of variables declaration//GEN-END:variables

    private void ModoEdicion() {
        this.setTitle(this.getTitle().replace("Agregar Nueva", "Editar"));
        this.lbl_titulo.setText(this.lbl_titulo.getText().replace("Agregar", "Editar"));
        this.btn_agregar.setVisible(false);
        this.btn_editar.setVisible(true);
        //this.txt_tag.setText(bomba.getTag());
        //this.txt_descripcion.setText(bomba.getDescripcion());
    }

    private void agregarDatosBomba(int modo) {
        if(ValidarDatos()){
            //bomba.agregarDatosBomba(modo);
        }
        else 
            JOptionPane.showMessageDialog(null, "Datos Inválidos", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }
    
    private boolean ValidarDatos(){
        return !this.txt_tag.getText().isEmpty() && !this.txt_descripcion.getText().isEmpty();
    }
}