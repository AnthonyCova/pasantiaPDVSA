/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup.utilidades;

import java.util.Hashtable;
import javax.naming.AuthenticationException;
import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

/**
 *
 * @author Tony C
 */
public class LDAP {

    /**
     * Permite Autenticar usuario y contraseña ante un servidor LDAP
     *
     * @param usuario (String) Usuario ingresado para loggearse
     * @param password (String) Password ingresado para loggearse
     * @return true si el login se realizo exitosamen, false si hubo fallo
     * @author 
     */
    public static boolean autenticacionLDAP(String usuario, String password) {
        
        if(!Configuracion.getInstance().getProperty(Configuracion.FLAGLDAP).equalsIgnoreCase("1")){
            return true;
        }
        
        Hashtable auth = new Hashtable(11);
        //String base = "ou=Usuarios,dc=sof,dc=com";
        String base = Configuracion.getInstance().getProperty(Configuracion.BASELDAP);
        String dn =  usuario + base;
        //String ldapURL = "ldap://172.16.13.6:389";
        String ldapURL =  "ldap://"+Configuracion.getInstance().getProperty(Configuracion.URLLDAP);
                
        auth.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        auth.put(Context.PROVIDER_URL, ldapURL);
        auth.put(Context.SECURITY_AUTHENTICATION, "simple");
        auth.put(Context.SECURITY_PRINCIPAL, dn);
        auth.put(Context.SECURITY_CREDENTIALS, password);

        try {
            DirContext authContext = new InitialDirContext(auth);
            System.out.println("LA AUTENTICACION SE REALIZAO CORRECTAMENTE ANTE EL LDAP!");
            return true;
        } catch (AuthenticationException authEx) {
            System.out.println("NO SE ENCONTRO ESTOS DATOS!");
            return false;

        } catch (NamingException namEx) {
            System.out.println("SUCEDIO ALGO!");
            namEx.printStackTrace();
            return false;
        }
    }
}
