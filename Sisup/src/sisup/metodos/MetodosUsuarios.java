/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.metodos;

import java.util.logging.Level;
import java.util.logging.Logger;
import sisup.clases.Usuario;
import sisup.utilidades.LDAP;

/**
 *
 * @author Tony C
 */
public class MetodosUsuarios {

     public sisup.clases.Usuario getAcceso(String login, String contrasena) {
        Usuario usuario = null;
        //if(LDAP.autenticacionLDAP(login, contrasena))
            usuario = sisup.baseDatos.Consultas.acceso(login);
        return usuario;
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

    public java.util.ArrayList<sisup.clases.Usuario> getUsuarios() {
        java.util.ArrayList<sisup.clases.Usuario> usuarios = new java.util.ArrayList<>();
        usuarios = sisup.baseDatos.Consultas.obtenerUsuarios();
        return usuarios;

    }
}
