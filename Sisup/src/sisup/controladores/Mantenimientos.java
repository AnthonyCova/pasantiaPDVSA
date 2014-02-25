/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.controladores;

import sisup.ui.UIAgregarTipoMantenimiento;
import sisup.ui.UIMantenimientos;

/**
 *
 * @author Liz
 */
public class Mantenimientos {
    //Variables de la vista
    UIAgregarTipoMantenimiento uiAgregarTipoMantenimiento;
    
    public Mantenimientos(){
    }
    
    public UIAgregarTipoMantenimiento MostrarUIAgregarTipoMantenimiento(boolean visible){
        uiAgregarTipoMantenimiento.setVisible(visible);
        return uiAgregarTipoMantenimiento;
    }
    
}
