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
public class Login {
    
    MetodosUsuarios metodosUsuarios;
    Usuario usuario;
    
    public Login(){
        metodosUsuarios = new MetodosUsuarios();
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
    public boolean ConsultarDatosLogin(String usuario,String clave){
        boolean autenticacion = false;
        // TODO: Código para la autenticación del usuario
        this.usuario = metodosUsuarios.getAcceso(usuario, clave);
        System.out.println(this.usuario.getId());
        if (this.usuario != null && this.usuario.getId() != null)
            autenticacion = true;
        return autenticacion;
    }
    
}
