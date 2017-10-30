/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;

public class GUI_CrearUsuario extends javax.swing.JFrame { 
    
    DateFormat df = DateFormat.getDateInstance();
    ControladorOperador controladorOperador;
    ControladorGerente controladorGerente;

    public GUI_CrearUsuario(){
        
        initComponents();
        controladorOperador = new ControladorOperador();
        controladorGerente = new ControladorGerente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        respuestaSeguridad = new javax.swing.JTextField();
        primerNombreLabel12 = new javax.swing.JLabel();
        preguntaSeguridad = new javax.swing.JTextField();
        confirmarpass = new javax.swing.JPasswordField();
        primerNombreLabel11 = new javax.swing.JLabel();
        primerNombreLabel10 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        primerNombreLabel9 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        primerNombreLabel8 = new javax.swing.JLabel();
        cel = new javax.swing.JTextField();
        primerNombreLabel7 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        primerNombreLabel6 = new javax.swing.JLabel();
        primerNombreLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
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
        primerNom = new javax.swing.JTextField();
        crearUsuario = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
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
        botonCancelar.setBounds(1000, 570, 250, 100);

        respuestaSeguridad.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        respuestaSeguridad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(respuestaSeguridad);
        respuestaSeguridad.setBounds(880, 450, 230, 28);

        primerNombreLabel12.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel12.setText("Respuesta:");
        jPanel1.add(primerNombreLabel12);
        primerNombreLabel12.setBounds(750, 450, 150, 30);

        preguntaSeguridad.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        preguntaSeguridad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(preguntaSeguridad);
        preguntaSeguridad.setBounds(880, 400, 230, 28);

        confirmarpass.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        confirmarpass.setSelectionColor(new java.awt.Color(102, 102, 255));
        confirmarpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarpassActionPerformed(evt);
            }
        });
        jPanel1.add(confirmarpass);
        confirmarpass.setBounds(880, 350, 230, 28);

        primerNombreLabel11.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel11.setText("Pregunta:");
        jPanel1.add(primerNombreLabel11);
        primerNombreLabel11.setBounds(750, 400, 140, 30);

        primerNombreLabel10.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel10.setText("Confirmar:");
        jPanel1.add(primerNombreLabel10);
        primerNombreLabel10.setBounds(750, 350, 150, 30);

        pass.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        pass.setSelectionColor(new java.awt.Color(102, 102, 255));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(880, 300, 230, 28);

        primerNombreLabel9.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel9.setText("Contraseña:");
        jPanel1.add(primerNombreLabel9);
        primerNombreLabel9.setBounds(750, 300, 160, 30);

        correo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(460, 550, 230, 28);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel8.setText("Email:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(260, 550, 120, 30);

        cel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cel);
        cel.setBounds(880, 250, 230, 28);

        primerNombreLabel7.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel7.setText("Celular:");
        jPanel1.add(primerNombreLabel7);
        primerNombreLabel7.setBounds(750, 250, 130, 30);

        tel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        jPanel1.add(tel);
        tel.setBounds(880, 200, 230, 28);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel6.setText("Teléfono:");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(750, 200, 140, 30);

        primerNombreLabel5.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel5.setText("Fecha Nacimiento:");
        jPanel1.add(primerNombreLabel5);
        primerNombreLabel5.setBounds(260, 500, 220, 40);

        tipo.setBackground(new java.awt.Color(102, 102, 255));
        tipo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        tipo.setForeground(new java.awt.Color(102, 102, 255));
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Gerente" }));
        tipo.setFocusable(false);
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });
        jPanel1.add(tipo);
        tipo.setBounds(460, 200, 230, 28);

        primerNombreLabel4.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel4.setText("Tipo de Usuario:");
        jPanel1.add(primerNombreLabel4);
        primerNombreLabel4.setBounds(260, 200, 170, 30);

        ced.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        ced.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(ced);
        ced.setBounds(460, 450, 230, 28);

        primerNombreLabel3.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel3.setText("Cédula:");
        jPanel1.add(primerNombreLabel3);
        primerNombreLabel3.setBounds(260, 450, 130, 30);

        segundoAp.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoAp);
        segundoAp.setBounds(460, 400, 230, 28);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel2.setText("Segundo Apellido:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(260, 400, 180, 30);

        primerAp.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerAp);
        primerAp.setBounds(460, 350, 230, 28);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel1.setText("Primer Apellido:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(260, 350, 170, 30);

        segundoNom.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoNom);
        segundoNom.setBounds(460, 300, 230, 28);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(260, 300, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(260, 250, 170, 30);

        primerNom.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerNom);
        primerNom.setBounds(460, 250, 230, 28);

        crearUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearUsuario.setBorder(null);
        crearUsuario.setBorderPainted(false);
        crearUsuario.setContentAreaFilled(false);
        crearUsuario.setFocusPainted(false);
        crearUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(crearUsuario);
        crearUsuario.setBounds(750, 570, 250, 100);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(460, 500, 230, 28);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearUsuario.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
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

    private void confirmarpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarpassActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed

        String primerNombre, segundoNombre, primerApellido, segundoApellido, cedula, tipoUsuario, 
                fechaNacimiento, telefono, celular, email, contrasena, confirmar, pregunta, respuesta;
        
        primerNombre = primerNom.getText();
        segundoNombre = segundoNom.getText();
        primerApellido = primerAp.getText();
        segundoApellido = segundoAp.getText();
        cedula = ced.getText();
        tipoUsuario = (String) tipo.getSelectedItem();
        fechaNacimiento = df.format(fecha.getDate());
        System.out.print(fechaNacimiento);
        telefono = tel.getText();
        celular = cel.getText();
        email = correo.getText();
        contrasena = pass.getText();
        confirmar = confirmarpass.getText();
        pregunta = preguntaSeguridad.getText();
        respuesta = respuestaSeguridad.getText();
       
       if(tipoUsuario.equals("Operador")){
           
            int numFilas = controladorOperador.insertarOperador(primerNombre, 
               segundoNombre, primerApellido, segundoApellido,
               cedula, fechaNacimiento, telefono, celular, email, 
               contrasena, confirmar, pregunta, respuesta);

            if(numFilas == 1){
                
                JOptionPane.showMessageDialog(null, "Operador creado exitosamente.");
            }
            else if (numFilas == 5){
                
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el operador.");
            }
        }
        else if(tipoUsuario.equals("Gerente")){
            
            int numFilas = controladorGerente.insertarGerente(primerNombre, 
               segundoNombre, primerApellido, segundoApellido,
               cedula, fechaNacimiento, telefono, celular, email, 
               contrasena, confirmar, pregunta, respuesta);           

            if (numFilas == 1){
                
                JOptionPane.showMessageDialog(null, "Gerente creado exitosamente.");
            }
            else if (numFilas == 5){
                
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.");
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el gerente.");
            }         
       }  
    }//GEN-LAST:event_crearUsuarioActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoActionPerformed

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
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField ced;
    private javax.swing.JTextField cel;
    private javax.swing.JPasswordField confirmarpass;
    private javax.swing.JTextField correo;
    private javax.swing.JButton crearUsuario;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField preguntaSeguridad;
    private javax.swing.JTextField primerAp;
    private javax.swing.JTextField primerNom;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel1;
    private javax.swing.JLabel primerNombreLabel10;
    private javax.swing.JLabel primerNombreLabel11;
    private javax.swing.JLabel primerNombreLabel12;
    private javax.swing.JLabel primerNombreLabel2;
    private javax.swing.JLabel primerNombreLabel3;
    private javax.swing.JLabel primerNombreLabel4;
    private javax.swing.JLabel primerNombreLabel5;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel primerNombreLabel7;
    private javax.swing.JLabel primerNombreLabel8;
    private javax.swing.JLabel primerNombreLabel9;
    private javax.swing.JTextField respuestaSeguridad;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JTextField segundoNom;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}