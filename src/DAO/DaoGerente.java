/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoGerente {
   
    Conexiones conexion;
    
    public DaoGerente(){
        
        conexion = new Conexiones();
    }
    
    public Gerente loginGerente(String user){
        
        String sql;
        Gerente gerente = new Gerente();

        sql = "SELECT cedula_ge, contrasena FROM Gerentes WHERE cedula_ge = '" + user + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                gerente.setCedula_ge(consulta.getString(1));
                gerente.setContrasena(consulta.getString(2));
            }
            
            return gerente;
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return null;
    }
    
    public int guardarGerente(Gerente ge){
        
        String sql_guardar;
        int numFilas;      
     
        sql_guardar = "INSERT INTO Gerentes (cedula_ge, primer_nombre, segundo_nombre, " + 
                "primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, " + 
                "contrasena, pregunta, respuesta) VALUES ('" + ge.getCedula_ge() + "', '" +
                ge.getPrimer_nombre() +  "', '" + ge.getSegundo_nombre() +  "', '" +
                ge.getPrimer_apellido() +  "', '" + ge.getSegundo_apellido() + "', '" + 
                ge.getFecha_nacimiento() + "', '" + ge.getEmail() +  "', '" + 
                ge.getTelefono() +  "', '" + ge.getCelular() +  "', '" +        
                "Activo" +  "', '" + ge.getContrasena() +  "', '" +
                ge.getPregunta() +  "', '" + ge.getRespuesta() +  "')" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql_guardar); 
            return numFilas;
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return -1;  
    }
}