/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;

public class GUI_RegistrarSede extends javax.swing.JFrame { 
    
    Validaciones validaciones;
    ControladorSede controladorSede;
    String idGerente;

    
    public GUI_RegistrarSede(){
        
        initComponents();
        controladorSede = new ControladorSede();
        validaciones = new Validaciones();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        barrio = new javax.swing.JTextField();
        barrioLabel = new javax.swing.JLabel();
        carreraLabel = new javax.swing.JLabel();
        carrera = new javax.swing.JTextField();
        calleLabel = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        telefonoLabel = new javax.swing.JLabel();
        ciudadLabel = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        idSedeLabel = new javax.swing.JLabel();
        idSede = new javax.swing.JTextField();
        registrarSede = new javax.swing.JButton();
        direccionLabel = new javax.swing.JLabel();
        calle = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
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
        botonCancelar.setBounds(970, 590, 250, 100);

        barrio.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        barrio.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(barrio);
        barrio.setBounds(890, 460, 250, 32);

        barrioLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        barrioLabel.setText("Barrio:");
        jPanel1.add(barrioLabel);
        barrioLabel.setBounds(750, 460, 120, 30);

        carreraLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        carreraLabel.setText("Carrera:");
        jPanel1.add(carreraLabel);
        carreraLabel.setBounds(750, 320, 120, 40);

        carrera.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        carrera.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(carrera);
        carrera.setBounds(890, 320, 250, 32);

        calleLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        calleLabel.setText("Calle:");
        jPanel1.add(calleLabel);
        calleLabel.setBounds(750, 380, 130, 50);

        ciudad.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        ciudad.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(ciudad);
        ciudad.setBounds(380, 390, 250, 32);

        telefonoLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        telefonoLabel.setText("Telefono:");
        jPanel1.add(telefonoLabel);
        telefonoLabel.setBounds(260, 460, 180, 30);

        ciudadLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        ciudadLabel.setText("Ciudad:");
        jPanel1.add(ciudadLabel);
        ciudadLabel.setBounds(260, 390, 170, 30);

        nombre.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(380, 320, 250, 32);

        nombreLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        nombreLabel.setText("Nombre:");
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(260, 320, 180, 30);

        idSedeLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        idSedeLabel.setText("ID Sede:");
        jPanel1.add(idSedeLabel);
        idSedeLabel.setBounds(260, 240, 170, 50);

        idSede.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        idSede.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(idSede);
        idSede.setBounds(380, 250, 250, 32);

        registrarSede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        registrarSede.setBorder(null);
        registrarSede.setBorderPainted(false);
        registrarSede.setContentAreaFilled(false);
        registrarSede.setFocusPainted(false);
        registrarSede.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        registrarSede.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        registrarSede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarSedeActionPerformed(evt);
            }
        });
        jPanel1.add(registrarSede);
        registrarSede.setBounds(720, 590, 250, 100);

        direccionLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        direccionLabel.setText("Dirección");
        jPanel1.add(direccionLabel);
        direccionLabel.setBounds(750, 250, 140, 30);

        calle.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        calle.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(calle);
        calle.setBounds(890, 390, 250, 32);

        telefono.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        telefono.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(telefono);
        telefono.setBounds(380, 460, 250, 32);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RegistrarSedeFondo .png"))); // NOI18N
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

    
    public void setIdGerente(String idGerente) {
        this.idGerente = idGerente;
    }

    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Gerente gerenteLogin = new GUI_Gerente();
        gerenteLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void registrarSedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarSedeActionPerformed

        String nom, id, ciu, tel, cra, cl, bar;
        
        nom = nombre.getText();
        id = idSede.getText();
        ciu = ciudad.getText();
        tel = telefono.getText();
        cra = carrera.getText();
        bar = barrio.getText();
        cl = calle.getText();
        
        if (nom.equals("") || id.equals("") || ciu.equals("") || cra.equals("") ||
                bar.equals("") || cl.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else if(!validaciones.validarLetrasYNumerosEspacios(nom)) {
            JOptionPane.showMessageDialog(null, "El campo nombre tiene caracteres invalidos.");
        }
        else if(!validaciones.validarNumero(id) || !validaciones.validarNumero(tel)) {
            JOptionPane.showMessageDialog(null, "Los campos ID y telefono solo pueden ser números");
        }
        else if(!validaciones.validarLetrasEspacios(ciu) || !validaciones.validarLetrasYNumerosEspacios(bar)) {
            JOptionPane.showMessageDialog(null, "Ha ingresado caracteres invalidos.");
        }
        else if(!validaciones.validarLetrasYNumerosEspaciosSimbolos(cra) || !validaciones.validarLetrasYNumerosEspaciosSimbolos(cl)) {
            JOptionPane.showMessageDialog(null, "Ha ingresado caracteres invalidos, en carrera y calle solo se "
                    + "puede usar los caracteres espaciales '.' y '-' .");
        }
        else {
            
        int numFilas = controladorSede.insertarSede(nom, id, ciu, tel, cra, cl, bar, idGerente);
            switch (numFilas) {
                case 2:
                    JOptionPane.showMessageDialog(null, "La sede ya se encuentra registrada en el sistema.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Sede creada exitosamente.");
                    nombre.setText(null);
                    idSede.setText(null);
                    ciudad.setText(null);
                    telefono.setText(null);
                    carrera.setText(null);
                    barrio.setText(null);
                    calle.setText(null);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar la sede.");
                    break;
            }
        }
    }//GEN-LAST:event_registrarSedeActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barrio;
    private javax.swing.JLabel barrioLabel;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField calle;
    private javax.swing.JLabel calleLabel;
    private javax.swing.JTextField carrera;
    private javax.swing.JLabel carreraLabel;
    private javax.swing.JTextField ciudad;
    private javax.swing.JLabel ciudadLabel;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField idSede;
    private javax.swing.JLabel idSedeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton registrarSede;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables
}