/**
 * 
 */
package co.com.ppi.Street.manager;

import java.util.List;

import javax.ws.rs.core.Response;

import co.com.ppi.Street.models.entity.ImagenProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 6, 2022 a las 3:58:59 PM <br>
 *
 */
public interface ImagenProductoManager {

	/**
	 * Se crea la imagen del producto<br>
	 * Creado el Oct 6, 2022 a las 4:18:51 PM <br>
	 *
	 * @param imagenProducto
	 * @return
	 */
	Response create(ImagenProductoEntity imagenProducto);
	
	/**
	 * Se actualiza la imagen del producto<br>
	 * Creado el Oct 6, 2022 a las 4:19:06 PM <br>
	 *
	 * @param imagenProducto
	 * @return
	 */
	Response update(ImagenProductoEntity imagenProducto);
	
	/**
	 * Se elimina la imagen del producto con el id de imagenProducto<br>
	 * Creado el Oct 6, 2022 a las 4:19:23 PM <br>
	 *
	 * @param idImagenProducto
	 * @return
	 */
	Response delete(Long idImagenProducto);
	
	/**
	 * Se encuentra imagenProducto por el idImagenProducto<br>
	 * Creado el Oct 6, 2022 a las 4:20:09 PM <br>
	 *
	 * @param idImagenProducto
	 * @return
	 */
	ImagenProductoEntity findByPK(Long idImagenProducto);
	
	/**
	 * Se encuentra la imagen del producto por el id del producto<br>
	 * Creado el Oct 6, 2022 a las 4:20:51 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	List<ImagenProductoEntity> findByIdProducto(Long idProducto);
	
	/**
	 * Se encuentra la imagen por id de tipo color<br>
	 * Creado el Oct 6, 2022 a las 4:21:18 PM <br>
	 *
	 * @param idTipoColor
	 * @return
	 */
	ImagenProductoEntity findByIdTipoColor(Long idTipoColor);
	
	/**
	 * Convertimos una imagen en base 64 a bytes<br>
	 * Creado el Oct 7, 2022 a las 8:59:22 PM <br>
	 *
	 * @return
	 */
	byte[] base64ToBytes(String base64);
	
	/**
	 * Convertimos una imagen de bytes a base64<br>
	 * Creado el Oct 7, 2022 a las 9:12:12 PM <br>
	 *
	 * @param bytes
	 * @return
	 */
	String bytesToBase64(byte[] bytes);
}
