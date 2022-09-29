/**
 * 
 */
package co.com.ppi.Street.dao.impl;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import co.com.ppi.Street.dao.ProductoDAO;
import co.com.ppi.Street.models.entity.ProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Aug 28, 2022 a las 8:00:59 PM <br>
 *
 */
@Repository
public class ProductoDAOImpl implements ProductoDAO {

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

}
