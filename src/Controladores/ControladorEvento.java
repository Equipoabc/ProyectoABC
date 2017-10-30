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

public class ControladorEvento {
    
    DaoEvento daoEvento;
    
    public ControladorEvento(){
        
        daoEvento = new DaoEvento();
    }

    public int insertarEvento(String cod, String nom, String date, String prec, String cupo, String hora, String min, String dur, String lug, String tem){
        
        Evento evento = new Evento();
        
        evento.setNombre_evento(nom);
        evento.setId_evento(cod);
        evento.setFecha(date);
        
        return 0;
    }
}