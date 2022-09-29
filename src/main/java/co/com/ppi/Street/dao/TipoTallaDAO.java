/**
 * 
 */
package co.com.ppi.Street.dao;

import co.com.ppi.Street.models.entity.TipoTallaEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:26:34 PM <br>
 *
 */
public interface TipoTallaDAO {
	/**
	 * metodo encargado de crear un TipoTalla en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param TipoTalla
	 */
	void insert(TipoTallaEntity TipoTalla);

	/**
	 * metodo encargado de actualizar un TipoTalla en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param TipoTalla
	 */
	void update(TipoTallaEntity TipoTalla);

	/**
	 * metodo encargado de eliminar un TipoTalla en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param TipoTalla
	 */
	void delete(TipoTallaEntity TipoTalla);

	/**
	 * metodo encargado de encontrar un TipoTalla en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoTalla
	 * @return
	 */
	TipoTallaEntity findByPK(Long idTipoTalla);
}
