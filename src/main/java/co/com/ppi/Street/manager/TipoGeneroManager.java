/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.TipoGeneroEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 6, 2022 a las 3:59:55 PM <br>
 *
 */
public interface TipoGeneroManager {

	/**
	 * Se crea tipo genero <br>
	 * Creado el Oct 6, 2022 a las 5:33:24 PM <br>
	 *
	 * @param tipoGenero
	 * @return
	 */
	Response create(TipoGeneroEntity tipoGenero);
	
	/**
	 * Se actualiza el tipo genero<br>
	 * Creado el Oct 6, 2022 a las 5:41:00 PM <br>
	 *
	 * @param tipoGenero
	 * @return
	 */
	Response update(TipoGeneroEntity tipoGenero);
	
	/**
	 * Se elimina un tipo genero<br>
	 * Creado el Oct 6, 2022 a las 5:41:31 PM <br>
	 *
	 * @param idTipoGenero
	 * @return
	 */
	Response delete(Long idTipoGenero);
	
	/**
	 * Se encuentra tipoGenero por id<br>
	 * Creado el Oct 6, 2022 a las 5:41:48 PM <br>
	 *
	 * @param idTipoGenero
	 * @return
	 */
	TipoGeneroEntity findByPK(Long idTipoGenero);
	
	/**
	 * Se lista todos los tipoGenero por genero<br>
	 * Creado el Oct 6, 2022 a las 3:11:33 PM <br>
	 *
	 * @param genero
	 * @return
	 */
	TipoGeneroEntity findByGenero(String genero);
	
	/**
	 * Se lista todos los tipoGenero por abreviatura<br>
	 * Creado el Oct 6, 2022 a las 3:12:12 PM <br>
	 *
	 * @param abreviatura
	 * @return
	 */
	TipoGeneroEntity finByAbreviatura(String abreviatura);
	
	/**
	 * Se listan todos los tipo Genero<br>
	 * Creado el Oct 6, 2022 a las 3:12:45 PM <br>
	 *
	 * @return
	 */
	List<TipoGeneroEntity> getAll();
}


