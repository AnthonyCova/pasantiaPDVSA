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
        try {
            java.sql.ResultSet resultSet;
            resultSet = sisup.baseDatos.Consultas.obtenerMantenimientos();
            while(resultSet.next()){
                sisup.clases.Mantenimiento mantenimiento =new sisup.clases.Mantenimiento();
                mantenimiento.setDescripcion(resultSet.getString("descripcion"));
                mantenimiento.setEstatus(resultSet.getString("estatus"));
                mantenimiento.setId(resultSet.getString("idmantenimiento"));
                mantenimientos.add(mantenimiento);
            }
            return mantenimientos;
        } catch (SQLException ex) {
            Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return mantenimientos;
        }
    }
}
