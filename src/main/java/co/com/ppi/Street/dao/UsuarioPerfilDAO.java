/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

import co.com.ppi.Street.models.entity.UsuarioPerfilEntity;

/**
 * Interface encargada de definir los métodos para la capa de datos de la entidad. <br>
 * Creado el 21/10/2022 a las 21:06:42. <br>
 *
 */
public interface UsuarioPerfilDAO {

    /**
     * Método encargado de insertar un registro en la entidad UsuarioPerfil <br>
     * Creado el 21/10/2022 a las 21:06:42. <br>
     *
     * @param usuarioPerfil
    */
    void insert(UsuarioPerfilEntity usuarioPerfilEntity);

    /**
     * Método encargado de actualizar un registro en la entidad UsuarioPerfil <br>
     * Creado el 21/10/2022 a las 21:06:42. <br>
     *
     * @param usuarioPerfil
    */
    void update(UsuarioPerfilEntity usuarioPerfilEntity);

    /**
     * Método encargado de eliminar un registro en la entidad UsuarioPerfil <br>
     * Creado el 21/10/2022 a las 21:06:42. <br>
     *
     * @param usuarioPerfil
    */
    void delete(UsuarioPerfilEntity usuarioPerfilEntity);

    /**
     * Método encargado de encontrar un registro en la entidad UsuarioPerfil por su PK <br>
     * Creado el 21/10/2022 a las 21:06:42. <br>
     *
     * @return
    */
    UsuarioPerfilEntity findByPk(Long id);
    
    /**
     * Metodo encargado de encontrar un usuarioPerdil por idPerfil y idUsuario<br>
     * Creado el Oct 21, 2022 a las 11:07:59 PM <br>
     *
     * @param idPerfil
     * @param idUsuario
     * @return
     */
    UsuarioPerfilEntity finByPkAndIdUsuario(Long idPerfil, Long idUsuario);
    
    /**
     * Metodo encargado de listar los usuarioperfil<br>
     * Creado el Oct 21, 2022 a las 11:26:13 PM <br>
     *
     * @return
     */
    List<UsuarioPerfilEntity> getAll();

}