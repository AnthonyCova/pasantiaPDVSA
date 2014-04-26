/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.controladores;

import java.util.ArrayList;
import sisup.clases.Usuario;
import sisup.metodos.MetodosUsuarios;

/**
 *
 * @author Liz
 */
public class UsuariosControlador {
    MetodosUsuarios metodosUsuarios;
    ArrayList<Usuario> listaUsuarios;
    
    public UsuariosControlador(){
        metodosUsuarios = new MetodosUsuarios();
    }
    
    public int agregarDatosUsuario(boolean modoEditar, Usuario usuario){
        int resultado;
        if (modoEditar)
            resultado = metodosUsuarios.actualizarUsuario(usuario);
        else
            resultado = metodosUsuarios.setUsuario(usuario);
        return resultado;
    }
    
    public Usuario armarUsuario(String id,String nombre, String cedula, String correo, String cargo, String login, String rol, String estatus){
        Usuario usuario  = new Usuario();
        usuario.setId(id);
        usuario.setNombre(nombre);
        usuario.setCedula(cedula);
        usuario.setCorreo(correo);
        usuario.setCargo(cargo);
        usuario.setRol(rol);
        usuario.setLogin(login);
        usuario.setEstatus(estatus);
        return usuario;
    }
    
    public Object[][] getListaUsuarios(){
        listaUsuarios = metodosUsuarios.getUsuarios();
        Object[][] data = new Object[listaUsuarios.size()][5];
        int i = 0;
        for (Usuario usuario : listaUsuarios){
            data[i][0] = usuario.getNombre();
            data[i][1] = usuario.getLogin();
            data[i][2] = usuario.getCargo();
            data[i][3] = usuario.getEstatus();
            data[i][4] = "d";
            i++;
        }
        return data;
    }
    
    public Usuario getUsuarioEditar(int posicion){
        return listaUsuarios.get(posicion);
    }
}
