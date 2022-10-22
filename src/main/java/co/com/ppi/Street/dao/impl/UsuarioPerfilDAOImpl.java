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

import co.com.ppi.Street.dao.UsuarioPerfilDAO;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.UsuarioPerfilEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 9:20:50 PM <br>
 *
 */
@Repository
public class UsuarioPerfilDAOImpl implements UsuarioPerfilDAO{

	@PersistenceContext()
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioPerfilDAO#insert(co.com.ppi.Street.models.entity.UsuarioPerfilEntity)
	 */
	@Override
	public void insert(UsuarioPerfilEntity usuarioPerfilEntity) {
		this.entityManager.persist(usuarioPerfilEntity);
		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioPerfilDAO#update(co.com.ppi.Street.models.entity.UsuarioPerfilEntity)
	 */
	@Override
	public void update(UsuarioPerfilEntity usuarioPerfilEntity) {
		this.entityManager.merge(usuarioPerfilEntity);
		this.entityManager.flush();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioPerfilDAO#delete(co.com.ppi.Street.models.entity.UsuarioPerfilEntity)
	 */
	@Override
	public void delete(UsuarioPerfilEntity usuarioPerfilEntity) {
		this.entityManager.remove(usuarioPerfilEntity);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioPerfilDAO#findByPk(java.lang.Long)
	 */
	@Override
	public UsuarioPerfilEntity findByPk(Long id) {
		return this.entityManager.find(UsuarioPerfilEntity.class, id);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioPerfilDAO#finByPkAndIdUsuario(java.lang.Long, java.lang.Long)
	 */
	@Override
	public UsuarioPerfilEntity finByPkAndIdUsuario(Long idPerfil, Long idUsuario) {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM USUARIO_PERFIL WHERE ID_USUARIO_SISTEMA = ?1 AND ID_TIPO_PERFIL_USUARIO = ?2 ", 
				UsuarioPerfilEntity.class);
		query.setParameter(1, idUsuario);
		query.setParameter(2, idPerfil);
		try {
			return (UsuarioPerfilEntity) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.dao.UsuarioPerfilDAO#getAll()
	 */
	@Override
	public List<UsuarioPerfilEntity> getAll() {
		Query query = this.entityManager.createNativeQuery(
				"SELECT * FROM USUARIO_PERFIL", 
				UsuarioPerfilEntity.class);
		try {
			return  query.getResultList();	
		} catch (NoResultException e) {
			return Collections.emptyList();
		}
	}
	
	
}
