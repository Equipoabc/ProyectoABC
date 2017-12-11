package GUI;
import Controladores.*;
import static GUI.GUI_ModificarEvento.parseFecha;
import java.text.*;
import javax.swing.*;
import Logica.*;
import com.itextpdf.text.DocumentException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI_Inscripcion extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorParticipante controladorParticipante;
    ControladorEvento controladorEvento;
    String idOperador;
    String id_participante, nombre_participante;
    Evento evento;
    Participante participante;
    int banderaAceptar;
    DateFormat df = DateFormat.getDateInstance();
    
    public GUI_Inscripcion(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        dineroLabel.setVisible(false);
        dinero.setVisible(false);
        cambioLabelEditar.setVisible(false);
        cambioLabel.setVisible(false);
        continuarBoton.setVisible(false);
        evento = new Evento();
        controladorParticipante = new ControladorParticipante();
        participante = new Participante();
        controladorEvento = new ControladorEvento();
        validaciones = new Validaciones();
        fecha.setMaxSelectableDate(GetDateNow());
        fecha.getDateEditor().setEnabled(false);
        banderaAceptar = 0;
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorEvento.llenarCombo();
        
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
    
    private static Date GetDateNow() {
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
        segundoApellidoLabel = new javax.swing.JLabel();
        primerApellido = new javax.swing.JTextField();
        primerApellidoLabel = new javax.swing.JLabel();
        segundoNombre = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        primerNombre = new javax.swing.JTextField();
        cedulaLabel1 = new javax.swing.JLabel();
        crearParticipante = new javax.swing.JButton();
        fecha = new com.toedter.calendar.JDateChooser();
        precioLabelEditar = new javax.swing.JLabel();
        nombreEventoEditar = new javax.swing.JLabel();
        precioLabel1 = new javax.swing.JLabel();
        nombreEventoLabel2 = new javax.swing.JLabel();
        dineroLabel = new javax.swing.JLabel();
        cambioLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dinero = new javax.swing.JTextField();
        cambioLabelEditar = new javax.swing.JLabel();
        consultarBoton = new javax.swing.JButton();
        continuarBoton = new javax.swing.JButton();
        listaEventos = new javax.swing.JComboBox<>();
        consultarBoton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 600));
        setPreferredSize(new java.awt.Dimension(750, 600));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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
        botonCancelar.setBounds(370, 470, 140, 90);

        correo.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                correoKeyPressed(evt);
            }
        });
        jPanel1.add(correo);
        correo.setBounds(160, 390, 150, 25);

        correoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correoLabel.setText("Email:");
        jPanel1.add(correoLabel);
        correoLabel.setBounds(40, 380, 120, 30);

        telefonoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefonoLabel.setText("Teléfono:");
        jPanel1.add(telefonoLabel);
        telefonoLabel.setBounds(40, 410, 130, 30);

        telefono.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        telefono.setSelectionColor(new java.awt.Color(102, 102, 255));
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoKeyPressed(evt);
            }
        });
        jPanel1.add(telefono);
        telefono.setBounds(160, 420, 150, 25);

        codEventoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        codEventoLabel.setText("Código Evento:");
        jPanel1.add(codEventoLabel);
        codEventoLabel.setBounds(350, 240, 100, 34);

        fechaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel.setText("Fecha Nacimiento:");
        jPanel1.add(fechaLabel);
        fechaLabel.setBounds(40, 350, 220, 40);

        cedula.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulaKeyPressed(evt);
            }
        });
        jPanel1.add(cedula);
        cedula.setBounds(160, 180, 150, 25);

        cedulaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel.setText("No. de Cédula:");
        jPanel1.add(cedulaLabel);
        cedulaLabel.setBounds(40, 180, 200, 30);

        segundoApellido.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoApellido.setSelectionColor(new java.awt.Color(102, 102, 255));
        segundoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segundoApellidoKeyPressed(evt);
            }
        });
        jPanel1.add(segundoApellido);
        segundoApellido.setBounds(160, 330, 150, 25);

        segundoApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoApellidoLabel.setText("Segundo Apellido:");
        jPanel1.add(segundoApellidoLabel);
        segundoApellidoLabel.setBounds(40, 320, 110, 34);

        primerApellido.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerApellido.setSelectionColor(new java.awt.Color(102, 102, 255));
        primerApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerApellidoKeyPressed(evt);
            }
        });
        jPanel1.add(primerApellido);
        primerApellido.setBounds(160, 300, 150, 25);

        primerApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerApellidoLabel.setText("Primer Apellido:");
        jPanel1.add(primerApellidoLabel);
        primerApellidoLabel.setBounds(40, 290, 230, 34);

        segundoNombre.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoNombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        segundoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segundoNombreKeyPressed(evt);
            }
        });
        jPanel1.add(segundoNombre);
        segundoNombre.setBounds(160, 270, 150, 25);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(40, 260, 230, 34);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(40, 230, 220, 30);

        primerNombre.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerNombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        primerNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerNombreKeyPressed(evt);
            }
        });
        jPanel1.add(primerNombre);
        primerNombre.setBounds(160, 240, 150, 25);

        cedulaLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel1.setText("Verifique si el participante se encuentra registrado en el sistema.");
        jPanel1.add(cedulaLabel1);
        cedulaLabel1.setBounds(40, 140, 430, 30);

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
        crearParticipante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                crearParticipanteKeyPressed(evt);
            }
        });
        jPanel1.add(crearParticipante);
        crearParticipante.setBounds(240, 470, 140, 90);

        fecha.setBackground(new java.awt.Color(255, 255, 255));
        fecha.setForeground(new java.awt.Color(102, 102, 255));
        fecha.setFocusable(false);
        fecha.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fecha.setMaxSelectableDate(new java.util.Date(1514786508000L));
        fecha.setMinSelectableDate(new java.util.Date(-1577901492000L));
        fecha.setRequestFocusEnabled(false);
        fecha.setVerifyInputWhenFocusTarget(false);
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fechaKeyPressed(evt);
            }
        });
        jPanel1.add(fecha);
        fecha.setBounds(160, 360, 150, 25);

        precioLabelEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(precioLabelEditar);
        precioLabelEditar.setBounds(460, 330, 110, 20);

        nombreEventoEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(nombreEventoEditar);
        nombreEventoEditar.setBounds(460, 300, 110, 20);

        precioLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        precioLabel1.setText("Precio:");
        jPanel1.add(precioLabel1);
        precioLabel1.setBounds(400, 330, 110, 18);

        nombreEventoLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        nombreEventoLabel2.setText("Nombre Evento:");
        jPanel1.add(nombreEventoLabel2);
        nombreEventoLabel2.setBounds(350, 300, 110, 18);

        dineroLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        dineroLabel.setText("Dinero:");
        jPanel1.add(dineroLabel);
        dineroLabel.setBounds(400, 360, 50, 18);

        cambioLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cambioLabel.setText("Cambio:");
        jPanel1.add(cambioLabel);
        cambioLabel.setBounds(400, 390, 50, 18);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Inscripción");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 40, 200, 50);

        dinero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dineroKeyPressed(evt);
            }
        });
        jPanel1.add(dinero);
        dinero.setBounds(460, 360, 150, 25);

        cambioLabelEditar.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(cambioLabelEditar);
        cambioLabelEditar.setBounds(460, 390, 150, 20);

        consultarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        consultarBoton.setBorder(null);
        consultarBoton.setContentAreaFilled(false);
        consultarBoton.setDefaultCapable(false);
        consultarBoton.setFocusPainted(false);
        consultarBoton.setFocusable(false);
        consultarBoton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        consultarBoton.setRequestFocusEnabled(false);
        consultarBoton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        consultarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBotonActionPerformed(evt);
            }
        });
        consultarBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultarBotonKeyPressed(evt);
            }
        });
        jPanel1.add(consultarBoton);
        consultarBoton.setBounds(610, 240, 120, 42);

        continuarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        continuarBoton.setBorder(null);
        continuarBoton.setBorderPainted(false);
        continuarBoton.setContentAreaFilled(false);
        continuarBoton.setDefaultCapable(false);
        continuarBoton.setFocusPainted(false);
        continuarBoton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        continuarBoton.setRequestFocusEnabled(false);
        continuarBoton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        continuarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBotonActionPerformed(evt);
            }
        });
        continuarBoton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                continuarBotonKeyPressed(evt);
            }
        });
        jPanel1.add(continuarBoton);
        continuarBoton.setBounds(610, 350, 130, 50);

        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });
        jPanel1.add(listaEventos);
        listaEventos.setBounds(450, 250, 150, 25);

        consultarBoton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        consultarBoton2.setBorder(null);
        consultarBoton2.setBorderPainted(false);
        consultarBoton2.setContentAreaFilled(false);
        consultarBoton2.setDefaultCapable(false);
        consultarBoton2.setFocusPainted(false);
        consultarBoton2.setFocusable(false);
        consultarBoton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        consultarBoton2.setRequestFocusEnabled(false);
        consultarBoton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        consultarBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarBoton2ActionPerformed(evt);
            }
        });
        consultarBoton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consultarBoton2KeyPressed(evt);
            }
        });
        jPanel1.add(consultarBoton2);
        consultarBoton2.setBounds(320, 170, 120, 50);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        fondo.setMaximumSize(new java.awt.Dimension(750, 500));
        fondo.setMinimumSize(new java.awt.Dimension(750, 500));
        fondo.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.add(fondo);
        fondo.setBounds(0, -10, 750, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Operador oper = new GUI_Operador();
        oper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
    
    private void crearParticipante(){
       
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
                    primerAp,segundoAp,ced,fechaNacimiento, tel, email, idOperador, codigoEvento, "Valido");
            
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
                    JOptionPane.showMessageDialog(null, "La inscripción se ha realizado exitosamente.");
                    evento = controladorEvento.consultarDatosEvento(codigoEvento);
                    nombreEventoEditar.setText(evento.getNombre_evento());
                    precioLabelEditar.setText(evento.getPrecio());
                    
                    int opcion = 5;
                    opcion = JOptionPane.showConfirmDialog(null, "Desea imprimir un recibo?",
                            "Imprimir recibo", JOptionPane.OK_CANCEL_OPTION);
                    if(opcion == 0){
                        id_participante = ced;
                        dinero.setVisible(true);
                        dinero.grabFocus();
                        dinero.requestFocus();
                        dineroLabel.setVisible(true);
                        cambioLabel.setVisible(true);
                        cambioLabelEditar.setVisible(true);
                        continuarBoton.setVisible(true);
                        crearParticipante.setEnabled(false);
                        
                    }
                    else{
                        primerNombre.setText(null);
                        segundoNombre.setText(null);
                        primerApellido.setText(null);
                        segundoApellido.setText(null);
                        cedula.setText(null);
                        telefono.setText(null);
                        correo.setText(null);
                        banderaAceptar = 0;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al realizar la inscripción.");
                    break;
            }
            
        }
            
        }
    }
    
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
    
    private void crearParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearParticipanteActionPerformed
      crearParticipante();
     
    }//GEN-LAST:event_crearParticipanteActionPerformed
    
    private void consultar() {
        String id = cedula.getText();
        String id_evento1 = (String) listaEventos.getSelectedItem();
        String[] partes = id_evento1.split(" ");
        String id_evento = partes[0];
        if (id_evento.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios");
        } else if (!validaciones.validarNumero(id_evento) || !validaciones.validarNumero(id)) {
            
            JOptionPane.showMessageDialog(null, "Los campos deben ser numericos.");
        } else {
            //Nuevo
            evento = controladorEvento.consultarDatosEvento(id_evento);
            //Nuevo
            if(evento != null){
                nombreEventoEditar.setText(evento.getNombre_evento());
                precioLabelEditar.setText(evento.getPrecio());
            }
            else{
                JOptionPane.showMessageDialog(null, "El evento " + id_evento + " no existe.");
            }
            
        }
    }
    
    private void consultarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBotonActionPerformed

        consultar();
    }//GEN-LAST:event_consultarBotonActionPerformed
    
    private void continuar(){
        Reportes recibo = new Reportes();
        String cod_evento = evento.getId_evento();
        String nombre_evento = evento.getNombre_evento();
        Date fechaActual;
        fechaActual = GUI_Inscripcion.GetDateNow();
        String fecha = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            fecha = new SimpleDateFormat("dd/MM/YYYY").format(fechaActual);
        } catch(Exception e){
            System.out.println(e);
        }
        
        String precio = evento.getPrecio();
        String money = dinero.getText();
        participante = controladorParticipante.consultarDatosParticipante(id_participante);
        nombre_participante = participante.getPrimer_nombre() + " " + participante.getSegundo_nombre() + " " +
                participante.getPrimer_apellido() + " " +participante.getSegundo_apellido();
        if(money.equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese dinero");
        }
        else if (!validaciones.validarNumero(money)) {
            JOptionPane.showMessageDialog(null, "El dinero debe ser un número");
        }
        else {
            int plata = Integer.parseInt(money);
            int prec = Integer.parseInt(precio);
            int cambio = plata - prec;
            if(plata >= prec){
                try {
                    String cambioS;
                    cambioS = String.valueOf(cambio);
                    cambioLabelEditar.setText(cambioS);
                    recibo.imprimirRecibo(nombre_participante, id_participante, cod_evento, nombre_evento, precio, fecha, money, cambioS);
                    JOptionPane.showMessageDialog(null, "Recibo impreso");
                    dinero.setVisible(false);
                    dineroLabel.setVisible(false);
                    cambioLabel.setVisible(false);
                    cambioLabelEditar.setVisible(false);
                    continuarBoton.setVisible(false);
                    dinero.setText("");
                    cambioLabelEditar.setText("");
                    cedula.setText("");
                    crearParticipante.setEnabled(true);
                    
                } catch (IOException ex) {
                    Logger.getLogger(GUI_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DocumentException ex) {
                    Logger.getLogger(GUI_RegistrarPago.class.getName()).log(Level.SEVERE, null, ex);
                }
                nombreEventoEditar.setText("");
                precioLabelEditar.setText("");
                primerNombre.setText(null);
                segundoNombre.setText(null);
                primerApellido.setText(null);
                segundoApellido.setText(null);
                cedula.setText(null);
                telefono.setText(null);
                correo.setText(null);
                banderaAceptar = 0;
                
            }
            else{
                JOptionPane.showMessageDialog(null, "No es suficiente dinero.");
            }
            
        }
    }
    private void continuarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBotonActionPerformed
        continuar();
    }//GEN-LAST:event_continuarBotonActionPerformed

    private void primerNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerNombreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_primerNombreKeyPressed

    private void continuarBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_continuarBotonKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){continuar();}
    }//GEN-LAST:event_continuarBotonKeyPressed

    private void dineroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dineroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){continuar();}
    }//GEN-LAST:event_dineroKeyPressed

    private void consultarBotonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultarBotonKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){consultar();}
    }//GEN-LAST:event_consultarBotonKeyPressed

    private void segundoNombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundoNombreKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_segundoNombreKeyPressed

    private void primerApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerApellidoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_primerApellidoKeyPressed

    private void segundoApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundoApellidoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_segundoApellidoKeyPressed

    private void cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_cedulaKeyPressed

    private void fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_fechaKeyPressed

    private void correoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_correoKeyPressed

    private void telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_telefonoKeyPressed

    private void crearParticipanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_crearParticipanteKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){crearParticipante();}
    }//GEN-LAST:event_crearParticipanteKeyPressed

    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaEventosActionPerformed

    private void consultarBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarBoton2ActionPerformed
        consultarParticipante();
    }//GEN-LAST:event_consultarBoton2ActionPerformed

    private void consultarBoton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultarBoton2KeyPressed
        consultarParticipante();
    }//GEN-LAST:event_consultarBoton2KeyPressed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Inscripcion().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JLabel cambioLabel;
    private javax.swing.JLabel cambioLabelEditar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JLabel cedulaLabel1;
    private javax.swing.JLabel codEventoLabel;
    private javax.swing.JButton consultarBoton;
    private javax.swing.JButton consultarBoton2;
    private javax.swing.JButton continuarBoton;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JButton crearParticipante;
    private javax.swing.JTextField dinero;
    private javax.swing.JLabel dineroLabel;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaEventos;
    private javax.swing.JLabel nombreEventoEditar;
    private javax.swing.JLabel nombreEventoLabel2;
    private javax.swing.JLabel precioLabel1;
    private javax.swing.JLabel precioLabelEditar;
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