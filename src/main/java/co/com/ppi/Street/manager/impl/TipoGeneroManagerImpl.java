/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.TipoGeneroDAO;
import co.com.ppi.Street.manager.TipoGeneroManager;
import co.com.ppi.Street.models.entity.TipoGeneroEntity;
import co.com.ppi.Street.util.Constantes.Activo;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 1:03:01 AM <br>
 *
 */
@Service
public class TipoGeneroManagerImpl implements TipoGeneroManager{

	@Autowired
	private TipoGeneroDAO tipoGeneroDAO;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoGeneroManager#create(co.com.ppi.Street.models.entity.TipoGeneroEntity)
	 */
	@Override
	@Transactional
	public Response create(TipoGeneroEntity tipoGenero) {
		TipoGeneroEntity tipoGeneroCrear = this.tipoGeneroDAO.findByGenero(tipoGenero.getGenero());
		if(tipoGeneroCrear != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		TipoGeneroEntity tipoGeneroCrearNuevo = new TipoGeneroEntity();
		tipoGeneroCrearNuevo.setGenero(tipoGenero.getGenero());
		tipoGeneroCrearNuevo.setAbreviatura(tipoGenero.getAbreviatura());
		tipoGeneroCrearNuevo.setActivo(Activo.SI);
		this.tipoGeneroDAO.insert(tipoGeneroCrearNuevo);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoGeneroManager#update(co.com.ppi.Street.models.entity.TipoGeneroEntity)
	 */
	@Override
	@Transactional
	public Response update(TipoGeneroEntity tipoGenero) {
		TipoGeneroEntity tipoGeneroExistente = this.tipoGeneroDAO.findByPK(tipoGenero.getIdTipoGenero());
		if(tipoGeneroExistente.getIdTipoGenero() == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		tipoGeneroExistente.setGenero(tipoGenero.getGenero());
		tipoGeneroExistente.setAbreviatura(tipoGenero.getAbreviatura());
		this.tipoGeneroDAO.update(tipoGeneroExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoGeneroManager#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public Response delete(Long idTipoGenero) {
		TipoGeneroEntity tipoGeneroExistente = this.tipoGeneroDAO.findByPK(idTipoGenero);
		if(tipoGeneroExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.tipoGeneroDAO.delete(tipoGeneroExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoGeneroManager#findByPK(java.lang.Long)
	 */
	@Override
	public TipoGeneroEntity findByPK(Long idTipoGenero) {
		return this.tipoGeneroDAO.findByPK(idTipoGenero);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoGeneroManager#findByGenero(java.lang.String)
	 */
	@Override
	public TipoGeneroEntity findByGenero(String genero) {
		return this.findByGenero(genero);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoGeneroManager#finByAbreviatura(java.lang.String)
	 */
	@Override
	public TipoGeneroEntity finByAbreviatura(String abreviatura) {
		return this.finByAbreviatura(abreviatura);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoGeneroManager#getAll()
	 */
	@Override
	public List<TipoGeneroEntity> getAll() {
		List<TipoGeneroEntity> listasGenero = this.tipoGeneroDAO.getAll();
		return listasGenero;
	}
}
