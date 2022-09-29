/**
 * 
 */
package co.com.ppi.Street.dao;

import co.com.ppi.Street.models.entity.ImagenProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 9:49:21 PM <br>
 *
 */
public interface ImagenProductoDAO {
	/**
	 * metodo encargado de crear un ImagenProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param ImagenProducto
	 */
	void insert(ImagenProductoEntity ImagenProducto);

	/**
	 * metodo encargado de actualizar un ImagenProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param ImagenProducto
	 */
	void update(ImagenProductoEntity ImagenProducto);

	/**
	 * metodo encargado de eliminar un ImagenProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param ImagenProducto
	 */
	void delete(ImagenProductoEntity ImagenProducto);

	/**
	 * metodo encargado de encontrar un ImagenProducto en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idImagenProducto
	 * @return
	 */
	ImagenProductoEntity findByPK(Long idImagenProducto);
}
