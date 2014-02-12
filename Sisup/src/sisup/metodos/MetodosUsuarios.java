/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.metodos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tony C
 */
public class MetodosUsuarios {
    
     public int setUsuario(sisup.clases.Usuario usuario){
        int resultado=-1;
        try {
            resultado = sisup.baseDatos.Consultas.insertarUsuario(usuario.getNombre(), usuario.getContrasena(), usuario.getRol(), usuario.getEstatus());
            return resultado;
        } catch (Exception ex) {
            Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return resultado;
        }
    }
     
   public int actualizarUsuario(sisup.clases.Usuario usuario){
        int resultado = sisup.baseDatos.Consultas.actualizarUsuario(usuario.getNombre(), usuario.getContrasena(), usuario.getRol(), usuario.getEstatus(),usuario.getId());
        return resultado;

    }
    
    public java.util.ArrayList<sisup.clases.Usuario>  getUsuarios(String senal){
        java.util.ArrayList<sisup.clases.Usuario> usuarios = new java.util.ArrayList<>();
        try {
            java.sql.ResultSet resultSet;
            resultSet = sisup.baseDatos.Consultas.obtenerUsuarios();
            while(resultSet.next()){
                sisup.clases.Usuario usuario =new sisup.clases.Usuario();
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setContrasena(resultSet.getString("contrasena"));
                usuario.setId(resultSet.getString("idusuario"));
                usuario.setEstatus(resultSet.getString("estatus"));
                usuario.setRol(resultSet.getString("rol"));
                usuarios.add(usuario);
            }
            return usuarios;
        } catch (SQLException ex) {
            Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return usuarios;
        }
    }
}
