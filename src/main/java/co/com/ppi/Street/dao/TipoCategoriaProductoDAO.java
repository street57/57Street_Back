/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

import co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity;
import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 9:52:21 PM <br>
 *
 */
public interface TipoCategoriaProductoDAO {
	/**
	 * metodo encargado de crear un TipoCategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param tipoCategoriaProducto
	 */
	void insert(TipoCategoriaProductoEntity tipoCategoriaProducto);

	/**
	 * metodo encargado de actualizar un TipoCategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param tipoCategoriaProducto
	 */
	void update(TipoCategoriaProductoEntity tipoCategoriaProducto);

	/**
	 * metodo encargado de eliminar un TipoCategoriaProducto en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param tipoCategoriaProducto
	 */
	void delete(TipoCategoriaProductoEntity tipoCategoriaProducto);

	/**
	 * metodo encargado de encontrar un TipoCategoriaProducto en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoCategoriaProducto
	 * @return
	 */
	TipoCategoriaProductoEntity findByPK(Long idTipoCategoriaProducto);
	
	/**
	 * Metodo encargado de encontrar un TipoCategoriaProducto por nombre<br>
	 * Creado el Oct 2, 2022 a las 10:30:43 PM <br>
	 *
	 * @param nombreCategoriaProducto
	 * @return
	 */
	TipoCategoriaProductoEntity findByNombre(String nombreCategoriaProducto);
	
	/**
	 * Va retornar todos los tipoCategoriaProducto registrados <br>
	 * Creado el Oct 2, 2022 a las 10:41:36 PM <br>
	 *
	 * @return
	 */
	List<TipoCategoriaProductoEntity> getAll();
}
