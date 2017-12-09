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
public class ControladorReportesParticipantes {

    DaoReportesParticipantes daoReportesParticipantes;

    public ControladorReportesParticipantes(){
        
        daoReportesParticipantes = new DaoReportesParticipantes();
    } 
    
    public void consultarParticipantes(DefaultTableModel modeloTabla, JTable tabla) {
       
        daoReportesParticipantes.consultarParticipantes(modeloTabla, tabla);
    }

    public void consultarParticipante(DefaultTableModel modeloTabla, JTable tabla, String busqueda) {
       
        daoReportesParticipantes.consultarParticipante(modeloTabla, tabla, busqueda);
    }
    
}
