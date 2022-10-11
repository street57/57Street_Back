/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.TipoTallaEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 6, 2022 a las 4:00:26 PM <br>
 *
 */
public interface TipoTallaManager {

	/**
	 * se crea el tipo talla<br>
	 * Creado el Oct 7, 2022 a las 12:40:59 AM <br>
	 *
	 * @param tipoTalla
	 * @return
	 */
	Response create(TipoTallaEntity tipoTalla);
	
	/**
	 * Se actualiza el tipo talla<br>
	 * Creado el Oct 7, 2022 a las 12:41:17 AM <br>
	 *
	 * @param tipoTalla
	 * @return
	 */
	Response update(TipoTallaEntity tipoTalla);
	
	/**
	 * Se elimina el tipo talla<br>
	 * Creado el Oct 7, 2022 a las 12:41:36 AM <br>
	 *
	 * @param idTipoTalla
	 * @return
	 */
	Response delete(Long idTipoTalla);
	
	/**
	 * Se encuentra el tipo talla<br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoTalla
	 * @return
	 */
	TipoTallaEntity findByPK(Long idTipoTalla);
	
	/**
	 * Se encuentra el tipo talla por el nombre<br>
	 * Creado el Oct 6, 2022 a las 3:38:25 PM <br>
	 *
	 * @param nombreTipoTalla
	 * @return
	 */
	TipoTallaEntity findByNombre(String nombreTipoTalla);
	
	/**
	 * Se listan todos los tipo talla<br>
	 * Creado el Sep 30, 2022 a las 12:34:57 AM <br>
	 *
	 * @return
	 */
	List<TipoTallaEntity> getAll();

}
