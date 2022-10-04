/**
 * 
 */
package co.com.ppi.Street.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.ppi.Street.dao.TipoGeneroDAO;
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

}
