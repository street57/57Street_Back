/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.TipoColorDAO;
import co.com.ppi.Street.manager.TipoColorManager;
import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 29, 2022 a las 11:32:11 PM <br>
 *
 */
@Service
public class TipoColorManagerImpl implements TipoColorManager{

	@Autowired
	private TipoColorDAO tipoColorDAO;
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoColorManager#create(co.com.ppi.Street.models.entity.TipoColorEntity)
	 */
	@Override
	@Transactional
	public Response create(TipoColorEntity tipoColor) {
		TipoColorEntity tipoColorExistente =  this.tipoColorDAO.findByNombre(tipoColor.getNombre());
		if(tipoColorExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		TipoColorEntity tipoColorCrear = new TipoColorEntity();
		tipoColorCrear.setNombre(tipoColor.getNombre());
		this.tipoColorDAO.insert(tipoColorCrear);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoColorManager#update(co.com.ppi.Street.models.entity.TipoColorEntity)
	 */
	@Override
	@Transactional
	public Response update(TipoColorEntity tipoColor) {
		TipoColorEntity tipoColorExistente = this.tipoColorDAO.findByPK(tipoColor.getIdTipoColor());
		if(tipoColorExistente.getIdTipoColor() == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		tipoColorExistente.setNombre(tipoColor.getNombre());
		this.tipoColorDAO.update(tipoColorExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoColorManager#findByPK(java.lang.Long)
	 */
	@Override
	public TipoColorEntity findByPK(Long idTipoColor) {
		return this.tipoColorDAO.findByPK(idTipoColor);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoColorManager#getAll()
	 */
	@Override
	public List<TipoColorEntity> getAll() {
		List<TipoColorEntity> listaColores = this.tipoColorDAO.getAll();
		return listaColores;
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoColorManager#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public Response delete(Long idTipoColor) {
		TipoColorEntity tipoColorExistente = this.tipoColorDAO.findByPK(idTipoColor);
		if(tipoColorExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.tipoColorDAO.delete(tipoColorExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoColorManager#findByNombre(java.lang.String)
	 */
	@Override
	public TipoColorEntity findByNombre(String nombreColor) {
		return this.tipoColorDAO.findByNombre(nombreColor);
	}
	
	

}
