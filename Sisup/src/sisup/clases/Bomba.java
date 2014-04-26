/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.clases;

/**
 *
 * @author Tony C
 */
public class Bomba {
    
    private String id;
    private String tag;
    private String descripcionTag;
    private String horaArranque;
    private String senal;
    private String estatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDescripcionTag() {
        return descripcionTag;
    }

    public void setDescripcionTag(String descripcionTag) {
        this.descripcionTag = descripcionTag;
    }

    public String getHoraArranque() {
        return horaArranque;
    }

    public void setHoraArranque(String horaArranque) {
        this.horaArranque = horaArranque;
    }

    public String getSenal() {
        return senal;
    }

    public void setSenal(String senal) {
        this.senal = senal;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
