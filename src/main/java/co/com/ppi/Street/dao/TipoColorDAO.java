/**
 * 
 */
package co.com.ppi.Street.dao;

import co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity;
import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:18:14 PM <br>
 *
 */
public interface TipoColorDAO {
	/**
	 * metodo encargado de crear un TipoColor en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param TipoColor
	 */
	void insert(TipoColorEntity TipoColor);

	/**
	 * metodo encargado de actualizar un TipoColor en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param TipoColor
	 */
	void update(TipoColorEntity TipoColor);

	/**
	 * metodo encargado de eliminar un TipoColor en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param TipoColor
	 */
	void delete(TipoColorEntity TipoColor);

	/**
	 * metodo encargado de encontrar un TipoColor en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoColor
	 * @return
	 */
	TipoColorEntity findByPK(Long idTipoColor);
}
