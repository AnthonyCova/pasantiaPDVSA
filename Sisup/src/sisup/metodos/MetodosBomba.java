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
public class MetodosBomba {
    
    
    public  int setBomba(sisup.clases.Bomba bomba){
        int resultado = sisup.baseDatos.Consultas.insertarBomba(bomba.getTag(), bomba.getDescripcioTag(), bomba.getEstatus(), bomba.getHoraArranque());
        return resultado;

    }
    
    public int actualizarBomba(sisup.clases.Bomba bomba){
        int resultado = sisup.baseDatos.Consultas.actualizarBomba(bomba.getTag(), bomba.getDescripcioTag(), bomba.getEstatus(), bomba.getHoraArranque(),bomba.getId());
        return resultado;

    }
    
    public java.util.ArrayList<sisup.clases.Bomba>  getBombas(String senal){
        java.util.ArrayList<sisup.clases.Bomba> bombas = new java.util.ArrayList<>();
        try {
            java.sql.ResultSet resultSet;
            resultSet = sisup.baseDatos.Consultas.obtenerBombas(senal);
            while(resultSet.next()){
                sisup.clases.Bomba bomba =new sisup.clases.Bomba();
                bomba.setTag(resultSet.getString("tag"));
                bomba.setDescripcioTag(resultSet.getString("descripcionTag"));
                bomba.setId(resultSet.getString("idbomba"));
                bomba.setEstatus(resultSet.getString("estatus"));
                bomba.setHoraArranque(resultSet.getString("horaArranque"));
                bomba.setSenal(resultSet.getString("senal"));
                bombas.add(bomba);
            }
            return bombas;
        } catch (SQLException ex) {
            Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return bombas;
        }
    }
}
