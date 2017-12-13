package DAO;
import Conexion.*;
import Logica.Main;
import Logica.Reportes;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class DaoReportesParticipantesEventos {

    Conexiones conexion;

    public DaoReportesParticipantesEventos() {

        conexion = Main.conexion;
    }    
    
    public void guardarReporteParticipantes(String nombre){
        
        String[] cabecera = new String[7];
      
        cabecera[0]="Participante";
        cabecera[1]="Evento";
        cabecera[2]="Estado de Pago";
        
        String sql;

        sql = "SELECT id_participante, id_evento, estado_pago FROM Participantes_Eventos;";
        
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
          
            
            String[][] data= new String[size][3];

            int j = 0;
            String aux;
            while(consulta.next()){
                
                for (int i = 0; i < 3; i++) {
                   
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
           
    public void consultarParticipantes(DefaultTableModel modeloTabla, JTable tabla) {
        
        String sql;

        sql = "SELECT id_participante, id_evento, estado_pago FROM Participantes_Eventos;";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            Object fila[] = new Object[3];
            
            while(consulta.next()){
                
                for (int i = 0; i < 3; i++) {
                    
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

    public void consultarParticipante(DefaultTableModel modeloTabla, JTable tabla, String busqueda) {
        
        String sql;

        sql = "SELECT id_participante, id_evento, estado_pago FROM Participantes_Eventos"
                + " WHERE id_participante = '" + busqueda + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            Object fila[] = new Object[3];

            while (consulta.next()) {

                for (int i = 0; i < 3; i++) {

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
