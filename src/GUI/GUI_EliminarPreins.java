package GUI;
import Controladores.*;
import javax.swing.*;
import Logica.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GUI_EliminarPreins extends javax.swing.JFrame {
    
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
    
    public GUI_EliminarPreins(){
        
        initComponents();
        this.setLocationRelativeTo(null);
        controladorEvento = new ControladorEvento();
        controladorParticipante = new ControladorParticipante();
        participanteEvento = new Participantes_Eventos();
        validaciones = new Validaciones();
        participante = new Participante();
        evento = new Evento();
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
        cancelar = new javax.swing.JButton();
        codEventoLabel = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        cedulaLabel = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        listaEventos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 500));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eliminar Preinscripción");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 320, 50);

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
        cancelar.setBounds(380, 350, 140, 90);

        codEventoLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        codEventoLabel.setText("Ingresar código evento:");
        jPanel1.add(codEventoLabel);
        codEventoLabel.setBounds(290, 240, 180, 34);

        cedula.setFont(new java.awt.Font("Cambria", 2, 12)); // NOI18N
        cedula.setSelectionColor(new java.awt.Color(102, 102, 255));
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cedulaKeyPressed(evt);
            }
        });
        jPanel1.add(cedula);
        cedula.setBounds(300, 190, 150, 30);

        cedulaLabel.setFont(new java.awt.Font("Cambria", 2, 18)); // NOI18N
        cedulaLabel.setText("Ingresar cédula:");
        jPanel1.add(cedulaLabel);
        cedulaLabel.setBounds(310, 150, 200, 30);

        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarMed.png"))); // NOI18N
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setFocusPainted(false);
        eliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EliminarPeq.png"))); // NOI18N
        eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar.png"))); // NOI18N
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                eliminarKeyPressed(evt);
            }
        });
        jPanel1.add(eliminar);
        eliminar.setBounds(240, 350, 140, 90);

        listaEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEventosActionPerformed(evt);
            }
        });
        jPanel1.add(listaEventos);
        listaEventos.setBounds(300, 290, 150, 30);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoOtros.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
        jLabel2.setMaximumSize(new java.awt.Dimension(750, 500));
        jLabel2.setMinimumSize(new java.awt.Dimension(750, 500));
        jLabel2.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 750, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
        GUI_Operador oper = new GUI_Operador();
        oper.setId(idNombre);
        oper.personalizarBienvenida();
        oper.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed
    
    private void eliminar(){
        String id_evento1 = (String) listaEventos.getSelectedItem();
        String[] partes = id_evento1.split(" ");
        String id_evento = partes[0];  
        String id_participante = cedula.getText();
        
        if (id_participante.equals("") || id_evento.equals("")) {
            
            JOptionPane.showMessageDialog(null, "Faltan campos obligatorios.");
        } else if (!validaciones.validarNumero(id_evento) || !validaciones.validarNumero(id_participante)) {
            
            JOptionPane.showMessageDialog(null, "Los campos deben ser númericos.");
        }
        else {
            participanteEvento = controladorParticipante.consultarPreinscripcion(id_participante, id_evento);
            participante = controladorParticipante.consultarDatosParticipante(id_participante);
            evento = controladorEvento.consultarDatosEvento(id_evento);
            if (participante == null){
                JOptionPane.showMessageDialog(null, "El participante " + id_participante + " no existe.");
            }
            else if (evento == null){
                JOptionPane.showMessageDialog(null, "El evento " + id_evento + "  no existe.");
            }
            else if(participanteEvento != null){
                if(participanteEvento.getEstado_pago().equals("Invalido")){
                    int opcion = 5;
                    opcion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la pre-inscripción "
                            + "del participante " + id_participante + " al evento " + id_evento + "?",
                            "Confirmar eliminación", JOptionPane.OK_CANCEL_OPTION);
                    if(opcion == 0){
                        int numFilas;
                        numFilas = controladorParticipante.eliminarPreinscripcion(id_participante, id_evento);
                        if (numFilas == 1){
                            JOptionPane.showMessageDialog(null, "La pre-inscripción ha sido eliminada.");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Hubo un error eliminando la pre-inscripción.");
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "El participante ya pagó la inscripción, no se puede eliminar.");
                    
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "El participante " + id_participante + " no se encuentra pre-inscrito al evento " + id_evento + ".");
            }
        }
    }
    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        
        eliminar();
    }//GEN-LAST:event_eliminarActionPerformed

    private void cedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){eliminar();}
    }//GEN-LAST:event_cedulaKeyPressed

    private void eliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eliminarKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){eliminar();}
    }//GEN-LAST:event_eliminarKeyPressed

    private void listaEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEventosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaEventosActionPerformed
    
    public static void main(String args[]){
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            
            public void run(){
                
                new GUI_EliminarPreins().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cedula;
    private javax.swing.JLabel cedulaLabel;
    private javax.swing.JLabel codEventoLabel;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaEventos;
    // End of variables declaration//GEN-END:variables
    
}