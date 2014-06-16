/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.metodos;

/**
 *
 * @author Tony C
 */
public class MetodosBomba {
    
    public  int setBomba(sisup.clases.Bomba bomba){
        int resultado = sisup.baseDatos.Consultas.insertarBomba(bomba.getTag(), bomba.getDescripcionTag(), bomba.getEstatus(), bomba.getHoraArranque(), bomba.getSenal());
        return resultado;

    }
    
    public int actualizarBomba(sisup.clases.Bomba bomba){
        int resultado = sisup.baseDatos.Consultas.actualizarBomba(bomba.getTag(), bomba.getDescripcionTag(), bomba.getEstatus(), bomba.getHoraArranque(),bomba.getId());
        return resultado;
    }
    
    public java.util.ArrayList<sisup.clases.Bomba>  getBombasParada(String senal){
        java.util.ArrayList<sisup.clases.Bomba> bombas;
        bombas = sisup.baseDatos.Consultas.obtenerBombasParada(senal);
        return bombas;
    }
    
    public java.util.ArrayList<sisup.clases.Bomba>  getBombas(){
        java.util.ArrayList<sisup.clases.Bomba> bombas;
        bombas = sisup.baseDatos.Consultas.obtenerBombas();
        return bombas;
    }
}
