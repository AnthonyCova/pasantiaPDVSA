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
        try {
            java.sql.ResultSet resultSet;
            resultSet = sisup.baseDatos.Consultas.consultarFallas(fechaInicio, fechaFin);
            while(resultSet.next()){
                sisup.clases.Falla falla =new sisup.clases.Falla();
                falla.setIdBomba("idbomba");
                falla.setBomba("bomba");
                falla.setIdMantenimiento(resultSet.getString("idmantenimiento"));
                falla.setMantenimiento("mantenimiento");
                falla.setIdUsuario("idusuario");
                falla.setUsuario("usuario");
                falla.setFechaInicio("inicio");
                falla.setFechaFinal("fin");
                falla.setObservacion("observacion");
                falla.setEstatus(resultSet.getString("estatus"));
                falla.setId(resultSet.getString("idfalla"));
                fallas.add(falla);
            }
            return fallas;
        } catch (SQLException ex) {
            Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return fallas;
        }
    }
   
   
     public static int setFalla(sisup.clases.Falla falla){
        int resultado = sisup.baseDatos.Consultas.insertarFalla(falla.getIdBomba(), falla.getIdMantenimiento(), falla.getIdUsuario(), falla.getFechaInicio(), falla.getFechaFinal(), falla.getObservacion(), falla.getEstatus());
        return resultado;

    }
}
