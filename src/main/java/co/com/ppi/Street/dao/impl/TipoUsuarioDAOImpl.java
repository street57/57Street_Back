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

import co.com.ppi.Street.dao.TipoUsuarioDAO;
import co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity;
import co.com.ppi.Street.models.entity.TipoUsuarioEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 9:17:55 PM <br>
 *
 */
@Repository
public class TipoUsuarioDAOImpl implements TipoUsuarioDAO{

	@PersistenceContext()
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoUsuarioDAO#insert(co.com.ppi.Street.models.entity.TipoUsuarioEntity)
	 */
	@Override
	public void insert(TipoUsuarioEntity tipoUsuarioEntity) {
		this.entityManager.persist(tipoUsuarioEntity);
		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoUsuarioDAO#update(co.com.ppi.Street.models.entity.TipoUsuarioEntity)
	 */
	@Override
	public void update(TipoUsuarioEntity tipoUsuarioEntity) {
		this.entityManager.merge(tipoUsuarioEntity);
		this.entityManager.flush();
		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoUsuarioDAO#delete(co.com.ppi.Street.models.entity.TipoUsuarioEntity)
	 */
	@Override
	public void delete(TipoUsuarioEntity tipoUsuarioEntity) {
		this.entityManager.remove(tipoUsuarioEntity);
		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoUsuarioDAO#findByPk(java.lang.Long)
	 */
	@Override
	public TipoUsuarioEntity findByPk(Long id) {
		return this.entityManager.find(TipoUsuarioEntity.class, id);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoUsuarioDAO#getAll()
	 */
	@Override
	public List<TipoUsuarioEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_USUARIO",
				TipoUsuarioEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}
	
	
}
