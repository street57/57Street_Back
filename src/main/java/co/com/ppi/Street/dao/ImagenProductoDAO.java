/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

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
	 * @param imagenProducto
	 */
	void insert(ImagenProductoEntity imagenProducto);

	/**
	 * metodo encargado de actualizar un ImagenProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param imagenProducto
	 */
	void update(ImagenProductoEntity imagenProducto);

	/**
	 * metodo encargado de eliminar un ImagenProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param imagenProducto
	 */
	void delete(ImagenProductoEntity imagenProducto);

	/**
	 * metodo encargado de encontrar un ImagenProducto en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idImagenProducto
	 * @return
	 */
	ImagenProductoEntity findByPK(Long idImagenProducto);
	
	/**
	 * metodo encargado de listar las imagenProducto por idProducto<br>
	 * Creado el Oct 6, 2022 a las 3:00:04 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	List<ImagenProductoEntity> findByIdProducto(Long idProducto);
	
	/**
	 * metodo encargado de listar las imagenProducto por idTipoColor<br>
	 * Creado el Oct 6, 2022 a las 3:00:45 PM <br>
	 *
	 * @param idTipoColor
	 * @return
	 */
	ImagenProductoEntity findByIdTipoColor(Long idTipoColor);
	
	
}
