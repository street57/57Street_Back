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

import co.com.ppi.Street.dao.ImagenProductoDAO;
import co.com.ppi.Street.models.entity.DetalleProductoEntity;
import co.com.ppi.Street.models.entity.ImagenProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:46:36 PM <br>
 *
 */
@Repository
public class ImagenProductoDAOImpl implements ImagenProductoDAO{

	@PersistenceContext()
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.ImagenProductoDAO#insert(co.com.ppi.Street.models.entity.ImagenProductoEntity)
	 */
	@Override
	public void insert(ImagenProductoEntity imagenProducto) {
		this.entityManager.persist(imagenProducto);		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.ImagenProductoDAO#update(co.com.ppi.Street.models.entity.ImagenProductoEntity)
	 */
	@Override
	public void update(ImagenProductoEntity imagenProducto) {
		this.entityManager.merge(imagenProducto);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.ImagenProductoDAO#delete(co.com.ppi.Street.models.entity.ImagenProductoEntity)
	 */
	@Override
	public void delete(ImagenProductoEntity imagenProducto) {
		this.entityManager.remove(imagenProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.ImagenProductoDAO#findByPK(java.lang.Long)
	 */
	@Override
	public ImagenProductoEntity findByPK(Long idImagenProducto) {
		return this.entityManager.find(ImagenProductoEntity.class, idImagenProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.ImagenProductoDAO#findAllByIdProducto(java.lang.Long)
	 */
	@Override
	public ImagenProductoEntity findByIdProducto(Long idProducto) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM IMAGEN_PRODUCTO WHERE ID_PRODUCTO = ?1", 
				DetalleProductoEntity.class);
		query.setParameter(1, idProducto);
		try {
			return (ImagenProductoEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.ImagenProductoDAO#findAllByIdTipoColor(java.lang.Long)
	 */
	@Override
	public ImagenProductoEntity findByIdTipoColor(Long idTipoColor) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM DETALLE_PRODUCTO WHERE ID_TIPO_COLOR = ?1", 
				DetalleProductoEntity.class);
		query.setParameter(1, idTipoColor);
		try {
			return (ImagenProductoEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
