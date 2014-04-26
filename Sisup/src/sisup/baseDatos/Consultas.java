/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.baseDatos;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import sisup.metodos.MetodosBomba;

/**
 *
 * @author Tony C
 */
public class Consultas {
    
    public static sisup.clases.Usuario acceso(String login){
        sisup.clases.Usuario usuario = new sisup.clases.Usuario();
        String sql= String.format("Select idusuario, nombre, rol, cedula, cargo, correo from usuario where login='%s' and estatus='Activo';", login);
        Conexion conexion = new Conexion();
        java.sql.ResultSet resultado;
        conexion.conectar();
        resultado = conexion.consulta(sql);
        try {
            while (resultado.next()) {
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setLogin(login);
                usuario.setId(resultado.getString("idusuario"));
                usuario.setEstatus("Activo");
                usuario.setRol(resultado.getString("rol"));
                usuario.setCargo(resultado.getString("cargo"));
                usuario.setCedula(resultado.getString("cedula"));
                usuario.setCorreo(resultado.getString("correo"));
            }
            conexion.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return usuario;  
        }
    }
    
    public static java.util.ArrayList<sisup.clases.Usuario>  obtenerUsuarios(){
        java.util.ArrayList<sisup.clases.Usuario> usuarios = new java.util.ArrayList<>();
        try {
            String sql= "Select idusuario, nombre, rol, login, cedula, cargo, correo,estatus  from usuario;";
            Conexion conexion = new Conexion();
            java.sql.ResultSet  resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);
            while (resultado.next()) {
                sisup.clases.Usuario usuario = new sisup.clases.Usuario();
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setLogin(resultado.getString("login"));
                usuario.setId(resultado.getString("idusuario"));
                usuario.setEstatus(resultado.getString("estatus"));
                usuario.setRol(resultado.getString("rol"));
                usuario.setCargo(resultado.getString("cargo"));
                usuario.setCedula(resultado.getString("cedula"));
                usuario.setCorreo(resultado.getString("correo"));
                usuarios.add(usuario);
            }
            conexion.cierraConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return usuarios;  
        }
     }
    
     public static  int insertarUsuario(String nombre, String login, String rol, String estatus, String cedula, String cargo, String correo){
            String sql= String.format("insert into usuario (nombre, login, rol, estatus, cedula, cargo, correo) values('%s','%s','%s','%s','%s','%s','%s'); ", nombre,login,rol,estatus,cedula, cargo, correo);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado; 
    }
     
         
    public static int  actualizarUsuario(String nombre, String login, String rol, String estatus ,String id, String cedula, String cargo, String correo){
            String sql= String.format("Update  usuario set nombre='%s', login='%s' , rol='%s' , estatus='%s' ,cedula='%s' , cargo= '%s', correo='%s' where idusuario=%s; ", nombre, login, rol, estatus, cedula, cargo, correo, id);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;
    }
        
     public static java.util.ArrayList<sisup.clases.Mantenimiento> obtenerMantenimientos(){
            java.util.ArrayList<sisup.clases.Mantenimiento> mantenimientos = new java.util.ArrayList<>();
            String sql="Select idmantenimiento, descripcion, estatus from mantenimiento;";
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);
            try {
                while(resultado.next()){
                    sisup.clases.Mantenimiento mantenimiento =new sisup.clases.Mantenimiento();
                    mantenimiento.setDescripcion(resultado.getString("descripcion"));
                    mantenimiento.setEstatus(resultado.getString("estatus"));
                    mantenimiento.setId(resultado.getString("idmantenimiento"));
                    mantenimientos.add(mantenimiento);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                conexion.cierraConexion();
                return mantenimientos;
            }
    }
     
    public static int insertarMantenimiento(String descripcion, String estatus){
            String sql= String.format("insert into mantenimiento (descripcion, estatus) values('%s','%s'); ", descripcion,estatus);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;
        
    }
    
    public static int  actualizarMantenimiento(String descripcion, String estatus ,String id){
            String sql= String.format("Update mantenimiento set descripcion='%s', estatus='%s'  where idmantenimiento=%s; ", descripcion, estatus,id);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;
    }
    
    public static java.util.ArrayList<sisup.clases.Bomba>  obtenerBombasParada(String senal){
            java.util.ArrayList<sisup.clases.Bomba> bombas = new java.util.ArrayList<>();
            String sql= String.format("Select idbomba, tag, descripcion, estatus, horaArranque, senal from bomba where senal in ('%s');", senal);
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);        
            try {
                while(resultado.next()){
                    sisup.clases.Bomba bomba =new sisup.clases.Bomba();
                    bomba.setTag(resultado.getString("tag"));
                    bomba.setDescripcionTag(resultado.getString("descripcionTag"));
                    bomba.setId(resultado.getString("idbomba"));
                    bomba.setEstatus(resultado.getString("estatus"));
                    bomba.setHoraArranque(resultado.getString("horaArranque"));
                    bomba.setSenal(resultado.getString("senal"));
                    bombas.add(bomba);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                conexion.cierraConexion();
                return bombas;
            }
    }
    
    public static java.util.ArrayList<sisup.clases.Bomba>  obtenerBombas(){
            java.util.ArrayList<sisup.clases.Bomba> bombas = new java.util.ArrayList<>();
            String sql= String.format("Select idbomba, tag, descripcionTag, estatus from bomba;");
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);        
            try {
                while(resultado.next()){
                    sisup.clases.Bomba bomba =new sisup.clases.Bomba();
                    bomba.setTag(resultado.getString("tag"));
                    bomba.setDescripcionTag(resultado.getString("descripcionTag"));
                    bomba.setId(resultado.getString("idbomba"));
                    bomba.setEstatus(resultado.getString("estatus"));
                    bombas.add(bomba);
                }
            } catch (SQLException ex) {
                Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                conexion.cierraConexion();
                return bombas;
            }
    }
    
    public static int  insertarBomba(String tag, String descripcion, String status, String horaArranque){
            String sql= String.format("insert into bomba (tag, descripcion, estatus, horaArranque) values('%s','%s','%s','%s'); ", tag, descripcion,status, horaArranque);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;
    }
    
    public static int actualizarBomba(String tag, String descripcion, String status, String horaArranque, String id){
            String sql= String.format("Update  bomba set tag='%s', descripcion='%s' , estatus='%s' , horaArranque='%s' where idbomba=%s; ", tag, descripcion,status, horaArranque, id);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;

    }
    
    public static java.util.ArrayList<sisup.clases.Falla> consultarFallas(String inicio, String fin){
            String sql= String.format("Select f.idbomba, b.tag, b.descripcionTag, f.idmantenimiento, m.descripcion ,f.idusuario, u.nombre,  f.inicio, f.final, f.observacion, f.estatus from falla f inner join  (bomba b, mantenimiento m, usuario u) on b.idbomba=f.idbomba and m.idmantenimiento=f.idmantenimiento and u.idusuario=f.idusuario where f.inicio between '%s' and '%s';", inicio, fin);
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);
            java.util.ArrayList<sisup.clases.Falla> fallas = new java.util.ArrayList<>();
            try {
                while(resultado.next()){
                    sisup.clases.Falla falla =new sisup.clases.Falla();
                    sisup.clases.Bomba bomba =new sisup.clases.Bomba();
                    bomba.setId(resultado.getString("idbomba"));
                    bomba.setTag(resultado.getString("tag"));
                    bomba.setDescripcionTag(resultado.getString("descripcionTag"));
                    falla.setBomba(bomba);
                    falla.setIdMantenimiento(resultado.getString("idmantenimiento"));
                    falla.setMantenimiento(resultado.getString("mantenimiento"));
                    falla.setIdUsuario(resultado.getString("idusuario"));
                    falla.setUsuario(resultado.getString("usuario"));
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");
                    calendar.setTime(sdf.parse(resultado.getString("inicio")));
                    falla.setFechaInicio(calendar);
                    calendar.setTime(sdf.parse(resultado.getString("fin")));
                    falla.setFechaFinal(calendar);
                    falla.setObservacion(resultado.getString("observacion"));
                    falla.setEstatus(resultado.getString("estatus"));
                    falla.setId(resultado.getString("idfalla"));
                    fallas.add(falla);
                }
                conexion.cierraConexion();
                return fallas;
            } catch (SQLException ex) {
                Logger.getLogger(MetodosBomba.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                conexion.cierraConexion();
                return fallas;
            }
    }
    
        /**
     * Retorna el resulSet de la insercion de la falla
     *
     * @param idFalla
     * @param idmantenimiento
     * @param idusuario
     * @param observacion
     * @param estatus
     * @return java.sql.ResultSet
     */
    public static int completarReporteFalla(String idFalla, String idmantenimiento, String idusuario, String observacion, String estatus){
            String sql= String.format("update falla set idmantenimiento = %s, idusuario = %s, observacion = '%s', estatus = '%s' where idFalla = %s;" ,idmantenimiento ,idusuario, observacion, estatus, idFalla);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;
    }
    
       /**
     * Retorna el resulSet de la insercion de la falla
     *
     * @param idFalla
     * @param fin
     * @param estatus
     * @return java.sql.ResultSet
     */
    public static int cerrarFalla(String idFalla, String fin, String estatus){
            String sql= String.format("update falla set final = '%s', estatus = '%s' where idFalla = %s;" , fin, estatus, idFalla);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;
    }
    
       /**
     * Retorna el resulSet de la insercion de la falla
     *
     * @param idbomba
     * @param inicio
     * @param estatus
     * @return java.sql.ResultSet
     */
    public static int  insertarFalla(String idbomba, String inicio, String estatus){
            String sql= String.format("insert into falla (idbomba, inicio, estatus) values(%s,%s,%s); ",idbomba , inicio, estatus );
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertarConId(sql);
            conexion.cierraConexion();
            return resultado;

    }
}
