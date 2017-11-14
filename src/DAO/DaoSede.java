/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoSede {
    
    Conexiones conexion;
    
    public DaoSede(){
        
        conexion = Main.conexion;;
    }

    public int guardarSede(Sede sede) {
        String sql_guardar, validar;
        validar = "SELECT id_sede FROM Sedes WHERE id_sede = '" + sede.getId_sede() + "';";        

        int numFilas; 
        
        sql_guardar = "INSERT INTO Sedes (id_sede, nombre_sede, ciudad, " + 
                "calle, carrera, barrio, telefono, cedula_ge)" + 
                " VALUES ('" + sede.getId_sede()+ "', '" +
                sede.getNombre_sede() +  "', '" + sede.getCiudad() +  "', '" +
                sede.getCalle() +  "', '" + sede.getCarrera() + "', '" + 
                sede.getBarrio() +  "', '" + sede.getTelefono() +  "', '" + sede.getCedula_ge() +  "')" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(validar.equals(sede.getId_sede())){
                
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