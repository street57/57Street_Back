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
	 * metodo encargado de encontrar un detalleProducto por idTipoColor en la BD<br>
	 * Creado el Oct 6, 2022 a las 2:45:12 PM <br>
	 *
	 * @param idTipoColor
	 * @return
	 */
	DetalleProductoEntity findByIdTipoColor(Long idTipoColor);
	
	/**
	 * metodo encarfado de encontrar un detalleProducto por idTipoTalla en la BD<br>
	 * Creado el Oct 6, 2022 a las 2:45:49 PM <br>
	 *
	 * @param idTipoTalla
	 * @return
	 */
	DetalleProductoEntity findByIdTipoTalla(Long idTipoTalla);
	
	/**
	 * metodo encargado de encontrar un detalleProducto por idTipoGenero en la BD<br>
	 * Creado el Oct 6, 2022 a las 2:46:29 PM <br>
	 *
	 * @param idTipoGenero
	 * @return
	 */
	DetalleProductoEntity findByIdTipoGenero(Long idTipoGenero);
	
	/**
	 * Encuentra el detalleProducto por el IdProducto <br>
	 * Creado el Oct 2, 2022 a las 2:48:26 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	DetalleProductoEntity findByIdProducto (Long idProducto);
}
