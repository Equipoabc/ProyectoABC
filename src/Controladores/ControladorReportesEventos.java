package Controladores;
import javax.swing.table.DefaultTableModel;
import DAO.*;
import javax.swing.JTable;

public class ControladorReportesEventos {
    
    DaoReportesEventos daoReportesEventos;
    
    public ControladorReportesEventos(){
        
        daoReportesEventos = new DaoReportesEventos();
    }
    
    public void consultarEventos(DefaultTableModel modeloTabla, JTable tabla) {
        
        daoReportesEventos.consultarEventos(modeloTabla, tabla);
    }
    
    public void generarReporteEventos(String nombre){
        daoReportesEventos.guardarReporteEventos(nombre);
    }
    
    public void consultarEvento(DefaultTableModel modeloTabla, JTable tabla, String busqueda) {
        
        daoReportesEventos.consultarEvento(modeloTabla, tabla, busqueda);
    }
}
