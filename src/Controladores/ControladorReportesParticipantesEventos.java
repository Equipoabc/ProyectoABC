package Controladores;
import javax.swing.table.DefaultTableModel;
import DAO.*;
import javax.swing.JTable;

public class ControladorReportesParticipantesEventos {
    
    DaoReportesParticipantesEventos daoReportesParticipantes;
    
    public ControladorReportesParticipantesEventos(){
        
        daoReportesParticipantes = new DaoReportesParticipantesEventos();
    }
    
    public void generarReporteParticipantes(String nombre){
        daoReportesParticipantes.guardarReporteParticipantes(nombre);
    }
    
    public void consultarParticipantes(DefaultTableModel modeloTabla, JTable tabla) {
        
        daoReportesParticipantes.consultarParticipantes(modeloTabla, tabla);
    }
    
    public void consultarParticipante(DefaultTableModel modeloTabla, JTable tabla, String busqueda) {
        
        daoReportesParticipantes.consultarParticipante(modeloTabla, tabla, busqueda);
    }
    
}
