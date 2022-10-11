/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.TipoSubcategoriaProductoDAO;
import co.com.ppi.Street.manager.TipoSubcategoriaProductoManager;
import co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 1:05:41 AM <br>
 *
 */
@Service
public class TipoSubcategoriaProductoManagerImpl implements TipoSubcategoriaProductoManager{

	@Autowired
	private TipoSubcategoriaProductoDAO tipoSubcategoriaProductoDAO;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoSubcategoriaProductoManager#create(co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity)
	 */
	@Override
	@Transactional
	public Response create(TipoSubcategoriaProductoEntity tipoSubcategoriaProducto) {
		TipoSubcategoriaProductoEntity tipoSubcategoriaProductoExistente = this.tipoSubcategoriaProductoDAO.findByNombre(tipoSubcategoriaProducto.getNombre());
		if(tipoSubcategoriaProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		TipoSubcategoriaProductoEntity tipoSubcategoriaProductoCrear = new TipoSubcategoriaProductoEntity();
		tipoSubcategoriaProductoCrear.setNombre(tipoSubcategoriaProducto.getNombre());
		this.tipoSubcategoriaProductoDAO.insert(tipoSubcategoriaProductoCrear);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoSubcategoriaProductoManager#update(co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity)
	 */
	@Override
	public Response update(TipoSubcategoriaProductoEntity tipoSubcategoriaProducto) {
		TipoSubcategoriaProductoEntity tipoSubcategoriaProductoExistente = this.tipoSubcategoriaProductoDAO.findByIdTipoCategoriaProducto(tipoSubcategoriaProducto.getIdTipoSubcategoriaProducto());
		if(tipoSubcategoriaProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		tipoSubcategoriaProductoExistente.setNombre(tipoSubcategoriaProducto.getNombre());
		this.tipoSubcategoriaProductoDAO.update(tipoSubcategoriaProductoExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoSubcategoriaProductoManager#delete(java.lang.Long)
	 */
	@Override
	public Response delete(Long IdTipoSubcategoriaProducto) {
		TipoSubcategoriaProductoEntity tipoSubcategoriaProductoExistente = this.findByPK(IdTipoSubcategoriaProducto);
		if(tipoSubcategoriaProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.tipoSubcategoriaProductoDAO.delete(tipoSubcategoriaProductoExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoSubcategoriaProductoManager#findByPK(java.lang.Long)
	 */
	@Override
	public TipoSubcategoriaProductoEntity findByPK(Long idTipoSubcategoriaProducto) {
		return this.tipoSubcategoriaProductoDAO.findByPK(idTipoSubcategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoSubcategoriaProductoManager#findByNombre(java.lang.String)
	 */
	@Override
	public TipoSubcategoriaProductoEntity findByNombre(String nombre) {
		return this.tipoSubcategoriaProductoDAO.findByNombre(nombre);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoSubcategoriaProductoManager#findByIdTipoCategoriaProducto(java.lang.Long)
	 */
	@Override
	public TipoSubcategoriaProductoEntity findByIdTipoCategoriaProducto(Long idTipoCategoriaProducto) {
		return this.tipoSubcategoriaProductoDAO.findByIdTipoCategoriaProducto(idTipoCategoriaProducto);
	}
}
