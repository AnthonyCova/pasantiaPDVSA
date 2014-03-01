/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.baseDatos;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import sisup.utilidades.Configuracion;

/**
 *
 * @author Tony C
 */
public class Conexion {
    
//variables miembro
 
    private String usuario;
    private String clave;
    private String url;
    private String driverClassName;
    private Connection conn = null;
    private Statement estancia;
 
//CONSTRUCTORES
 
    //Constructor que toma los datos de conexion por medio de parametros
    public Conexion(String usuario, String clave, String url, String driverClassName) {
        this.usuario = usuario;
        this.clave = clave;
        this.url = url;
        this.driverClassName = driverClassName;
    }
 
    //Constructor que crea la conexion sin parametros con unos definidos en la clase
    //(meter los datos correspondientes)
    public Conexion() {
        //poner los datos apropiados
        this.usuario = Configuracion.getInstance().getProperty(Configuracion.USUARIODB);
        this.clave = Configuracion.getInstance().getProperty(Configuracion.CONTRASENADB);
        this.url = "jdbc:mysql://"+Configuracion.getInstance().getProperty(Configuracion.SERVIDORDB)+Configuracion.getInstance().getProperty(Configuracion.PUERTODB)+"/"+Configuracion.getInstance().getProperty(Configuracion.NOMBREDB);
        this.driverClassName = Configuracion.getInstance().getProperty(Configuracion.DRIVERDB);
    }
    
    //metodos para recuperar los datos de conexion
    public String getClave() {
        return clave;
    }
 
    public String getUrl() {
        return url;
    }
 
    public String getUsuario() {
        return usuario;
    }
 
    public Connection getConn() {
        return conn;
    }
 
    public String getDriverClassName() {
        return driverClassName;
    }
 
    public void setClave(String clave) {
        this.clave = clave;
    }
 
    public void setUrl(String url) {
        this.url = url;
    }
 
    public void setUsuario(String usuario) throws SQLException {
        this.usuario = usuario;
    }
 
    public void setConn(Connection conn) {
        this.conn = conn;
    }
 
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
 
//la conexion propiamente dicha
 
    public void conectar(){
        try {
            System.out.println(url);
            Class.forName(this.driverClassName).newInstance();
            this.conn = DriverManager.getConnection(this.url, this.usuario, this.clave);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException err) {
            System.out.println("Error " + err.getMessage());
        }
    }
    //Cerrar la conexion
 
    public void cierraConexion() {
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
//METODOS PARA TRABAJAR CON LA BASE DE DATOS
 
    public ResultSet consulta(String consulta) {
        ResultSet resultSet=null;
        try {
            this.estancia = (Statement) conn.createStatement();
            resultSet=this.estancia.executeQuery(consulta);
            return resultSet;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            return resultSet;
        }
    }
 
    public void actualizar(String actualiza) throws SQLException {
        this.estancia = (Statement) conn.createStatement();
        estancia.executeUpdate(actualiza);
    }
 
    public ResultSet borrar(String borra) throws SQLException {
        Statement st = (Statement) this.conn.createStatement();
        return (ResultSet) st.executeQuery(borra);
    }
 
    public int insertar(String inserta)  {
        int resultado=-1;
        try {
            Statement st = (Statement) this.conn.createStatement();
            resultado =st.executeUpdate(inserta);
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            resultado =-2;
        }finally{
            return resultado;
        }
    }
 
}
