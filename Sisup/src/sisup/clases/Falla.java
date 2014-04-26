/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.clases;

import java.util.Calendar;

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
    private Calendar FechaInicio;
    private Calendar FechaFinal;
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
    
    public Calendar getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Calendar FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Calendar getFechaFinal() {
        return FechaFinal;
    }
    
    public String getFechaFinalString() {
        return FechaFinal.toString();
    }

    public void setFechaFinal(Calendar FechaFinal) {
        this.FechaFinal = FechaFinal;
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
        long diff = FechaFinal.getTimeInMillis() - FechaInicio.getTimeInMillis();
        
        //diferencia en dias
        long diffDays = diff / (24 * 60 * 60 * 1000);
        if(diffDays>0) {diferencia += diffDays + "dia"; diferencia += diffDays > 1 ? "s" : ""; diff -= (diffDays * 24 * 60 * 60 * 1000);}
        //diferencia en horas
        long diffHours = diff / (60 * 60 * 1000);
        if(diffHours>0) {diferencia += diffHours + "hora"; diferencia += diffHours > 1 ? "s" : ""; diff -= (diffHours * 60 * 60 * 1000);}
        //diferencia en minutos
        long diffMinutes = diff / (60 * 1000);
        if(diffMinutes>0) {diferencia += diffMinutes + "minuto"; diferencia += diffMinutes > 1 ? "s" : ""; diff -= (diffMinutes * 60 * 1000);}
        //diferencia en segundos
        long diffSeconds = diff / 1000;
        if(diffSeconds>0) {diferencia += diffSeconds + "segundo"; diferencia += diffSeconds > 1 ? "s" : ""; diff -= (diffSeconds * 1000);}
        
        setTiempoFueraServicio(diferencia);
    }
}
