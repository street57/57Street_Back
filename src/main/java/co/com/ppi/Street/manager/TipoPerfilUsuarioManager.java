/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 9:59:04 PM <br>
 *
 */
public interface TipoPerfilUsuarioManager {

	/**
	 * Se crea un tipoPerfilUsuario<br>
	 * Creado el Oct 21, 2022 a las 10:01:37 PM <br>
	 *
	 * @param tipoPerfilUsuario
	 * @return
	 */
	Response create(TipoPerfilUsuarioEntity tipoPerfilUsuario);
	
	/**
	 * Se actualiza un tipoPerfilUsuario<br>
	 * Creado el Oct 21, 2022 a las 10:01:53 PM <br>
	 *
	 * @param tipoPerfilUsuario
	 * @return
	 */
	Response update(TipoPerfilUsuarioEntity tipoPerfilUsuario);
	
	/**
	 * Se elimina un tipoPerfilUsuario<br>
	 * Creado el Oct 21, 2022 a las 10:02:14 PM <br>
	 *
	 * @param idTipoPerfilUsuario
	 * @return
	 */
	Response delete(Long idTipoPerfilUsuario);
	
	/**
	 * Se encuentra un tipoPerfilUsuario por PK<br>
	 * Creado el Oct 21, 2022 a las 10:02:36 PM <br>
	 *
	 * @param idTipoPerfilUsuario
	 * @return
	 */
	TipoPerfilUsuarioEntity findByPK(Long idTipoPerfilUsuario);
	
	/**
	 * Se listan todos los tipoPerfilUsuario<br>
	 * Creado el Oct 21, 2022 a las 10:02:58 PM <br>
	 *
	 * @return
	 */
	List<TipoPerfilUsuarioEntity> getAll();
}
