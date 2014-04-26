/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.controladores;

import java.util.ArrayList;
import java.util.Calendar;
import sisup.clases.Bomba;
import sisup.clases.Falla;
import sisup.metodos.MetodosBomba;
import sisup.metodos.MetodosFalla;
import sisup.utilidades.Configuracion;

/**
 *
 * @author Liz
 */
public class ReportesControlador {

    MetodosFalla metodosFalla;
    MetodosBomba metodosBomba;
    ArrayList<Bomba> listaBombasParadas;
    ArrayList<Bomba> listaNuevasBombasParadas;
    ArrayList<Falla> listaFallas;
    
    public ReportesControlador() {
        metodosFalla = new MetodosFalla();
        metodosBomba = new MetodosBomba();
    }
    
    public int GuardarReporte(Falla falla){
        int resultado = metodosFalla.setFalla(falla);
        return resultado;
    }
    
    /*public Falla armarFalla(String id,String idBomba, String fechaFinal, String fechaInicio, String idMantenimiento, String idUsuario, String observacion, String estatus){
        Falla falla  = new Falla();
        falla.setId(id);
        falla.setFechaFinal(fechaFinal);
        falla.setFechaInicio(fechaInicio);
        falla.setIdBomba(idBomba);
        falla.setIdMantenimiento(idMantenimiento);
        falla.setIdUsuario(idUsuario);
        falla.setObservacion(observacion);
        falla.setEstatus(estatus);
        return falla;
    }*/
    
    public Object[][] getListaBombasParadas(){
        listaNuevasBombasParadas = metodosBomba.getBombasParada(Configuracion.getInstance().getProperty(Configuracion.SENALFALLABOMBA));
        
        /*if(listaNuevasBombasParadas == null)
            listaBombasParadas = listaNuevasBombasParadas;*/
        
        procesarNuevasFallas();
        procesarFallasSolventadas();
        limitarFallasDashboard();
        
        Object[][] data = new Object[listaFallas.size()][5];
        int i = 0;
        for (Falla falla : listaFallas){
            data[i][0] = falla.getFechaInicio();
            data[i][1] = falla.getBomba().getTag();
            data[i][2] = falla.getBomba().getDescripcionTag();
            data[i][3] = falla.getTiempoFueraServicio();
            data[i][4] = setBotonReporte(falla.getEstatus());
            i++;
        }
        return data;
    }
    
    public Falla getFallaReportar(int posicion){
        return listaFallas.get(posicion);
    }

    private void procesarNuevasFallas() {
        ArrayList<Bomba> auxlistaBombasParadas = new ArrayList<>(listaNuevasBombasParadas);
        auxlistaBombasParadas.removeAll(listaBombasParadas);
        if (!auxlistaBombasParadas.isEmpty())
            armarFallasNuevas(auxlistaBombasParadas);
    }
    
    private void procesarFallasSolventadas(){
        ArrayList<Bomba> auxlistaBombasParadas = new ArrayList<>(listaBombasParadas);
        auxlistaBombasParadas.removeAll(listaNuevasBombasParadas);
        if (!auxlistaBombasParadas.isEmpty())
            cerrarFallasSolventadas(auxlistaBombasParadas);
    }

    private void armarFallasNuevas(ArrayList<Bomba> auxlistaBombasParadas) {
        for(Bomba bomba : auxlistaBombasParadas){
            Falla falla = new Falla();
            falla.setBomba(bomba);
            falla.setEstatus("Activa");
            falla.setFechaInicio(Calendar.getInstance());
            int auxId = metodosFalla.setFalla(falla);
            falla.setId(Integer.toString(auxId));
            listaFallas.add(0,falla);
        }
    }

    private String setBotonReporte(String estatus) {
        if (estatus.equals("Activa")) 
            return "Falla";
        else if (estatus.equals("Activa"))
                 return "Reportar";
       return "Ver Reporte";    
    }

    private void cerrarFallasSolventadas(ArrayList<Bomba> auxlistaBombasParadas) {
        for(Falla falla : listaFallas)
            for(Bomba bomba : auxlistaBombasParadas){
                if(bomba.getId().equals(falla.getIdBomba()) && falla.getEstatus().equals("Activa")){
                    falla.setFechaFinal(Calendar.getInstance());
                    falla.setEstatus("Controlada");
                    metodosFalla.setCerrarFalla(falla);
                }
            }    
    }

    private void limitarFallasDashboard() {
        int aux = listaFallas.size() - Integer.parseInt(Configuracion.getInstance().getProperty(Configuracion.SENALFALLABOMBA));
        if(aux > 0){
            int remover = listaFallas.size() -1;
            for(int i = 0; i <= aux; i++)
                listaFallas.remove(remover--);
        }
    }
    
}
