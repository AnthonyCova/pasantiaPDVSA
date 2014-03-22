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
public class MetodosFalla {
    
    
   public java.util.ArrayList<sisup.clases.Falla>  getFallas(String fechaInicio, String fechaFin){
        java.util.ArrayList<sisup.clases.Falla> fallas = new java.util.ArrayList<>();
        fallas = sisup.baseDatos.Consultas.consultarFallas(fechaInicio, fechaFin);
        return fallas;
    }
   
   
     public static int setFalla(sisup.clases.Falla falla){
        int resultado = sisup.baseDatos.Consultas.insertarFalla(falla.getIdBomba(), falla.getIdMantenimiento(), falla.getIdUsuario(), falla.getFechaInicio(), falla.getFechaFinal(), falla.getObservacion(), falla.getEstatus());
        return resultado;

    }
}
