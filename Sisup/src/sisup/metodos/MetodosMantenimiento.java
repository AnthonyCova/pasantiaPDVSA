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
public class MetodosMantenimiento {
    
    public static int setMantenimiento(sisup.clases.Mantenimiento mantenimiento){
        int resultado = sisup.baseDatos.Consultas.insertarMantenimiento(mantenimiento.getDescripcion(), mantenimiento.getEstatus());
        return resultado;
    }
    
    public int actualizarMantenimiento(sisup.clases.Mantenimiento mantenimiento){
            int resultado  = sisup.baseDatos.Consultas.actualizarMantenimiento(mantenimiento.getDescripcion(), mantenimiento.getEstatus(), mantenimiento.getId());
            return resultado;
    }
    
    public java.util.ArrayList<sisup.clases.Mantenimiento>  getMantenimientos(){
        java.util.ArrayList<sisup.clases.Mantenimiento> mantenimientos = new java.util.ArrayList<>();
        mantenimientos = sisup.baseDatos.Consultas.obtenerMantenimientos();
        return mantenimientos;
    }
}
