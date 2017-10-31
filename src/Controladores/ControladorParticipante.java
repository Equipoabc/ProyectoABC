/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import DAO.*;
import Logica.*;

/**
 *
 * @author Luis
 */

public class ControladorParticipante {
    
    DaoParticipante daoParticipante;
    
       public ControladorParticipante(){
        
        daoParticipante = new DaoParticipante();
    }
       
           public int  insertarParticipante(String primerNombre, String segundoNombre, 
                   String primerApellido, String segundoApellido, String cedula, String fechaNacimiento,
                   String telefono, String email, String idOperador, String codEvento){
               
       
       Participante pa = new Participante();     
      
        pa.setCedula_pa(cedula); 
        pa.setFecha_nacimiento(fechaNacimiento);
        pa.setPrimer_nombre(primerNombre);
        pa.setSegundo_nombre(segundoNombre);
        pa.setPrimer_apellido(primerApellido);
        pa.setSegundo_apellido(segundoApellido);        
        pa.setTelefono(telefono);
        pa.setEmail(email);
        pa.setEstado_pago("Invalido");
        pa.setCedula_op(idOperador);
        
                
        int result = daoParticipante.guardarParticipante(pa, codEvento);
        return result;
    }
}