package DAO;
import Logica.Medicamento;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoFormulas_medicas_Medicamentos {
    
    public int insertarFormula(String cedula, String codigo){
        /*
        String sql_guardar, validar;
        int numFilas;
        
        validar = "SELECT codigo_medicamento FROM Medicamentos WHERE codigo_medicamento = '" + medicamento.getCodigo_medicamento() + "';";
        sql_guardar = "INSERT INTO Medicamentos (codigo_medicamento, nombre_medicamento, costo, descripcion) VALUES ('" 
                + medicamento.getCodigo_medicamento() + "', '" +
                medicamento.getNombre_medicamento() +  "', " + medicamento.getCosto() +  ", '" +
                medicamento.getDescripcion()  +  "')" ;
        
        try {
            
            Connection conn= conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);
            
            while(consulta.next()){
                
                validar = consulta.getString(1);
            }
            
            if(validar.equals(medicamento.getCodigo_medicamento())){
                
                return 2;
            }            
            else {                
                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }
        } catch(SQLException e){
            
            System.out.println("SQL error: " + e);
        } catch(Exception e){
            
            System.out.println("Error" + e);
        }
        */
        return -1;
    }   
}
