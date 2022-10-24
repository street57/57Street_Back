/**
 * 
 */
package co.com.ppi.Street.dao;

import java.util.List;

import co.com.ppi.Street.models.entity.UsuarioSistemaEntity;

/**
 * Interface encargada de definir los métodos para la capa de datos de la entidad. <br>
 * Creado el 21/10/2022 a las 20:55:21. <br>
 *
 */
public interface UsuarioSistemaDAO {

    /**
     * Método encargado de insertar un registro en la entidad UsuarioSistema <br>
     * Creado el 21/10/2022 a las 20:55:21. <br>
     *
     * @param usuarioSistema
    */
    void insert(UsuarioSistemaEntity usuarioSistemaEntity);

    /**
     * Método encargado de actualizar un registro en la entidad UsuarioSistema <br>
     * Creado el 21/10/2022 a las 20:55:21. <br>
     *
     * @param usuarioSistema
    */
    void update(UsuarioSistemaEntity usuarioSistemaEntity);

    /**
     * Método encargado de eliminar un registro en la entidad UsuarioSistema <br>
     * Creado el 21/10/2022 a las 20:55:21. <br>
     *
     * @param usuarioSistema
    */
    void delete(UsuarioSistemaEntity usuarioSistemaEntity);

    /**
     * Método encargado de encontrar un registro en la entidad UsuarioSistema por su PK <br>
     * Creado el 21/10/2022 a las 20:55:21. <br>
     *
     * @return
    */
    UsuarioSistemaEntity findByPk(Long id);
    
    /**
     * Metodo encargado de encontrar un registro en la entidad UsuarioSistema por su email<br>
     * Creado el Oct 21, 2022 a las 10:23:33 PM <br>
     *
     * @param email
     * @return
     */
    UsuarioSistemaEntity findByEmail(String email);
    
    /**
	 * Método encargado de encontrar un usuario por email y clave. <br>
	 * Creado el Oct 22, 2022 a las 8:28:22 PM <br>
	 *
	 * @param email
	 * @param clave
	 * @return
	 */
	UsuarioSistemaEntity findByEmailAndClave(String email, String clave);
    
    /**
     * Metodo encargado de listar todos los usuariosSistema<br>
     * Creado el Oct 21, 2022 a las 10:27:18 PM <br>
     *
     * @return
     */
    List<UsuarioSistemaEntity> getAll();
    
  }
