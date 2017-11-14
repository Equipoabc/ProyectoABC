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
        
        conexion = Main.conexion;
    }

    public int guardarParticipante(Participante pa, String codEvento){
        
        String sql_guardar, validar, validarEvento;
        validar = "SELECT cedula_pa FROM Participantes WHERE cedula_pa = '" + pa.getCedula_pa() + "';";  
        validarEvento = "SELECT id_evento FROM Eventos WHERE id_evento = '" + codEvento + "';";
        String sql_guardarPar_Ev;
        int numFilas, numFilas2;
        numFilas2 = 0;
        
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
            Statement sentencia2 = conn.createStatement();
            
            ResultSet consulta = sentencia.executeQuery(validar);
            ResultSet consultaEvento = sentencia2.executeQuery(validarEvento);
            
            while(consulta.next()){
                validar = consulta.getString(1);
            }
            while(consultaEvento.next()){
               validarEvento = consultaEvento.getString(1);
            }
            
            if (validarEvento.equals (codEvento) && validar.equals(pa.getCedula_pa())){
                return 7;
            }
            
            if(!validarEvento.equals(codEvento)) {
                return 3;
            }
            else {
            if(!validar.equals(pa.getCedula_pa())){
                
            numFilas = sentencia.executeUpdate(sql_guardar);
            
            numFilas2 = sentencia.executeUpdate(sql_guardarPar_Ev);
            
            return numFilas + numFilas2;
            }
            else if (validar.equals(pa.getCedula_pa())){
                  sentencia.executeUpdate(sql_guardarPar_Ev);
                  return 5;
            }
            
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }    
    
}