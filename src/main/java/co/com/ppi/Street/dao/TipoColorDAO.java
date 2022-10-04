/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

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
	 * @param tipoColor
	 */
	void insert(TipoColorEntity idColor);

	/**
	 * metodo encargado de actualizar un TipoColor en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param tipoColor
	 */
	void update(TipoColorEntity tipoColor);

	/**
	 * metodo encargado de eliminar un TipoColor en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param tipoColor
	 */
	void delete(TipoColorEntity tipoColor);

	/**
	 * metodo encargado de encontrar un TipoColor en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoColor
	 * @return
	 */
	TipoColorEntity findByPK(Long idTipoColor);
	
	/**
	 * metodo encargado de encontrar nombre del color en la BD <br>
	 * Creado el Sep 29, 2022 a las 11:40:16 PM <br>
	 *
	 * @param nombreColor
	 * @return
	 */
	TipoColorEntity findByNombre (String nombreColor);
	
	/**
	 * Va retornar todos los tipo color registrados<br>
	 * Creado el Sep 30, 2022 a las 12:34:57 AM <br>
	 *
	 * @return
	 */
	List<TipoColorEntity> getAll();
}
