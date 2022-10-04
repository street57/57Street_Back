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

import co.com.ppi.Street.dao.TipoColorDAO;
import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:48:06 PM <br>
 *
 */
@Repository
public class TipoColorDAOImpl implements TipoColorDAO {

	@PersistenceContext()
	private EntityManager entityManager;
	

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoColorDAO#update(co.com.ppi.Street.models.entity.TipoColorEntity)
	 */
	@Override
	public void update(TipoColorEntity tipoColor) {
		this.entityManager.merge(tipoColor);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoColorDAO#delete(co.com.ppi.Street.models.entity.TipoColorEntity)
	 */
	@Override
	public void delete(TipoColorEntity tipoColor) {
		this.entityManager.remove(tipoColor);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoColorDAO#findByPK(java.lang.Long)
	 */
	@Override
	public TipoColorEntity findByPK(Long idTipoColor) {
		return this.entityManager.find(TipoColorEntity.class, idTipoColor);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoColorDAO#findByNombre(java.lang.String)
	 */
	@Override
	public TipoColorEntity findByNombre(String nombreColor) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_COLOR WHERE NOMBRE = ?1", 
				TipoColorEntity.class);
		query.setParameter(1, nombreColor);
		try {
			return (TipoColorEntity) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoColorDAO#getAll()
	 */
	@Override
	public List<TipoColorEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_COLOR", 
				TipoColorEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoColorDAO#insert(co.com.ppi.Street.models.entity.TipoColorEntity)
	 */
	@Override
	public void insert(TipoColorEntity tipoColor) {
		this.entityManager.persist(tipoColor);		
	}

}
