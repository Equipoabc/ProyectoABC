/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import Logica.*;
import Conexion.*;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class DaoGerente {
   
    Conexiones conexion;
    
    public DaoGerente(){
        
        conexion = new Conexiones();
    }
    
    public Gerente loginGerente(String user){
        
        String sql;
        Gerente gerente = new Gerente();

        sql = "SELECT cedula_ge, contrasena FROM Gerentes WHERE cedula_ge = '" + user + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                gerente.setCedula_ge(consulta.getString(1));
                gerente.setContrasena(consulta.getString(2));
            }
            
            return gerente;
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return null;
    }
    
    public int guardarGerente(Gerente ge){
        
        String sql_guardar, validar;
        int numFilas;      
     
        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + ge.getCedula_ge() + "';";
        sql_guardar = "INSERT INTO Gerentes (cedula_ge, primer_nombre, segundo_nombre, " + 
                "primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, " + 
                "contrasena, pregunta, respuesta) VALUES ('" + ge.getCedula_ge() + "', '" +
                ge.getPrimer_nombre() +  "', '" + ge.getSegundo_nombre() +  "', '" +
                ge.getPrimer_apellido() +  "', '" + ge.getSegundo_apellido() + "', '" + 
                ge.getFecha_nacimiento() + "', '" + ge.getEmail() +  "', '" + 
                ge.getTelefono() +  "', '" + ge.getCelular() +  "', '" +        
                "Activo" +  "', '" + ge.getContrasena() +  "', '" +
                ge.getPregunta() +  "', '" + ge.getRespuesta() +  "')" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(validar.equals(ge.getCedula_ge())){
                
                return 2;
            }
            
            else {
            
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return -1;  
    }
    
        public int consultarDatosGerente(String cedula, JComboBox<String> tipoUsuario, JTextField primerNom, JTextField segundoNom, JTextField primerAp, 
            JTextField segundoAp, JTextField ced, JDateChooser fecha, JTextField correo, JTextField tel, JTextField cel, JComboBox<String> estado) {
        
        String sql, validar;
        
        
        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedula + "';";
        sql = "SELECT primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, cedula_ge, fecha_nacimiento, email, telefono, "
                + "celular, estado FROM Gerentes WHERE cedula_ge = '" + cedula + "';";
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(!validar.equals(cedula)){
                
                return -1;
            }
            
            else {
            
                ResultSet consulta2 = sentencia.executeQuery(sql);
                DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
                
                while(consulta2.next()){
            
                    tipoUsuario.setSelectedIndex(1);
                    primerNom.setText(consulta2.getString(1));
                    segundoNom.setText(consulta2.getString(2));
                    primerAp.setText(consulta2.getString(3));
                    segundoAp.setText(consulta2.getString(4));
                    ced.setText(consulta2.getString(5));
                    // fecha.setDate(format.parse(consulta2.getString(6))); Validar esta vaina. :'v
                    correo.setText(consulta2.getString(7));
                    tel.setText(consulta2.getString(8));
                    cel.setText(consulta2.getString(9));
                       
                    if(consulta2.getString(10).equals("Activo")){
                        
                        estado.setSelectedIndex(0);
                    }
                    else {
                        
                       estado.setSelectedIndex(1); 
                    }
                }
                
                return 2;
            }
        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }

}