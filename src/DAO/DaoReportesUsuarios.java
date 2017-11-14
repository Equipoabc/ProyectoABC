/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Conexion.*;
import Logica.Main;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Iván
 */

public class DaoReportesUsuarios {
    
    Conexiones conexion;
    
    public DaoReportesUsuarios(){
            
        conexion = Main.conexion;
    }
    
    public void consultarUsuarios(DefaultTableModel modeloTabla, JTable tabla){
        
        String sql;

        sql = "SELECT cedula_op, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Operadores UNION SELECT cedula_ge, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Gerentes;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[10];
            
            while(consulta.next()){
                
                for (int i = 0; i < 10; i++) {
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                modeloTabla.addRow(fila);
            }
            
            tabla.updateUI();
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
    }  

    public void consultarUsuarios(DefaultTableModel modeloTabla, JTable tabla, String busqueda){
       
        String sql;

        sql = "SELECT cedula_op, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Operadores WHERE cedula_op = '" + busqueda + "' UNION "
                + "SELECT cedula_ge, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, fecha_nacimiento, "
                + "email, telefono, celular, estado FROM Gerentes WHERE cedula_ge = '" + busqueda + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[10];
            
            while(consulta.next()){
                
                for (int i = 0; i < 10; i++) {
                    
                    fila[i] = consulta.getObject(i + 1);
                }
                
                modeloTabla.addRow(fila);
            }
            
            tabla.updateUI();
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
    }
}