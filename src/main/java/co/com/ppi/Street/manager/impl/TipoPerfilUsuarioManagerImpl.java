/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.TipoPerfilUsuarioDAO;
import co.com.ppi.Street.manager.TipoPerfilUsuarioManager;
import co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity;
import co.com.ppi.Street.util.Constantes.Activo;

/**
 * TODO: descripción <br>
 * Creado el Oct 22, 2022 a las 1:29:31 AM <br>
 *
 */
@Service
public class TipoPerfilUsuarioManagerImpl implements TipoPerfilUsuarioManager {

	@Autowired
	private TipoPerfilUsuarioDAO tipoPerfilUsuarioDAO;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoPerfilUsuarioManager#create(co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity)
	 */
	@Override
	@Transactional
	public Response create(TipoPerfilUsuarioEntity tipoPerfilUsuario) {
		TipoPerfilUsuarioEntity tipoPerfilUsuarioExistente = this.tipoPerfilUsuarioDAO.findByPk(tipoPerfilUsuario.getIdTipoPerfilUsuario());
		if(tipoPerfilUsuarioExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		TipoPerfilUsuarioEntity tipoPerfilUsuarioCrear = new TipoPerfilUsuarioEntity();
		tipoPerfilUsuarioCrear.setNombrePerfil(tipoPerfilUsuario.getNombrePerfil());
		tipoPerfilUsuarioCrear.setActivo(Activo.SI);
		this.tipoPerfilUsuarioDAO.insert(tipoPerfilUsuarioCrear);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoPerfilUsuarioManager#update(co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity)
	 */
	@Override
	@Transactional
	public Response update(TipoPerfilUsuarioEntity tipoPerfilUsuario) {
		TipoPerfilUsuarioEntity tipoPerfilUsuarioExistente = this.tipoPerfilUsuarioDAO.findByPk(tipoPerfilUsuario.getIdTipoPerfilUsuario());
		if(tipoPerfilUsuarioExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		tipoPerfilUsuarioExistente.setNombrePerfil(tipoPerfilUsuario.getNombrePerfil());
		tipoPerfilUsuarioExistente.setActivo(Activo.SI);
		this.tipoPerfilUsuarioDAO.update(tipoPerfilUsuarioExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoPerfilUsuarioManager#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public Response delete(Long idTipoPerfilUsuario) {
		TipoPerfilUsuarioEntity tipoPerfilUsuarioExistente = this.tipoPerfilUsuarioDAO.findByPk(idTipoPerfilUsuario);
		if(tipoPerfilUsuarioExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.tipoPerfilUsuarioDAO.delete(tipoPerfilUsuarioExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoPerfilUsuarioManager#findByPK(java.lang.Long)
	 */
	@Override
	public TipoPerfilUsuarioEntity findByPK(Long idTipoPerfilUsuario) {
		return this.tipoPerfilUsuarioDAO.findByPk(idTipoPerfilUsuario);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoPerfilUsuarioManager#getAll()
	 */
	@Override
	public List<TipoPerfilUsuarioEntity> getAll() {
		List<TipoPerfilUsuarioEntity> listaTiposPerfilUsuario = this.tipoPerfilUsuarioDAO.getAll();
		return listaTiposPerfilUsuario;
	}
}
