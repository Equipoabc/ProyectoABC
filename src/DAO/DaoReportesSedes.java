package DAO;
import Conexion.*;
import Logica.Main;
import Logica.Reportes;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class DaoReportesSedes {
    
    Conexiones conexion;
    
    public DaoReportesSedes(){
        
        conexion = Main.conexion;
    }
    
    public void guardarReporteSedes(String nombre){
        
        String[] cabecera = new String[6];
        
        cabecera[0]="Nombre Sede";
        cabecera[1]="Ciudad";
        cabecera[2]="Calle";
        cabecera[3]="Carrera";
        cabecera[4]="Barrio";
        cabecera[5]="Telefono";
        
        String sql;
        
        sql = "SELECT nombre_sede, ciudad, calle, carrera, barrio, telefono FROM Sedes;";
        
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
            
            String[][] data= new String[size][6];
            
            int j = 0;
            String aux;
            while(consulta.next()){
                
                for (int i = 0; i < 6; i++) {
                    
                    aux =  consulta.getString(i + 1);
                    data[j][i] = aux;
                }
                
                j++;
            }
            
            Reportes.generarReporte(cabecera, data, nombre);
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
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
