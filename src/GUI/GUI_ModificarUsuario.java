/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controladores.*;
import java.text.*;

public class GUI_ModificarUsuario extends javax.swing.JFrame { 
    
    DateFormat df = DateFormat.getDateInstance();
    ControladorOperador controladorOperador;
    ControladorGerente controladorGerente;

    public GUI_ModificarUsuario(){
        
        initComponents();
        controladorOperador = new ControladorOperador();
        controladorGerente = new ControladorGerente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        primerNombreLabel8 = new javax.swing.JLabel();
        cel = new javax.swing.JTextField();
        primerNombreLabel7 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        primerNombreLabel6 = new javax.swing.JLabel();
        primerNombreLabel5 = new javax.swing.JLabel();
        estado = new javax.swing.JComboBox<>();
        primerNombreLabel4 = new javax.swing.JLabel();
        ced = new javax.swing.JTextField();
        primerNombreLabel3 = new javax.swing.JLabel();
        segundoAp = new javax.swing.JTextField();
        primerNombreLabel2 = new javax.swing.JLabel();
        primerAp = new javax.swing.JTextField();
        primerNombreLabel1 = new javax.swing.JLabel();
        segundoNom = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        consultarLabel = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        primerNom1 = new javax.swing.JTextField();
        primerNombreLabel9 = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        primerNombreLabel10 = new javax.swing.JLabel();
        tipo1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        botonCancelar.setBorder(null);
        botonCancelar.setBorderPainted(false);
        botonCancelar.setContentAreaFilled(false);
        botonCancelar.setFocusPainted(false);
        botonCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        botonCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(botonCancelar);
        botonCancelar.setBounds(890, 560, 250, 100);

        correo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(1070, 270, 200, 28);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel8.setText("Email:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(860, 270, 120, 30);

        cel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cel);
        cel.setBounds(1070, 370, 200, 28);

        primerNombreLabel7.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel7.setText("Estado:");
        jPanel1.add(primerNombreLabel7);
        primerNombreLabel7.setBounds(860, 420, 130, 30);

        tel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        jPanel1.add(tel);
        tel.setBounds(1070, 320, 200, 28);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel6.setText("Teléfono:");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(860, 320, 140, 30);

        primerNombreLabel5.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel5.setText("Fecha Nacimiento:");
        jPanel1.add(primerNombreLabel5);
        primerNombreLabel5.setBounds(860, 220, 220, 40);

        estado.setBackground(new java.awt.Color(102, 102, 255));
        estado.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        estado.setForeground(new java.awt.Color(102, 102, 255));
        estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        estado.setFocusable(false);
        estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoActionPerformed(evt);
            }
        });
        jPanel1.add(estado);
        estado.setBounds(1070, 420, 200, 28);

        primerNombreLabel4.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel4.setText("Ingresar Cédula:");
        jPanel1.add(primerNombreLabel4);
        primerNombreLabel4.setBounds(100, 290, 280, 40);

        ced.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        ced.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(ced);
        ced.setBounds(600, 470, 200, 28);

        primerNombreLabel3.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel3.setText("Cédula:");
        jPanel1.add(primerNombreLabel3);
        primerNombreLabel3.setBounds(400, 470, 130, 30);

        segundoAp.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoAp);
        segundoAp.setBounds(600, 420, 200, 28);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel2.setText("Segundo Apellido:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(400, 420, 180, 30);

        primerAp.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerAp);
        primerAp.setBounds(600, 370, 200, 28);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel1.setText("Primer Apellido:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(400, 370, 170, 30);

        segundoNom.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoNom);
        segundoNom.setBounds(600, 320, 200, 28);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(400, 320, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(400, 270, 170, 30);

        consultarLabel.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        consultarLabel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(consultarLabel);
        consultarLabel.setBounds(100, 350, 200, 40);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        botonConsultar.setBorder(null);
        botonConsultar.setBorderPainted(false);
        botonConsultar.setContentAreaFilled(false);
        botonConsultar.setFocusPainted(false);
        botonConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        botonConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultar);
        botonConsultar.setBounds(80, 410, 250, 100);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(1070, 230, 200, 28);

        primerNom1.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerNom1.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerNom1);
        primerNom1.setBounds(600, 270, 200, 28);

        primerNombreLabel9.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel9.setText("Tipo de Usuario:");
        jPanel1.add(primerNombreLabel9);
        primerNombreLabel9.setBounds(400, 220, 170, 30);

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        botonAceptar.setBorder(null);
        botonAceptar.setBorderPainted(false);
        botonAceptar.setContentAreaFilled(false);
        botonAceptar.setFocusPainted(false);
        botonAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        botonAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(640, 560, 250, 100);

        primerNombreLabel10.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel10.setText("Celular:");
        jPanel1.add(primerNombreLabel10);
        primerNombreLabel10.setBounds(860, 370, 130, 30);

        tipo1.setBackground(new java.awt.Color(102, 102, 255));
        tipo1.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        tipo1.setForeground(new java.awt.Color(102, 102, 255));
        tipo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Gerente" }));
        tipo1.setFocusable(false);
        tipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipo1ActionPerformed(evt);
            }
        });
        jPanel1.add(tipo1);
        tipo1.setBounds(600, 220, 200, 28);

        jLabel2.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModificarUsuario.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, 0, 1390, 780);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1382, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Administrador adminLogin = new GUI_Administrador();
        adminLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        
        
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
       
        String primerNombre, segundoNombre, primerApellido, segundoApellido, cedula, tipoUsuario, 
                fechaNacimiento, telefono, celular, email;
        
        primerNombre = consultarLabel.getText();
        segundoNombre = segundoNom.getText();
        primerApellido = primerAp.getText();
        segundoApellido = segundoAp.getText();
        cedula = ced.getText();
        tipoUsuario = (String) estado.getSelectedItem();
        fechaNacimiento = df.format(fecha.getDate());
        telefono = tel.getText();
        celular = cel.getText();
        email = correo.getText();
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void tipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipo1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearUsuario().setVisible(true);
            }
        });  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JTextField ced;
    private javax.swing.JTextField cel;
    private javax.swing.JTextField consultarLabel;
    private javax.swing.JTextField correo;
    private javax.swing.JComboBox<String> estado;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField primerAp;
    private javax.swing.JTextField primerNom1;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel1;
    private javax.swing.JLabel primerNombreLabel10;
    private javax.swing.JLabel primerNombreLabel2;
    private javax.swing.JLabel primerNombreLabel3;
    private javax.swing.JLabel primerNombreLabel4;
    private javax.swing.JLabel primerNombreLabel5;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel primerNombreLabel7;
    private javax.swing.JLabel primerNombreLabel8;
    private javax.swing.JLabel primerNombreLabel9;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JTextField segundoNom;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox<String> tipo1;
    // End of variables declaration//GEN-END:variables
}