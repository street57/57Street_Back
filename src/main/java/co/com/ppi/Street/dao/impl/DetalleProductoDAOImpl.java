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

import co.com.ppi.Street.dao.DetalleProductoDAO;
import co.com.ppi.Street.models.entity.DetalleProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:30:01 PM <br>
 *
 */
@Repository
public class DetalleProductoDAOImpl implements DetalleProductoDAO{
	
	@PersistenceContext()
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.DetalleProductoDAO#insert(co.com.ppi.Street.models.entity.DetalleProductoEntity)
	 */
	@Override
	public void insert(DetalleProductoEntity detalleProducto) {
		this.entityManager.persist(detalleProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.DetalleProductoDAO#update(co.com.ppi.Street.models.entity.DetalleProductoEntity)
	 */
	@Override
	public void update(DetalleProductoEntity detalleProducto) {
		this.entityManager.merge(detalleProducto);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.DetalleProductoDAO#delete(co.com.ppi.Street.models.entity.DetalleProductoEntity)
	 */
	@Override
	public void delete(DetalleProductoEntity detalleProducto) {
		this.entityManager.remove(detalleProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.DetalleProductoDAO#findByPK(java.lang.Long)
	 */
	@Override
	public DetalleProductoEntity findByPK(Long idDetalleProducto) {
		return this.entityManager.find(DetalleProductoEntity.class, idDetalleProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.DetalleProductoDAO#findByIdProducto(java.lang.Long)
	 */
	@Override
	public List<DetalleProductoEntity> findByIdProducto(Long idProducto) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM DETALLE_PRODUCTO WHERE ID_PRODUCTO = ?1", 
				DetalleProductoEntity.class);
		query.setParameter(1, idProducto);
		try {
			return (List<DetalleProductoEntity>) query.getResultList();
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.DetalleProductoDAO#findAllByIdTipoColor(java.lang.Long)
	 */
	@Override
	public DetalleProductoEntity findByIdTipoColor(Long idTipoColor) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM DETALLE_PRODUCTO WHERE ID_TIPO_COLOR = ?1", 
				DetalleProductoEntity.class);
		query.setParameter(1, idTipoColor);
		try {
			return (DetalleProductoEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.DetalleProductoDAO#findAllByIdTipoTalla(java.lang.Long)
	 */
	@Override
	public DetalleProductoEntity findByIdTipoTalla(Long idTipoTalla) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM DETALLE_PRODUCTO WHERE ID_TIPO_TALLA = ?1", 
				DetalleProductoEntity.class);
		query.setParameter(1, idTipoTalla);
		try {
			return (DetalleProductoEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.DetalleProductoDAO#findAllByIdTipoGenero(java.lang.Long)
	 */
	@Override
	public DetalleProductoEntity findByIdTipoGenero(Long idTipoGenero) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM DETALLE_PRODUCTO WHERE ID_TIPO_GENERO = ?1", 
				DetalleProductoEntity.class);
		query.setParameter(1, idTipoGenero);
		try {
			return (DetalleProductoEntity) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	
}
