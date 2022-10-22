/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.Date;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.UsuarioPerfilDAO;
import co.com.ppi.Street.manager.UsuarioPerfilManager;
import co.com.ppi.Street.models.entity.UsuarioPerfilEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 10:59:52 PM <br>
 *
 */
@Service
public class UsuarioPerfilManagerImpl implements UsuarioPerfilManager{

	@Autowired
	private UsuarioPerfilDAO usuarioPerfilDAO;
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioPerfilManager#create(co.com.ppi.Street.models.entity.UsuarioPerfilEntity)
	 */
	@Override
	@Transactional
	public Response create(UsuarioPerfilEntity usuarioPerfil) {
		UsuarioPerfilEntity usuarioPerfilExistente = this.usuarioPerfilDAO.finByPkAndIdUsuario(usuarioPerfil.getIdTipoPerfilUsuario(), usuarioPerfil.getIdUsuarioSistema());
		if(usuarioPerfilExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		UsuarioPerfilEntity usuarioPerfilCrear = new UsuarioPerfilEntity();
		usuarioPerfilCrear.setIdTipoPerfilUsuario(usuarioPerfil.getIdTipoPerfilUsuario());
		usuarioPerfilCrear.setIdUsuarioSistema(usuarioPerfil.getIdUsuarioSistema());
		usuarioPerfilCrear.setFechaModificaBD(new Date());
		this.usuarioPerfilDAO.insert(usuarioPerfilCrear);
		return Response.status(Response.Status.OK).entity(usuarioPerfilCrear).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioPerfilManager#update(co.com.ppi.Street.models.entity.UsuarioPerfilEntity)
	 */
	@Override
	@Transactional
	public Response update(UsuarioPerfilEntity usuarioPerfil) {
		UsuarioPerfilEntity usuarioPerfilExistente = this.usuarioPerfilDAO.findByPk(usuarioPerfil.getIdUsuarioPerfil());
		if(usuarioPerfilExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		usuarioPerfilExistente.setFechaModificaBD(new Date());
		usuarioPerfilExistente.setIdTipoPerfilUsuario(usuarioPerfil.getIdTipoPerfilUsuario());
		usuarioPerfilExistente.setIdUsuarioSistema(usuarioPerfil.getIdUsuarioSistema());
		this.usuarioPerfilDAO.update(usuarioPerfilExistente);
		return Response.status(Response.Status.OK).entity(usuarioPerfilExistente).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioPerfilManager#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public Response delete(Long idUsuarioPerfil) {
		UsuarioPerfilEntity usuarioPerfilExistente = this.usuarioPerfilDAO.findByPk(idUsuarioPerfil);
		if(usuarioPerfilExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.usuarioPerfilDAO.delete(usuarioPerfilExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioPerfilManager#findByPK(java.lang.Long)
	 */
	@Override
	public UsuarioPerfilEntity findByPK(Long idUsuarioPerfil) {
		return this.usuarioPerfilDAO.findByPk(idUsuarioPerfil);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioPerfilManager#getAll()
	 */
	@Override
	public List<UsuarioPerfilEntity> getAll() {
		List<UsuarioPerfilEntity> listaUsuariosPerfil = this.usuarioPerfilDAO.getAll();
		return listaUsuariosPerfil;
	}

	
}
