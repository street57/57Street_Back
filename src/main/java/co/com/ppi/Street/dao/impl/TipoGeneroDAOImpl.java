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

import co.com.ppi.Street.dao.TipoGeneroDAO;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.TipoGeneroEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:48:58 PM <br>
 *
 */
 @Repository
public class TipoGeneroDAOImpl implements TipoGeneroDAO  {

	 @PersistenceContext()
	 private EntityManager entityManager;
	 
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoGeneroDAO#insert(co.com.ppi.Street.models.entity.TipoGeneroEntity)
	 */
	@Override
	public void insert(TipoGeneroEntity tipoGenero) {
		this.entityManager.persist(tipoGenero);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoGeneroDAO#update(co.com.ppi.Street.models.entity.TipoGeneroEntity)
	 */
	@Override
	public void update(TipoGeneroEntity tipoGenero) {
		this.entityManager.merge(tipoGenero);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoGeneroDAO#delete(co.com.ppi.Street.models.entity.TipoGeneroEntity)
	 */
	@Override
	public void delete(TipoGeneroEntity tipoGenero) {
		this.entityManager.remove(tipoGenero);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoGeneroDAO#findByPK(java.lang.Long)
	 */
	@Override
	public TipoGeneroEntity findByPK(Long idTipoGenero) {
		return this.entityManager.find(TipoGeneroEntity.class, idTipoGenero);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoGeneroDAO#findByGenero(java.lang.String)
	 */
	@Override
	public TipoGeneroEntity findByGenero(String genero) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_GENERO WHERE GENERO = ?1", 
				TipoGeneroEntity.class);
		query.setParameter(1, genero);
		try {
			return (TipoGeneroEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoGeneroDAO#finByAbreviatura(java.lang.String)
	 */
	@Override
	public TipoGeneroEntity finByAbreviatura(String abreviatura) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_GENERO WHERE ABREVIATURA = ?1", 
				TipoGeneroEntity.class);
		query.setParameter(1, abreviatura);
		try {
			return (TipoGeneroEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
				
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoGeneroDAO#getAll()
	 */
	@Override
	public List<TipoGeneroEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_GENERO", 
				TipoGeneroEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

}
