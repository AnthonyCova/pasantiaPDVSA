/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sisup.controladores;

import java.util.ArrayList;
import sisup.clases.Bomba;
import sisup.clases.Falla;
import sisup.clases.Mantenimiento;
import sisup.metodos.MetodosBomba;
import sisup.metodos.MetodosFalla;
import sisup.metodos.MetodosMantenimiento;
import sisup.utilidades.Configuracion;

/**
 *
 * @author Liz
 */
public class ReportesControlador {

    MetodosFalla metodosFalla;
    MetodosBomba metodosBomba;
    MetodosMantenimiento metodosMantenimiento;
    ArrayList<Bomba> listaBombasParadas;
    ArrayList<Bomba> listaNuevasBombasParadas;
    ArrayList<Bomba> auxlistaNuevasBombasParadas;
    ArrayList<Falla> listaFallas;
    ArrayList<Mantenimiento> listaMantenimientos;
    
    public ReportesControlador() {
        metodosFalla = new MetodosFalla();
        metodosBomba = new MetodosBomba();
        metodosMantenimiento = new MetodosMantenimiento();
        
        listaBombasParadas = new ArrayList();
        ultimasFallasRegistradas();
    }
    
    public int guardarReporte(Falla falla){
        int resultado = metodosFalla.setReporteFalla(falla);
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
        //EJEMPLO BOMBAS PARADAS
        listaNuevasBombasParadas = metodosBomba.getBombasParada(Configuracion.getInstance().getProperty(Configuracion.SENALFALLABOMBA));
        procesarBombasId(listaNuevasBombasParadas);
        
        procesarNuevasFallas();
        procesarFallasSolventadas();
        limitarFallasDashboard();
        actualizarBombasParadas();
        
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
        auxlistaNuevasBombasParadas = new ArrayList<>(listaNuevasBombasParadas);
        for (Bomba bombaNueva : listaNuevasBombasParadas){
            for (Bomba bombaParada : listaBombasParadas){
                if(bombaNueva.getId().equals(bombaParada.getId()))
                    auxlistaNuevasBombasParadas.remove(bombaNueva);
                    //auxlistaNuevasBombasParadas.removeAll(listaBombasParadas);
            }
        }
        
        if (!auxlistaNuevasBombasParadas.isEmpty())
            armarFallasNuevas(auxlistaNuevasBombasParadas);
    }
    
    private void procesarFallasSolventadas(){
        ArrayList<Bomba> auxlistaBombasParadas = new ArrayList<>(listaBombasParadas);
        for(Bomba bombaParada : listaBombasParadas){
            for (Bomba bombaNueva : listaNuevasBombasParadas){
                if (bombaParada.getId().equals(bombaNueva.getId()))
                    auxlistaBombasParadas.remove(bombaParada);
                    //auxlistaBombasParadas.removeAll(listaNuevasBombasParadas);
            }
        }
        if (!auxlistaBombasParadas.isEmpty())
            cerrarFallasSolventadas(auxlistaBombasParadas);
    }

    private void armarFallasNuevas(ArrayList<Bomba> auxlistaBombasParadas) {
        for(Bomba bomba : auxlistaBombasParadas){
            Falla falla = new Falla();
            falla.setBomba(bomba);
            falla.setEstatus("Activa");
            java.util.Date dt = new java.util.Date();
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateTime = sdf.format(dt);
            falla.setFechaInicio(dateTime);
            int auxId = metodosFalla.setFalla(falla);
            falla.setId(Integer.toString(auxId));
            listaFallas.add(0,falla);
        }
    }

    private String setBotonReporte(String estatus) {
        if (estatus.equals("Activa")) 
            return "Falla";
        else if (estatus.equals("Controlada"))
                 return "Reportar";
       return "Ver Reporte";    
    }

    private void cerrarFallasSolventadas(ArrayList<Bomba> auxlistaBombasParadas) {
        for(Falla falla : listaFallas)
            for(Bomba bomba : auxlistaBombasParadas){
                if(bomba.getId().equals(falla.getIdBomba()) && falla.getEstatus().equals("Activa")){
                    java.util.Date dt = new java.util.Date();
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String dateTime = sdf.format(dt);
                    falla.setFechaFinal(dateTime);
                    falla.setEstatus("Controlada");
                    metodosFalla.setCerrarFalla(falla);
                    listaBombasParadas.remove(bomba);
                }
            }    
    }

    private void limitarFallasDashboard() {
        int aux = listaFallas.size() - Integer.parseInt(Configuracion.getInstance().getProperty(Configuracion.CANTIDADBOMBASDASHBOARD));
        if(aux > 0){
            int remover = listaFallas.size() -1;
            for(int i = 0; i <= aux; i++)
                listaFallas.remove(remover--);
        }
    }
    
    public ArrayList<Mantenimiento> getListaMantenimientos(){
        listaMantenimientos = metodosMantenimiento.getMantenimientosActivos();
        return listaMantenimientos;
    }
    
    public String getIdMantenimiento(String nombreMantenimiento){
        for (Mantenimiento mant : listaMantenimientos){
            if(mant.getDescripcion().equals(nombreMantenimiento))
                return mant.getId();
        }
        return "0";
    }

    private void procesarBombasId(ArrayList<Bomba> listaNuevasBombasParadas) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ultimasFallasRegistradas() {
        listaFallas = metodosFalla.obtenerUltimasFallas(Configuracion.getInstance().getProperty(Configuracion.CANTIDADBOMBASDASHBOARD));
        for(Falla falla : listaFallas)
            listaBombasParadas.add(falla.getBomba());
    }

    private void actualizarBombasParadas() {
        listaBombasParadas.addAll(auxlistaNuevasBombasParadas);
    }
    
    public Object[][] buscarReportes(String fDesde, String fHasta){
        
        String [] aDesde = fDesde.split("/");
        String [] aHasta = fHasta.split("/");
        
        String desde = aDesde[2]+"-"+aDesde[1]+"-"+aDesde[0];
        String hasta = aHasta[2]+"-"+aHasta[1]+"-"+aHasta[0];
        
        ArrayList<Falla> reportesConsultados = metodosFalla.obtenerFallasPorFecha(desde,hasta);
        
        int i = 0;
        Object [][] data = new String[reportesConsultados.size()][5];
        for (Falla falla : reportesConsultados){
            data[i][0] = falla.getFechaInicioFormat();
            data[i][1] = falla.getBomba().getDescripcionTag();
            data[i][2] = falla.getTiempoFueraServicio();
            data[i][3] = falla.getMantenimiento();
            data[i++][4] = falla.getUsuario();
        }
        return data;
    }
}
