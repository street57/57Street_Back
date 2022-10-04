/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

import co.com.ppi.Street.models.entity.DetalleProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 24, 2022 a las 1:01:38 PM <br>
 *
 */
public interface DetalleProductoDAO {
	
	/**
	 * metodo encargado de crear un DetalleProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param detalleProducto
	 */
	void insert(DetalleProductoEntity detalleProducto);

	/**
	 * metodo encargado de actualizar un DetalleProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param detalleProducto
	 */
	void update(DetalleProductoEntity detalleProducto);

	/**
	 * metodo encargado de eliminar un DetalleProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param detalleProducto
	 */
	void delete(DetalleProductoEntity detalleProducto);

	/**
	 * metodo encargado de encontrar un DetalleProducto en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idDetalleProducto
	 * @return
	 */
	DetalleProductoEntity findByPK(Long idDetalleProducto);
	
	/**
	 * Encuentra el detalleProducto por el IdProducto <br>
	 * Creado el Oct 2, 2022 a las 2:48:26 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	List<DetalleProductoEntity> findByIdProducto (Long idProducto);
}
