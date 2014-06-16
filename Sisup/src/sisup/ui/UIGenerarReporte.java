/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.ui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import sisup.controladores.ReportesControlador;

/**
 *
 * @author Liz
 */
public class UIGenerarReporte extends javax.swing.JPanel {
    private final UIDashboard padre;

    /**
     * Creates new form UIGenerarReporte
     * @param padre
     */
    public UIGenerarReporte(final UIDashboard padre) {
        super();
        this.padre = padre;
        initComponents();
        inicializarElementos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_generarReporte = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnl_accion = new javax.swing.JPanel();
        pnl_busqueda = new javax.swing.JPanel();
        lbl_desde = new javax.swing.JLabel();
        ftf_fechaDesde = new javax.swing.JFormattedTextField();
        lbl_hasta = new javax.swing.JLabel();
        ftf_fechaHasta = new javax.swing.JFormattedTextField();
        btn_buscar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_generarPDF = new javax.swing.JButton();
        pnl_tablaReportes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_reportes = new javax.swing.JTable();

        pnl_generarReporte.setOpaque(false);

        pnl_titulo.setOpaque(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/generarReporte.png"))); // NOI18N
        jLabel1.setText("Generar Reportes");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_accion.setOpaque(false);

        pnl_busqueda.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda de reportes"));
        pnl_busqueda.setOpaque(false);

        lbl_desde.setText("Desde: ");

        ftf_fechaDesde.setText(" DD/MM/AAAA ");

        lbl_hasta.setText("Hasta: ");

        ftf_fechaHasta.setText(" DD/MM/AAAA ");
        ftf_fechaHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftf_fechaHastaActionPerformed(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/buscar.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_busquedaLayout = new javax.swing.GroupLayout(pnl_busqueda);
        pnl_busqueda.setLayout(pnl_busquedaLayout);
        pnl_busquedaLayout.setHorizontalGroup(
            pnl_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_desde)
                .addGap(18, 18, 18)
                .addComponent(ftf_fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lbl_hasta)
                .addGap(18, 18, 18)
                .addComponent(ftf_fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnl_busquedaLayout.setVerticalGroup(
            pnl_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_busquedaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_busquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_desde)
                    .addComponent(ftf_fechaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_hasta)
                    .addComponent(ftf_fechaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(pnl_busquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btn_generarPDF.setBackground(new java.awt.Color(204, 204, 255));
        btn_generarPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/atras.png"))); // NOI18N
        btn_generarPDF.setText("Generar PDF");
        btn_generarPDF.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 14, 14, 14));
        btn_generarPDF.setBorderPainted(false);
        btn_generarPDF.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_generarPDF.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btn_generarPDF.setOpaque(false);
        btn_generarPDF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_generarPDF.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_generarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_accionLayout = new javax.swing.GroupLayout(pnl_accion);
        pnl_accion.setLayout(pnl_accionLayout);
        pnl_accionLayout.setHorizontalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_accionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_generarPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cerrar)
                .addContainerGap())
            .addGroup(pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_accionLayout.createSequentialGroup()
                    .addComponent(pnl_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 416, Short.MAX_VALUE)))
        );
        pnl_accionLayout.setVerticalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cerrar)
                    .addComponent(btn_generarPDF))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnl_accionLayout.createSequentialGroup()
                    .addComponent(pnl_busqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnl_tablaReportes.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de reportes"));
        pnl_tablaReportes.setOpaque(false);

        tbl_reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Bomba", "Tiempo Inactiva", "Mantenimiento", "Reporta"
            }
        ));
        jScrollPane2.setViewportView(tbl_reportes);

        javax.swing.GroupLayout pnl_tablaReportesLayout = new javax.swing.GroupLayout(pnl_tablaReportes);
        pnl_tablaReportes.setLayout(pnl_tablaReportesLayout);
        pnl_tablaReportesLayout.setHorizontalGroup(
            pnl_tablaReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tablaReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_tablaReportesLayout.setVerticalGroup(
            pnl_tablaReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tablaReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_generarReporteLayout = new javax.swing.GroupLayout(pnl_generarReporte);
        pnl_generarReporte.setLayout(pnl_generarReporteLayout);
        pnl_generarReporteLayout.setHorizontalGroup(
            pnl_generarReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_generarReporteLayout.createSequentialGroup()
                .addGroup(pnl_generarReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_generarReporteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_generarReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnl_tablaReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnl_accion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_generarReporteLayout.setVerticalGroup(
            pnl_generarReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_generarReporteLayout.createSequentialGroup()
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_accion, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_tablaReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_generarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_generarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        pnl_tablaReportes.setVisible(true);
        btn_generarPDF.setVisible(true);
        buscarReportes();
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void ftf_fechaHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftf_fechaHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftf_fechaHastaActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        this.pnl_tablaReportes.setVisible(false);
        this.ftf_fechaDesde.setText("DD/MM/AAAA");
        this.ftf_fechaHasta.setText("DD/MM/AAAA");
        this.btn_generarPDF.setVisible(false);
        padre.cambiapanel(UIDashboard.enm_paneles.UIDASHBOARD);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_generarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarPDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_generarPDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_generarPDF;
    private javax.swing.JFormattedTextField ftf_fechaDesde;
    private javax.swing.JFormattedTextField ftf_fechaHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_desde;
    private javax.swing.JLabel lbl_hasta;
    private javax.swing.JPanel pnl_accion;
    private javax.swing.JPanel pnl_busqueda;
    private javax.swing.JPanel pnl_generarReporte;
    private javax.swing.JPanel pnl_tablaReportes;
    private javax.swing.JPanel pnl_titulo;
    private javax.swing.JTable tbl_reportes;
    // End of variables declaration//GEN-END:variables

    private void inicializarElementos() {
        pnl_tablaReportes.setVisible(false);
        btn_generarPDF.setVisible(false);
    }

    public void buscarReportes() {

        Object[][] data = padre.reportesControlador.buscarReportes(this.ftf_fechaDesde.getText(),this.ftf_fechaHasta.getText());
      
        DefaultTableModel modeloDeLaTabla=(DefaultTableModel)this.tbl_reportes.getModel();
        for(int i=0; i<data.length;i++)
            modeloDeLaTabla.addRow(data[i]);
        this.tbl_reportes.setModel(modeloDeLaTabla);
        this.pnl_tablaReportes.setVisible(true);
    }
}
