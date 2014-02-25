/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.controladores;

import sisup.ui.UIDashboard;

/**
 *
 * @author Liz
 */
public class Login {
    
    public boolean ValidarDatosLogin(String usuario,String clave){
        boolean autenticacion = true;
        // TODO: Código para la autenticación del usuario
        return autenticacion;
    }
    
    public void MostrarDashboard(){
        UIDashboard uidashboard = new UIDashboard();
        uidashboard.setVisible(true);
    }
    
    
}
