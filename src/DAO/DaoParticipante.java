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

public class DaoParticipante {
    
    Conexiones conexion;
    
    public DaoParticipante(){
        
        conexion = new Conexiones();
    }

    public int guardarParticipante(Participante pa, String codEvento){
        
        String sql_guardar;
        String sql_guardarPar_Ev;
        int numFilas, numFilas2;
        
        sql_guardar = "INSERT INTO Participantes (cedula_pa, primer_nombre, segundo_nombre, " + 
            "primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono)  " + 
            " VALUES ('" + pa.getCedula_pa() + "', '" +
            pa.getPrimer_nombre() +  "', '" + pa.getSegundo_nombre() +  "', '" +
            pa.getPrimer_apellido() +  "', '" + pa.getSegundo_apellido() + "', '" + 
            pa.getFecha_nacimiento() + "', '" + pa.getEmail() +  "', '" + 
            pa.getTelefono() +   "')" ;
        
        sql_guardarPar_Ev = "INSERT INTO Participantes_eventos (id_participante, id_evento, estado_pago, " + 
            "cedula_op)  " + 
            " VALUES ('" + pa.getCedula_pa() + "', '" +
            codEvento +  "', '" + pa.getEstado_pago() +  "', '" +
            pa.getCedula_op() +   "')" ;        
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_guardar);
            numFilas2 = sentencia.executeUpdate(sql_guardarPar_Ev);
            return numFilas + numFilas2;
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    
    
}