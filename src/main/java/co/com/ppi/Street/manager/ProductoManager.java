package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.dto.ActualizarProductoInDTO;
import co.com.ppi.Street.models.dto.CrearProductoInDTO;
import co.com.ppi.Street.models.entity.ProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 6, 2022 a las 3:59:10 PM <br>
 *
 */
public interface ProductoManager {

	/**
	 * Se actualiza un producto<br>
	 * Creado el Oct 8, 2022 a las 8:28:32 AM <br>
	 *
	 * @param idProducto
	 * @param producto
	 * @return
	 */
	Response actualizarProducto(Long idProducto, ActualizarProductoInDTO producto);
	
	/**
	 * Se crea un producto<br>
	 * Creado el Oct 6, 2022 a las 4:32:20 PM <br>
	 *
	 * @param producto
	 * @return
	 */
	Response registrarProducto(CrearProductoInDTO producto);


	/**
	 * Se elimina un producto por su id<br>
	 * Creado el Oct 6, 2022 a las 4:32:53 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	Response delete(Long idProducto);

	/**
	 * Se encuentra el producto por el id<br>
	 * Creado el Oct 6, 2022 a las 4:33:17 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	ProductoEntity findByPK(Long idProducto);
	
	/**
	 * Método encargado de retornar el detalle de un producto. <br>
	 * Creado el Oct 19, 2022 a las 8:44:23 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	Response findDetalleProducto(Long idProducto);

	/**
	 * Se encuentra el producto por el nombre<br>
	 * Creado el Oct 6, 2022 a las 4:34:45 PM <br>
	 *
	 * @param nombreProducto
	 * @return
	 */
	ProductoEntity findByNombre(String nombreProducto);

	/**
	 * Se listan todos los productos <br>
	 * Creado el Oct 6, 2022 a las 4:34:59 PM <br>
	 *
	 * @return
	 */
	List<ProductoEntity> getAll();

}