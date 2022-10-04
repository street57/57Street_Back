/**
 * 
 */
package co.com.ppi.Street.dao;

import co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:23:18 PM <br>
 *
 */
public interface TipoSubcategoriaProductoDAO {
	/**
	 * metodo encargado de crear un TipoSubcategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param tipoSubcategoriaProducto
	 */
	void insert(TipoSubcategoriaProductoEntity tipoSubcategoriaProducto);

	/**
	 * metodo encargado de actualizar un TipoSubcategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param tipoSubcategoriaProducto
	 */
	void update(TipoSubcategoriaProductoEntity tipoSubcategoriaProducto);

	/**
	 * metodo encargado de eliminar un TipoSubcategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param tipoSubcategoriaProducto
	 */
	void delete(TipoSubcategoriaProductoEntity tipoSubcategoriaProducto);

	/**
	 * metodo encargado de encontrar un TipoSubcategoriaProducto  en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoSubcategoriaProducto
	 * @return
	 */
	TipoSubcategoriaProductoEntity findByPK(Long idTipoSubcategoriaProducto);
}
