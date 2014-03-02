/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.metodos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sisup.clases.Usuario;

/**
 *
 * @author Tony C
 */
public class MetodosUsuarios {

    public sisup.clases.Usuario getAcceso(String login, String contrasena) {
        sisup.clases.Usuario usuario = new Usuario();

        try {
            if (sisup.utilidades.LDAP.autenticacionLDAP(login, contrasena)) {
                java.sql.ResultSet resultSet;
                resultSet = sisup.baseDatos.Consultas.acceso(login);
                while (resultSet.next()) {
                    usuario.setNombre(resultSet.getString("nombre"));
                    usuario.setLogin(resultSet.getString("login"));
                    usuario.setId(resultSet.getString("idusuario"));
                    usuario.setEstatus(resultSet.getString("estatus"));
                    usuario.setRol(resultSet.getString("rol"));
                    usuario.setCargo(resultSet.getString("cargo"));
                    usuario.setCedula(resultSet.getString("cedula"));
                    usuario.setCorreo(resultSet.getString("correo"));
                }
            }
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return usuario;
        }

    }

    public int setUsuario(sisup.clases.Usuario usuario) {
        int resultado = -1;
        try {
            resultado = sisup.baseDatos.Consultas.insertarUsuario(usuario.getNombre(), usuario.getLogin(), usuario.getRol(), usuario.getEstatus(), usuario.getCedula(), usuario.getCargo(), usuario.getCorreo());
            return resultado;
        } catch (Exception ex) {
            Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return resultado;
        }
    }

    public int actualizarUsuario(sisup.clases.Usuario usuario) {
        int resultado = sisup.baseDatos.Consultas.actualizarUsuario(usuario.getNombre(), usuario.getLogin(), usuario.getRol(), usuario.getEstatus(), usuario.getId(), usuario.getCedula(), usuario.getCargo(), usuario.getCorreo());
        return resultado;

    }

    public java.util.ArrayList<sisup.clases.Usuario> getUsuarios(String senal) {
        java.util.ArrayList<sisup.clases.Usuario> usuarios = new java.util.ArrayList<>();
        try {
            java.sql.ResultSet resultSet;
            resultSet = sisup.baseDatos.Consultas.obtenerUsuarios();
            while (resultSet.next()) {
                sisup.clases.Usuario usuario = new sisup.clases.Usuario();
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setLogin(resultSet.getString("login"));
                usuario.setId(resultSet.getString("idusuario"));
                usuario.setEstatus(resultSet.getString("estatus"));
                usuario.setRol(resultSet.getString("rol"));
                usuario.setCargo(resultSet.getString("cargo"));
                usuario.setCedula(resultSet.getString("cedula"));
                usuario.setCorreo(resultSet.getString("correo"));
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (SQLException ex) {
            Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return usuarios;
        }
    }
}
