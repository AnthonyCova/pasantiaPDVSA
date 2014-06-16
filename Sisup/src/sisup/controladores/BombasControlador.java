/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.controladores;

import java.util.ArrayList;
import java.util.Calendar;
import sisup.clases.Bomba;
import sisup.metodos.MetodosBomba;

/**
 *
 * @author Liz
 */
public class BombasControlador {
    MetodosBomba metodosBomba;
    ArrayList<Bomba> listaBombas;
    
    public BombasControlador(){
        metodosBomba = new MetodosBomba();
    }
    
    public int agregarDatosBomba(boolean modoEditar, Bomba bomba){
        int resultado;
        if (modoEditar)
            resultado = metodosBomba.actualizarBomba(bomba);
        else
            resultado = metodosBomba.setBomba(bomba);
        return resultado;
    }
    
    public Bomba armarBomba(String id, String tag, String descripcion, String estatus){
        Bomba bomba  = new Bomba();
        bomba.setId(id);
        bomba.setTag(tag);
        bomba.setDescripcionTag(descripcion);
        bomba.setEstatus(estatus);
        java.sql.Date sDate = new java.sql.Date(Calendar.getInstance().getTime().getTime());
        bomba.setHoraArranque(sDate.toString());
        bomba.setSenal("0");
        return bomba;
    }
    
    public Object[][] getListaBombas(){
        listaBombas = metodosBomba.getBombas();
        Object[][] data = new Object[listaBombas.size()][3];
        int i = 0;
        for (Bomba bomba : listaBombas){
            data[i][0] = bomba.getTag();
            data[i][1] = bomba.getEstatus();
            data[i][2] = "d";
            i++;
        }
        return data;
    }
    
    public Bomba getBombaEditar(int posicion){
        return listaBombas.get(posicion);
    }
}
