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

import co.com.ppi.Street.dao.UsuarioSistemaDAO;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.UsuarioSistemaEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 9:08:50 PM <br>
 *
 */
@Repository
public class UsuarioSistemaDAOImpl implements UsuarioSistemaDAO {

	@PersistenceContext()
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioSistemaDAO#insert(co.com.ppi.Street.models.entity.UsuarioSistemaEntity)
	 */
	@Override
	public void insert(UsuarioSistemaEntity usuarioSistemaEntity) {
		this.entityManager.persist(usuarioSistemaEntity);
		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioSistemaDAO#update(co.com.ppi.Street.models.entity.UsuarioSistemaEntity)
	 */
	@Override
	public void update(UsuarioSistemaEntity usuarioSistemaEntity) {
		this.entityManager.merge(usuarioSistemaEntity);
		this.entityManager.flush();	
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioSistemaDAO#delete(co.com.ppi.Street.models.entity.UsuarioSistemaEntity)
	 */
	@Override
	public void delete(UsuarioSistemaEntity usuarioSistemaEntity) {
		this.entityManager.remove(usuarioSistemaEntity);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioSistemaDAO#findByPk(java.lang.Long)
	 */
	@Override
	public UsuarioSistemaEntity findByPk(Long id) {
		return this.entityManager.find(UsuarioSistemaEntity.class, id);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioSistemaDAO#findByEmail(java.lang.String)
	 */
	@Override
	public UsuarioSistemaEntity findByEmail(String email) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM USUARIO_SISTEMA WHERE EMAIL = ?1", 
				UsuarioSistemaEntity.class);
		query.setParameter(1, email);		
		try {
			return (UsuarioSistemaEntity) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}

	}
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioSistemaDAO#findByEmailAndClave(java.lang.String, java.lang.String)
	 */
	@Override
	public UsuarioSistemaEntity findByEmailAndClave(String email, String clave) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM USUARIO_SISTEMA WHERE UPPER(EMAIL) = UPPER(?1) AND CLAVE = ?2", 
				UsuarioSistemaEntity.class);
		query.setParameter(1, email);
 		query.setParameter(2, clave);		
		try {
			return (UsuarioSistemaEntity) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioSistemaDAO#getAll()
	 */
	@Override
	public List<UsuarioSistemaEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM USUARIO_SISTEMA", 
				UsuarioSistemaEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

}
