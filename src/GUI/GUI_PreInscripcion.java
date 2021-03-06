package GUI;
import Controladores.*;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class GUI_PreInscripcion extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorParticipante controladorParticipante;
    ControladorEvento controladorEvento;
    Evento evento;
    String idOperador;
    Participante participante;
    
    public GUI_PreInscripcion(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorParticipante = new ControladorParticipante();
        controladorEvento = new ControladorEvento();
        validaciones = new Validaciones();
        evento = new Evento();
        fecha.setMaxSelectableDate(GetDateNow());
        fecha.getDateEditor().setEnabled(false);
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorEvento.llenarCombo();
        participante = new Participante();
        
        for(int i=0; i < lista.size(); i++){
            listaEventos.addItem(lista.get(i));
        }
    }
    
    public static Date parseFecha(String fecha){ 
        
        fecha = fecha.replace("-","/") ; 
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd"); 
        Date fechaDate = null; 
        try {
            fechaDate = formato.parse(fecha); 
        } 
        catch (ParseException ex) 
        { 
            System.out.println("Error: " + ex); 
        } 
        return fechaDate; 
    }
    
    private Date GetDateNow() {
        
        Calendar currentDate = Calendar.getInstance();
        return currentDate.getTime();
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
        telefonoLabel = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        codEventoLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        cedulaLabel = new javax.swing.JLabel();
        segundoApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        segundoApellidoLabel = new javax.swing.JLabel();
        primerApellido = new javax.swing.JTextField();
        primerApellidoLabel = new javax.swing.JLabel();
        segundoNombre = new javax.swing.JTextField();
        cedulaLabel1 = new javax.swing.JLabel();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        primerNombre = new javax.swing.JTextField();
        crearParticipante = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        listaEventos = new javax.swing.JComboBox<>();
        consultarBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));
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
        botonCancelar.setBounds(380, 370, 140, 90);

        correo.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(520, 260, 150, 25);

        correoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correoLabel.setText("Email:");
        jPanel1.add(correoLabel);
        correoLabel.setBounds(400, 250, 120, 40);

        telefonoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefonoLabel.setText("Teléfono:");
        jPanel1.add(telefonoLabel);
        telefonoLabel.setBounds(400, 280, 130, 40);

        telefono.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        telefono.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(telefono);
        telefono.setBounds(520, 290, 150, 25);

        codEventoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codEventoLabel.setText("Código Evento:");
        jPanel1.add(codEventoLabel);
        codEventoLabel.setBounds(400, 310, 200, 40);

        fechaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel.setText("Fecha Nacimiento:");
        jPanel1.add(fechaLabel);
        fechaLabel.setBounds(400, 220, 220, 40);

        cedula.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cedula);
        cedula.setBounds(210, 170, 150, 25);

        cedulaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel.setText("Verifique si el participante se encuentra registrado en el sistema.");
        jPanel1.add(cedulaLabel);
        cedulaLabel.setBounds(80, 120, 430, 30);

        segundoApellido.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoApellido.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoApellido);
        segundoApellido.setBounds(200, 320, 150, 25);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Preinscripción");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 200, 50);

        segundoApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoApellidoLabel.setText("Segundo Apellido:");
        jPanel1.add(segundoApellidoLabel);
        segundoApellidoLabel.setBounds(80, 320, 130, 20);

        primerApellido.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerApellido.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerApellido);
        primerApellido.setBounds(200, 290, 150, 25);

        primerApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerApellidoLabel.setText("Primer Apellido:");
        jPanel1.add(primerApellidoLabel);
        primerApellidoLabel.setBounds(80, 290, 230, 34);

        segundoNombre.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoNombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoNombre);
        segundoNombre.setBounds(200, 260, 150, 25);

        cedulaLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel1.setText("No. de Cédula:");
        jPanel1.add(cedulaLabel1);
        cedulaLabel1.setBounds(90, 170, 200, 30);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(80, 260, 230, 34);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(80, 230, 220, 30);

        primerNombre.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerNombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerNombre);
        primerNombre.setBounds(200, 230, 150, 25);

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
        crearParticipante.setBounds(240, 370, 140, 90);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(1514786508000L));
        fecha.setMinSelectableDate(new java.util.Date(-1577901492000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fecha);
        fecha.setBounds(520, 230, 150, 25);

        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });
        jPanel1.add(listaEventos);
        listaEventos.setBounds(520, 320, 150, 25);

        consultarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        consultarBoton.setBorder(null);
        consultarBoton.setBorderPainted(false);
        consultarBoton.setContentAreaFilled(false);
        consultarBoton.setFocusPainted(false);
        consultarBoton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        consultarBoton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        consultarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBotonActionPerformed(evt);
            }
        });
        jPanel1.add(consultarBoton);
        consultarBoton.setBounds(370, 140, 140, 90);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Operador oper = new GUI_Operador();
        oper.setId(idOperador);
        oper.personalizarBienvenida();
        oper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void crearParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearParticipanteActionPerformed
        
        String primerNom, segundoNom, primerAp, segundoAp, ced,
                fechaNacimiento, tel, email, validar = "";
        fechaNacimiento = "";
        LocalDate fechaNac = LocalDate.now();
        
        primerNom = primerNombre.getText();
        segundoNom = segundoNombre.getText();
        primerAp = primerApellido.getText();
        segundoAp = segundoApellido.getText();
        ced = cedula.getText();        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            
            fechaNacimiento = new SimpleDateFormat("dd/MM/YYYY").format(fecha.getDate());
            fechaNac = LocalDate.parse(fechaNacimiento, fmt);
        } catch(Exception e){
            validar = "\nDebe ingresar una fecha válida.";
        }
        
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        
        tel = telefono.getText();
        String id_evento1 = (String) listaEventos.getSelectedItem();
        String[] partes = id_evento1.split(" ");
        String codigoEvento = partes[0];
        email = correo.getText();        
       evento = controladorEvento.consultarDatosEvento(codigoEvento);
        
        if (primerNom.equals("") || primerAp.equals("") || ced.equals("") || tel.equals("") || fechaNacimiento.equals("")) {
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios" + validar + ".");
        }
        else if(!validaciones.validarLetras(primerNom) || !validaciones.validarLetras(segundoNom) ||
                !validaciones.validarLetras(primerAp) || !validaciones.validarLetras(segundoAp)) {
            JOptionPane.showMessageDialog(null, "Los campos del nombre deben ser de solo letras");
        }
        else if(!validaciones.validarNumero(ced) || !validaciones.validarNumero(tel) || !validaciones.validarNumero(codigoEvento)) {
            JOptionPane.showMessageDialog(null, "Los campos de cedula, telefono y codigoEvento deben ser de solo numeros");
        }
        else if (periodo.getYears() < 15) {
            JOptionPane.showMessageDialog(null, "El participante debe ser mínimo de 15 años");
        }
        else if(evento == null){
            JOptionPane.showMessageDialog(null, "El evento que ingresó no existe.");
        }
        else {
            if(Integer.parseInt(evento.getCupos()) <= 0){
                 JOptionPane.showMessageDialog(null, "No hay cupos para el evento.");
            }
            else {
            int numFilas = controladorParticipante.insertarParticipante(primerNom,segundoNom,
                    primerAp,segundoAp,ced,fechaNacimiento, tel, email, idOperador, codigoEvento, "Invalido");
            
            switch (numFilas) {
                case 3:
                    JOptionPane.showMessageDialog(null, "El evento que ingresó no existe.");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "El participante ya se encuentra pre-inscrito en este evento" + "\n" +
                            "Debe proceder a pagar para quedar inscrito.");
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "El participante ya se encuentra inscrito en este evento");
                    break;
                case 2:
                case 5:
                    int cuposActuales = Integer.parseInt(evento.getCupos()) - 1;         
                    controladorEvento.actualizarCupos(codigoEvento, Integer.toString(cuposActuales));
                    JOptionPane.showMessageDialog(null, "La pre-inscripción se ha realizado exitosamente.");
                    primerNombre.setText(null);
                    segundoNombre.setText(null);
                    primerApellido.setText(null);
                    segundoApellido.setText(null);
                    cedula.setText(null);
                    telefono.setText(null);
                    correo.setText(null);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al realizar la pre-inscripción.");
                    break;
            }
        }
        }
    }//GEN-LAST:event_crearParticipanteActionPerformed

    private void consultarParticipante(){
        String cedulaP;
        cedulaP = cedula.getText();
        if(cedulaP.equals("")){
             JOptionPane.showMessageDialog(null, "No ha ingresado un número de cédula.");           
        }
        else if (!validaciones.validarNumero(cedulaP)){
            JOptionPane.showMessageDialog(null, "La cedula debe ser un número.");
            
        }
        else{
        participante = controladorParticipante.consultarDatosParticipante(cedulaP);
        
        if(participante != null){
                primerNombre.setText(participante.getPrimer_nombre());
                segundoNombre.setText(participante.getSegundo_nombre());
                primerApellido.setText(participante.getPrimer_apellido());
                segundoApellido.setText(participante.getSegundo_apellido());
                fecha.setDate(parseFecha(participante.getFecha_nacimiento()));
                correo.setText(participante.getEmail());
                telefono.setText(participante.getTelefono());
               
        }
        else{
            JOptionPane.showMessageDialog(null, "El participante no se encuentra registrado.");
        }
        }
        
    }
    
    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaEventosActionPerformed

    private void consultarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBotonActionPerformed
        consultarParticipante();
    }//GEN-LAST:event_consultarBotonActionPerformed
    
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
    private javax.swing.JLabel cedulaLabel1;
    private javax.swing.JLabel codEventoLabel;
    private javax.swing.JButton consultarBoton;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JButton crearParticipante;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaEventos;
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