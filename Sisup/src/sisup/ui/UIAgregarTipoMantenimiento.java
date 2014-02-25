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
public class UIAgregarTipoMantenimiento extends javax.swing.JInternalFrame {
    private int tipoMantenimiento;
    ImagenPanel imagenFondo;

    /**
     * Creates new form AgregarTipoMantenimiento
     */
    public UIAgregarTipoMantenimiento() {
        initComponents();
        inicializarComponentes();
        btn_editar.setVisible(false);
    }
    
    public UIAgregarTipoMantenimiento(int tipoMantenimiento) {
        initComponents();
        inicializarComponentes();
        this.tipoMantenimiento = tipoMantenimiento;
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

        pnl_agregarTipoMantenimiento = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        pnl_accion = new javax.swing.JPanel();
        btn_atras = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        pnl_content = new javax.swing.JPanel();
        lbl_tipoMantenimiento = new javax.swing.JLabel();
        txt_tipoMantenimiento = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Nuevo Tipo de Manteniemiento");

        pnl_agregarTipoMantenimiento.setOpaque(false);

        pnl_titulo.setOpaque(false);

        lbl_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/agregarMantenimiento.png"))); // NOI18N
        lbl_titulo.setText("Agregar Tipo de Mantenimiento");

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

        pnl_accion.setOpaque(false);

        btn_atras.setBackground(new java.awt.Color(204, 204, 255));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/atras.png"))); // NOI18N
        btn_atras.setText("Atrás");
        btn_atras.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 14, 14, 14));
        btn_atras.setBorderPainted(false);
        btn_atras.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_atras.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btn_atras.setOpaque(false);
        btn_atras.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_atras.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(204, 204, 255));
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/agregarTipoMantenimiento.png"))); // NOI18N
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
        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/agregarTipoMantenimiento.png"))); // NOI18N
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
                .addComponent(btn_atras)
                .addContainerGap())
        );
        pnl_accionLayout.setVerticalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_accionLayout.createSequentialGroup()
                .addGroup(pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_atras)
                    .addComponent(btn_agregar)
                    .addComponent(btn_editar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnl_content.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del tipo de mantenimeinto"));
        pnl_content.setOpaque(false);

        lbl_tipoMantenimiento.setText("Tipo de mantenimiento:");

        txt_tipoMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipoMantenimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_contentLayout = new javax.swing.GroupLayout(pnl_content);
        pnl_content.setLayout(pnl_contentLayout);
        pnl_contentLayout.setHorizontalGroup(
            pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_tipoMantenimiento)
                .addGap(18, 18, 18)
                .addComponent(txt_tipoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        pnl_contentLayout.setVerticalGroup(
            pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_tipoMantenimiento)
                    .addComponent(txt_tipoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_agregarTipoMantenimientoLayout = new javax.swing.GroupLayout(pnl_agregarTipoMantenimiento);
        pnl_agregarTipoMantenimiento.setLayout(pnl_agregarTipoMantenimientoLayout);
        pnl_agregarTipoMantenimientoLayout.setHorizontalGroup(
            pnl_agregarTipoMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agregarTipoMantenimientoLayout.createSequentialGroup()
                .addGroup(pnl_agregarTipoMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_agregarTipoMantenimientoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_agregarTipoMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_content, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_accion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnl_agregarTipoMantenimientoLayout.setVerticalGroup(
            pnl_agregarTipoMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_agregarTipoMantenimientoLayout.createSequentialGroup()
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnl_accion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_content, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_agregarTipoMantenimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_agregarTipoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tipoMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipoMantenimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipoMantenimientoActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        agregarDatosTipoMantenimiento(0);
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        agregarDatosTipoMantenimiento(1);
    }//GEN-LAST:event_btn_editarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_editar;
    private javax.swing.JLabel lbl_tipoMantenimiento;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_accion;
    private javax.swing.JPanel pnl_agregarTipoMantenimiento;
    private javax.swing.JPanel pnl_content;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JTextField txt_tipoMantenimiento;
    // End of variables declaration//GEN-END:variables

    private void ModoEdicion() {
        this.setTitle(this.getTitle().replace("Agregar Nuevo", "Editar"));
        this.lbl_titulo.setText(this.lbl_titulo.getText().replace("Agregar", "Editar"));
        this.btn_agregar.setVisible(false);
        this.btn_editar.setVisible(true);
        //this.txt_tipoMantenimiento.setText(tipoMantenimiento.getNombre());
    }

    private void agregarDatosTipoMantenimiento(int modo) {
        if(!this.txt_tipoMantenimiento.getText().isEmpty()){
            //tipoMantenimiento.agregarDatosTipoMantenimiento(modo);
        }
        else 
            JOptionPane.showMessageDialog(null, "Datos Inválidos", "Advertencia", JOptionPane.WARNING_MESSAGE);
    }

    private void inicializarComponentes() {
        imagenFondo = new ImagenPanel("/sisup/recursos/ypf-noche.jpg");
        this.add(imagenFondo);
        imagenFondo.setSize(new java.awt.Dimension(720, 232));
        imagenFondo.setVisible(true);
        imagenFondo.add(pnl_agregarTipoMantenimiento);
    }
}
