/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 29, 2022 a las 11:15:10 PM <br>
 *
 */
public interface TipoColorManager  {
	
	/**
	 * se crea el tipo color <br>
	 * Creado el Sep 29, 2022 a las 11:28:27 PM <br>
	 *
	 * @param tipoColor
	 * @return
	 */
	Response create(TipoColorEntity tipoColor);
	
	/**
	 * Se actualiza el tipo color<br>
	 * Creado el Sep 29, 2022 a las 11:29:02 PM <br>
	 *
	 * @param tipoColor
	 */
	Response update(TipoColorEntity tipoColor);
	
	/**
	 * Se elimina el tipo color <br>
	 * Creado el Sep 29, 2022 a las 11:29:24 PM <br>
	 *
	 * @param idTipoColor
	 */
	Response delete(Long idTipoColor);
	
	/**
	 * Se encuentra el tipo color<br>
	 * Creado el Sep 29, 2022 a las 11:30:38 PM <br>
	 *
	 * @param idTipoColor
	 * @return
	 */
	TipoColorEntity findByPK(Long idTipoColor);
	
	/**
	 * Se encuentra el tipo color por el nombre<br>
	 * Creado el Oct 6, 2022 a las 4:12:36 PM <br>
	 *
	 * @param nombreColor
	 * @return
	 */
	TipoColorEntity findByNombre (String nombreColor);
	
	/**
	 * Se listan todos los tipo color<br>
	 * Creado el Oct 6, 2022 a las 4:12:17 PM <br>
	 *
	 * @return
	 */
	List<TipoColorEntity> getAll();
}
