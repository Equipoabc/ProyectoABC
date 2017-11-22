package GUI;
import Controladores.*;
import static GUI.GUI_ModificarEvento.parseFecha;
import java.text.*;
import javax.swing.*;
import Logica.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class GUI_ModificarParticipante extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorParticipante controladorParticipante;
    String idOperador;
    DateFormat df = DateFormat.getDateInstance();
    Participante participante;
            
    public GUI_ModificarParticipante() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorParticipante = new ControladorParticipante();
        validaciones = new Validaciones();
        fechaNac.setMaxSelectableDate(GetDateNow());
        fechaNac.getDateEditor().setEnabled(false);
        botonAceptar.setEnabled(false);
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
        tel = new javax.swing.JTextField();
        fechaLabel = new javax.swing.JLabel();
        segundoAp = new javax.swing.JTextField();
        segundoApellidoLabel = new javax.swing.JLabel();
        primerAp = new javax.swing.JTextField();
        primerApellidoLabel = new javax.swing.JLabel();
        segundoNomb = new javax.swing.JTextField();
        segundoNombreLabel = new javax.swing.JLabel();
        primerNombreLabel = new javax.swing.JLabel();
        primerNomb = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        fechaNac = new com.toedter.calendar.JDateChooser();
        primerNombreLabel4 = new javax.swing.JLabel();
        consultarLabel = new javax.swing.JTextField();
        botonConsultar = new javax.swing.JButton();
        cdeulaText = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
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
        botonCancelar.setBounds(490, 320, 140, 90);

        correo.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        correo.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(correo);
        correo.setBounds(550, 170, 180, 20);

        correoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        correoLabel.setText("Email:");
        jPanel1.add(correoLabel);
        correoLabel.setBounds(490, 165, 120, 30);

        telefonoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        telefonoLabel.setText("Teléfono:");
        jPanel1.add(telefonoLabel);
        telefonoLabel.setBounds(487, 215, 70, 30);

        tel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        tel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(tel);
        tel.setBounds(550, 220, 180, 20);

        fechaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        fechaLabel.setText("Fecha Nacimiento:");
        jPanel1.add(fechaLabel);
        fechaLabel.setBounds(490, 115, 150, 30);

        segundoAp.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(segundoAp);
        segundoAp.setBounds(320, 270, 150, 20);

        segundoApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoApellidoLabel.setText("Segundo Apellido:");
        jPanel1.add(segundoApellidoLabel);
        segundoApellidoLabel.setBounds(210, 270, 250, 34);

        primerAp.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerAp.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerAp);
        primerAp.setBounds(320, 220, 150, 20);

        primerApellidoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerApellidoLabel.setText("Primer Apellido:");
        jPanel1.add(primerApellidoLabel);
        primerApellidoLabel.setBounds(210, 220, 230, 34);

        segundoNomb.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        segundoNomb.setSelectionColor(new java.awt.Color(102, 102, 255));
        segundoNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoNombActionPerformed(evt);
            }
        });
        jPanel1.add(segundoNomb);
        segundoNomb.setBounds(320, 170, 150, 20);

        segundoNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        segundoNombreLabel.setText("Segundo Nombre:");
        jPanel1.add(segundoNombreLabel);
        segundoNombreLabel.setBounds(210, 170, 230, 34);

        primerNombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel.setText("Primer Nombre:");
        jPanel1.add(primerNombreLabel);
        primerNombreLabel.setBounds(210, 120, 100, 30);

        primerNomb.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        primerNomb.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(primerNomb);
        primerNomb.setBounds(320, 120, 150, 20);

        botonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarMed.png"))); // NOI18N
        botonAceptar.setBorder(null);
        botonAceptar.setBorderPainted(false);
        botonAceptar.setContentAreaFilled(false);
        botonAceptar.setFocusPainted(false);
        botonAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AceptarPeq.png"))); // NOI18N
        botonAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(botonAceptar);
        botonAceptar.setBounds(350, 320, 140, 90);

        fechaNac.setBackground(new java.awt.Color(255, 255, 255));
        fechaNac.setForeground(new java.awt.Color(102, 102, 255));
        fechaNac.setFocusable(false);
        fechaNac.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fechaNac.setMaxSelectableDate(new java.util.Date(1514786508000L));
        fechaNac.setMinSelectableDate(new java.util.Date(-1577901492000L));
        fechaNac.setRequestFocusEnabled(false);
        fechaNac.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(fechaNac);
        fechaNac.setBounds(600, 120, 130, 20);

        primerNombreLabel4.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        primerNombreLabel4.setText("Ingresar Cédula:");
        jPanel1.add(primerNombreLabel4);
        primerNombreLabel4.setBounds(60, 170, 100, 40);

        consultarLabel.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        consultarLabel.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(consultarLabel);
        consultarLabel.setBounds(40, 210, 140, 20);

        botonConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarMed.png"))); // NOI18N
        botonConsultar.setBorder(null);
        botonConsultar.setBorderPainted(false);
        botonConsultar.setContentAreaFilled(false);
        botonConsultar.setFocusPainted(false);
        botonConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConsultarPeq.png"))); // NOI18N
        botonConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Consultar.png"))); // NOI18N
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(botonConsultar);
        botonConsultar.setBounds(30, 240, 160, 70);

        cdeulaText.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cdeulaText.setText("Cedula:");
        jPanel1.add(cdeulaText);
        cdeulaText.setBounds(487, 265, 100, 30);

        cedula.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cedula);
        cedula.setBounds(550, 270, 180, 20);

        fondo.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoModificarPart.png"))); // NOI18N
        fondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        fondo.setFocusable(false);
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 760, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        
        GUI_Operador operador = new GUI_Operador();
        operador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed
   
    public String organizarFecha(String fecha){
        
        String[] arreglo = fecha.split("/");
        return arreglo[2] + "-" + arreglo[1] + "-" + arreglo[0];      
    }
    
    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        
        String codigoConsulta, cedulaS, fechaS = "", primerNombreS, segundoNombreS, primerApellidoS,
                segundoApellidoS, correoS, telefonoS, validar = "";        
        codigoConsulta = consultarLabel.getText();
        cedulaS = cedula.getText();
        primerNombreS = primerNomb.getText();
        segundoNombreS = segundoNomb.getText();
        primerApellidoS = primerAp.getText();
        segundoApellidoS = segundoAp.getText();
        correoS = correo.getText();
        telefonoS = tel.getText();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.now();        
        try {
            
            fechaS = new SimpleDateFormat("dd/MM/YYYY").format(fechaNac.getDate());
            fecha = LocalDate.parse(fechaS, fmt);            
        } catch(Exception e){
            
            validar = "\nDebe ingresar una fecha válida.";            
        }     
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fecha, ahora);
        
        if (cedulaS.equals("") || primerNombreS.equals("") || primerApellidoS.equals("") || telefonoS.equals("") || codigoConsulta.equals("")){               
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");            
        } else if (!validaciones.validarLetras(primerNombreS) || !validaciones.validarLetras(segundoNombreS) || !validaciones.validarLetras(primerApellidoS) || !validaciones.validarLetras(segundoApellidoS)){              
            JOptionPane.showMessageDialog(null, "Los campos del nombre tema deben ser de solo letras.");            
        } else if (!validaciones.validarNumero(cedulaS) || !validaciones.validarNumero(codigoConsulta) || !validaciones.validarNumero(telefonoS)) {             
            JOptionPane.showMessageDialog(null, "Los campos de consulta, cedula y telefono deben ser de solo numeros.");            
        } else if (periodo.getYears() < 15) {             
            JOptionPane.showMessageDialog(null, "El participante tiene que ser mayor de 15 años.");            
        } else {
            
            if(controladorParticipante.comprobar(codigoConsulta) == 1){
                
                fechaS = organizarFecha(fechaS);
                
                if (cedulaS.equals(participante.getCedula_pa()) && primerNombreS.equals(participante.getPrimer_nombre())
                        && segundoNombreS.equals(participante.getSegundo_nombre()) && primerApellidoS.equals(participante.getPrimer_apellido())
                        && segundoApellidoS.equals(participante.getSegundo_apellido()) && correoS.equals(participante.getEmail())
                        && telefonoS.equals(participante.getTelefono()) && fechaS.equals(participante.getFecha_nacimiento())){
                    
                    JOptionPane.showMessageDialog(null, "No se ha modificado ningun campo.");                    
                } else {
                    
                    int resultado = controladorParticipante.actualizarParticipante(codigoConsulta, cedulaS, primerNombreS,
                            segundoNombreS, primerApellidoS, segundoApellidoS, correoS, telefonoS, fechaS);
                    
                    switch(resultado){
                        case 1:
                            JOptionPane.showMessageDialog(null, "Los datos del participante se han modificado exitosamente.");
                            consultarLabel.setText(null);
                            cedula.setText(null);
                            primerNomb.setText(null);
                            segundoNomb.setText(null);
                            primerAp.setText(null);
                            segundoAp.setText(null);
                            fechaNac.setDate(null);
                            correo.setText(null);
                            tel.setText(null);
                            break;
                            
                        case 2:
                            JOptionPane.showMessageDialog(null, "La cedula del participante ha actualizar ya se encuentra registrado.");
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Ocurrio un problema al actualizar el evento.");
                            break;
                    }
                }                
            } else {
                
                JOptionPane.showMessageDialog(null, "El participante que desea modificar no existe.");                
            }            
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        
        botonAceptar.setEnabled(true);
        String cedulaConsulta = consultarLabel.getText();
        
        if (cedulaConsulta.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo de la consulta esta vacio.");
            
        } else if (!validaciones.validarNumero(cedulaConsulta)) {
            
            JOptionPane.showMessageDialog(null, "El campo consultar debe ser numerico.");
            
        } else {
            
            participante = controladorParticipante.consultarDatoParticipante(cedulaConsulta);
            
            if (participante != null) {
                
                cedula.setText(participante.getCedula_pa());
                primerNomb.setText(participante.getPrimer_nombre());
                segundoNomb.setText(participante.getSegundo_nombre());
                primerAp.setText(participante.getPrimer_apellido());
                segundoAp.setText(participante.getSegundo_apellido());
                fechaNac.setDate(parseFecha(participante.getFecha_nacimiento()));
                correo.setText(participante.getEmail());
                tel.setText(participante.getTelefono());
                
                JOptionPane.showMessageDialog(null, "Los datos del participante se han cargado exitosamente.");
                
            } else {
                
                JOptionPane.showMessageDialog(null, "El participante no existe.");
                consultarLabel.setText(null);
                cedula.setText(null);
                primerNomb.setText(null);
                segundoNomb.setText(null);
                primerAp.setText(null);
                segundoAp.setText(null);
                fechaNac.setDate(null);
                correo.setText(null);
                tel.setText(null);
            }
        }        
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void segundoNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoNombActionPerformed
    }//GEN-LAST:event_segundoNombActionPerformed

    public static void main(String args[]){
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_ModificarParticipante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JLabel cdeulaText;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField consultarLabel;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JLabel fechaLabel;
    private com.toedter.calendar.JDateChooser fechaNac;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField primerAp;
    private javax.swing.JLabel primerApellidoLabel;
    private javax.swing.JTextField primerNomb;
    private javax.swing.JLabel primerNombreLabel;
    private javax.swing.JLabel primerNombreLabel4;
    private javax.swing.JTextField segundoAp;
    private javax.swing.JLabel segundoApellidoLabel;
    private javax.swing.JTextField segundoNomb;
    private javax.swing.JLabel segundoNombreLabel;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables
}