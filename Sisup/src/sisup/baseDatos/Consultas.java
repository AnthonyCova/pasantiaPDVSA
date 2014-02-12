/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.baseDatos;
/**
 *
 * @author Tony C
 */
public class Consultas {
    
    public static java.sql.ResultSet acceso(String usuario, String password){
            String sql= String.format("Select idusuario, nombre, rol from usuario where usuario='%s' and contrasena='%s' and estatus=1;", usuario,password);
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);
            conexion.cierraConexion();
            return resultado;
    }
    
    public static java.sql.ResultSet  obtenerUsuarios(){
            String sql= "Select idusuario, nombre, rol from usuario;";
            Conexion conexion = new Conexion();
            java.sql.ResultSet  resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);
            conexion.cierraConexion();
            return resultado;  
     }
    
     public static  int insertarUsuario(String nombre, String contrasena, String rol, String estatus){
            String sql= String.format("insert into usuario (nombre, contrasena, rol, estatus) values('%s','%s','%s','%s'); ", nombre,contrasena,rol,estatus);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado; 
    }
     
         
    public static int  actualizarUsuario(String nombre, String contrasena, String rol, String estatus ,String id){
            String sql= String.format("Update  usuario set nombre='%s', contrasena='%s' , rol='%s' , estatus='%s' where idusuario=%s; ", nombre, contrasena,rol,estatus ,id);
            Conexion conexion = new Conexion();
            int resultado;
            conexion.conectar();
            resultado = conexion.insertar(sql);
            conexion.cierraConexion();
            return resultado;
    }
        
     public static java.sql.ResultSet obtenerMantenimientos(){
            String sql="Select idmantenimiento, descripcion, estatus from mantenimento);";
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);
            conexion.cierraConexion();
            return resultado;   
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
    
    public static java.sql.ResultSet obtenerBombas(String senal){
            String sql= String.format("Select idbomba, tag, descripcion, estatus, horaArranque, senal from bomba where senal='%s';", senal);
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);
            conexion.cierraConexion();
            return resultado;
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
    
    public static java.sql.ResultSet consultarFallas(String inicio, String fin){
            String sql= String.format("Select f.idbomba, b.tag, b.descripcionTag, f.idmantenimiento, m.descripcion ,f.idusuario, u.nombre,  f.inicio, f.final, f.observacion, f.estatus from falla f inner join  (bomba b, mantenimiento m, usuario u) on b.idbomba=f.idbomba and m.idmantenimiento=f.idmantenimiento and u.idusuario=f.idusuario where f.inicio between '%s' and '%s';", inicio, fin);
            Conexion conexion = new Conexion();
            java.sql.ResultSet resultado;
            conexion.conectar();
            resultado = conexion.consulta(sql);
            conexion.cierraConexion();
            return resultado;

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
