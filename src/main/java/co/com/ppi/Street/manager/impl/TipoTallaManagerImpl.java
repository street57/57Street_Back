/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.TipoTallaDAO;
import co.com.ppi.Street.manager.TipoTallaManager;
import co.com.ppi.Street.models.entity.TipoTallaEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 1:07:06 AM <br>
 *
 */
@Service
public class TipoTallaManagerImpl implements TipoTallaManager{

	@Autowired
	private TipoTallaDAO tipoTallaDAO;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoTallaManager#create(co.com.ppi.Street.models.entity.TipoTallaEntity)
	 */
	@Override
	@Transactional
	public Response create(TipoTallaEntity tipoTalla) {
		TipoTallaEntity tipoTallaExistente = this.tipoTallaDAO.findByNombre(tipoTalla.getNombre());
		if(tipoTallaExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		TipoTallaEntity tipoTallaCrear = new TipoTallaEntity();
		tipoTallaCrear.setNombre(tipoTalla.getNombre());
		this.tipoTallaDAO.insert(tipoTallaCrear);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoTallaManager#update(co.com.ppi.Street.models.entity.TipoTallaEntity)
	 */
	@Override
	public Response update(TipoTallaEntity tipoTalla) {
		TipoTallaEntity tipoTallaExistente = this.tipoTallaDAO.findByPK(tipoTalla.getIdTalla());
		if(tipoTallaExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		tipoTallaExistente.setNombre(tipoTalla.getNombre());
		this.tipoTallaDAO.update(tipoTallaExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoTallaManager#delete(java.lang.Long)
	 */
	@Override
	public Response delete(Long idTipoTalla) {
		TipoTallaEntity tipoTallaExistente = this.tipoTallaDAO.findByPK(idTipoTalla);
		if(tipoTallaExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.tipoTallaDAO.delete(tipoTallaExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoTallaManager#findByPK(java.lang.Long)
	 */
	@Override
	public TipoTallaEntity findByPK(Long idTipoTalla) {
		return this.tipoTallaDAO.findByPK(idTipoTalla);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoTallaManager#findByNombre(java.lang.String)
	 */
	@Override
	public TipoTallaEntity findByNombre(String nombreTipoTalla) {
		return this.tipoTallaDAO.findByNombre(nombreTipoTalla);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoTallaManager#getAll()
	 */
	@Override
	public List<TipoTallaEntity> getAll() {
		List<TipoTallaEntity> listaTallas = this.tipoTallaDAO.getAll();
		return listaTallas;
	}
}
