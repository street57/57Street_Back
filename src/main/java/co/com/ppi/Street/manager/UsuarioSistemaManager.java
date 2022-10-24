/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.UsuarioSistemaEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 9:26:50 PM <br>
 *
 */
public interface UsuarioSistemaManager {

	/**
	 * Se crea un usuarioSistema<br>
	 * Creado el Oct 21, 2022 a las 9:42:57 PM <br>
	 *
	 * @param usuarioSistema
	 * @return
	 */
	Response create(UsuarioSistemaEntity usuarioSistema);
	
	/**
	 * Se actualiza un usuarioSistema<br>
	 * Creado el Oct 21, 2022 a las 9:43:27 PM <br>
	 *
	 * @param usuarioSistema
	 * @return
	 */
	Response update(UsuarioSistemaEntity usuarioSistema);
	
	/**
	 * Se elimina un usuarioSistema<br>
	 * Creado el Oct 21, 2022 a las 9:43:49 PM <br>
	 *
	 * @param idUsuarioSistema
	 * @return
	 */
	Response delete(Long idUsuarioSistema);
	
	/**
	 * Se encuentra un usuarioSIstema por PK<br>
	 * Creado el Oct 21, 2022 a las 9:44:15 PM <br>
	 *
	 * @param idUsuarioSistema
	 * @return
	 */
	UsuarioSistemaEntity findByPK(Long idUsuarioSistema);

	/**
	 * Se encuentra un usuarioSistema por email<br>
	 * Creado el Oct 21, 2022 a las 9:44:49 PM <br>
	 *
	 * @param emailUsuarioSistema
	 * @return
	 */
	UsuarioSistemaEntity findByEmail(String emailUsuarioSistema);
	
	/**
	 * Método encargado de encontrar un usuario por email y clave. <br>
	 * Creado el Oct 22, 2022 a las 8:28:22 PM <br>
	 *
	 * @param email
	 * @param clave
	 * @return
	 */
	UsuarioSistemaEntity findByEmailAndClave(String email, String clave);
	
	/**
	 * Se listan todos los usuariosSistema de la BD<br>
	 * Creado el Oct 21, 2022 a las 9:46:02 PM <br>
	 *
	 * @return
	 */
	List<UsuarioSistemaEntity> getAll();
}
