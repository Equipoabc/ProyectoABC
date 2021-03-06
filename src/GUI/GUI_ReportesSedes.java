/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controladores.ControladorReportesSedes;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Iván
 */
public class GUI_ReportesSedes extends javax.swing.JFrame {

    /**
     * Creates new form GUI_ReportesSedes
     */
    DefaultTableModel modeloTabla;
    ControladorReportesSedes controladorReportesSedes;
    String tipo;
    String idNombre;
    
    public void setId(String id) {
        this.idNombre = id;
    }
    
    public void setTipo(String ti){
        this.tipo = ti;
    }
    
    public GUI_ReportesSedes() {
        initComponents();
        this.setLocationRelativeTo(null);
        campoDeBusqueda.setText("");
        controladorReportesSedes = new ControladorReportesSedes();
        modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int fila, int columna) {

                return false;
            }
        };

        tabla.setModel(modeloTabla);

        modeloTabla.addColumn("Nombre"); // nombre_sede
        modeloTabla.addColumn("Ciudad"); // ciudad
        modeloTabla.addColumn("Calle"); // calle, carrera y barrio
        modeloTabla.addColumn("Carrera");
        modeloTabla.addColumn("Barrio");
        modeloTabla.addColumn("Telefono"); // telefono

        tabla.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        campoDeBusqueda = new javax.swing.JTextField();
        exportar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        buscar.setBorderPainted(false);
        buscar.setContentAreaFilled(false);
        buscar.setFocusPainted(false);
        buscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar);
        buscar.setBounds(550, 120, 130, 70);

        tabla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 101, 247), 2, true));
        tabla.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setGridColor(new java.awt.Color(108, 101, 247));
        tabla.setSelectionBackground(new java.awt.Color(108, 101, 247));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 710, 170);

        campoDeBusqueda.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        campoDeBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeBusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(campoDeBusqueda);
        campoDeBusqueda.setBounds(390, 140, 150, 25);

        exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExportarMed.png"))); // NOI18N
        exportar.setBorderPainted(false);
        exportar.setContentAreaFilled(false);
        exportar.setFocusPainted(false);
        exportar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExportarPeq.png"))); // NOI18N
        exportar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exportar.png"))); // NOI18N
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });
        jPanel1.add(exportar);
        exportar.setBounds(430, 390, 150, 50);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        cancelar.setBorder(null);
        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        cancelar.setFocusPainted(false);
        cancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(570, 390, 130, 50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reportes Sedes");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 50, 280, 50);

        txtBuscar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        txtBuscar.setText("Código Sede:");
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(300, 140, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String busqueda;
        busqueda = campoDeBusqueda.getText();

        while (modeloTabla.getRowCount() != 0) {

            modeloTabla.removeRow(0);
        }

        if (busqueda.equals("")) {

            controladorReportesSedes.consultarSedes(modeloTabla, tabla);
        } else {

            controladorReportesSedes.consultarSede(modeloTabla, tabla, busqueda);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void campoDeBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeBusquedaActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        // TODO add your handling code here:
        
        String busqueda;
        busqueda = campoDeBusqueda.getText();
       
        if(busqueda.equals("")){
            
        Date fechaActual;
        fechaActual = GUI_ReportesUsuarios.GetDateNow();
        String fecha = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            fecha = new SimpleDateFormat("dd-MM-YYYY").format(fechaActual);
        } catch(Exception e){
            System.out.println(e);
        }
        controladorReportesSedes.generarReporteSedes("Reporte Sedes " + fecha);
        }
    }//GEN-LAST:event_exportarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed

        switch (this.tipo) {
            case "op":
                GUI_ReportesOperador oper = new GUI_ReportesOperador();
                oper.setId(idNombre);
                    oper.personalizarBienvenida();
                oper.setVisible(true);
                this.dispose();
                break;
            case "ge":
                {
                    GUI_ReportesGerente interfazLogin = new GUI_ReportesGerente();
                     interfazLogin.setId(idNombre);
                    interfazLogin.personalizarBienvenida();
                    interfazLogin.setVisible(true);
                    this.dispose();
                    break;
                }
            case "admin":
                {
                    GUI_ReportesAdmin interfazLogin = new GUI_ReportesAdmin();
                    interfazLogin.setVisible(true);
                    this.dispose();
                    break;
                }
            default:
                break;
        }
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_ReportesSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ReportesSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ReportesSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ReportesSedes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_ReportesSedes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField campoDeBusqueda;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton exportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel txtBuscar;
    // End of variables declaration//GEN-END:variables
}
