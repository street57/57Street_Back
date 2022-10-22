/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.Base64;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.ppi.Street.dao.ImagenProductoDAO;
import co.com.ppi.Street.manager.ImagenProductoManager;
import co.com.ppi.Street.models.entity.ImagenProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 12:56:54 AM <br>
 *
 */
@Service
public class ImagenProductoManagerImpl implements ImagenProductoManager {

	@Autowired
	private ImagenProductoDAO imagenProductoDAO;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ImagenProductoManager#create(co.com.ppi.Street.models.entity.ImagenProductoEntity)
	 */
	@Override
	public Response create(ImagenProductoEntity imagenProducto) {
		ImagenProductoEntity imagenProductoExistente = this.imagenProductoDAO.findByPK(imagenProducto.getIdImagenProducto());
		if(imagenProductoExistente != null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		ImagenProductoEntity imagenProductoCrear = new ImagenProductoEntity();
		imagenProductoCrear.setImagen(imagenProducto.getImagen());
		this.imagenProductoDAO.insert(imagenProductoCrear);
		return Response.status(Response.Status.OK).build();
		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ImagenProductoManager#update(co.com.ppi.Street.models.entity.ImagenProductoEntity)
	 */
	@Override
	@Transactional
	public Response update(ImagenProductoEntity imagenProducto) {
		ImagenProductoEntity imagenProductoExistente = this.imagenProductoDAO.findByPK(imagenProducto.getIdImagenProducto());
		if(imagenProductoExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		imagenProductoExistente.setImagen(imagenProducto.getImagen());
		this.imagenProductoDAO.update(imagenProductoExistente);
		return Response.status(Response.Status.OK).build();		
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ImagenProductoManager#delete(java.lang.Long)
	 */
	@Override
	@Transactional
	public Response delete(Long idImagenProducto) {
		ImagenProductoEntity imagenProductoExistente = this.imagenProductoDAO.findByPK(idImagenProducto);
		if(imagenProductoExistente == null) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}
		this.imagenProductoDAO.delete(imagenProductoExistente);
		return Response.status(Response.Status.OK).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ImagenProductoManager#findByPK(java.lang.Long)
	 */
	@Override
	public ImagenProductoEntity findByPK(Long idImagenProducto) {
		return this.imagenProductoDAO.findByPK(idImagenProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ImagenProductoManager#findByIdProducto(java.lang.Long)
	 */
	@Override
	public List<ImagenProductoEntity> findByIdProducto(Long idProducto) {
		return this.imagenProductoDAO.findByIdProducto(idProducto);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ImagenProductoManager#findByIdTipoColor(java.lang.Long)
	 */
	@Override
	public ImagenProductoEntity findByIdTipoColor(Long idTipoColor) {
		return this.imagenProductoDAO.findByIdTipoColor(idTipoColor);
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ImagenProductoManager#base64ToBytes(java.lang.String)
	 */
	@Override
	public byte[] base64ToBytes(String base64) {
		byte[] imagenBytes = Base64.getDecoder().decode(base64);
		return imagenBytes;
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ImagenProductoManager#bytesToBase64(byte[])
	 */
	@Override
	public String bytesToBase64(byte[] bytes) {
		String imagenBase64 = Base64.getEncoder().encodeToString(bytes);
		return imagenBase64;
	}

	
}
