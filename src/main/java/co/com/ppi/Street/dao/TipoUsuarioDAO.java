/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

import co.com.ppi.Street.models.entity.TipoUsuarioEntity;

/**
 * Interface encargada de definir los métodos para la capa de datos de la entidad. <br>
 * Creado el 21/10/2022 a las 21:04:24. <br>
 *
 */
public interface TipoUsuarioDAO {

    /**
     * Método encargado de insertar un registro en la entidad TipoUsuario <br>
     * Creado el 21/10/2022 a las 21:04:24. <br>
     *
     * @param tipoUsuario
    */
    void insert(TipoUsuarioEntity tipoUsuarioEntity);

    /**
     * Método encargado de actualizar un registro en la entidad TipoUsuario <br>
     * Creado el 21/10/2022 a las 21:04:24. <br>
     *
     * @param tipoUsuario
    */
    void update(TipoUsuarioEntity tipoUsuarioEntity);

    /**
     * Método encargado de eliminar un registro en la entidad TipoUsuario <br>
     * Creado el 21/10/2022 a las 21:04:24. <br>
     *
     * @param tipoUsuario
    */
    void delete(TipoUsuarioEntity tipoUsuarioEntity);

    /**
     * Método encargado de encontrar un registro en la entidad TipoUsuario por su PK <br>
     * Creado el 21/10/2022 a las 21:04:24. <br>
     *
     * @return
    */
    TipoUsuarioEntity findByPk(Long id);
    
    /**
     * Metodo encargado de listar todos los tipoUsuario<br>
     * Creado el Oct 22, 2022 a las 12:15:37 AM <br>
     *
     * @return
     */
    List<TipoUsuarioEntity> getAll();

}