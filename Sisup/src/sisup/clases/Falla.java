/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.clases;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import org.joda.time.Period;
/**
 *
 * @author Tony C
 */
public class Falla {
    private String id;
    private Bomba bomba;
    private String idMantenimiento;
    private String mantenimiento;
    private String idUsuario;
    private String usuario;
    private String FechaInicio;
    private String FechaFinal;
    private String observacion;
    private String estatus;
    private String tiempoFueraServicio;
    
    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    public String getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(String mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBomba() {
        return bomba.getId();
    }

    public void setIdBomba(String idBomba) {
        this.bomba.setId(idBomba);
    }

    public String getIdMantenimiento() {
        return idMantenimiento;
    }

    public void setIdMantenimiento(String idMantenimiento) {
        this.idMantenimiento = idMantenimiento;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFechaInicioString() {
        return FechaInicio.toString();
    }
    
    public String getFechaInicio() {
        return FechaInicio;
    }
    
    public String getFechaInicioFormat(){
        String[] fia = FechaInicio.split("-");
        String[] seg = fia[2].split(" ");
        return seg[0] + "-" + fia[1] + "-" + fia[0] + " " + seg[1];
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechaFinal() {
        return FechaFinal;
    }
    
    public String getFechaFinalString() {
        return FechaFinal.toString();
    }
    
    public String getFechaFinalFormat(){
        String[] fia = FechaFinal.split("-");
        String[] seg = fia[2].split(" ");
        return seg[0] + "-" + fia[1] + "-" + fia[0] + " " + seg[1];
    }

    public void setFechaFinal(String FechaFinal) {
        this.FechaFinal = FechaFinal;
        if(FechaFinal != null)
            calcularTiempoFueraServicio();
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    public void setTiempoFueraServicio(String tiempoFueraServicio){
        this.tiempoFueraServicio = tiempoFueraServicio;
    }
    
    public String getTiempoFueraServicio(){
        return tiempoFueraServicio;
    }

    private void calcularTiempoFueraServicio() {
        String diferencia = "";
        String[] fia = FechaInicio.split("-");
        String[] hor = fia[2].split(" ");
        String[] seg = hor[1].split(":");
        String[] mis = seg[2].split("\\.");
        
        DateTime FechaInicioaux = new DateTime(Integer.parseInt(fia[0]), 
                                              Integer.parseInt(fia[1]), 
                                              Integer.parseInt(hor[0]), 
                                              Integer.parseInt(seg[0]), 
                                              Integer.parseInt(seg[1]),
                                              Integer.parseInt(mis[0]));
        
        fia = FechaFinal.split("-");
        hor = fia[2].split(" ");
        seg = hor[1].split(":");
        mis = seg[2].split("\\.");
        
        DateTime FechaFinalaux = new DateTime(Integer.parseInt(fia[0]), 
                                              Integer.parseInt(fia[1]), 
                                              Integer.parseInt(hor[0]), 
                                              Integer.parseInt(seg[0]), 
                                              Integer.parseInt(seg[1]),
                                              Integer.parseInt(mis[0]));
        
        Period dur = new Period(FechaInicioaux,FechaFinalaux);
        
        int tiempo = dur.getDays();
        if (tiempo > 0) {diferencia += tiempo + " dia"; diferencia += tiempo > 1 ? "s " : " ";}
        
        
        Period dur2 = dur.minusDays(tiempo);
        tiempo = dur2.getHours();
        if (tiempo > 0) {diferencia += tiempo + "h ";} 
        
        FechaFinalaux = FechaFinalaux.minus(dur2.getHours());
        Period dur3 = dur2.minusHours(tiempo);
        tiempo = dur3.getMinutes();
        if (tiempo > 0) {diferencia += tiempo + "m ";} 
        
        Period dur4 = dur3.minusMinutes(tiempo);
        tiempo = dur4.getSeconds();
        if (tiempo > 0) {diferencia += tiempo + "s ";} 
        
        /*diferencia en dias
        long diffDays = duracion / (24 * 60 * 60 * 1000);
        if(diffDays>0) {diferencia += diffDays + "dia"; diferencia += diffDays > 1 ? "s" : ""; duracion -= (diffDays * 24 * 60 * 60 * 1000);}
        //diferencia en horas
        long diffHours = duracion / (60 * 60 * 1000);
        if(diffHours>0) {diferencia += diffHours + "hora"; diferencia += diffHours > 1 ? "s" : ""; duracion -= (diffHours * 60 * 60 * 1000);}
        //diferencia en minutos
        long diffMinutes = duracion / (60 * 1000);
        if(diffMinutes>0) {diferencia += diffMinutes + "minuto"; diferencia += diffMinutes > 1 ? "s" : ""; duracion -= (diffMinutes * 60 * 1000);}
        //diferencia en segundos
        long diffSeconds = duracion / 1000;
        if(diffSeconds>0) {diferencia += diffSeconds + "segundo"; diferencia += diffSeconds > 1 ? "s" : ""; duracion -= (diffSeconds * 1000);}
        */setTiempoFueraServicio(diferencia);
    }
}
