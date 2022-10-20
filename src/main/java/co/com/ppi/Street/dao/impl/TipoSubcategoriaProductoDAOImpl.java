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

import co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO;
import co.com.ppi.Street.models.entity.ProductoEntity;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 26, 2022 a las 10:49:41 PM <br>
 *
 */
@Repository
public class TipoSubcategoriaProductoDAOImpl implements TipoSubcategoriaProductoDAO {

	@PersistenceContext()
	private EntityManager entityManager;
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO#insert(co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity)
	 */
	@Override
	public void insert(TipoSubcategoriaProductoEntity TipoSubcategoriaProducto) {
		this.entityManager.persist(TipoSubcategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO#update(co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity)
	 */
	@Override
	public void update(TipoSubcategoriaProductoEntity TipoSubcategoriaProducto) {
		this.entityManager.merge(TipoSubcategoriaProducto);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO#delete(co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity)
	 */
	@Override
	public void delete(TipoSubcategoriaProductoEntity TipoSubcategoriaProducto) {
		this.entityManager.remove(TipoSubcategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO#findByPK(java.lang.Long)
	 */
	@Override
	public TipoSubcategoriaProductoEntity findByPK(Long idTipoSubcategoriaProducto) {
		return this.entityManager.find(TipoSubcategoriaProductoEntity.class, idTipoSubcategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO#findAllByNombre(java.lang.String)
	 */
	@Override
	public TipoSubcategoriaProductoEntity findByNombre(String nombreSubcategoriaProducto) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_SUBCATEGORIA_PRODUCTO WHERE NOMBRE = ?1", 
				TipoSubcategoriaProductoEntity.class);
		query.setParameter(1, nombreSubcategoriaProducto);
		try {
			return (TipoSubcategoriaProductoEntity) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO#findByIdTipoCategoriaProducto(java.lang.Long)
	 */
	@Override
	public TipoSubcategoriaProductoEntity findByIdTipoCategoriaProducto(Long idTipoCategoriaProducto) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_SUBCATEGORIA_PRODUCTO WHERE ID_TIPO_CATEGORIA_PRODUCTO = ?1", 
				TipoSubcategoriaProductoEntity.class);
		query.setParameter(1, idTipoCategoriaProducto);
		try {
			return  (TipoSubcategoriaProductoEntity)query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO#getAll()
	 */
	@Override
	public List<TipoSubcategoriaProductoEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM TIPO_SUBCATEGORIA_PRODUCTO",
				TipoSubcategoriaProductoEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}

}
