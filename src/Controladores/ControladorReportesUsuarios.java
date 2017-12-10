package Controladores;
import DAO.*;
import javax.swing.JTable;
import javax.swing.table.*;

public class ControladorReportesUsuarios {
    
    DaoReportesUsuarios daoRegistros;
    
    public ControladorReportesUsuarios(){
        
        daoRegistros = new DaoReportesUsuarios();
    }
    
    public void consultarUsuarios(DefaultTableModel modeloTabla, JTable tabla){
        
        daoRegistros.consultarUsuarios(modeloTabla, tabla);
    }
    
    public void generarReporteUsuarios(String nombre){
        daoRegistros.guardarReporteUsuarios(nombre);
    }
    
    
    public void consultarUsuario(DefaultTableModel modeloTabla, JTable tabla, String busqueda){
        
        daoRegistros.consultarUsuarios(modeloTabla, tabla, busqueda);
    }
}