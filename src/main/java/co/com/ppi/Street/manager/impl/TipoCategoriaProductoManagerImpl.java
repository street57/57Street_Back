/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.TipoCategoriaProductoDAO;
import co.com.ppi.Street.manager.TipoCategoriaProductoManager;
import co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity;
import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 1:01:18 AM <br>
 *
 */
@Service
public class TipoCategoriaProductoManagerImpl implements TipoCategoriaProductoManager{

	@Autowired
	private TipoCategoriaProductoDAO tipoCategoriaProductoDAO;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoCategoriaProductoManager#create(co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity)
	 */
	@Override
	@Transactional
	public Response create(TipoCategoriaProductoEntity tipoCategoriaProducto) {
		TipoCategoriaProductoEntity tipoCategoriaProductoExistente = this.tipoCategoriaProductoDAO.findByNombre(tipoCategoriaProducto.getNombre());
		if(tipoCategoriaProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		tipoCategoriaProductoExistente.setNombre(tipoCategoriaProducto.getNombre());
		this.tipoCategoriaProductoDAO.insert(tipoCategoriaProducto);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoCategoriaProductoManager#update(co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity)
	 */
	@Override
	public Response update(TipoCategoriaProductoEntity tipoCategoriaProducto) {
		TipoCategoriaProductoEntity tipoCategoriaProductoExistente = this.tipoCategoriaProductoDAO.findByNombre(tipoCategoriaProducto.getNombre());
		if(tipoCategoriaProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		tipoCategoriaProductoExistente.setNombre(tipoCategoriaProducto.getNombre());
		this.tipoCategoriaProductoDAO.insert(tipoCategoriaProducto);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoCategoriaProductoManager#delete(java.lang.Long)
	 */
	@Override
	public Response delete(Long idTipoCategoriaProducto) {
		TipoCategoriaProductoEntity tipoCategoriaProductoExistente = this.tipoCategoriaProductoDAO.findByPK(idTipoCategoriaProducto);
		if(tipoCategoriaProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.tipoCategoriaProductoDAO.delete(tipoCategoriaProductoExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoCategoriaProductoManager#findByPK(java.lang.Long)
	 */
	@Override
	public TipoCategoriaProductoEntity findByPK(Long idTipoCategoriaProducto) {
		return this.tipoCategoriaProductoDAO.findByPK(idTipoCategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoCategoriaProductoManager#findByNombre(java.lang.String)
	 */
	@Override
	public TipoCategoriaProductoEntity findByNombre(String nombreCategoriaProducto) {
		return this.tipoCategoriaProductoDAO.findByNombre(nombreCategoriaProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.TipoCategoriaProductoManager#getAll()
	 */
	@Override
	public List<TipoCategoriaProductoEntity> getAll() {
		List<TipoCategoriaProductoEntity> listaCategoriaProducto = this.tipoCategoriaProductoDAO.getAll();
		return listaCategoriaProducto;
	}
}
