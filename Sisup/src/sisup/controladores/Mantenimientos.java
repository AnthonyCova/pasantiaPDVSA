/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.controladores;

import java.util.ArrayList;
import sisup.clases.Mantenimiento;
import sisup.metodos.MetodosMantenimiento;

/**
 *
 * @author Liz
 */
public class Mantenimientos {
    //Variables de la vista
    MetodosMantenimiento metodosMantenimiento;
    ArrayList<Mantenimiento> listaMantenimientos;
    
    public Mantenimientos(){
        metodosMantenimiento = new MetodosMantenimiento();
    }
    
    public int agregarDatosMantenimiento(boolean modoEditar, Mantenimiento mantenimiento){
        int resultado;
        if (modoEditar)
            resultado = metodosMantenimiento.actualizarMantenimiento(mantenimiento);
        else
            resultado = metodosMantenimiento.setMantenimiento(mantenimiento);
        return resultado;
    }
    
    public Mantenimiento armarMantenimiento(String id,String descripcion, String estatus){
        Mantenimiento mantenimiento  = new Mantenimiento();
        mantenimiento.setId(id);
        mantenimiento.setDescripcion(descripcion);
        mantenimiento.setEstatus(estatus);
        return mantenimiento;
    }
    
    public Object[][] getListaMantenimientos(){
        listaMantenimientos = metodosMantenimiento.getMantenimientos();
        Object[][] data = new Object[listaMantenimientos.size()][3];
        int i = 0;
        for (Mantenimiento usuario : listaMantenimientos){
            data[i][0] = usuario.getDescripcion();
            data[i][1] = usuario.getEstatus();
            data[i][2] = "d";
            i++;
        }
        return data;
    }
    
    public Mantenimiento getMantenimientoEditar(int posicion){
        return listaMantenimientos.get(posicion);
    }
    
}
