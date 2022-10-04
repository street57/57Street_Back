/**
 * 
 */
package co.com.ppi.Street.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.ppi.Street.dao.TipoTallaDAO;
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

}
