/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Iván
 */
public class Medico {
    
    private String id_empleado;
    private int numero_licencia;
    private String especialidad;
    private String universidad;
    
    public Medico(){
        
        id_empleado = "";
        numero_licencia = 0;
        especialidad = "";
        universidad = "";    
    }

    /**
     * @return the id_empleado
     */
    public String getId_empleado() {
        return id_empleado;
    }

    /**
     * @param id_empleado the id_empleado to set
     */
    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    /**
     * @return the numero_licencia
     */
    public int getNumero_licencia() {
        return numero_licencia;
    }

    /**
     * @param numero_licencia the numero_licencia to set
     */
    public void setNumero_licencia(int numero_licencia) {
        this.numero_licencia = numero_licencia;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the universidad
     */
    public String getUniversidad() {
        return universidad;
    }

    /**
     * @param universidad the universidad to set
     */
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}
