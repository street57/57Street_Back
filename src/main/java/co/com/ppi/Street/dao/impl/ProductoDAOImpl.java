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

import co.com.ppi.Street.dao.ProductoDAO;
import co.com.ppi.Street.models.entity.ProductoEntity;
import co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity;
import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Aug 28, 2022 a las 8:00:59 PM <br>
 *
 */
@Repository
public class ProductoDAOImpl implements ProductoDAO {

	@PersistenceContext()
	private EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.com.ppi.Street.dao.ProductoDAO#insert(co.com.ppi.Street.models.entity.
	 * ProductoEntity)
	 */
	public void insert(ProductoEntity producto) {
		this.entityManager.persist(producto);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.com.ppi.Street.dao.ProductoDAO#update(co.com.ppi.Street.models.entity.
	 * ProductoEntity)
	 */
	public void update(ProductoEntity producto) {
		this.entityManager.merge(producto);
		this.entityManager.flush();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.com.ppi.Street.dao.ProductoDAO#delete(co.com.ppi.Street.models.entity.
	 * ProductoEntity)
	 */
	public void delete(ProductoEntity producto) {
		this.entityManager.remove(producto);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.ppi.Street.dao.ProductoDAO#findByPK(java.lang.Long)
	 */
	public ProductoEntity findByPK(Long idProducto) {

		return this.entityManager.find(ProductoEntity.class, idProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.ProductoDAO#findByNombre(java.lang.String)
	 */
	@Override
	public ProductoEntity findByNombre(String nombreProducto) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM PRODUCTO WHERE NOMBRE = ?1", 
				ProductoEntity.class);
		query.setParameter(1, nombreProducto);
		try {
			return (ProductoEntity) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.ProductoDAO#getAll()
	 */
	@Override
	public List<ProductoEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM PRODUCTO", 
				ProductoEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

}
