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

import co.com.ppi.Street.dao.TipoTallaDAO;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.TipoTallaEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:50:19 PM <br>
 *
 */
@Repository
public class TipoTallaDAOImpl implements TipoTallaDAO {

	@PersistenceContext()
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoTallaDAO#insert(co.com.ppi.Street.models.entity.TipoTallaEntity)
	 */
	@Override
	public void insert(TipoTallaEntity tipoTalla) {
		this.entityManager.persist(tipoTalla);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoTallaDAO#update(co.com.ppi.Street.models.entity.TipoTallaEntity)
	 */
	@Override
	public void update(TipoTallaEntity tipoTalla) {
		this.entityManager.merge(tipoTalla);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoTallaDAO#delete(co.com.ppi.Street.models.entity.TipoTallaEntity)
	 */
	@Override
	public void delete(TipoTallaEntity tipoTalla) {
		this.entityManager.remove(tipoTalla);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoTallaDAO#findByPK(java.lang.Long)
	 */
	@Override
	public TipoTallaEntity findByPK(Long idTipoTalla) {
		return this.entityManager.find(TipoTallaEntity.class, idTipoTalla);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoTallaDAO#findAllByNombre(java.lang.String)
	 */
	@Override
	public TipoTallaEntity findByNombre(String nombreTipoTalla) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_TALLA WHERE NOMBRE = ?1", 
				TipoTallaEntity.class);
		query.setParameter(1, nombreTipoTalla);
		try {
			return (TipoTallaEntity) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoTallaDAO#getAll()
	 */
	@Override
	public List<TipoTallaEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_TALLA", 
				TipoTallaEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

}
