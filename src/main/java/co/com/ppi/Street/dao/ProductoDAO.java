package co.com.ppi.Street.dao;

import co.com.ppi.Street.models.entity.ProductoEntity;

public interface ProductoDAO {

	/**
	 * metodo encargado de crear un producto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param producto
	 */
	void insert(ProductoEntity producto);

	/**
	 * metodo encargado de actualizar un producto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param producto
	 */
	void update(ProductoEntity producto);

	/**
	 * metodo encargado de eliminar un producto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param producto
	 */
	void delete(ProductoEntity producto);

	/**
	 * metodo encargado de encontrar un producto en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	ProductoEntity findByPK(Long idProducto);
}
