/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Controladores.*;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class GUI_CrearEvento extends javax.swing.JFrame { 
    
    DateFormat df = DateFormat.getDateInstance();
    ControladorOperador controladorOperador;
    ControladorGerente controladorGerente;

       public GUI_CrearEvento() {
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
        primerNombreLabel6 = new javax.swing.JLabel();
        primerNombreLabel5 = new javax.swing.JLabel();
        ced = new javax.swing.JTextField();
        primerNombreLabel3 = new javax.swing.JLabel();
        segundoAp = new javax.swing.JTextField();
        primerNombreLabel2 = new javax.swing.JLabel();
        primerNombreLabel1 = new javax.swing.JLabel();
        segundoNom = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        primerNom = new javax.swing.JTextField();
        crearUsuario = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date,null,null,Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        jSpinner2 = new javax.swing.JSpinner();
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
        botonCancelar.setBounds(970, 590, 250, 100);

        correo.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(890, 460, 250, 32);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel8.setText("Tema:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(750, 460, 120, 30);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel6.setText("Cupos:");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(750, 250, 140, 30);

        primerNombreLabel5.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel5.setText("Duración:");
        jPanel1.add(primerNombreLabel5);
        primerNombreLabel5.setBounds(750, 320, 220, 40);

        ced.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        ced.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(ced);
        ced.setBounds(890, 390, 250, 32);

        primerNombreLabel3.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel3.setText("Lugar:");
        jPanel1.add(primerNombreLabel3);
        primerNombreLabel3.setBounds(750, 390, 130, 50);

        segundoAp.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoAp);
        segundoAp.setBounds(380, 460, 250, 32);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel2.setText("Precio:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(260, 460, 180, 30);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel1.setText("Fecha:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(260, 390, 170, 30);

        segundoNom.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        segundoNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoNom);
        segundoNom.setBounds(380, 320, 250, 32);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(260, 320, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 28)); // NOI18N
        primerNombreLabel.setText("Código:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(260, 240, 170, 50);

        primerNom.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        primerNom.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerNom);
        primerNom.setBounds(380, 250, 250, 32);

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
        crearUsuario.setBounds(720, 590, 250, 100);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(380, 390, 250, 32);

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1,"HH:mm");
        jSpinner1.setEditor(de);
        jSpinner1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jSpinner1.setAutoscrolls(true);
        jSpinner1.setFocusable(false);
        jPanel1.add(jSpinner1);
        jSpinner1.setBounds(890, 320, 100, 32);

        jSpinner2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jSpinner2.setAutoscrolls(true);
        jSpinner2.setFocusable(false);
        jPanel1.add(jSpinner2);
        jSpinner2.setBounds(890, 250, 100, 32);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearEventoFondo.png"))); // NOI18N
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

    private void crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioActionPerformed
        // TODO add your handling code here:
  // TODO add your handling code here:
       

    
    }//GEN-LAST:event_crearUsuarioActionPerformed

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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_CrearUsuario().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField ced;
    private javax.swing.JTextField correo;
    private javax.swing.JButton crearUsuario;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField primerNom;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel1;
    private javax.swing.JLabel primerNombreLabel2;
    private javax.swing.JLabel primerNombreLabel3;
    private javax.swing.JLabel primerNombreLabel5;
    private javax.swing.JLabel primerNombreLabel6;
    private javax.swing.JLabel primerNombreLabel8;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JTextField segundoNom;
    private javax.swing.JLabel segundoNombreLabel;
    // End of variables declaration//GEN-END:variables
}
