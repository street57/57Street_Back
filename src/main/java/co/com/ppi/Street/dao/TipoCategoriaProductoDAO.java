/**
 * 
 */
package co.com.ppi.Street.dao;

import co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 9:52:21 PM <br>
 *
 */
public interface TipoCategoriaProductoDAO {
	/**
	 * metodo encargado de crear un TipoCategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param TipoCategoriaProducto
	 */
	void insert(TipoCategoriaProductoEntity TipoCategoriaProducto);

	/**
	 * metodo encargado de actualizar un TipoCategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param TipoCategoriaProducto
	 */
	void update(TipoCategoriaProductoEntity TipoCategoriaProducto);

	/**
	 * metodo encargado de eliminar un TipoCategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param TipoCategoriaProducto
	 */
	void delete(TipoCategoriaProductoEntity TipoCategoriaProducto);

	/**
	 * metodo encargado de encontrar un TipoCategoriaProducto en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoCategoriaProducto
	 * @return
	 */
	TipoCategoriaProductoEntity findByPK(Long idTipoCategoriaProducto);
}
