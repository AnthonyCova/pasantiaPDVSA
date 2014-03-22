/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.baseDatos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sisup.metodos.MetodosBomba;

/**
 *
 * @author Tony C
 */
public class Consultas {
    
    public static java.util.ArrayList<sisup.clases.Usuario> acceso(String login){
        java.util.ArrayList<sisup.clases.Usuario> usuarios = new java.util.ArrayList<>();
        String sql= String.format("Select idusuario, nombre, rol, cedula, cargo, correo from usuario where login='%s' and estatus=1;", login);
        Conexion conexion = new Conexion();
        java.sql.ResultSet resultado;
        conexion.conectar();
        resultado = conexion.consulta(sql);
        try {
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
            return usuarios;  
        } catch (SQLException ex) {
            Logger.getLogger(Consultas.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return usuarios;  
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
            return usuarios;  
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
            String sql= String.format("Update  usuario set nombre='%s', login='%s' , rol='%s' , estatus='%s' ,cedula='%s' , cargo= '%s', correo='%s' where idusuario=%s; ", nombre, login,rol,estatus ,id,cedula, cargo, correo);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;
    }
        
     public static java.util.ArrayList<sisup.clases.Mantenimiento> obtenerMantenimientos(){
            java.util.ArrayList<sisup.clases.Mantenimiento> mantenimientos = new java.util.ArrayList<>();
            String sql="Select idmantenimiento, descripcion, estatus from mantenimento);";
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
    
    public static java.util.ArrayList<sisup.clases.Bomba>  obtenerBombas(String senal){
            java.util.ArrayList<sisup.clases.Bomba> bombas = new java.util.ArrayList<>();
            String sql= String.format("Select idbomba, tag, descripcion, estatus, horaArranque, senal from bomba where senal='%s';", senal);
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);        
            try {
                while(resultado.next()){
                    sisup.clases.Bomba bomba =new sisup.clases.Bomba();
                    bomba.setTag(resultado.getString("tag"));
                    bomba.setDescripcioTag(resultado.getString("descripcionTag"));
                    bomba.setId(resultado.getString("idbomba"));
                    bomba.setEstatus(resultado.getString("estatus"));
                    bomba.setHoraArranque(resultado.getString("horaArranque"));
                    bomba.setSenal(resultado.getString("senal"));
                    bombas.add(bomba);
                }
                return bombas;
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
                    falla.setIdBomba(resultado.getString("idbomba"));
                    falla.setBomba(resultado.getString("bomba"));
                    falla.setIdMantenimiento(resultado.getString("idmantenimiento"));
                    falla.setMantenimiento(resultado.getString("mantenimiento"));
                    falla.setIdUsuario(resultado.getString("idusuario"));
                    falla.setUsuario(resultado.getString("usuario"));
                    falla.setFechaInicio(resultado.getString("inicio"));
                    falla.setFechaFinal(resultado.getString("fin"));
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
     * @param idbomba
     * @param idmantenimiento
     * @param idusuario
     * @param inicio
     * @param fin
     * @param observacion
     * @param estatus
     * @return java.sql.ResultSet
     */
    public static int  insertarFalla(String idbomba, String idmantenimiento, String idusuario, String inicio, String fin, String observacion, String estatus){
            String sql= String.format("insert into falla (idbomba, idmantenimiento, idusuario, inicio, final, observacion, estatus) values(%s,%s,%s,'%s','%s','%s','%s'); ",idbomba ,idmantenimiento ,idusuario , inicio, fin,observacion,estatus );
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;

    }
}
