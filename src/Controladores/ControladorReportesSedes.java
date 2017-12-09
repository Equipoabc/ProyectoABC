/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;
import javax.swing.table.DefaultTableModel;
import DAO.*;
import javax.swing.JTable;

/**
 *
 * @author Iván
 */
public class ControladorReportesSedes {
    
    DaoReportesSedes daoReportesSedes;

    public ControladorReportesSedes(){
        
        daoReportesSedes = new DaoReportesSedes();
    }    
    
    public void consultarSedes(DefaultTableModel modeloTabla, JTable tabla) {
        
        daoReportesSedes.consultarSedes(modeloTabla, tabla);
    }
    
    public void generarReporteSedes(String nombre){
     daoReportesSedes.guardarReporteSedes(nombre);
    }

    public void consultarSede(DefaultTableModel modeloTabla, JTable tabla, String busqueda) {
        
        daoReportesSedes.consultarSede(modeloTabla, tabla, busqueda);
    }
}
