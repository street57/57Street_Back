/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.DetalleProductoDAO;
import co.com.ppi.Street.manager.DetalleProductoManager;
import co.com.ppi.Street.models.entity.DetalleProductoEntity;import co.com.ppi.Street.models.entity.ProductoEntity;
import co.com.ppi.Street.models.entity.TipoColorEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 12:46:35 AM <br>
 *
 */
@Service
public class DetalleProductoManagerImpl implements DetalleProductoManager {

	@Autowired
	private DetalleProductoDAO detalleProductoDAO;
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.DetalleProductoManager#create(co.com.ppi.Street.models.entity.DetalleProductoEntity)
	 */
	@Override
	@Transactional
	public Response create(DetalleProductoEntity detalleProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.DetalleProductoManager#update(co.com.ppi.Street.models.entity.DetalleProductoEntity)
	 */
	@Override
	public Response update(DetalleProductoEntity detalleProducto) {
		DetalleProductoEntity detalleProductoExistente = this.detalleProductoDAO.findByPK(detalleProducto.getIdDetalleProducto());
		if(detalleProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		detalleProductoExistente.setIdDetalleProducto(detalleProducto.getIdDetalleProducto());
		this.detalleProductoDAO.update(detalleProductoExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.DetalleProductoManager#delete(java.lang.Long)
	 */
	@Override
	public Response delete(Long idDetalleProducto) {
		DetalleProductoEntity detalleProductoExistente = this.detalleProductoDAO.findByPK(idDetalleProducto);
		if(detalleProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.detalleProductoDAO.delete(detalleProductoExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.DetalleProductoManager#findByPK(java.lang.Long)
	 */
	@Override
	public DetalleProductoEntity findByPK(Long idDetalleProducto) {
		return this.detalleProductoDAO.findByPK(idDetalleProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.DetalleProductoManager#findByIdTipoColor(java.lang.Long)
	 */
	@Override
	public DetalleProductoEntity findByIdTipoColor(Long idTipoColor) {
		return this.detalleProductoDAO.findByIdTipoColor(idTipoColor);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.DetalleProductoManager#findByIdTipoTalla(java.lang.Long)
	 */
	@Override
	public DetalleProductoEntity findByIdTipoTalla(Long idTipoTalla) {
		return this.detalleProductoDAO.findByIdTipoTalla(idTipoTalla);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.DetalleProductoManager#findByIdTipoGenero(java.lang.Long)
	 */
	@Override
	public DetalleProductoEntity findByIdTipoGenero(Long idTipoGenero) {
		return this.detalleProductoDAO.findByIdTipoGenero(idTipoGenero);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.DetalleProductoManager#findByIdProducto(java.lang.Long)
	 */
	@Override
	public List<DetalleProductoEntity> findByIdProducto(Long idProducto) {
		return this.detalleProductoDAO.findByIdProducto(idProducto);
	}

}
