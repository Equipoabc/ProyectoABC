/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import DAO.*;
import Logica.*;

public class ControladorSede {

    DaoSede daoSede;
    
    public ControladorSede(){
        
        daoSede = new DaoSede();
    }
    public int insertarSede(String nom, String id, String ciu, String tel, String cra, String cl, String bar, String idGerente) {
        Sede sede = new Sede(); 
        
        sede.setNombre_sede(nom);
        sede.setId_sede(id);
        sede.setCiudad(ciu);
        sede.setTelefono(tel);
        sede.setCarrera(cra);
        sede.setCalle(cl);
        sede.setBarrio(bar);
        sede.setCedula_ge(idGerente);
        
        int result = daoSede.guardarSede(sede);        
        return result;
        
        
    }
    
}