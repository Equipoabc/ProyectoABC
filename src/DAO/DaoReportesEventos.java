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
public class DaoReportesEventos {

    Conexiones conexion;

    public DaoReportesEventos() {

        conexion = Main.conexion;
    }
    
    public void consultarEventos(DefaultTableModel modeloTabla, JTable tabla) {
        
       String sql;

        sql = "SELECT nombre_evento, fecha, precio, lugar, duracion, tema, cupos FROM Eventos;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[7];
            
            while(consulta.next()){
                
                for (int i = 0; i < 7; i++) {
                    
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

    public void consultarEvento(DefaultTableModel modeloTabla, JTable tabla, String busqueda) {
        
        String sql;

        sql = "SELECT nombre_evento, fecha, precio, lugar, duracion, tema, cupos FROM Eventos WHERE id_evento = '" + busqueda + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            Object fila[] = new Object[7];

            while (consulta.next()) {

                for (int i = 0; i < 7; i++) {

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
    
}
