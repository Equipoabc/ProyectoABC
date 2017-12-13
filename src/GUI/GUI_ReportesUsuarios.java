package GUI;
import Controladores.*;
import DAO.DaoReportesUsuarios;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.*;

public class GUI_ReportesUsuarios extends javax.swing.JFrame {
    
    DefaultTableModel modeloTabla;
    ControladorReportesUsuarios controladorRegistros;
    DaoReportesUsuarios daoR;
    String tipo;
    String idNombre;
    
    public void setId(String id) {
        this.idNombre = id;
    }
    
    public void setTipo(String ti){
        this.tipo = ti;
    }
    
    static Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
    }
    
     
    
    public GUI_ReportesUsuarios(){
        
        initComponents();
        
        this.setLocationRelativeTo(null);
        fieldBuscar.setText("");
        controladorRegistros = new ControladorReportesUsuarios();
        modeloTabla = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int fila, int columna){
                
                return false;
            }
        };
        
        tableDatos.setModel(modeloTabla);
        
        modeloTabla.addColumn("Cedula");
        modeloTabla.addColumn("Primer nombre");
        modeloTabla.addColumn("Segundo nombre");
        modeloTabla.addColumn("Primer apellido");
        modeloTabla.addColumn("Segundo apellido");
        modeloTabla.addColumn("Fecha de nacimiento");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Celular");
        modeloTabla.addColumn("Estado");
        
        tableDatos.getTableHeader().setReorderingAllowed(false);
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
        buttonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDatos = new javax.swing.JTable();
        txtBuscar = new javax.swing.JLabel();
        fieldBuscar = new javax.swing.JTextField();
        buttonExportar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setLayout(null);

        buttonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        buttonBuscar.setBorderPainted(false);
        buttonBuscar.setContentAreaFilled(false);
        buttonBuscar.setFocusPainted(false);
        buttonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        buttonBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBuscar);
        buttonBuscar.setBounds(580, 130, 130, 40);

        tableDatos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(108, 101, 247), 2, true));
        tableDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        tableDatos.setGridColor(new java.awt.Color(108, 101, 247));
        tableDatos.setSelectionBackground(new java.awt.Color(108, 101, 247));
        jScrollPane1.setViewportView(tableDatos);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 180, 700, 200);

        txtBuscar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        txtBuscar.setText("No. Cédula:");
        jPanel1.add(txtBuscar);
        txtBuscar.setBounds(320, 140, 70, 20);

        fieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(fieldBuscar);
        fieldBuscar.setBounds(401, 140, 160, 23);

        buttonExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExportarMed.png"))); // NOI18N
        buttonExportar.setBorderPainted(false);
        buttonExportar.setContentAreaFilled(false);
        buttonExportar.setFocusPainted(false);
        buttonExportar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExportarPeq.png"))); // NOI18N
        buttonExportar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exportar.png"))); // NOI18N
        buttonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportarActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExportar);
        buttonExportar.setBounds(440, 400, 130, 50);

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
        cancelar.setBounds(590, 400, 130, 50);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reportes Usuarios");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 50, 280, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(750, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        
        String busqueda;
        busqueda = fieldBuscar.getText();
        
        while(modeloTabla.getRowCount() != 0){
            
            modeloTabla.removeRow(0);
        }
        
        if(busqueda.equals("")){
            
            controladorRegistros.consultarUsuarios(modeloTabla, tableDatos);
        }
        else {
            
            controladorRegistros.consultarUsuario(modeloTabla, tableDatos, busqueda);
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed
    
    private void fieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBuscarActionPerformed
        
    }//GEN-LAST:event_fieldBuscarActionPerformed

    private void buttonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportarActionPerformed
        // TODO add your handling code here:
        String busqueda;
        busqueda = fieldBuscar.getText();
       
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
        controladorRegistros.generarReporteUsuarios("Reporte " + fecha);
        }
        
    }//GEN-LAST:event_buttonExportarActionPerformed

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
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(GUI_ReportesUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_ReportesUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_ReportesUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_ReportesUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_ReportesUsuarios().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonExportar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField fieldBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDatos;
    private javax.swing.JLabel txtBuscar;
    // End of variables declaration//GEN-END:variables
}