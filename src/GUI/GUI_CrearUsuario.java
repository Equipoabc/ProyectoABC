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
        respuestaLabel12 = new javax.swing.JLabel();
        preguntaSeguridad = new javax.swing.JTextField();
        confirmarpass = new javax.swing.JPasswordField();
        preguntaLabel11 = new javax.swing.JLabel();
        confirmarLabel10 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        passLabel9 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        emailLabel8 = new javax.swing.JLabel();
        cel = new javax.swing.JTextField();
        celLabel7 = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        telefonoLabel6 = new javax.swing.JLabel();
        fechaLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        tipoLabel = new javax.swing.JLabel();
        ced = new javax.swing.JTextField();
        cedulaLabel3 = new javax.swing.JLabel();
        segundoAp = new javax.swing.JTextField();
        segundoApellidoLabel2 = new javax.swing.JLabel();
        primerAp = new javax.swing.JTextField();
        primerApellidoLabel = new javax.swing.JLabel();
        segundoNom = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        primerNom = new javax.swing.JTextField();
        crearUsuario = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        fondo = new javax.swing.JLabel();

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

        respuestaLabel12.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        respuestaLabel12.setText("Respuesta:");
        jPanel1.add(respuestaLabel12);
        respuestaLabel12.setBounds(750, 450, 150, 30);

        preguntaSeguridad.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        preguntaSeguridad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(preguntaSeguridad);
        preguntaSeguridad.setBounds(880, 400, 230, 28);

        confirmarpass.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        confirmarpass.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(confirmarpass);
        confirmarpass.setBounds(880, 350, 230, 28);

        preguntaLabel11.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        preguntaLabel11.setText("Pregunta:");
        jPanel1.add(preguntaLabel11);
        preguntaLabel11.setBounds(750, 400, 140, 30);

        confirmarLabel10.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        confirmarLabel10.setText("Confirmar:");
        jPanel1.add(confirmarLabel10);
        confirmarLabel10.setBounds(750, 350, 150, 30);

        pass.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        pass.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(pass);
        pass.setBounds(880, 300, 230, 28);

        passLabel9.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        passLabel9.setText("Contraseña:");
        jPanel1.add(passLabel9);
        passLabel9.setBounds(750, 300, 160, 30);

        correo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(460, 550, 230, 28);

        emailLabel8.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        emailLabel8.setText("Email:");
        jPanel1.add(emailLabel8);
        emailLabel8.setBounds(260, 550, 120, 30);

        cel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cel);
        cel.setBounds(880, 250, 230, 28);

        celLabel7.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        celLabel7.setText("Celular:");
        jPanel1.add(celLabel7);
        celLabel7.setBounds(750, 250, 130, 30);

        tel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(tel);
        tel.setBounds(880, 200, 230, 28);

        telefonoLabel6.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        telefonoLabel6.setText("Teléfono:");
        jPanel1.add(telefonoLabel6);
        telefonoLabel6.setBounds(750, 200, 140, 30);

        fechaLabel5.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        fechaLabel5.setText("Fecha Nacimiento:");
        jPanel1.add(fechaLabel5);
        fechaLabel5.setBounds(260, 500, 220, 40);

        tipo.setBackground(new java.awt.Color(102, 102, 255));
        tipo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        tipo.setForeground(new java.awt.Color(102, 102, 255));
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Gerente" }));
        tipo.setFocusable(false);
        jPanel1.add(tipo);
        tipo.setBounds(460, 200, 230, 28);

        tipoLabel.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        tipoLabel.setText("Tipo de Usuario:");
        jPanel1.add(tipoLabel);
        tipoLabel.setBounds(260, 200, 170, 30);

        ced.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        ced.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(ced);
        ced.setBounds(460, 450, 230, 28);

        cedulaLabel3.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        cedulaLabel3.setText("Cédula:");
        jPanel1.add(cedulaLabel3);
        cedulaLabel3.setBounds(260, 450, 130, 30);

        segundoAp.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoAp);
        segundoAp.setBounds(460, 400, 230, 28);

        segundoApellidoLabel2.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        segundoApellidoLabel2.setText("Segundo Apellido:");
        jPanel1.add(segundoApellidoLabel2);
        segundoApellidoLabel2.setBounds(260, 400, 180, 30);

        primerAp.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerAp);
        primerAp.setBounds(460, 350, 230, 28);

        primerApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 24)); // NOI18N
        primerApellidoLabel.setText("Primer Apellido:");
        jPanel1.add(primerApellidoLabel);
        primerApellidoLabel.setBounds(260, 350, 170, 30);

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

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearUsuario.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(-10, 0, 1390, 780);

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

    public boolean validarNumero(String str){
       
        if (str.matches("[0-9]+"))
            return true;
        else
            return false;
    }
    
    public boolean validarLetras(String str){
       
        if (str.matches("[A-Za-z]+"))
            return true;
        else
            return false;
    }
    
    public boolean validarLetrasYNumeros(String str){
       
        if (str.matches("[A-Za-z0-9]+"))
            return true;
        else
            return false;
    }
    
    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed

        String primerNombre, segundoNombre, primerApellido, segundoApellido, cedula, tipoUsuario, 
                fechaNacimiento, telefono, celular, email, contrasena, confirmar, pregunta, respuesta;
        
        primerNombre = primerNom.getText();
        segundoNombre = segundoNom.getText();
        primerApellido = primerAp.getText();
        segundoApellido = segundoAp.getText();
        cedula = ced.getText();
        tipoUsuario = (String) tipo.getSelectedItem();
        fechaNacimiento = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
        telefono = tel.getText();
        celular = cel.getText();
        email = correo.getText();
        contrasena = pass.getText();
        confirmar = confirmarpass.getText();
        pregunta = preguntaSeguridad.getText();
        respuesta = respuestaSeguridad.getText();
       
        if (primerNombre.equals("") || primerApellido.equals("") || cedula.equals("") || fechaNacimiento.equals("") ||
            celular.equals("") || contrasena.equals("") || pregunta.equals("") ||  respuesta.equals("")){
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios");            
        }
        
        else if(!validarLetras(primerNombre) || !validarLetras(segundoNombre) || !validarLetras(primerApellido) ||
                !validarLetras(segundoApellido) || !validarLetras(primerNombre)){
            
            JOptionPane.showMessageDialog(null, "Los campos del nombre deben ser de solo letras");
        }
        
        else if(!validarNumero(cedula) || !validarNumero(telefono) || !validarNumero(celular)){
            
            JOptionPane.showMessageDialog(null, "Los campos de cedula, telefono y celular deben ser de solo numeros");
        }
        
        else if(!validarLetrasYNumeros(contrasena) || contrasena.length() < 8){
            
            JOptionPane.showMessageDialog(null, "El campos contraseña debe tener minimo 8 caracteres validos");
        }
        
        else { 
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
            
            else if (numFilas == 2){
                
                JOptionPane.showMessageDialog(null, "El operador ya se encuentra registrado.");
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
            
            else if (numFilas == 2){
                
                JOptionPane.showMessageDialog(null, "El gerente ya se encuentra registrado.");
            }
            else {
                
                JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el gerente.");
            }         
        }
        }
    }//GEN-LAST:event_crearUsuarioActionPerformed

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
    private javax.swing.JLabel cedulaLabel3;
    private javax.swing.JTextField cel;
    private javax.swing.JLabel celLabel7;
    private javax.swing.JLabel confirmarLabel10;
    private javax.swing.JPasswordField confirmarpass;
    private javax.swing.JTextField correo;
    private javax.swing.JButton crearUsuario;
    private javax.swing.JLabel emailLabel8;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel5;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passLabel9;
    private javax.swing.JLabel preguntaLabel11;
    private javax.swing.JTextField preguntaSeguridad;
    private javax.swing.JTextField primerAp;
    private javax.swing.JLabel primerApellidoLabel;
    private javax.swing.JTextField primerNom;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel respuestaLabel12;
    private javax.swing.JTextField respuestaSeguridad;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JLabel segundoApellidoLabel2;
    private javax.swing.JTextField segundoNom;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telefonoLabel6;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JLabel tipoLabel;
    // End of variables declaration//GEN-END:variables
}