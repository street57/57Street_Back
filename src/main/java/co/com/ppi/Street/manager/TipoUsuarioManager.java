/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.TipoUsuarioEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 9:48:27 PM <br>
 *
 */
public interface TipoUsuarioManager {

	/**
	 * Se crea un tipoUsuario<br>
	 * Creado el Oct 21, 2022 a las 9:50:41 PM <br>
	 *
	 * @param tipoUsuario
	 * @return
	 */
	Response create(TipoUsuarioEntity tipoUsuario);
	
	/**
	 * Se actualiza un tipoUsuario<br>
	 * Creado el Oct 21, 2022 a las 9:51:00 PM <br>
	 *
	 * @param tipoUsuario
	 * @return
	 */
	Response update(TipoUsuarioEntity tipoUsuario);
	
	/**
	 * Se elimina un tipoUsuario<br>
	 * Creado el Oct 21, 2022 a las 9:52:06 PM <br>
	 *
	 * @param idTipoUsuario
	 * @return
	 */
	Response delete(Long idTipoUsuario);
	
	/**
	 * Se encuentra un tipoUsuario por PK<br>
	 * Creado el Oct 21, 2022 a las 9:52:24 PM <br>
	 *
	 * @param idTipoUsuario
	 * @return
	 */
	TipoUsuarioEntity findByPK(Long idTipoUsuario);
	
	/**
	 * Se listan todos los tipoUsuario<br>
	 * Creado el Oct 21, 2022 a las 9:52:43 PM <br>
	 *
	 * @return
	 */
	List<TipoUsuarioEntity> getAll();
}
