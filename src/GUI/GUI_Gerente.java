package GUI;

import Controladores.ControladorGerente;
import Logica.Gerente;

public class GUI_Gerente extends javax.swing.JFrame {
    
    String id;
    
    
    public GUI_Gerente(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        modificarSede = new javax.swing.JButton();
        reportes = new javax.swing.JButton();
        registrarSede = new javax.swing.JButton();
        CerrarSesion = new javax.swing.JLabel();
        crearEvento = new javax.swing.JButton();
        modificarEvento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("  Bienvenido(a) ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 240, 200, 50);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 280, 190, 50);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(108, 101, 247));
        jLabel3.setText("<html><body> <center>  Modificar<br>Evento </center></body></html>");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 180, 110, 90);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(108, 101, 247));
        jLabel5.setText("<html><body> <center>  Reportes y<br>Consultas </center></body></html>");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(590, 180, 140, 90);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(108, 101, 247));
        jLabel7.setText("<html><body> <center>  Registrar<br>Sede </center></body></html>");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(340, 310, 110, 90);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(108, 101, 247));
        jLabel8.setText("<html><body> <center> Modificar<br>Sede </center></body></html>");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 310, 120, 90);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 26)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(108, 101, 247));
        jLabel9.setText("<html><body> <center>  Crear<br>Evento </center></body></html>");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(270, 180, 90, 90);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gerente");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 200, 50);

        modificarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        modificarSede.setBorder(null);
        modificarSede.setBorderPainted(false);
        modificarSede.setContentAreaFilled(false);
        modificarSede.setFocusPainted(false);
        modificarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarSedeActionPerformed(evt);
            }
        });
        jPanel1.add(modificarSede);
        modificarSede.setBounds(480, 300, 180, 110);

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
        reportes.setBounds(560, 170, 180, 110);
        reportes.getAccessibleContext().setAccessibleName("Reportes y Consultas");

        registrarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        registrarSede.setBorder(null);
        registrarSede.setBorderPainted(false);
        registrarSede.setContentAreaFilled(false);
        registrarSede.setFocusPainted(false);
        registrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarSedeActionPerformed(evt);
            }
        });
        jPanel1.add(registrarSede);
        registrarSede.setBounds(300, 300, 180, 110);

        CerrarSesion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        CerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        CerrarSesion.setText("Cerrar Sesión");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseClicked(evt);
            }
        });
        jPanel1.add(CerrarSesion);
        CerrarSesion.setBounds(610, 40, 120, 50);

        crearEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        crearEvento.setBorder(null);
        crearEvento.setBorderPainted(false);
        crearEvento.setContentAreaFilled(false);
        crearEvento.setFocusPainted(false);
        crearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEventoActionPerformed(evt);
            }
        });
        jPanel1.add(crearEvento);
        crearEvento.setBounds(220, 170, 180, 110);

        modificarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoBotones.png"))); // NOI18N
        modificarEvento.setBorder(null);
        modificarEvento.setBorderPainted(false);
        modificarEvento.setContentAreaFilled(false);
        modificarEvento.setFocusPainted(false);
        modificarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEventoActionPerformed(evt);
            }
        });
        jPanel1.add(modificarEvento);
        modificarEvento.setBounds(390, 170, 180, 110);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoAdministrador1.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, -10, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setId(String id) {
        this.id = id;
    }
    
    private void reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesActionPerformed
        // TODO add your handling code here:
        GUI_ReportesGerente vSede = new GUI_ReportesGerente();
        vSede.setId(id);
        vSede.personalizarBienvenida();
        vSede.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_reportesActionPerformed
    
    private void registrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarSedeActionPerformed
        // TODO add your handling code here:
        GUI_RegistrarSede interfazSede = new GUI_RegistrarSede();
        interfazSede.setIdGerente(id);
        interfazSede.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registrarSedeActionPerformed
    
    private void CerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseClicked
        
        GUI_Login interfazLogin = new GUI_Login();
        interfazLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionMouseClicked
    
    private void modificarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarSedeActionPerformed
        // TODO add your handling code here:
        GUI_ModificarSede interfazModificarSede = new GUI_ModificarSede();
        interfazModificarSede.setId(id);
        interfazModificarSede.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_modificarSedeActionPerformed
    
    private void crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEventoActionPerformed
        
        GUI_CrearEvento interfazCrearEvento = new GUI_CrearEvento();
        interfazCrearEvento.setId(id);
        interfazCrearEvento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crearEventoActionPerformed
   
    public void personalizarBienvenida(){
        Gerente gerente = new Gerente();
        ControladorGerente controladorGerente = new ControladorGerente();
        
        
        gerente = controladorGerente.consultarDatosGerente(id);
        System.out.println(gerente);
        jLabel1.setText(gerente.getPrimer_nombre());
    }
    private void modificarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEventoActionPerformed
        // TODO add your handling code here:
        GUI_ModificarEvento interfazModificarEvento = new GUI_ModificarEvento();
        interfazModificarEvento.setId(id);
        interfazModificarEvento.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarEventoActionPerformed
    
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
                
                new GUI_Gerente().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CerrarSesion;
    private javax.swing.JButton crearEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificarEvento;
    private javax.swing.JButton modificarSede;
    private javax.swing.JButton registrarSede;
    private javax.swing.JButton reportes;
    // End of variables declaration//GEN-END:variables
}