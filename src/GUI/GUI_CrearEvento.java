/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;

public class GUI_CrearEvento extends javax.swing.JFrame { 
    
    DateFormat df = DateFormat.getDateInstance();
    ControladorEvento controladorEvento;
    String id;

    public GUI_CrearEvento(){
        
        initComponents();
        controladorEvento = new ControladorEvento();
    }
    
    public boolean validarNumero(String str){
       
        if (str.matches("[0-9]*"))
            return true;
        else
            return false;
    }
    
    public boolean validarLetrasEspacios(String str){
       
        if (str.matches("[A-Za-z ]*"))
            return true;
        else
            return false;
    }
    
    public boolean validarLetrasYNumerosEspacios(String str){
       
        if (str.matches("[A-Za-z0-9 ]*"))
            return true;
        else
            return false;
    }
    
     public boolean validarLetrasYNumerosEspaciosSimbolos(String str){
       
        if (str.matches("[A-Za-z0-9 .-]*"))
            return true;
        else
            return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCancelar = new javax.swing.JButton();
        tema = new javax.swing.JTextField();
        primerNombreLabel8 = new javax.swing.JLabel();
        primerNombreLabel6 = new javax.swing.JLabel();
        primerNombreLabel5 = new javax.swing.JLabel();
        lugar = new javax.swing.JTextField();
        primerNombreLabel3 = new javax.swing.JLabel();
        precio = new javax.swing.JTextField();
        primerNombreLabel2 = new javax.swing.JLabel();
        primerNombreLabel1 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        crearEvento = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        cupos = new javax.swing.JSpinner();
        horas = new javax.swing.JComboBox<>();
        minutos = new javax.swing.JComboBox<>();
        horasLabel = new javax.swing.JLabel();
        primerNombreLabel7 = new javax.swing.JLabel();
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

        tema.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        tema.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(tema);
        tema.setBounds(890, 460, 250, 32);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel8.setText("Tema:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(750, 460, 120, 30);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerNombreLabel6.setText("Minutos");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(1075, 327, 80, 30);

        primerNombreLabel5.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel5.setText("Duración:");
        jPanel1.add(primerNombreLabel5);
        primerNombreLabel5.setBounds(750, 320, 120, 40);

        lugar.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        lugar.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(lugar);
        lugar.setBounds(890, 390, 250, 32);

        primerNombreLabel3.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel3.setText("Lugar:");
        jPanel1.add(primerNombreLabel3);
        primerNombreLabel3.setBounds(750, 380, 130, 50);

        precio.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        precio.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(precio);
        precio.setBounds(380, 460, 250, 32);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel2.setText("Precio:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(260, 460, 180, 30);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel1.setText("Fecha:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(260, 390, 170, 30);

        nombre.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(380, 320, 250, 32);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(260, 320, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel.setText("Código:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(260, 240, 170, 50);

        codigo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        codigo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(codigo);
        codigo.setBounds(380, 250, 250, 32);

        crearEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        crearEvento.setBorder(null);
        crearEvento.setBorderPainted(false);
        crearEvento.setContentAreaFilled(false);
        crearEvento.setFocusPainted(false);
        crearEvento.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        crearEvento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        crearEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEventoActionPerformed(evt);
            }
        });
        jPanel1.add(crearEvento);
        crearEvento.setBounds(720, 590, 250, 100);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(380, 390, 250, 32);

        cupos.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cupos.setAutoscrolls(true);
        cupos.setFocusable(false);
        jPanel1.add(cupos);
        cupos.setBounds(890, 250, 100, 32);

        horas.setBackground(new java.awt.Color(102, 102, 255));
        horas.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        horas.setForeground(new java.awt.Color(102, 102, 255));
        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        horas.setFocusable(false);
        horas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horasActionPerformed(evt);
            }
        });
        jPanel1.add(horas);
        horas.setBounds(890, 327, 60, 28);

        minutos.setBackground(new java.awt.Color(102, 102, 255));
        minutos.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        minutos.setForeground(new java.awt.Color(102, 102, 255));
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "15", "30", "45" }));
        minutos.setFocusable(false);
        minutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutosActionPerformed(evt);
            }
        });
        jPanel1.add(minutos);
        minutos.setBounds(1010, 327, 60, 28);

        horasLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        horasLabel.setText("Cupos:");
        jPanel1.add(horasLabel);
        horasLabel.setBounds(750, 250, 140, 30);

        primerNombreLabel7.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerNombreLabel7.setText("Horas");
        jPanel1.add(primerNombreLabel7);
        primerNombreLabel7.setBounds(955, 327, 60, 30);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearEventoFondo.png"))); // NOI18N
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
        
        GUI_Gerente gerenteLogin = new GUI_Gerente();
        gerenteLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEventoActionPerformed

        String nom, cod, date, prec, cupo, lug, tem, dur, hora, min;
        
        nom = nombre.getText();
        cod = codigo.getText();
        date = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
        prec = precio.getText();
        cupo = cupos.getValue().toString();
        hora = (String) horas.getSelectedItem();
        min = (String) minutos.getSelectedItem();
        dur = hora + ":" + min + ":00";
        lug = lugar.getText();
        tem = tema.getText();
        
        if (nom.equals("") || cod.equals("") || date.equals("") || prec.equals("") ||
                lug.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        }
        else if(!validarNumero(cod) || !validarNumero(prec)) {
            JOptionPane.showMessageDialog(null, "Los campos código y precio deben ser números (sin puntos).");
        }
        else if(!validarLetrasYNumerosEspacios(nom) || !validarLetrasYNumerosEspacios(lug) || !validarLetrasYNumerosEspacios(tem)) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos.");
        }
        else if(validarNumero(nom) || validarNumero(lug) || validarNumero(tem)) {
            JOptionPane.showMessageDialog(null, "Los campos nombre, lugar y tema no pueden ser solo números.");
        }
        else if(cupo.equals("0") || (hora.equals("0") && min.equals("0"))) {
            JOptionPane.showMessageDialog(null, "Los campos cupo y duración no pueden quedar en 0");
        }
        else {
        int numFilas = controladorEvento.insertarEvento(cod, nom, date, prec, cupo, hora, min, dur, lug, tem, id);
        if(numFilas == 2){
            JOptionPane.showMessageDialog(null, "El evento ya se encuentra registrado en el sistema.");
        }
        else if (numFilas == 1){
            JOptionPane.showMessageDialog(null, "Evento creado exitosamente.");
        }
        else {
            
            JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el evento.");
        }
        }
    }//GEN-LAST:event_crearEventoActionPerformed

    private void horasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horasActionPerformed

    private void minutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutosActionPerformed

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
    private javax.swing.JTextField codigo;
    private javax.swing.JButton crearEvento;
    private javax.swing.JSpinner cupos;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fondo;
    private javax.swing.JComboBox<String> horas;
    private javax.swing.JLabel horasLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lugar;
    private javax.swing.JComboBox<String> minutos;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField precio;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel1;
    private javax.swing.JLabel primerNombreLabel2;
    private javax.swing.JLabel primerNombreLabel3;
    private javax.swing.JLabel primerNombreLabel5;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel primerNombreLabel7;
    private javax.swing.JLabel primerNombreLabel8;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tema;
    // End of variables declaration//GEN-END:variables

    void setId(String idGerente) {
        this.id = idGerente;
    }
}