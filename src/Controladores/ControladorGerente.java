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

public class ControladorGerente {
    
    DaoGerente daoGerente;
    
    public ControladorGerente(){
        
        daoGerente = new DaoGerente();
    }
 
    public int  insertarGerente(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, 
            String cedula, String fechaNacimiento, String telefono, String celular, String email, String contrasena, 
            String confirmar, String pregunta, String respuesta){
        
        if(!contrasena.equals(confirmar)){
        
            return 5;
        }
        Gerente ge = new Gerente();    
        
        ge.setPrimer_nombre(primerNombre);
        ge.setSegundo_nombre(segundoNombre);
        ge.setPrimer_apellido(primerApellido);
        ge.setSegundo_apellido(segundoApellido);
        ge.setCedula_ge(cedula);
        ge.setTelefono(telefono);
        ge.setCelular(celular);
        ge.setEmail(email);
        ge.setFecha_nacimiento(fechaNacimiento);
        ge.setContrasena(contrasena);
        ge.setRespuesta(respuesta);
        ge.setPregunta(pregunta);
        
        int result = daoGerente.guardarGerente(ge);        
        return result;
    }
    
    public Gerente loginGerente(String user){

        Gerente gerente;
        gerente = daoGerente.loginGerente(user);
        return gerente;
    }
    
    public int consultarDatosGerente(String cedula, JComboBox<String> tipoUsuario, JTextField primerNom, JTextField segundoNom, JTextField primerAp, JTextField segundoAp, JTextField ced, JDateChooser fecha, JTextField correo, JTextField tel, JTextField cel, JComboBox<String> estado) {
        
        return daoGerente.consultarDatosGerente(cedula, tipoUsuario, primerNom, segundoNom, primerAp, segundoAp, ced, fecha,
                    correo, tel, cel, estado);
    }
}
