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
import sisup.controladores.Mantenimientos;

/**
 *
 * @author Liz
 */
public class UIMantenimientos extends javax.swing.JPanel {
    private UIDashboard padre;

    public UIMantenimientos(final UIDashboard padre) {
        super();
        this.padre = padre;
        initComponents();
        CargarTablaMantenimientos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_mantenimientos = new javax.swing.JPanel();
        pnl_titulo = new javax.swing.JPanel();
        lbl_administrarTiposMantenimiento = new javax.swing.JLabel();
        pnl_accion = new javax.swing.JPanel();
        btn_atras = new javax.swing.JButton();
        btn_agregarTipoMantenimiento = new javax.swing.JButton();
        pnl_tablaMantenimientos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(null);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(820, 460));

        pnl_mantenimientos.setBackground(null);
        pnl_mantenimientos.setOpaque(false);
        pnl_mantenimientos.setPreferredSize(new java.awt.Dimension(820, 460));

        pnl_titulo.setOpaque(false);

        lbl_administrarTiposMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/mantenimiento.png"))); // NOI18N
        lbl_administrarTiposMantenimiento.setText("Administrar Tipos de Mantenimiento");

        javax.swing.GroupLayout pnl_tituloLayout = new javax.swing.GroupLayout(pnl_titulo);
        pnl_titulo.setLayout(pnl_tituloLayout);
        pnl_tituloLayout.setHorizontalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_administrarTiposMantenimiento)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        pnl_tituloLayout.setVerticalGroup(
            pnl_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_administrarTiposMantenimiento)
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

        btn_agregarTipoMantenimiento.setBackground(new java.awt.Color(204, 204, 255));
        btn_agregarTipoMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sisup/recursos/agregarTipoMantenimiento.png"))); // NOI18N
        btn_agregarTipoMantenimiento.setText("Agregar");
        btn_agregarTipoMantenimiento.setBorder(javax.swing.BorderFactory.createEmptyBorder(14, 14, 14, 14));
        btn_agregarTipoMantenimiento.setBorderPainted(false);
        btn_agregarTipoMantenimiento.setHorizontalTextPosition(SwingConstants.CENTER);
        btn_agregarTipoMantenimiento.setMargin(new java.awt.Insets(14, 14, 14, 14));
        btn_agregarTipoMantenimiento.setOpaque(false);
        btn_agregarTipoMantenimiento.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btn_agregarTipoMantenimiento.setVerticalTextPosition(SwingConstants.BOTTOM);
        btn_agregarTipoMantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarTipoMantenimientoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_accionLayout = new javax.swing.GroupLayout(pnl_accion);
        pnl_accion.setLayout(pnl_accionLayout);
        pnl_accionLayout.setHorizontalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_accionLayout.createSequentialGroup()
                .addContainerGap(565, Short.MAX_VALUE)
                .addComponent(btn_agregarTipoMantenimiento)
                .addGap(18, 18, 18)
                .addComponent(btn_atras)
                .addContainerGap())
        );
        pnl_accionLayout.setVerticalGroup(
            pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_accionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_atras)
                .addComponent(btn_agregarTipoMantenimiento))
        );

        pnl_tablaMantenimientos.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de mantenimientos"));
        pnl_tablaMantenimientos.setOpaque(false);

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(750, 250));
        jScrollPane1.setRequestFocusEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo de Mantenimiento", "Status", "Acción"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout pnl_tablaMantenimientosLayout = new javax.swing.GroupLayout(pnl_tablaMantenimientos);
        pnl_tablaMantenimientos.setLayout(pnl_tablaMantenimientosLayout);
        pnl_tablaMantenimientosLayout.setHorizontalGroup(
            pnl_tablaMantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tablaMantenimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_tablaMantenimientosLayout.setVerticalGroup(
            pnl_tablaMantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_tablaMantenimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout pnl_mantenimientosLayout = new javax.swing.GroupLayout(pnl_mantenimientos);
        pnl_mantenimientos.setLayout(pnl_mantenimientosLayout);
        pnl_mantenimientosLayout.setHorizontalGroup(
            pnl_mantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mantenimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_tablaMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnl_mantenimientosLayout.setVerticalGroup(
            pnl_mantenimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_mantenimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_accion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_tablaMantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_mantenimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_mantenimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        padre.cambiapanel(UIDashboard.enm_paneles.UIDASHBOARD);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_agregarTipoMantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarTipoMantenimientoActionPerformed
        padre.cambiapanel(UIDashboard.enm_paneles.UIAGREGARTIPOMANTENIMIENTO);
    }//GEN-LAST:event_btn_agregarTipoMantenimientoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarTipoMantenimiento;
    private javax.swing.JButton btn_atras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_administrarTiposMantenimiento;
    private javax.swing.JPanel pnl_accion;
    public javax.swing.JPanel pnl_mantenimientos;
    private javax.swing.JPanel pnl_tablaMantenimientos;
    private javax.swing.JPanel pnl_titulo;
    // End of variables declaration//GEN-END:variables
    
    Mantenimientos mantenimientos;
    
    public void CargarTablaMantenimientos() {
        if (mantenimientos == null) mantenimientos = new Mantenimientos();

        Object[][] data = mantenimientos.getListaMantenimientos();
        
        if(data.length != 0){
            String[] columnNames = {"Tipo Mantenimiento", "Estatus", "Acción"};

            DefaultTableModel model = new DefaultTableModel(data, columnNames);
            JTable table2 = new JTable(model);

            Action delete = new AbstractAction()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JTable table = (JTable)e.getSource();
                    int modelRow = Integer.valueOf( e.getActionCommand());
                    //((DefaultTableModel)table.getModel()).removeRow(modelRow);
                    String var = table.getModel().getValueAt(modelRow, 0).toString();
                    String ac = e.getActionCommand();
                    padre.uiAgregarTipoMantenimiento.setModoEditar(mantenimientos.getMantenimientoEditar(modelRow));
                    padre.cambiapanel(UIDashboard.enm_paneles.UIAGREGARUSUARIO);
                }
            };

            ButtonColumn buttonColumn = new ButtonColumn(table2, delete, 4);
            buttonColumn.setMnemonic(KeyEvent.VK_D);

            JScrollPane scroll = new JScrollPane(table2);
            scroll.setPreferredSize(new java.awt.Dimension(400, 200));
            pnl_tablaMantenimientos.add(scroll);
            scroll.setVisible(true);
            jScrollPane1.setVisible(false);
            scroll.setBounds(30, 30, 400, 200);
        }
    }
}
