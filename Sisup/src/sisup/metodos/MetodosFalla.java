/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.metodos;

/**
 *
 * @author Tony C
 */
public class MetodosFalla {
    
    
   public java.util.ArrayList<sisup.clases.Falla>  getFallas(String fechaInicio, String fechaFin){
        java.util.ArrayList<sisup.clases.Falla> fallas;
        fallas = sisup.baseDatos.Consultas.consultarFallas(fechaInicio, fechaFin);
        return fallas;
    }
   
   
    public int setFalla(sisup.clases.Falla falla){
        int idFalla = sisup.baseDatos.Consultas.insertarFalla(falla.getIdBomba(), falla.getFechaInicioString(), falla.getEstatus());
        return idFalla;
    }
     
    public int setReporteFalla(sisup.clases.Falla falla){
        int resultado = sisup.baseDatos.Consultas.completarReporteFalla(falla.getId(), falla.getIdMantenimiento(), falla.getIdUsuario(), falla.getObservacion(), falla.getEstatus());
        return resultado;
    }
    
    public int setCerrarFalla(sisup.clases.Falla falla){
        int resultado = sisup.baseDatos.Consultas.cerrarFalla(falla.getId(), falla.getFechaFinalString(), falla.getEstatus());
        return resultado;
    }
    
    public java.util.ArrayList<sisup.clases.Falla> obtenerUltimasFallas(String cantidadBombas){
        java.util.ArrayList<sisup.clases.Falla> fallas;
        fallas = sisup.baseDatos.Consultas.consultarUltimasFallas(cantidadBombas);
        return fallas;
    }
    
    public java.util.ArrayList<sisup.clases.Falla> obtenerFallasPorFecha(String desde, String hasta){
        java.util.ArrayList<sisup.clases.Falla> fallas;
        fallas = sisup.baseDatos.Consultas.consultarFallasPorFecha(desde, hasta);
        return fallas;
    }
}
