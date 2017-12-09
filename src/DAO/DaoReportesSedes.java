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
public class DaoReportesSedes {

    Conexiones conexion;
    
    public DaoReportesSedes(){
            
        conexion = Main.conexion;
    }
    
    public void consultarSede(DefaultTableModel modeloTabla, JTable tabla, String busqueda) {
        
        String sql;

        sql = "SELECT nombre_sede, ciudad, calle, carrera, barrio, telefono FROM Sedes WHERE id_sede = '" + busqueda + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            Object fila[] = new Object[6];

            while (consulta.next()) {

                for (int i = 0; i < 6; i++) {

                    fila[i] = consulta.getObject(i + 1);
                }

                modeloTabla.addRow(fila);
            }

            tabla.updateUI();
        } catch (SQLException e) {

            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    
    }

    public void consultarSedes(DefaultTableModel modeloTabla, JTable tabla) {
        
        String sql;

        sql = "SELECT nombre_sede, ciudad, calle, carrera, barrio, telefono FROM Sedes;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[6];
            
            while(consulta.next()){
                
                for (int i = 0; i < 6; i++) {
                    
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
