/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.ui;

import java.util.ArrayList;
import sisup.clases.Usuario;
import sisup.metodos.MetodosUsuarios;

/**
 *
 * @author Tony C
 */
public class Test {
      public static void main(String args[]) {
          try{
          MetodosUsuarios metodosUsuarios = new MetodosUsuarios();
          Usuario usuario = new Usuario();
          usuario.setNombre("Anthony55");
          usuario.setLogin("contrasena");
          usuario.setEstatus("1");
          usuario.setRol("1");
          usuario.setId("1");
    //      int resul= metodosUsuarios.setUsuario(usuario);
    //      System.out.println("Resultado: "+resul);
          ArrayList<Usuario> usuarios = new ArrayList<>();
          usuarios = metodosUsuarios.getUsuarios();
          System.out.println("Resultado: usuarios."+usuarios.size());
          System.out.println("Resultado: usuario getNombre"+usuarios.get(0).getNombre());
          }catch(Exception err){
            System.out.println("Error " + err.getMessage());
          }
                  
                  
      }
}
 