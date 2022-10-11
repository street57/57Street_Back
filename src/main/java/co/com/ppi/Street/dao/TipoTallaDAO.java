/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

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
	 * @param tipoTalla
	 */
	void insert(TipoTallaEntity tipoTalla);

	/**
	 * metodo encargado de actualizar un TipoTalla en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param tipoTalla
	 */
	void update(TipoTallaEntity tipoTalla);

	/**
	 * metodo encargado de eliminar un TipoTalla en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param tipoTalla
	 */
	void delete(TipoTallaEntity tipoTalla);

	/**
	 * metodo encargado de encontrar un TipoTalla en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoTalla
	 * @return
	 */
	TipoTallaEntity findByPK(Long idTipoTalla);
	
	/**
	 * metodo encargado de encontrar nombre de la talla en la BD<br>
	 * Creado el Oct 6, 2022 a las 3:38:25 PM <br>
	 *
	 * @param nombreTipoTalla
	 * @return
	 */
	TipoTallaEntity findByNombre(String nombreTipoTalla);
	
	/**
	 * Va retornar todos los tipo talla registrados<br>
	 * Creado el Sep 30, 2022 a las 12:34:57 AM <br>
	 *
	 * @return
	 */
	List<TipoTallaEntity> getAll();
}
