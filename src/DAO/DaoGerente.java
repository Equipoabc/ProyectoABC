/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import Logica.*;
import Conexion.*;

public class DaoGerente {

    Conexiones conexion;

    public DaoGerente() {

        conexion = Main.conexion;
    }

    public Gerente loginGerente(String user) {

        String sql;
        Gerente gerente = new Gerente();

        sql = "SELECT cedula_ge, contrasena FROM Gerentes WHERE cedula_ge = '" + user + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            while (consulta.next()) {

                gerente.setCedula_ge(consulta.getString(1));
                gerente.setContrasena(consulta.getString(2));
            }

            return gerente;
        } catch (SQLException e) {

            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

        return null;
    }

    public int guardarGerente(Gerente ge) {

        String sql_guardar, validar;
        int numFilas;

        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + ge.getCedula_ge() + "';";
        sql_guardar = "INSERT INTO Gerentes (cedula_ge, primer_nombre, segundo_nombre, "
                + "primer_apellido, segundo_apellido, fecha_nacimiento, email, telefono, celular, estado, "
                + "contrasena, pregunta, respuesta) VALUES ('" + ge.getCedula_ge() + "', '"
                + ge.getPrimer_nombre() + "', '" + ge.getSegundo_nombre() + "', '"
                + ge.getPrimer_apellido() + "', '" + ge.getSegundo_apellido() + "', '"
                + ge.getFecha_nacimiento() + "', '" + ge.getEmail() + "', '"
                + ge.getTelefono() + "', '" + ge.getCelular() + "', '"
                + "Activo" + "', '" + ge.getContrasena() + "', '"
                + ge.getPregunta() + "', '" + ge.getRespuesta() + "')";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }

            if (validar.equals(ge.getCedula_ge())) {

                return 2;
            } else {

                numFilas = sentencia.executeUpdate(sql_guardar);
                return numFilas;
            }

        } catch (SQLException e) {

            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

        return -1;
    }

    public Gerente consultarDatosGerente(String cedula) {

        String sql, validar;
        Gerente gerente = new Gerente();

        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedula + "';";
        sql = "SELECT primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, cedula_ge, fecha_nacimiento, email, telefono, "
                + "celular, estado FROM Gerentes WHERE cedula_ge = '" + cedula + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }

            if (!validar.equals(cedula)) {

                return null;
            } else {

                ResultSet consulta2 = sentencia.executeQuery(sql);

                while (consulta2.next()) {

                    gerente.setPrimer_nombre(consulta2.getString(1));
                    gerente.setSegundo_nombre(consulta2.getString(2));
                    gerente.setPrimer_apellido(consulta2.getString(3));
                    gerente.setSegundo_apellido(consulta2.getString(4));
                    gerente.setCedula_ge(consulta2.getString(5));
                    gerente.setFecha_nacimiento(consulta2.getString(6));
                    gerente.setEmail(consulta2.getString(7));
                    gerente.setTelefono(consulta2.getString(8));
                    gerente.setCelular(consulta2.getString(9));
                    gerente.setEstado(consulta2.getString(10));

                    /*tipoUsuario.setSelectedIndex(1);
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
                    }*/
                }

                return gerente;
            }
        } catch (SQLException e) {
            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error" + e);
        }

        return null;
    }

    public int actualizarOperador(String cedulaBusqueda, String primerNombre, String segundoNombre,
            String primerApellido, String segundoApellido, String cedula, String telefono, String celular, String email,
            String estado, String tipo) {

        String sql_guardar, validar, validar2;

        validar = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedula + "';";
        validar2 = "SELECT cedula_op FROM Operadores WHERE cedula_op = '" + cedula + "';";
        sql_guardar = "UPDATE Gerentes SET primer_nombre = '" + primerNombre + "', segundo_nombre = '"
                + segundoNombre + "', primer_apellido = '" + primerApellido + "', segundo_apellido = '"
                + segundoApellido + "', cedula_ge = '" + cedula + "', telefono = '"
                + telefono + "', celular = '" + celular + "', email = '" + email + "', estado = '"
                + estado + "' WHERE cedula_ge = '" + cedulaBusqueda + "';";

        try {

            Connection conn = conexion.getConnetion();
            Statement sentencia = conn.createStatement();
            ResultSet consulta = sentencia.executeQuery(validar);

            while (consulta.next()) {

                validar = consulta.getString(1);
            }

            ResultSet consulta2 = sentencia.executeQuery(validar2);

            while (consulta2.next()) {

                validar2 = consulta2.getString(1);
            }

            if (validar.equals(cedula) && !cedula.equals(cedulaBusqueda)) {

                return 2;
            } else if (validar2.equals(cedula)) {

                return 3;
            } else if (!validar2.equals(cedula) && tipo.equals("Operador")) {

                // Crear en gerente y elimar de operador.
                return 4;
            } else {

                sentencia.executeQuery(sql_guardar); // Error extraño.
                return 1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error" + e);
        }

        return -1;
    }

    public int comprobar(String cedula) {

        String sql;
        sql = "SELECT cedula_ge FROM Gerentes WHERE cedula_ge = '" + cedula + "';";

        try {

            Connection con = conexion.getConnetion();
            Statement sentencia = con.createStatement();
            ResultSet consulta = sentencia.executeQuery(sql);

            while (consulta.next()) {

                sql = consulta.getString(1);
            }

            if (sql.equals(cedula)) {

                return 1;
            }
            return 0;

        } catch (SQLException e) {

            System.out.println("SQL error: " + e);
        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

        return 0;
    }

}
