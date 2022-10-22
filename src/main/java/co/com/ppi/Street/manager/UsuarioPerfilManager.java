/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.UsuarioPerfilEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 9:53:21 PM <br>
 *
 */
public interface UsuarioPerfilManager {

	/**
	 * Se crea un usuarioPerfil<br>
	 * Creado el Oct 21, 2022 a las 9:57:18 PM <br>
	 *
	 * @param usuarioPerfil
	 * @return
	 */
	Response create(UsuarioPerfilEntity usuarioPerfil);
	
	/**
	 * Se actualiza un usuarioPerfil<br>
	 * Creado el Oct 21, 2022 a las 9:57:36 PM <br>
	 *
	 * @param usuarioPerfil
	 * @return
	 */
	Response update(UsuarioPerfilEntity usuarioPerfil);
	
	/**
	 * Se elimina un usuarioPerfil<br>
	 * Creado el Oct 21, 2022 a las 9:57:54 PM <br>
	 *
	 * @param idUsuarioPerfil
	 * @return
	 */
	Response delete(Long idUsuarioPerfil);
	
	/**
	 * Se encuentra un usuarioPerfil por PK<br>
	 * Creado el Oct 21, 2022 a las 9:58:10 PM <br>
	 *
	 * @param idUsuarioPerfil
	 * @return
	 */
	UsuarioPerfilEntity findByPK(Long idUsuarioPerfil);
	
	/**
	 * Se listan todos los usuariosPerfil<br>
	 * Creado el Oct 21, 2022 a las 9:58:27 PM <br>
	 *
	 * @return
	 */
	List<UsuarioPerfilEntity> getAll();
}
