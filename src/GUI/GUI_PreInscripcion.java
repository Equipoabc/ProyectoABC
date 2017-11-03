/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;

public class GUI_PreInscripcion extends javax.swing.JFrame { 
    
    Validaciones validaciones;
    ControladorParticipante controladorParticipante;
    String idOperador;
 

    public GUI_PreInscripcion(){
        
        initComponents();
        controladorParticipante = new ControladorParticipante();
        validaciones = new Validaciones();
    }
    
    void setIdOperador(String cedula) {
       idOperador = cedula;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        correo = new javax.swing.JTextField();
        correoLabel = new javax.swing.JLabel();
        codEvento = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        codEventoLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        cedulaLabel = new javax.swing.JLabel();
        segundoApellido = new javax.swing.JTextField();
        segundoApellidoLabel = new javax.swing.JLabel();
        primerApellido = new javax.swing.JTextField();
        primerApellidoLabel = new javax.swing.JLabel();
        segundoNombre = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        primerNombre = new javax.swing.JTextField();
        crearParticipante = new javax.swing.JButton();
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
        botonCancelar.setBounds(950, 560, 250, 100);

        correo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(960, 280, 250, 32);

        correoLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        correoLabel.setText("Email:");
        jPanel1.add(correoLabel);
        correoLabel.setBounds(720, 280, 120, 30);

        codEvento.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        codEvento.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(codEvento);
        codEvento.setBounds(960, 400, 250, 32);

        telefonoLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        telefonoLabel.setText("Teléfono:");
        jPanel1.add(telefonoLabel);
        telefonoLabel.setBounds(720, 340, 130, 30);

        telefono.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        telefono.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(telefono);
        telefono.setBounds(960, 340, 250, 32);

        codEventoLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        codEventoLabel.setText("Código Evento:");
        jPanel1.add(codEventoLabel);
        codEventoLabel.setBounds(720, 396, 200, 33);

        fechaLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        fechaLabel.setText("Fecha Nacimiento:");
        jPanel1.add(fechaLabel);
        fechaLabel.setBounds(720, 220, 220, 40);

        cedula.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cedula);
        cedula.setBounds(400, 460, 250, 32);

        cedulaLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        cedulaLabel.setText("Cédula:");
        jPanel1.add(cedulaLabel);
        cedulaLabel.setBounds(160, 460, 200, 30);

        segundoApellido.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoApellido.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoApellido);
        segundoApellido.setBounds(400, 400, 250, 32);

        segundoApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        segundoApellidoLabel.setText("Segundo Apellido:");
        jPanel1.add(segundoApellidoLabel);
        segundoApellidoLabel.setBounds(160, 400, 250, 33);

        primerApellido.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerApellido.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerApellido);
        primerApellido.setBounds(400, 340, 250, 32);

        primerApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerApellidoLabel.setText("Primer Apellido:");
        jPanel1.add(primerApellidoLabel);
        primerApellidoLabel.setBounds(160, 340, 230, 33);

        segundoNombre.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoNombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoNombre);
        segundoNombre.setBounds(400, 280, 250, 32);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(160, 280, 230, 33);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(160, 220, 220, 30);

        primerNombre.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerNombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerNombre);
        primerNombre.setBounds(400, 220, 250, 32);

        crearParticipante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearParticipante.setBorder(null);
        crearParticipante.setBorderPainted(false);
        crearParticipante.setContentAreaFilled(false);
        crearParticipante.setFocusPainted(false);
        crearParticipante.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearParticipante.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearParticipanteActionPerformed(evt);
            }
        });
        jPanel1.add(crearParticipante);
        crearParticipante.setBounds(700, 560, 250, 100);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(960, 220, 250, 32);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PreInscripcionFondo.png"))); // NOI18N
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
        
        GUI_Operador oper = new GUI_Operador();
        oper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void crearParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearParticipanteActionPerformed

        String primerNom, segundoNom, primerAp, segundoAp, ced,  
                fechaNacimiento, tel, email, codigoEvento;
        
        primerNom = primerNombre.getText();
        segundoNom = segundoNombre.getText();
        primerAp = primerApellido.getText();
        segundoAp = segundoApellido.getText();
        ced = cedula.getText();
        fechaNacimiento = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
        tel = telefono.getText();
        codigoEvento = codEvento.getText();      
        email = correo.getText();
        
        if (primerNom.equals("") || primerAp.equals("") || ced.equals("") || tel.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else if(!validaciones.validarLetras(primerNom) || !validaciones.validarLetras(segundoNom) || 
                !validaciones.validarLetras(primerAp) || !validaciones.validarLetras(segundoAp)) {
            JOptionPane.showMessageDialog(null, "Los campos del nombre deben ser de solo letras");
        }
        else if(!validaciones.validarNumero(ced) || !validaciones.validarNumero(tel) || !validaciones.validarNumero(codigoEvento)) {
            JOptionPane.showMessageDialog(null, "Los campos de cedula, telefono y codigoEvento deben ser de solo numeros");
        }
        else {
        
             int numFilas = controladorParticipante.insertarParticipante(primerNom,segundoNom,
                primerAp,segundoAp,ced,fechaNacimiento, tel, email, idOperador, codigoEvento);
            
            switch (numFilas) {
                case 3:
                    JOptionPane.showMessageDialog(null, "El evento que ingresó no existe.");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "El participante ya se encuentra registrado en este evento.");
                    break;
                case 2:
                case 5:
                    JOptionPane.showMessageDialog(null, "La pre-inscripción se ha realizado exitosamente.");
                    primerNombre.setText(null);
                    segundoNombre.setText(null);
                    primerApellido.setText(null);
                    segundoApellido.setText(null);
                    cedula.setText(null);
                    telefono.setText(null);
                    codEvento.setText(null);
                    correo.setText(null);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al realizar la pre-inscripción.");
                    break;
            }
        }
    }//GEN-LAST:event_crearParticipanteActionPerformed

    public static void main(String args[]){

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_PreInscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JTextField codEvento;
    private javax.swing.JLabel codEventoLabel;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JButton crearParticipante;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField primerApellido;
    private javax.swing.JLabel primerApellidoLabel;
    private javax.swing.JTextField primerNombre;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JTextField segundoApellido;
    private javax.swing.JLabel segundoApellidoLabel;
    private javax.swing.JTextField segundoNombre;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables

}