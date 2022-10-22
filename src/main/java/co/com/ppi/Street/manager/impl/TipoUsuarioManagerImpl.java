/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.TipoUsuarioDAO;
import co.com.ppi.Street.manager.TipoUsuarioManager;
import co.com.ppi.Street.models.entity.TipoUsuarioEntity;
import co.com.ppi.Street.util.Constantes.Activo;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 11:47:34 PM <br>
 *
 */
@Service
public class TipoUsuarioManagerImpl implements TipoUsuarioManager{

	@Autowired
	private TipoUsuarioDAO tipoUsuarioDAO;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoUsuarioManager#create(co.com.ppi.Street.models.entity.TipoUsuarioEntity)
	 */
	@Override
	@Transactional
	public Response create(TipoUsuarioEntity tipoUsuario) {
		TipoUsuarioEntity tipoUsuarioExistente = this.tipoUsuarioDAO.findByPk(tipoUsuario.getIdTipoUsuario());
		if(tipoUsuarioExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		TipoUsuarioEntity tipoUsuarioCrear = new TipoUsuarioEntity();
		tipoUsuarioCrear.setNombreUsuario(tipoUsuario.getNombreUsuario());
		tipoUsuarioCrear.setActivo(Activo.SI);
		this.tipoUsuarioDAO.insert(tipoUsuarioCrear);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoUsuarioManager#update(co.com.ppi.Street.models.entity.TipoUsuarioEntity)
	 */
	@Override
	@Transactional
	public Response update(TipoUsuarioEntity tipoUsuario) {
		TipoUsuarioEntity tipoUsuarioExistente = this.tipoUsuarioDAO.findByPk(tipoUsuario.getIdTipoUsuario());
		if(tipoUsuarioExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		tipoUsuarioExistente.setNombreUsuario(tipoUsuario.getNombreUsuario());
		tipoUsuarioExistente.setActivo(Activo.SI);
		this.tipoUsuarioDAO.update(tipoUsuarioExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoUsuarioManager#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public Response delete(Long idTipoUsuario) {
		TipoUsuarioEntity tipoUsuarioExistente = this.tipoUsuarioDAO.findByPk(idTipoUsuario);
		if(tipoUsuarioExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.tipoUsuarioDAO.delete(tipoUsuarioExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoUsuarioManager#findByPK(java.lang.Long)
	 */
	@Override
	public TipoUsuarioEntity findByPK(Long idTipoUsuario) {
		return this.tipoUsuarioDAO.findByPk(idTipoUsuario);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoUsuarioManager#getAll()
	 */
	@Override
	public List<TipoUsuarioEntity> getAll() {
		List<TipoUsuarioEntity> listaTiposUsuario = this.tipoUsuarioDAO.getAll();
		return listaTiposUsuario;
	}
	
	
}
