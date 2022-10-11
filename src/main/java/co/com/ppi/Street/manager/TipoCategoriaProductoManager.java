/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 6, 2022 a las 3:59:37 PM <br>
 *
 */
public interface TipoCategoriaProductoManager {

	/**
	 * Se crea una categoriaProducto<br>
	 * Creado el Oct 6, 2022 a las 4:41:23 PM <br>
	 *
	 * @param tipoCategoriaProducto
	 * @return
	 */
	Response create(TipoCategoriaProductoEntity tipoCategoriaProducto);

	/**
	 * Se actualiza una categoriaProducto<br>
	 * Creado el Oct 6, 2022 a las 4:41:46 PM <br>
	 *
	 * @param tipoCategoriaProducto
	 * @return
	 */
	Response update(TipoCategoriaProductoEntity tipoCategoriaProducto);

	/**
	 * Se elimina una categoriaProducto<br>
	 * Creado el Oct 6, 2022 a las 4:42:12 PM <br>
	 *
	 * @param idTipoCategoriaProducto
	 * @return
	 */
	Response delete(Long idTipoCategoriaProducto);

	/**
	 * Se encuentra una categoriaProducto por el id<br>
	 * Creado el Oct 6, 2022 a las 4:43:09 PM <br>
	 *
	 * @param idTipoCategoriaProducto
	 * @return
	 */
	TipoCategoriaProductoEntity findByPK(Long idTipoCategoriaProducto);

	/**
	 * Se encuentra un TipoCategoriaProducto por nombre<br>
	 * Creado el Oct 2, 2022 a las 10:30:43 PM <br>
	 *
	 * @param nombreCategoriaProducto
	 * @return
	 */
	TipoCategoriaProductoEntity findByNombre(String nombreCategoriaProducto);

	/**
	 * Se listan los tipoCategoriaProducto<br>
	 * Creado el Oct 2, 2022 a las 10:41:36 PM <br>
	 *
	 * @return
	 */
	List<TipoCategoriaProductoEntity> getAll();

}
