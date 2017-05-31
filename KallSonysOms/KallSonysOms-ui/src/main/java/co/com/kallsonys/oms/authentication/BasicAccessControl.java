package co.com.kallsonys.oms.authentication;

import java.util.List;

import co.com.kallsonys.oms.backend.bdservice.oracle.OracleDataServiceImpl;
import co.com.kallsonys.oms.backend.entity.oracle.Rol;
import co.com.kallsonys.oms.backend.entity.oracle.Usuario;

/**
 * Default mock implementation of {@link AccessControl}. This implementation
 * accepts any string as a password, and considers the user "admin" as the only
 * administrator.
 */
public class BasicAccessControl implements AccessControl {

    @Override
    public boolean signIn(String username, String password) {
    	
    	boolean darIngreso=false;
    	List<Usuario> usuarios = OracleDataServiceImpl.get().getAllUsuarios();
    	Rol rol = null;
    	
    	for( Usuario u:usuarios ){
    		if( u.getUsuario().toUpperCase().equals(username.toUpperCase()) && u.getPassword().equals(password) ){
    			darIngreso= true;
    			rol=u.getRol();
    			break;
    		}
    	}
    	
        if (username == null || username.isEmpty())
        	darIngreso= false;
        
        if(darIngreso)
        	CurrentUser.set(username);
        	CurrentUser.setRol(rol);
        return darIngreso;
    }

    @Override
    public boolean isUserSignedIn() {
        return !CurrentUser.get().isEmpty();
    }

    @Override
    public boolean isUserInRole(String role) {
        if ("admin".equals(role)) {
            // Only the "admin" user is in the "admin" role
            return getPrincipalName().equals("admin");
        }

        // All users are in all non-admin roles
        return true;
    }

    @Override
    public String getPrincipalName() {
        return CurrentUser.get();
    }

}
