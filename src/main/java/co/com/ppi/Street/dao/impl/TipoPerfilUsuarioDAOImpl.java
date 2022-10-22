/**
 * 
 */
package co.com.ppi.Street.dao.impl;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import co.com.ppi.Street.dao.TipoPerfilUsuarioDAO;
import co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 9:23:35 PM <br>
 *
 */
@Repository
public class TipoPerfilUsuarioDAOImpl implements TipoPerfilUsuarioDAO{

	@PersistenceContext()
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoPerfilUsuarioDAO#insert(co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity)
	 */
	@Override
	public void insert(TipoPerfilUsuarioEntity tipoPerfilUsuarioEntity) {
		this.entityManager.persist(tipoPerfilUsuarioEntity);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoPerfilUsuarioDAO#update(co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity)
	 */
	@Override
	public void update(TipoPerfilUsuarioEntity tipoPerfilUsuarioEntity) {
		this.entityManager.merge(tipoPerfilUsuarioEntity);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoPerfilUsuarioDAO#delete(co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity)
	 */
	@Override
	public void delete(TipoPerfilUsuarioEntity tipoPerfilUsuarioEntity) {
		this.entityManager.remove(tipoPerfilUsuarioEntity);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoPerfilUsuarioDAO#findByPk(java.lang.Long)
	 */
	@Override
	public TipoPerfilUsuarioEntity findByPk(Long id) {
		return this.entityManager.find(TipoPerfilUsuarioEntity.class, id);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoPerfilUsuarioDAO#getAll()
	 */
	@Override
	public List<TipoPerfilUsuarioEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_PERFIL_USUARIO",
				TipoPerfilUsuarioEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

}
