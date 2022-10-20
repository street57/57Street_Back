/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.DetalleProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 6, 2022 a las 3:58:09 PM <br>
 *
 */
public interface DetalleProductoManager {

	/**
	 * Se crea el detalle del producto<br>
	 * Creado el Oct 6, 2022 a las 4:10:29 PM <br>
	 *
	 * @param detalleProducto
	 * @return
	 */
	Response create(DetalleProductoEntity detalleProducto);
	
	/**
	 * Se actualiza el detalle del producto<br>
	 * Creado el Oct 6, 2022 a las 4:11:16 PM <br>
	 *
	 * @param detalleProducto
	 * @return
	 */
	Response update(DetalleProductoEntity detalleProducto);
	
	/**
	 * Se elimina el detalle del producto<br>
	 * Creado el Oct 6, 2022 a las 4:11:33 PM <br>
	 *
	 * @param idDetalleProducto
	 * @return
	 */
	Response delete(Long idDetalleProducto);
	
	/**
	 * Se encuentra el detalle del producto<br>
	 * Creado el Oct 6, 2022 a las 4:13:02 PM <br>
	 *
	 * @param idDetalleProducto
	 * @return
	 */
	DetalleProductoEntity findByPK(Long idDetalleProducto);
	
	/**
	 * Se encuentra el detalle del producto por el id de tipo color<br>
	 * Creado el Oct 6, 2022 a las 4:13:21 PM <br>
	 *
	 * @param idTipoColor
	 * @return
	 */
	DetalleProductoEntity findByIdTipoColor(Long idTipoColor);
	
	/**
	 * Se encuentra el detalle del producto por el id de tipo talla<br>
	 * Creado el Oct 6, 2022 a las 4:13:39 PM <br>
	 *
	 * @param idTipoTalla
	 * @return
	 */
	DetalleProductoEntity findByIdTipoTalla(Long idTipoTalla);

	/**
	 * Se encuentra el detalle del producto por el id de tipo genero<br>
	 * Creado el Oct 6, 2022 a las 4:14:00 PM <br>
	 *
	 * @param idTipoGenero
	 * @return
	 */
	DetalleProductoEntity findByIdTipoGenero(Long idTipoGenero);

	/**
	 * Se encuentra el detalle del producto por id del producto<br>
	 * Creado el Oct 6, 2022 a las 4:14:14 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	List<DetalleProductoEntity> findByIdProducto (Long idProducto);
}
