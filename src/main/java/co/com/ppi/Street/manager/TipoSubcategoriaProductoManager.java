/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 6, 2022 a las 4:00:55 PM <br>
 *
 */
public interface TipoSubcategoriaProductoManager {

	/**
	 * Se crea una subcategoria de producto<br>
	 * Creado el Oct 7, 2022 a las 12:27:09 AM <br>
	 *
	 * @param tipoSubcategoriaProducto
	 * @return
	 */
	Response create(TipoSubcategoriaProductoEntity tipoSubcategoriaProducto);

	/**
	 * Se actualiza una subcategoria producto<br>
	 * Creado el Oct 7, 2022 a las 12:27:33 AM <br>
	 *
	 * @param tipoSubcategoriaProducto
	 * @return
	 */
	Response update(TipoSubcategoriaProductoEntity tipoSubcategoriaProducto);

	/**
	 * Se elimina una subcategoria producto<br>
	 * Creado el Oct 7, 2022 a las 12:30:35 AM <br>
	 *
	 * @param IdTipoSubcategoriaProducto
	 * @return
	 */
	Response delete(Long IdTipoSubcategoriaProducto);

	/**
	 * Se encuentra una subcategoria producto por id<br>
	 * Creado el Oct 7, 2022 a las 12:31:04 AM <br>
	 *
	 * @param idTipoSubcategoriaProducto
	 * @return
	 */
	TipoSubcategoriaProductoEntity findByPK(Long idTipoSubcategoriaProducto);

	/**
	 * Se encuentra una subcategoria producto por nombre<br>
	 * Creado el Oct 6, 2022 a las 3:22:46 PM <br>
	 *
	 * @param nombre
	 * @return
	 */
	TipoSubcategoriaProductoEntity findByNombre(String nombre);

	/**
	 * Se encuentra una subcategoria producto por idTipoCategoriaProducto
	 * idTipoCategoriaProducto<br>
	 * Creado el Oct 6, 2022 a las 3:27:23 PM <br>
	 *
	 * @param idTipoCategoriaProducto
	 * @return
	 */
	TipoSubcategoriaProductoEntity findByIdTipoCategoriaProducto(Long idTipoCategoriaProducto);

	/**
	 * Se listan todas las subcategorias producto<br>
	 * Creado el Oct 11, 2022 a las 5:16:06 PM <br>
	 *
	 * @return
	 */
	List<TipoSubcategoriaProductoEntity> getAll();
}
