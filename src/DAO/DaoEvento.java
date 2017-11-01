/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Logica.*;
import Conexion.*;

/**
 *
 * @author Luis
 */

public class DaoEvento {
    
    Conexiones conexion;
    
    public DaoEvento(){
        
        conexion = new Conexiones();
    }

    public int guardarEvento(Evento evento) {
        String sql_guardar, validar;
        validar = "SELECT id_evento FROM Eventos WHERE id_evento = '" + evento.getId_evento() + "';";
        int numFilas;  
        
        sql_guardar = "INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge) " + 
                "VALUES ('" + evento.getId_evento() + "', '" + evento.getNombre_evento() +  "', '" + evento.getFecha() +  "', " + 
                evento.getPrecio() +  ", '" + evento.getLugar() +  "', '" + evento.getDuracion() + "', '" +  evento.getTema() +  "', " 
                + evento.getCupos() +  ", '" + evento.getCedula_ge() +  "')" ;
     
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(validar.equals(evento.getId_evento())){
                
                return 2;
            }
            
            else {
            
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return -1;  
    }
    
}