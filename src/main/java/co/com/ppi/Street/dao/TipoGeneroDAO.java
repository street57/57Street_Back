/**
 * 
 */
package co.com.ppi.Street.dao;

import co.com.ppi.Street.models.entity.TipoGeneroEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:20:21 PM <br>
 *
 */
public interface TipoGeneroDAO {
	/**
	 * metodo encargado de crear un TipoGenero en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param TipoGenero
	 */
	void insert(TipoGeneroEntity TipoGenero);

	/**
	 * metodo encargado de actualizar un TipoGenero en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param TipoGenero
	 */
	void update(TipoGeneroEntity TipoGenero);

	/**
	 * metodo encargado de eliminar un TipoGenero en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param TipoGenero
	 */
	void delete(TipoGeneroEntity TipoGenero);

	/**
	 * metodo encargado de encontrar un TipoGenero en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoGenero
	 * @return
	 */
	TipoGeneroEntity findByPK(Long idTipoGenero);
}
