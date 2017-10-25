/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author Luis
 */

import DAO.*;
import Logica.*;
import java.text.SimpleDateFormat;

public class ControladorGerente {
    
    DaoGerente daoGerente;
    
    public ControladorGerente(){
        
        daoGerente = new DaoGerente();
    }
 
       public int  insertarGerente(String primerNombre, 
               String segundoNombre, String primerApellido, String segundoApellido,
               String cedula, String fechaNacimiento, String telefono, 
               String celular, String email, String contrasena, String confirmar, String pregunta, 
               String respuesta){
        
          if(!contrasena.equals(confirmar)){
              return 5;
          }
          
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        
       Gerente ge = new Gerente();     
        
       
      /* try {
             Date date = formatter.parse(fechaNacimiento);
             op.setFecha_nacimiento(date);
        } catch (ParseException ex) {
            Logger.getLogger(ControladorOperador.class.getName()).log(Level.SEVERE, null, ex);
        }*/
       
        
        ge.setPrimer_nombre(primerNombre);
        ge.setSegundo_nombre(segundoNombre);
        ge.setPrimer_apellido(primerApellido);
        ge.setSegundo_apellido(segundoApellido);
        ge.setCedula_ge(cedula);
        ge.setTelefono(telefono);
        ge.setCelular(celular);
        ge.setEmail(email);
        ge.setContrasena(contrasena);
        ge.setRespuesta(respuesta);
        ge.setPregunta(pregunta);
        
        
        //Se llama al dao para guardar
        System.out.println("Se va a insertar un Gerente");
        
        int result =daoGerente.guardarGerente(ge);        
        return result;

    }//end   
    
    
    public Gerente loginGerente(String user){

        Gerente gerente;
        gerente = daoGerente.loginGerente(user);
        return gerente;
    }
}
