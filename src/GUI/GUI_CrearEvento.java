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
import java.util.Calendar;
import java.util.Date;
//import java.util.Date;

public class GUI_CrearEvento extends javax.swing.JFrame { 
   
    Validaciones validaciones;
    ControladorEvento controladorEvento;
    String id;
    //Date fechaActual;
   
    

    public GUI_CrearEvento(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorEvento = new ControladorEvento();
        validaciones = new Validaciones();
        fecha.setMinSelectableDate(GetDateNow());
        fecha.getDateEditor().setEnabled(false);
    }

     private Date GetDateNow() {
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
     }
     
    void setId(String idGerente) {
        this.id = idGerente;
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
        botonCancelar.setBounds(320, 290, 160, 70);

        tema.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tema.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(tema);
        tema.setBounds(400, 250, 180, 20);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel8.setText("Tema:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(330, 240, 120, 30);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel6.setText("Minutos");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(580, 150, 80, 30);

        primerNombreLabel5.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel5.setText("Duración:");
        jPanel1.add(primerNombreLabel5);
        primerNombreLabel5.setBounds(330, 140, 70, 40);

        lugar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lugar.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(lugar);
        lugar.setBounds(400, 200, 180, 20);

        primerNombreLabel3.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel3.setText("Lugar:");
        jPanel1.add(primerNombreLabel3);
        primerNombreLabel3.setBounds(330, 180, 130, 50);

        precio.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        precio.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(precio);
        precio.setBounds(110, 250, 180, 20);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel2.setText("Precio:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(50, 250, 180, 30);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel1.setText("Fecha:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(50, 200, 170, 30);

        nombre.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(nombre);
        nombre.setBounds(110, 150, 180, 20);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(50, 150, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Código:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(50, 90, 50, 50);

        codigo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codigo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(codigo);
        codigo.setBounds(110, 100, 90, 20);

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
        crearEvento.setBounds(170, 290, 160, 70);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(3471314481000L));
        fecha.setMinSelectableDate(new java.util.Date(-1262282319000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(110, 200, 180, 20);

        cupos.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cupos.setAutoscrolls(true);
        cupos.setFocusable(false);
        jPanel1.add(cupos);
        cupos.setBounds(400, 100, 60, 30);

        horas.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        horas.setForeground(new java.awt.Color(102, 102, 255));
        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        horas.setFocusable(false);
        jPanel1.add(horas);
        horas.setBounds(400, 150, 60, 20);

        minutos.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        minutos.setForeground(new java.awt.Color(102, 102, 255));
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "15", "30", "45" }));
        minutos.setFocusable(false);
        jPanel1.add(minutos);
        minutos.setBounds(520, 150, 53, 20);

        horasLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        horasLabel.setText("Cupos:");
        jPanel1.add(horasLabel);
        horasLabel.setBounds(330, 100, 140, 30);

        primerNombreLabel7.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel7.setText("Horas");
        jPanel1.add(primerNombreLabel7);
        primerNombreLabel7.setBounds(470, 150, 50, 30);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CrearEventoFondo.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 681, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Gerente gerenteLogin = new GUI_Gerente();
        gerenteLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEventoActionPerformed

        String nom, cod, date = "", prec, cupo, lug, tem, dur, hora, min, validar = "";
        
        nom = nombre.getText();
        cod = codigo.getText();
        
         try {
           date = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
         
        prec = precio.getText();
        cupo = cupos.getValue().toString();
        hora = (String) horas.getSelectedItem();
        min = (String) minutos.getSelectedItem();
        dur = hora + ":" + min + ":00";
        lug = lugar.getText();
        tem = tema.getText();
        
        if (nom.equals("") || cod.equals("") || date.equals("") || prec.equals("") ||
                lug.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios" + validar + ".");
        }
        else if(!validaciones.validarNumero(cod) || !validaciones.validarNumero(prec)) {
            JOptionPane.showMessageDialog(null, "Los campos código y precio deben ser números (sin puntos).");
        }
        else if(!validaciones.validarLetrasYNumerosEspacios(nom) || !validaciones.validarLetrasYNumerosEspacios(lug) || 
                !validaciones.validarLetrasYNumerosEspacios(tem)) {
            JOptionPane.showMessageDialog(null, "Caracteres invalidos.");
        }
        else if(validaciones.validarNumero(nom) || validaciones.validarNumero(lug) || validaciones.validarNumero(tem)) {
            JOptionPane.showMessageDialog(null, "Los campos nombre, lugar y tema no pueden ser solo números.");
        }
        else if(cupo.equals("0") || (hora.equals("0") && min.equals("0"))) {
            JOptionPane.showMessageDialog(null, "Los campos cupo y duración no pueden quedar en 0");
        }
        else {
        int numFilas = controladorEvento.insertarEvento(cod, nom, date, prec, cupo, hora, min, dur, lug, tem, id);
            switch (numFilas) {
                case 2:
                    JOptionPane.showMessageDialog(null, "El evento ya se encuentra registrado en el sistema.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Evento creado exitosamente.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al guardar el evento.");
                    break;
            }
        }
    }//GEN-LAST:event_crearEventoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_CrearEvento().setVisible(true);
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

}