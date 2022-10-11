/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

import co.com.ppi.Street.models.entity.TipoGeneroEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:20:21 PM <br>
 *
 */
public interface TipoGeneroDAO {
	/**
	 * metodo encargado de crear un TipoGenero en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:10 PM <br>
	 *
	 * @param tipoGenero
	 */
	void insert(TipoGeneroEntity tipoGenero);

	/**
	 * metodo encargado de actualizar un TipoGenero en BD <br>
	 * Creado el Aug 28, 2022 a las 7:58:53 PM <br>
	 *
	 * @param tipoGenero
	 */
	void update(TipoGeneroEntity tipoGenero);

	/**
	 * metodo encargado de eliminar un TipoGenero en BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:21 PM <br>
	 *
	 * @param tipoGenero
	 */
	void delete(TipoGeneroEntity tipoGenero);

	/**
	 * metodo encargado de encontrar un TipoGenero en la BD <br>
	 * Creado el Aug 28, 2022 a las 7:59:46 PM <br>
	 *
	 * @param idTipoGenero
	 * @return
	 */
	TipoGeneroEntity findByPK(Long idTipoGenero);
	
	/**
	 * metodo encargado de listar todos los tipoGenero por genero de la BD<br>
	 * Creado el Oct 6, 2022 a las 3:11:33 PM <br>
	 *
	 * @param genero
	 * @return
	 */
	TipoGeneroEntity findByGenero(String genero);
	
	/**
	 * metodo encargado de listar todos los tipoGenero por abreviatura de la BD<br>
	 * Creado el Oct 6, 2022 a las 3:12:12 PM <br>
	 *
	 * @param abreviatura
	 * @return
	 */
	TipoGeneroEntity finByAbreviatura(String abreviatura);
	
	/**
	 * Va retornar todos los tipoGenero registrados<br>
	 * Creado el Oct 6, 2022 a las 3:12:45 PM <br>
	 *
	 * @return
	 */
	List<TipoGeneroEntity> getAll();
}
