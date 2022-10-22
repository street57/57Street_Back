/**
 * 
 */
package co.com.ppi.Street.dao;

import co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity;

/**
 * Interface encargada de definir los métodos para la capa de datos de la entidad. <br>
 * Creado el 21/10/2022 a las 21:07:44. <br>
 *
 */
public interface TipoPerfilUsuarioDAO {

    /**
     * Método encargado de insertar un registro en la entidad TipoPerfilUsuario <br>
     * Creado el 21/10/2022 a las 21:07:44. <br>
     *
     * @param tipoPerfilUsuario
    */
    void insert(TipoPerfilUsuarioEntity tipoPerfilUsuarioEntity);

    /**
     * Método encargado de actualizar un registro en la entidad TipoPerfilUsuario <br>
     * Creado el 21/10/2022 a las 21:07:44. <br>
     *
     * @param tipoPerfilUsuario
    */
    void update(TipoPerfilUsuarioEntity tipoPerfilUsuarioEntity);

    /**
     * Método encargado de eliminar un registro en la entidad TipoPerfilUsuario <br>
     * Creado el 21/10/2022 a las 21:07:44. <br>
     *
     * @param tipoPerfilUsuario
    */
    void delete(TipoPerfilUsuarioEntity tipoPerfilUsuarioEntity);

    /**
     * Método encargado de encontrar un registro en la entidad TipoPerfilUsuario por su PK <br>
     * Creado el 21/10/2022 a las 21:07:44. <br>
     *
     * @return
    */
    TipoPerfilUsuarioEntity findByPk(Long id);

}