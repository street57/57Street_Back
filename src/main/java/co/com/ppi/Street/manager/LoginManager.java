/**
 * 
 */
package co.com.ppi.Street.manager;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.dto.LoginJWTOutDTO;

/**
 * TODO: descripción <br>
 * Creado el Oct 22, 2022 a las 7:58:30 PM <br>
 *
 */
public interface LoginManager {

	/**
	 * Método encargado de realizar el login de un usuario por JWT. <br>
	 * Creado el Oct 22, 2022 a las 8:03:29 PM <br>
	 *
	 * @param correo
	 * @param clave
	 * @return
	 */
	Response loginJwt(String correo, String clave);
	
	/**
	 * Método encargado de verificar la información que existe en el token. <br>
	 * Creado el Oct 23, 2022 a las 2:45:19 PM <br>
	 *
	 * @param token
	 * @return
	 */
	LoginJWTOutDTO verifyToken(String token);
}
