package GUI;

import Controladores.ControladorOperador;
import Logica.Operador;

public class GUI_ReportesOperador extends javax.swing.JFrame {
    
    String idNombre;
    
    public void setId(String id) {
        this.idNombre = id;
    }
    
    public GUI_ReportesOperador(){
        
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     public void personalizarBienvenida(){
        Operador gerente = new Operador();
        ControladorOperador controladorGerente = new ControladorOperador();
        gerente = controladorGerente.consultarDatosOperador(idNombre);
        jLabel1.setText(gerente.getPrimer_nombre());
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
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        modificarUsuario = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        modificarUsuario1 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(108, 101, 247));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html><body> <center>  Reportes\n<br>Eventos</center></body></html>");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(300, 200, 140, 90);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 101, 247));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html><body> <center>  Reportes<br>Participantes </center></body></html>");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(480, 200, 140, 90);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Operador");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 200, 50);

        modificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        modificarUsuario.setBorder(null);
        modificarUsuario.setBorderPainted(false);
        modificarUsuario.setContentAreaFilled(false);
        modificarUsuario.setFocusPainted(false);
        modificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(modificarUsuario);
        modificarUsuario.setBounds(470, 190, 160, 110);

        reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        reportes.setBorder(null);
        reportes.setBorderPainted(false);
        reportes.setContentAreaFilled(false);
        reportes.setFocusPainted(false);
        reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesActionPerformed(evt);
            }
        });
        jPanel1.add(reportes);
        reportes.setBounds(290, 190, 160, 110);
        reportes.getAccessibleContext().setAccessibleName("Reportes y Consultas");

        CerrarSesion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Regresar");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(CerrarSesion);
        CerrarSesion.setBounds(640, 60, 90, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 280, 190, 50);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("  Bienvenido ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 240, 200, 50);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(108, 101, 247));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<html><body> <center>  Reportes<br>Participantes<br> Eventos </center></body></html>");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 320, 140, 90);

        modificarUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        modificarUsuario1.setBorder(null);
        modificarUsuario1.setBorderPainted(false);
        modificarUsuario1.setContentAreaFilled(false);
        modificarUsuario1.setFocusPainted(false);
        modificarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(modificarUsuario1);
        modificarUsuario1.setBounds(380, 310, 160, 110);

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAdministrador1.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 760, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        
        GUI_ReportesEventos repEventos= new GUI_ReportesEventos();
        repEventos.setTipo("op");
        repEventos.setId(idNombre);
        repEventos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportesActionPerformed
        
    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        
        GUI_Operador interfazLogin = new GUI_Operador();
        interfazLogin.setId(idNombre);
        interfazLogin.personalizarBienvenida();
        interfazLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked
    
    private void modificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarUsuarioActionPerformed
        
        GUI_ReportesParticipantes repParticipantes= new GUI_ReportesParticipantes();
        repParticipantes.setTipo("op");
        repParticipantes.setId(idNombre);
        repParticipantes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarUsuarioActionPerformed

    private void modificarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarUsuario1ActionPerformed
        GUI_ReportesParticipantesEventos repParticipantes= new GUI_ReportesParticipantesEventos();
        repParticipantes.setTipo("op");
        repParticipantes.setId(idNombre);
        repParticipantes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarUsuario1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(GUI_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Administrador().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarUsuario;
    private javax.swing.JButton modificarUsuario1;
    private javax.swing.JButton reportes;
    // End of variables declaration//GEN-END:variables
}