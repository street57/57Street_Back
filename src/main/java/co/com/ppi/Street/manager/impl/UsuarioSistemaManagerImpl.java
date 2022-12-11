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
import co.com.ppi.Street.dao.UsuarioSistemaDAO;
import co.com.ppi.Street.manager.UsuarioSistemaManager;
import co.com.ppi.Street.models.dto.RegistrarUsuarioInDTO;
import co.com.ppi.Street.models.entity.UsuarioPerfilEntity;
import co.com.ppi.Street.models.entity.UsuarioSistemaEntity;
import co.com.ppi.Street.util.Constantes.Activo;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 10:03:43 PM <br>
 *
 */
@Service
public class UsuarioSistemaManagerImpl implements UsuarioSistemaManager{

	@Autowired
	private UsuarioSistemaDAO usuarioSistemaDAO;
	
	@Autowired
	private UsuarioPerfilDAO usuarioPerfilDAO;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioSistemaManager#create(co.com.ppi.Street.models.entity.UsuarioSistemaEntity)
	 */
	@Override
	@Transactional
	public Response create(RegistrarUsuarioInDTO registrarUsuario) {
		UsuarioSistemaEntity usuarioSistemaExistente = this.usuarioSistemaDAO.findByEmail(registrarUsuario.getCorreo());
		if(usuarioSistemaExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		UsuarioSistemaEntity usuarioSistemaCrear = new UsuarioSistemaEntity();
		usuarioSistemaCrear.setNombres(registrarUsuario.getNombre());
		usuarioSistemaCrear.setEmail(registrarUsuario.getCorreo());
		usuarioSistemaCrear.setClave(registrarUsuario.getClave());
		usuarioSistemaCrear.setIdTipoUsuario(1L);
		usuarioSistemaCrear.setActivo(Activo.SI);
		this.usuarioSistemaDAO.insert(usuarioSistemaCrear);
		
		UsuarioPerfilEntity usuarioPerfil = new UsuarioPerfilEntity();
		usuarioPerfil.setIdUsuarioSistema(usuarioSistemaCrear.getIdUsuarioSistema());
		usuarioPerfil.setIdTipoPerfilUsuario(1L);
		usuarioPerfil.setFechaModificaBD(new Date());
		this.usuarioPerfilDAO.insert(usuarioPerfil);
		return Response.status(Response.Status.OK).entity(usuarioSistemaCrear).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioSistemaManager#update(co.com.ppi.Street.models.entity.UsuarioSistemaEntity)
	 */
	@Override
	@Transactional
	public Response update(UsuarioSistemaEntity usuarioSistema) {
		UsuarioSistemaEntity usuarioSistemaExistente = this.usuarioSistemaDAO.findByPk(usuarioSistema.getIdUsuarioSistema());
		if(usuarioSistemaExistente.getIdUsuarioSistema() == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		usuarioSistemaExistente.setIdTipoUsuario(usuarioSistema.getIdTipoUsuario());
		usuarioSistemaExistente.setNombres(usuarioSistema.getNombres());
		usuarioSistemaExistente.setApellidos(usuarioSistema.getApellidos());
		usuarioSistemaExistente.setEmail(usuarioSistema.getEmail());
		usuarioSistemaExistente.setClave(usuarioSistema.getClave());
		usuarioSistemaExistente.setUsuarioAcceso(usuarioSistema.getUsuarioAcceso());
		usuarioSistemaExistente.setCelular(usuarioSistema.getCelular());
		usuarioSistemaExistente.setActivo(Activo.SI);
		this.usuarioSistemaDAO.update(usuarioSistemaExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioSistemaManager#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public Response delete(Long idUsuarioSistema) {
		UsuarioSistemaEntity usuarioSistemaExistente = this.usuarioSistemaDAO.findByPk(idUsuarioSistema);
		if(usuarioSistemaExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.usuarioSistemaDAO.delete(usuarioSistemaExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioSistemaManager#findByPK(java.lang.Long)
	 */
	@Override
	public UsuarioSistemaEntity findByPK(Long idUsuarioSistema) {
		return this.usuarioSistemaDAO.findByPk(idUsuarioSistema);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioSistemaManager#findByEmail(java.lang.String)
	 */
	@Override
	public UsuarioSistemaEntity findByEmail(String emailUsuarioSistema) {
		return this.usuarioSistemaDAO.findByEmail(emailUsuarioSistema);
	}
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioSistemaManager#findByEmailAndClave(java.lang.String, java.lang.String)
	 */
	@Override
	public UsuarioSistemaEntity findByEmailAndClave(String email, String clave) {
		return this.usuarioSistemaDAO.findByEmailAndClave(email, clave);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.UsuarioSistemaManager#getAll()
	 */
	@Override
	public List<UsuarioSistemaEntity> getAll() {
		List<UsuarioSistemaEntity> listaUsuariosSistema = this.usuarioSistemaDAO.getAll();
		return listaUsuariosSistema;
	}

}
