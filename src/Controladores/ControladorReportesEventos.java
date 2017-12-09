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
public class ControladorReportesEventos {

    DaoReportesEventos daoReportesEventos;

    public ControladorReportesEventos(){
        
        daoReportesEventos = new DaoReportesEventos();
    }     
    
    public void consultarEventos(DefaultTableModel modeloTabla, JTable tabla) {
        
        daoReportesEventos.consultarEventos(modeloTabla, tabla);
    }

    public void consultarEvento(DefaultTableModel modeloTabla, JTable tabla, String busqueda) {
        
        daoReportesEventos.consultarEvento(modeloTabla, tabla, busqueda);
    }
}
