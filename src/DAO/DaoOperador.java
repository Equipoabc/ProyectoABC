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

/**
 *
 * @author Luis
 */

public class DaoOperador {
    
    Conexiones conexion;
    
    public DaoOperador(){
        
        conexion = new Conexiones();
    }
    
    public Operador loginOperador(String user){
        
        String sql;
        Operador operador = new Operador();
        
        sql = "SELECT cedula_op, contrasena FROM Operadores WHERE cedula_op = '" + user + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                operador.setCedula_op(consulta.getString(1));
                operador.setContrasena(consulta.getString(2));
            }
            
            return operador;
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error: " + e);
        }
        
        return null;
    }

    public int guardarOperador(Operador op){
        
        String sql_guardar, validar;
        int numFilas;
        
        validar = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + op.getCedula_op() + "';";        
        sql_guardar = "INSERT INTO Operadores (cedula_op, primer_nombre, segundo_nombre, " + 
            "primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, " + 
            "contrasena, pregunta, respuesta) VALUES ('" + op.getCedula_op() + "', '" +
            op.getPrimer_nombre() +  "', '" + op.getSegundo_nombre() +  "', '" +
            op.getPrimer_apellido() +  "', '" + op.getSegundo_apellido() + "', '" + 
            op.getFecha_nacimiento() + "', '" + op.getEmail() +  "', '" + 
            op.getTelefono() +  "', '" + op.getCelular() +  "', '" +        
            "Activo" +  "', '" + op.getContrasena() +  "', '" +
            op.getPregunta() +  "', '" + op.getRespuesta() +  "')" ;
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
            
                validar = consulta.getString(1);
            }
            
            if(validar.equals(op.getCedula_op())){
                
                return 2;
            }
            
            else {
            
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            e.printStackTrace();
            System.out.println("SQL error: " + e); 
        } catch(Exception e){ 
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }
    
    public int consultarDatosOperador(String cedula, JComboBox<String> tipoUsuario, JTextField primerNom, JTextField segundoNom, JTextField primerAp, 
            JTextField segundoAp, JTextField ced, JDateChooser fecha, JTextField correo, JTextField tel, JTextField cel, JComboBox<String> estado) {
        
        String sql, validar;
        
        validar = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + cedula + "';";
        sql = "SELECT primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, cedula_op, fecha_nacimiento, email, telefono, "
                + "celular, estado FROM Operadores WHERE cedula_op = '" + cedula + "';";
        
        
        
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
            
                    tipoUsuario.setSelectedIndex(0);
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
                
                return 1;
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