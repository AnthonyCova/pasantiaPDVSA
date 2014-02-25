/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.ui;

import javax.swing.SwingConstants;

/**
 *
 * @author Liz
 */
public class UINuevoReporte extends javax.swing.JInternalFrame {

    /**
     * Creates new form NuevoReporte
     */
    public UINuevoReporte() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_content = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_NuevoReporte = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbl_registro = new javax.swing.JLabel();
        lbl_parada = new javax.swing.JLabel();
        lbl_arranque = new javax.swing.JLabel();
        lbl_causa = new javax.swing.JLabel();
        lbl_tfds1 = new javax.swing.JLabel();
        lbl_tfds2 = new javax.swing.JLabel();
        lbl_observacion = new javax.swing.JLabel();
        txt_registro = new javax.swing.JLabel();
        txt_parada = new javax.swing.JLabel();
        txt_arranque = new javax.swing.JLabel();
        txt_tfds = new javax.swing.JLabel();
        cmb_causa = new javax.swing.JComboBox();
        txt_ScrollObservacion = new javax.swing.JScrollPane();
        txt_observacion = new javax.swing.JTextArea();
        pnl_accion = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Nuevo Reporte de Parada de Poliducto");
        setPreferredSize(new java.awt.Dimension(700, 400));

        lbl_NuevoReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/nuevoReporte.png"))); // NOI18N
        lbl_NuevoReporte.setText("Nuevo Reporte");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_NuevoReporte)
                .addContainerGap(569, Short.MAX_VALUE))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_tituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_NuevoReporte)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Reporte"));

        lbl_registro.setText("Registro:");

        lbl_parada.setText("Parada:");

        lbl_arranque.setText("Arranque:");

        lbl_causa.setText("Causa:");

        lbl_tfds1.setText("Tiempo fuera");

        lbl_tfds2.setText("de Servicio:");

        lbl_observacion.setText("Observación:");

        txt_registro.setText("XXX");

        txt_parada.setText("dd/mm/aaaa");

        txt_arranque.setText("dd/mm/aaaa");

        txt_tfds.setText("tt");

        cmb_causa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_observacion.setColumns(20);
        txt_observacion.setRows(5);
        txt_ScrollObservacion.setViewportView(txt_observacion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_registro)
                    .addComponent(lbl_parada)
                    .addComponent(lbl_arranque)
                    .addComponent(lbl_tfds1)
                    .addComponent(lbl_tfds2))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_arranque)
                    .addComponent(txt_tfds)
                    .addComponent(txt_parada)
                    .addComponent(txt_registro))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_observacion)
                    .addComponent(lbl_causa))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmb_causa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 283, Short.MAX_VALUE))
                    .addComponent(txt_ScrollObservacion))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_registro)
                    .addComponent(txt_registro)
                    .addComponent(lbl_causa)
                    .addComponent(cmb_causa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_parada)
                            .addComponent(txt_parada)
                            .addComponent(lbl_observacion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_arranque)
                            .addComponent(txt_arranque))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_tfds1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_tfds2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(txt_tfds)))
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addComponent(txt_ScrollObservacion))
                .addContainerGap())
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
        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/agregarNuevoReporte.png"))); // NOI18N
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

        javax.swing.GroupLayout pnl_accionLayout = new javax.swing.GroupLayout(pnl_accion);
        pnl_accion.setLayout(pnl_accionLayout);
        pnl_accionLayout.setHorizontalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_accionLayout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(btn_agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addContainerGap())
        );
        pnl_accionLayout.setVerticalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_cerrar)
                .addComponent(btn_agregar))
        );

        javax.swing.GroupLayout pnl_contentLayout = new javax.swing.GroupLayout(pnl_content);
        pnl_content.setLayout(pnl_contentLayout);
        pnl_contentLayout.setHorizontalGroup(
            pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contentLayout.createSequentialGroup()
                .addGroup(pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_contentLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(pnl_accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(pnl_contentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_contentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_contentLayout.setVerticalGroup(
            pnl_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_contentLayout.createSequentialGroup()
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JComboBox cmb_causa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_NuevoReporte;
    private javax.swing.JLabel lbl_arranque;
    private javax.swing.JLabel lbl_causa;
    private javax.swing.JLabel lbl_observacion;
    private javax.swing.JLabel lbl_parada;
    private javax.swing.JLabel lbl_registro;
    private javax.swing.JLabel lbl_tfds1;
    private javax.swing.JLabel lbl_tfds2;
    private javax.swing.JPanel pnl_accion;
    private javax.swing.JPanel pnl_content;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JScrollPane txt_ScrollObservacion;
    private javax.swing.JLabel txt_arranque;
    private javax.swing.JTextArea txt_observacion;
    private javax.swing.JLabel txt_parada;
    private javax.swing.JLabel txt_registro;
    private javax.swing.JLabel txt_tfds;
    // End of variables declaration//GEN-END:variables
}
