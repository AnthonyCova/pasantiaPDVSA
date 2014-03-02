/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.utilidades;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Tony C
 */
public class Configuracion {
    
Properties properties = null;
 
    /** Configuration file name */
    public final static String CONFIG_FILE_NAME = "C:/properties/Configuracion.properties";
    /** Data base server */
    public final static String SERVIDORDB = "dataBaseServer";
    /** Data base name */
    public final static String NOMBREDB = "nombreBD";
    /** Data base user */
    public final static String USUARIODB = "usuarioBD";
    /** Data base password */
    public final static String CONTRASENADB = "contrasenaBD";
    /** Data base driver */
    public final static String DRIVERDB = "driverDB";
    /** Data base puerto */
    public final static String PUERTODB = "puertoDB";
    /** Arbol LDAP */
    public final static String BASELDAP = "baseLDAP";
    /** URL LDAP */
    public final static String URLLDAP = "urlLDAP";
    /** FLAG LDAP */
    public final static String FLAGLDAP = "ldap";
    
    private Configuracion() {
        this.properties = new Properties();
        try {
            properties.load(new FileInputStream(CONFIG_FILE_NAME));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 
    /**
     * Implementando Singleton
     *
     * @return
     */
    public static Configuracion getInstance() {
        return ConfigurationHolder.INSTANCE;
    }
 
    private static class ConfigurationHolder {
        private static final Configuracion INSTANCE = new Configuracion();
    }
    /**
     * Retorna la propiedad de configuración solicitada
     *
     * @param key
     * @return
     */
    public String getProperty(String key) {
        return this.properties.getProperty(key);
    }
}
