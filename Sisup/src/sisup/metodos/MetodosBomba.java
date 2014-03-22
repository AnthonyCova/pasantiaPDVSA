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
        bombas = sisup.baseDatos.Consultas.obtenerBombas(senal);
        return bombas;

    }
}
