package Controladores;
import DAO.*;
import Logica.*;
import java.util.ArrayList;

public class ControladorSede {
    
    DaoSede daoSede;
    
    public ControladorSede(){
        
        daoSede = new DaoSede();
    }
    
    public ArrayList<String> llenarCombo() {
        return daoSede.llenarCombo();
    }
    
    public int insertarSede(String nom, String id, String ciu, String tel, String cra, String cl, String bar, String idGerente) {
        Sede sede = new Sede();
        
        sede.setNombre_sede(nom);
        sede.setId_sede(id);
        sede.setCiudad(ciu);
        sede.setTelefono(tel);
        sede.setCarrera(cra);
        sede.setCalle(cl);
        sede.setBarrio(bar);
        sede.setCedula_ge(idGerente);
        
        int result = daoSede.guardarSede(sede);
        return result;
        
        
    }
    
    public Sede consultarDatosSede(String codigoConsultar) {
        
        return daoSede.consultarDatosSede(codigoConsultar);
    }
    
    public int actualizarSede(String codigoConsulta, String nombreS, String ciudadS, String carreraS, String calleS, String barrioS, String telefonoS) {
        return daoSede.actualizarSede(codigoConsulta, nombreS, ciudadS, carreraS, calleS, barrioS, telefonoS);
    }
    
    public int comprobar(String codigoConsulta) {
        return daoSede.comprobar(codigoConsulta);
    }
    
}