/**
 * 
 */
package co.com.ppi.Street.manager;

import co.com.ppi.Street.models.dto.InformacionProductoDTO;

/**
 * TODO: descripción <br>
 * Creado el Oct 2, 2022 a las 2:29:51 PM <br>
 *
 */
public interface InformacionProductoManager {
	
	/**
	 * Retornara la informacion de un producto por un ID <br>
	 * Creado el Oct 2, 2022 a las 2:34:24 PM <br>
	 *
	 * @param idProducto
	 * @return
	 */
	InformacionProductoDTO findInformacionProductoByIdProducto(Long idProducto);
	
}
