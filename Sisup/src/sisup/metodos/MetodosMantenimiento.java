/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.metodos;

/**
 *
 * @author Tony C
 */
public class MetodosMantenimiento {
    
    public int setMantenimiento(sisup.clases.Mantenimiento mantenimiento){
        int resultado = sisup.baseDatos.Consultas.insertarMantenimiento(mantenimiento.getDescripcion(), mantenimiento.getEstatus());
        return resultado;
    }
    
    public int actualizarMantenimiento(sisup.clases.Mantenimiento mantenimiento){
            int resultado  = sisup.baseDatos.Consultas.actualizarMantenimiento(mantenimiento.getDescripcion(), mantenimiento.getEstatus(), mantenimiento.getId());
            return resultado;
    }
    
    public java.util.ArrayList<sisup.clases.Mantenimiento>  getMantenimientos(){
        java.util.ArrayList<sisup.clases.Mantenimiento> mantenimientos;
        mantenimientos = sisup.baseDatos.Consultas.obtenerMantenimientos();
        return mantenimientos;
    }
}
