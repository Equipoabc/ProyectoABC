package DAO;

import java.sql.*;
import Logica.*;
import Conexion.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DaoEvento {
    
    Conexiones conexion;
    
    public DaoEvento(){
        
        conexion = Main.conexion;
    }
    public ArrayList<String> llenarCombo(){
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT id_evento, nombre_evento FROM eventos;";
        try {
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                lista.add(consulta.getString(1)+" "+consulta.getString(2));
            }
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return lista;
    }
    public ArrayList<String> sacarEventos(){
        
        ArrayList<String> lista = new ArrayList<String>();
        String sql = "SELECT id_evento FROM eventos;";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                lista.add(consulta.getString(1));
            }
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return lista;
    }
    public int guardarEvento(Evento evento) {
        
        String sql_guardar, validar;
        validar = "SELECT id_evento FROM Eventos WHERE id_evento = '" + evento.getId_evento() + "';";
        int numFilas;
        
        sql_guardar = "INSERT INTO Eventos (id_evento, nombre_evento, fecha, precio, lugar, "
                + "duracion, tema, cupos, cedula_ge) " + "VALUES ('" + evento.getId_evento() + "', '" +
                evento.getNombre_evento() +  "', '" + evento.getFecha() +  "', " +
                evento.getPrecio() +  ", '" + evento.getLugar() +  "', '" + evento.getDuracion() +
                "', '" +  evento.getTema() +  "', " + evento.getCupos() +  ", '" + evento.getCedula_ge() +
                "')" ;
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(evento.getId_evento())){
                
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
    
    public Evento consultarDatosEvento(String id_evento) {
        String sql, validar;
        Evento evento = new Evento();
        
        validar = "SELECT id_evento FROM eventos WHERE id_evento = '" + id_evento + "';";
        sql = "SELECT nombre_evento, fecha, precio, lugar, duracion, tema, cupos, cedula_ge "
                + "FROM Eventos WHERE id_evento = '" + id_evento + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            if (!validar.equals(id_evento)) {
                
                return null;
            }
            else {
                
                ResultSet consulta2 = sentencia.executeQuery(sql);
                
                while (consulta2.next()) {
                    
                    evento.setNombre_evento(consulta2.getString(1));
                    evento.setFecha(consulta2.getString(2));
                    evento.setPrecio(consulta2.getString(3));
                    evento.setLugar(consulta2.getString(4));
                    evento.setDuracion(consulta2.getString(5));
                    evento.setTema(consulta2.getString(6));
                    evento.setCupos(consulta2.getString(7));
                    evento.setCedula_ge(consulta2.getString(8));
                    
                }
                evento.setId_evento(validar);
                
                return evento;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        return null;
    }
    
    
    public int eliminarEvento(String id_evento) {
        
        String sql;
        sql = "DELETE FROM eventos WHERE id_evento = '" + id_evento + "';";
        
        try {
            int numFilas;
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            numFilas = sentencia.executeUpdate(sql);
            return numFilas;
        }
        catch (SQLException e) {
            System.out.println("SQL error: " + e);
        }
        catch (Exception e) {
            System.out.println("Error" + e);
        }
        return -1;
    }
    
    public int actualizarEvento(String codigoConsulta,String nombreS, String precioS, String cuposS,
            String duracion, String lugarS, String temaS, String fechaS) {
        
        String sql_guardar, validar;
        validar = "SELECT id_evento FROM Eventos WHERE id_evento = '" + codigoConsulta + "';";
        sql_guardar = "UPDATE Eventos SET nombre_evento = '"
                + nombreS + "', precio = '" + precioS + "', lugar = '"
                + lugarS + "', duracion = '" + duracion + "', tema = '"
                + temaS + "', cupos = '" + cuposS + "', fecha = '"
                + fechaS + "' WHERE id_evento = '" + codigoConsulta + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while (consulta.next()) {
                
                validar = consulta.getString(1);
            }
            
            int numFilas = sentencia.executeUpdate(sql_guardar);
            return numFilas;
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        
        return -1;
    }
    public void actualizarCupos(String codEvento, String cupos){
        String sql;
        sql  = "UPDATE Eventos SET cupos = '" + cupos + "' WHERE id_evento = '" + codEvento + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql);
            
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
        
    }
    public int comprobar(String id){
        
        String sql;
        sql = "SELECT id_evento FROM Eventos WHERE id_evento = '" + id + "';";
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            
            if(sql.equals(id)){
                
                return 1;
            }
            return 0;
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        return 0;
    }
    
    public void eliminarpreInscripciones(String codigoEvento){
        
        String sql;
        sql = "DELETE FROM participantes_eventos WHERE  estado_pago = 'Invalido' AND id_evento = '" +
                codigoEvento + "';";
        
        try {
            
            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql);
            
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {
            
            System.out.println("Error" + e);
        }
    }
    
    public boolean consultarFecha(String codigoEvento){
        
        String sql = "SELECT fecha FROM Eventos WHERE id_evento = '" + codigoEvento + "';";
        LocalDate fechaActual = LocalDate.now();
        
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            String fecha = sql.replace("-","/") ;
            
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate fechaEvento = LocalDate.parse(fecha, fmt);
            Period periodo = Period.between(fechaActual, fechaEvento);
            if((periodo.getDays() <= 2) && (periodo.getMonths() == 0) && (periodo.getYears() == 0)){
                return true;
            }
            else
                return false;
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        return false;
    }
    
    public void liberarCupos(){
        
        int numeroEventos = 0;
        String sql = "SELECT COUNT(*) FROM Eventos;";
        try {
            
            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);
            
            
            while(consulta.next()){
                
                sql = consulta.getString(1);
            }
            numeroEventos = Integer.parseInt(sql);
            
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error: " + e);
        }
        
        ArrayList<String> lista = new ArrayList<String>();
        lista = sacarEventos();
        
        for(int i = 0; i < numeroEventos ; i++)
        {
            if(consultarFecha(lista.get(i))){
                eliminarpreInscripciones(lista.get(i));
            }
        }
    }
    
}