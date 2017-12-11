package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GUI_Escarapelas extends javax.swing.JFrame {
    
    Validaciones validaciones;
    ControladorParticipante controladorParticipante;
    ControladorEvento controladorEvento;
    Participantes_Eventos participanteEvento;
    Participante participante;
    Evento evento;
    String idNombre;
    
    public void setId(String id) {
        this.idNombre = id;
    }
    
    public GUI_Escarapelas(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorParticipante = new ControladorParticipante();
        controladorEvento = new ControladorEvento();
        participanteEvento = new Participantes_Eventos();
        participante = new Participante();
        evento = new Evento();
        validaciones = new Validaciones();
        ArrayList<String> lista = new ArrayList<String>();
        lista = controladorEvento.llenarCombo();
        
        for(int i=0; i < lista.size(); i++){
            listaEventos.addItem(lista.get(i));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        codEventoLabel = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        cedulaLab = new javax.swing.JLabel();
        descargar = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        cedulaLabel1 = new javax.swing.JLabel();
        cedulaLabel2 = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        cedulaLabel = new javax.swing.JLabel();
        eventoLabel = new javax.swing.JLabel();
        cedulaLabel6 = new javax.swing.JLabel();
        listaEventos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Escarapelas");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 30, 200, 50);

        codEventoLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        codEventoLabel.setText("Ingresar código evento:");
        jPanel1.add(codEventoLabel);
        codEventoLabel.setBounds(460, 200, 190, 34);

        cedula.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        jPanel1.add(cedula);
        cedula.setBounds(460, 150, 150, 30);

        cedulaLab.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLab.setText("Nombre:");
        jPanel1.add(cedulaLab);
        cedulaLab.setBounds(106, 310, 60, 30);

        descargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DescargarMed.png"))); // NOI18N
        descargar.setBorder(null);
        descargar.setBorderPainted(false);
        descargar.setContentAreaFilled(false);
        descargar.setFocusPainted(false);
        descargar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DescargarPeq.png"))); // NOI18N
        descargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Descargar.png"))); // NOI18N
        descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descargarActionPerformed(evt);
            }
        });
        jPanel1.add(descargar);
        descargar.setBounds(400, 350, 140, 90);

        generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GenerarMed.png"))); // NOI18N
        generar.setBorder(null);
        generar.setBorderPainted(false);
        generar.setContentAreaFilled(false);
        generar.setFocusPainted(false);
        generar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GenerarPeq.png"))); // NOI18N
        generar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Generar.png"))); // NOI18N
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });
        jPanel1.add(generar);
        generar.setBounds(460, 270, 140, 90);

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarMed.png"))); // NOI18N
        cancelar.setBorder(null);
        cancelar.setBorderPainted(false);
        cancelar.setContentAreaFilled(false);
        cancelar.setFocusPainted(false);
        cancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CancelarPeq.png"))); // NOI18N
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar);
        cancelar.setBounds(530, 350, 140, 90);

        cedulaLabel1.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel1.setText("Cédula:");
        jPanel1.add(cedulaLabel1);
        cedulaLabel1.setBounds(108, 340, 50, 30);

        cedulaLabel2.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        cedulaLabel2.setText("Evento:");
        jPanel1.add(cedulaLabel2);
        cedulaLabel2.setBounds(108, 370, 50, 30);

        nombreLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(nombreLabel);
        nombreLabel.setBounds(160, 310, 140, 30);

        cedulaLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(cedulaLabel);
        cedulaLabel.setBounds(160, 340, 140, 30);

        eventoLabel.setFont(new java.awt.Font("Cambria", 2, 14)); // NOI18N
        jPanel1.add(eventoLabel);
        eventoLabel.setBounds(160, 370, 140, 30);

        cedulaLabel6.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cedulaLabel6.setText("Ingresar cédula:");
        jPanel1.add(cedulaLabel6);
        cedulaLabel6.setBounds(460, 110, 200, 30);

        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });
        jPanel1.add(listaEventos);
        listaEventos.setBounds(460, 240, 150, 30);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoEscarapela.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
        jLabel2.setMaximumSize(new java.awt.Dimension(750, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(750, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, -20, 770, 500);

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
    
    private void descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descargarActionPerformed
        String id_participante = cedula.getText();
        String id_evento1 = (String) listaEventos.getSelectedItem();
        String[] partes = id_evento1.split(" ");
        String id_evento = partes[0];
        String nombre = "";
        String nombreEvento = "";
        String ced="";
        String fec="";
        Reportes certificado = new Reportes();
        
        if (id_evento.equals("") || id_participante.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if (!validaciones.validarNumero(id_evento) || !validaciones.validarNumero(id_participante)) {
            
            JOptionPane.showMessageDialog(null, "Los campos deben ser númericos.");
        } else {
            
            participanteEvento = controladorParticipante.consultarPreinscripcion(id_participante, id_evento);
            participante = controladorParticipante.consultarDatosParticipante(id_participante);
            evento = controladorEvento.consultarDatosEvento(id_evento);
            
            if (participante == null) {
                JOptionPane.showMessageDialog(null, "El participante no existe.");
            }
            else if (evento == null){
                JOptionPane.showMessageDialog(null, "El evento no existe.");
            }
            else if (participanteEvento.getEstado_pago().equals("Invalido")){
                JOptionPane.showMessageDialog(null, "El participante no ha realizado el pago.");
            }
            else if (participanteEvento == null){
                nombre = participante.getPrimer_nombre()+" "+ participante.getSegundo_nombre()
                        + " "+participante.getPrimer_apellido() + " "+ participante.getSegundo_apellido();
                JOptionPane.showMessageDialog(null, "El participante "+ nombre +" no se"
                        + " encuentra inscrito en el evento "+ evento.getNombre_evento() +".");
            }
            
            else {
                nombre = participante.getPrimer_nombre()+" "+ participante.getSegundo_nombre()
                        + " "+participante.getPrimer_apellido() + " "+ participante.getSegundo_apellido();
                ced = participante.getCedula_pa();
                evento = controladorEvento.consultarDatosEvento(id_evento);
                nombreEvento = evento.getNombre_evento();
                fec = evento.getFecha();
                try {
                    certificado.imprimirEscarapela(nombre,ced,nombreEvento);
                    JOptionPane.showMessageDialog(null, "La escarapela de "+nombre+" se ha generado correctamente.");
                } catch (IOException | DocumentException ex) {
                    Logger.getLogger(GUI_Certificados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }       
    }//GEN-LAST:event_descargarActionPerformed
    
    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        // TODO add your handling code here:
        String id_participante = cedula.getText();
        String id_evento1 = (String) listaEventos.getSelectedItem();
        String[] partes = id_evento1.split(" ");
        String id_evento = partes[0];
        
        if (id_evento.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo cédula se encuentra vacío.");
        } else if (!validaciones.validarNumero(id_evento)) {
            
            JOptionPane.showMessageDialog(null, "El campo debe ser numérico.");
        } else if (id_participante.equals("")) {
            
            JOptionPane.showMessageDialog(null, "El campo cédula se encuentra vacío.");
        } else if (!validaciones.validarNumero(id_participante)) {
            
            JOptionPane.showMessageDialog(null, "El campo debe ser numérico.");
        } else {
            
            participanteEvento = controladorParticipante.consultarPreinscripcion(id_participante, id_evento);
            participante = controladorParticipante.consultarDatosParticipante(id_participante);
            evento = controladorEvento.consultarDatosEvento(id_evento);
            
            if (participanteEvento != null) {
                
                nombreLabel.setText(participante.getPrimer_nombre()+ " "+ participante.getPrimer_apellido());
                cedulaLabel.setText(participanteEvento.getId_participante());
                eventoLabel.setText(evento.getNombre_evento());
                
            } else if (participante != null){
                
                JOptionPane.showMessageDialog(null, "El participante "+ id_participante +" no se"
                        + " encuentra inscrito en el evento "+ id_evento+".");
                
            } else {
                JOptionPane.showMessageDialog(null, "El participante no existe.");
                
                cedula.setText(null);
            
            }
        }
    }//GEN-LAST:event_generarActionPerformed
    
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        GUI_Operador oper = new GUI_Operador();
        oper.setId(idNombre);
        oper.personalizarBienvenida();
        oper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaEventosActionPerformed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_Escarapelas().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel cedulaLab;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JLabel cedulaLabel1;
    private javax.swing.JLabel cedulaLabel2;
    private javax.swing.JLabel cedulaLabel6;
    private javax.swing.JLabel codEventoLabel;
    private javax.swing.JButton descargar;
    private javax.swing.JLabel eventoLabel;
    private javax.swing.JButton generar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaEventos;
    private javax.swing.JLabel nombreLabel;
    // End of variables declaration//GEN-END:variables
    
}