/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Conexion.*;
import Logica.Main;
import Logica.Reportes;
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
    
    public void guardarReporteEventos(String nombre){
        
        
        String[] cabecera = new String[7];
      
        cabecera[0]="Nombre del Evento   ";
        cabecera[1]="Fecha Evento";
        cabecera[2]="Precio";
        cabecera[3]="Lugar     ";
        cabecera[4]="Duracion";
        cabecera[5]="Tema del Evento   ";
        cabecera[6]="Cupos";
        
        String sql;

        sql = "SELECT nombre_evento, fecha, precio, lugar, duracion, tema, cupos FROM Eventos;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement (ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); 
            ResultSet consulta = sentencia.executeQuery(sql);
            
            //Obtener el numero de filas del Resulset
           int size = 0;
           if (consulta.last()) {//make cursor to point to the last row in the ResultSet object
             size = consulta.getRow();
             consulta.beforeFirst(); //make cursor to point to the front of the ResultSet object, just before the first row.
           }
          
            
            String[][] data= new String[size][7];

            int j = 0;
            String aux;
            while(consulta.next()){
                
                for (int i = 0; i < 7; i++) {
                   
                    aux =  consulta.getString(i + 1);
                    data[j][i] = aux;
                }
                
                
                //System.out.println("H   " + Arrays.toString(data[j]));
                j++;
            }
            
        Reportes.generarReporte(cabecera, data, nombre);
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        
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
