/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import DAO.*;
import Logica.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Luis
 */

public class ControladorOperador {
  
    DaoOperador daoOperador;
    
    public ControladorOperador(){
        
        daoOperador = new DaoOperador();
    }
    
    public int  insertarOperador(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
            String cedula, String fechaNacimiento, String telefono, String celular, String email, String contrasena, 
            String confirmar, String pregunta, String respuesta){
        
        if(!contrasena.equals(confirmar)){
        
            return 5;
        }
         
        Operador op = new Operador();     
        
        op.setPrimer_nombre(primerNombre);
        op.setSegundo_nombre(segundoNombre);
        op.setPrimer_apellido(primerApellido);
        op.setSegundo_apellido(segundoApellido);
        op.setCedula_op(cedula);
        op.setTelefono(telefono);
        op.setCelular(celular);
        op.setFecha_nacimiento(fechaNacimiento);
        op.setEmail(email);
        op.setContrasena(contrasena);
        op.setRespuesta(respuesta);
        op.setPregunta(pregunta);

        
        int result = daoOperador.guardarOperador(op);
        return result;
    }
    
    public Operador loginOperador(String user){

        Operador operador;
        operador = daoOperador.loginOperador(user);
        return operador;
    }
    
    public int consultarDatosOperador(String cedula, JComboBox<String> tipoUsuario, JTextField primerNom, JTextField segundoNom, JTextField primerAp, 
            JTextField segundoAp, JTextField ced, JDateChooser fecha, JTextField correo, JTextField tel, JTextField cel, JComboBox<String> estado) {
        
        return daoOperador.consultarDatosOperador(cedula, tipoUsuario, primerNom, segundoNom, primerAp, segundoAp, ced, fecha,
                    correo, tel, cel, estado);
    }
}