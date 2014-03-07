/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.controladores;

import sisup.clases.Usuario;
import sisup.metodos.MetodosUsuarios;

/**
 *
 * @author Liz
 */
public class Usuarios {
    MetodosUsuarios metodosUsuarios;
    Usuario usuario;
    
    public int agregarDatosUsuario(int modo){
        metodosUsuarios = new MetodosUsuarios();
        int resultado;
        if (modo == 0)
            resultado = metodosUsuarios.setUsuario(usuario);
        else
            resultado = metodosUsuarios.actualizarUsuario(usuario);
        return resultado;
    }
    
    public void armarUsuario(String nombre, String cedula, String correo, String cargo, String login, String rol, String estatus){
        usuario  = new Usuario();
        usuario.setNombre(nombre);
        usuario.setCedula(cedula);
        usuario.setCedula(correo);
        usuario.setCorreo(cargo);
        usuario.setRol(rol);
        usuario.setId(login);
        usuario.setEstatus(estatus);
    }
    
    public java.util.ArrayList<Usuario> getListaUsuarios(){
        return metodosUsuarios.getUsuarios("senal");
    }
}
