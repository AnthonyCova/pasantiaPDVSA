/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.clases;

/**
 *
 * @author Tony C
 */
public class Mantenimiento {
    private String id;
    private String descripcion;
    private String estatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
}
