
package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
//import java.util.Date;

public class GUI_CrearEvento extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorEvento controladorEvento;
    String id;
    
    
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
        jLabel6 = new javax.swing.JLabel();
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
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
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
        botonCancelar.setBounds(370, 380, 160, 70);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Crear Evento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 200, 50);

        tema.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        tema.setSelectionColor(new java.awt.Color(102, 102, 255));
        tema.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                temaKeyPressed(evt);
            }
        });
        jPanel1.add(tema);
        tema.setBounds(460, 310, 180, 25);

        primerNombreLabel8.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel8.setText("Tema:");
        jPanel1.add(primerNombreLabel8);
        primerNombreLabel8.setBounds(390, 300, 120, 30);

        primerNombreLabel6.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel6.setText("Minutos");
        jPanel1.add(primerNombreLabel6);
        primerNombreLabel6.setBounds(640, 220, 80, 30);

        primerNombreLabel5.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel5.setText("Duración:");
        jPanel1.add(primerNombreLabel5);
        primerNombreLabel5.setBounds(390, 200, 70, 40);

        lugar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        lugar.setSelectionColor(new java.awt.Color(102, 102, 255));
        lugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lugarKeyPressed(evt);
            }
        });
        jPanel1.add(lugar);
        lugar.setBounds(460, 260, 180, 25);

        primerNombreLabel3.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel3.setText("Lugar:");
        jPanel1.add(primerNombreLabel3);
        primerNombreLabel3.setBounds(390, 240, 130, 50);

        precio.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        precio.setSelectionColor(new java.awt.Color(102, 102, 255));
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioKeyPressed(evt);
            }
        });
        jPanel1.add(precio);
        precio.setBounds(150, 310, 180, 25);

        primerNombreLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel2.setText("Precio:");
        jPanel1.add(primerNombreLabel2);
        primerNombreLabel2.setBounds(90, 310, 180, 30);

        primerNombreLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel1.setText("Fecha:");
        jPanel1.add(primerNombreLabel1);
        primerNombreLabel1.setBounds(90, 260, 170, 30);

        nombre.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreKeyPressed(evt);
            }
        });
        jPanel1.add(nombre);
        nombre.setBounds(150, 210, 180, 25);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(90, 210, 180, 30);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Código:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(90, 150, 50, 50);

        codigo.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codigo.setSelectionColor(new java.awt.Color(102, 102, 255));
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                codigoKeyPressed(evt);
            }
        });
        jPanel1.add(codigo);
        codigo.setBounds(150, 160, 180, 25);

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
        crearEvento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearEventoKeyPressed(evt);
            }
        });
        jPanel1.add(crearEvento);
        crearEvento.setBounds(220, 380, 160, 70);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(3471314481000L));
        fecha.setMinSelectableDate(new java.util.Date(-1262282319000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });
        jPanel1.add(fecha);
        fecha.setBounds(150, 260, 180, 25);

        cupos.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        cupos.setAutoscrolls(true);
        cupos.setFocusable(false);
        cupos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuposKeyPressed(evt);
            }
        });
        jPanel1.add(cupos);
        cupos.setBounds(460, 160, 60, 30);

        horas.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        horas.setForeground(new java.awt.Color(102, 102, 255));
        horas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        horas.setFocusable(false);
        horas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                horasKeyPressed(evt);
            }
        });
        jPanel1.add(horas);
        horas.setBounds(460, 210, 60, 30);

        minutos.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        minutos.setForeground(new java.awt.Color(102, 102, 255));
        minutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "15", "30", "45" }));
        minutos.setFocusable(false);
        minutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                minutosKeyPressed(evt);
            }
        });
        jPanel1.add(minutos);
        minutos.setBounds(580, 210, 53, 30);

        horasLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        horasLabel.setText("Cupos:");
        jPanel1.add(horasLabel);
        horasLabel.setBounds(390, 160, 140, 30);

        primerNombreLabel7.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel7.setText("Horas");
        jPanel1.add(primerNombreLabel7);
        primerNombreLabel7.setBounds(530, 220, 50, 30);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Gerente gerenteLogin = new GUI_Gerente();
        gerenteLogin.setId(this.id);
                    gerenteLogin.personalizarBienvenida();
        gerenteLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void crearEvento(){
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
            JOptionPane.showMessageDialog(null, "Caracteres inválidos.");
        }
        else if(validaciones.validarNumero(nom) || validaciones.validarNumero(lug) || validaciones.validarNumero(tem)) {
            JOptionPane.showMessageDialog(null, "Los campos nombre, lugar y tema no pueden ser solo números.");
        }
        else if(cupo.equals("0") || (hora.equals("0") && min.equals("0"))) {
            JOptionPane.showMessageDialog(null, "Los campos cupos y duración no pueden quedar sin datos.");
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
    }
    private void crearEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEventoActionPerformed
        
        crearEvento();
    }//GEN-LAST:event_crearEventoActionPerformed

    //Inicio eventos del teclado
    private void crearEventoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearEventoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_crearEventoKeyPressed

    private void codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_codigoKeyPressed

    private void nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_nombreKeyPressed

    private void precioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_precioKeyPressed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_fechaKeyPressed

    private void horasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_horasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_horasKeyPressed

    private void minutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minutosKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_minutosKeyPressed

    private void lugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lugarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_lugarKeyPressed

    private void temaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_temaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_temaKeyPressed

    private void cuposKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuposKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            crearEvento();
        }
    }//GEN-LAST:event_cuposKeyPressed
    //Fin eventos del teclado
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
    private javax.swing.JLabel jLabel6;
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