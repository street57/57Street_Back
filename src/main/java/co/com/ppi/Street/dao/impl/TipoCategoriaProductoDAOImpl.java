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

import co.com.ppi.Street.dao.TipoCategoriaProductoDAO;
import co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity;
import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:47:27 PM <br>
 *
 */
@Repository
public class TipoCategoriaProductoDAOImpl implements TipoCategoriaProductoDAO {

	@PersistenceContext()
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoCategoriaProductoDAO#insert(co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity)
	 */
	@Override
	public void insert(TipoCategoriaProductoEntity tipoCategoriaProducto) {
		this.entityManager.persist(tipoCategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoCategoriaProductoDAO#update(co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity)
	 */
	@Override
	public void update(TipoCategoriaProductoEntity tipoCategoriaProducto) {
		this.entityManager.merge(tipoCategoriaProducto);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoCategoriaProductoDAO#delete(co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity)
	 */
	@Override
	public void delete(TipoCategoriaProductoEntity tipoCategoriaProducto) {
		this.entityManager.remove(tipoCategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoCategoriaProductoDAO#findByPK(java.lang.Long)
	 */
	@Override
	public TipoCategoriaProductoEntity findByPK(Long idTipoCategoriaProducto) {
		return this.entityManager.find(TipoCategoriaProductoEntity.class, idTipoCategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoCategoriaProductoDAO#findByNombre(java.lang.String)
	 */
	@Override
	public TipoCategoriaProductoEntity findByNombre(String nombreCategoriaProducto) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_CATEGORIA_PRODUCTO WHERE NOMBRE = ?1", 
				TipoColorEntity.class);
		query.setParameter(1, nombreCategoriaProducto);
		try {
			return (TipoCategoriaProductoEntity) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoCategoriaProductoDAO#getAll()
	 */
	@Override
	public List<TipoCategoriaProductoEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_CATEGORIA_PRODUCTO", 
				TipoCategoriaProductoEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

}
