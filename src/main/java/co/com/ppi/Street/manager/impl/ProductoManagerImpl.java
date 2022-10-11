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
import co.com.ppi.Street.dao.ImagenProductoDAO;
import co.com.ppi.Street.dao.ProductoDAO;
import co.com.ppi.Street.manager.ImagenProductoManager;
import co.com.ppi.Street.manager.ProductoManager;
import co.com.ppi.Street.models.dto.ActualizarProductoInDTO;
import co.com.ppi.Street.models.dto.CrearProductoInDTO;
import co.com.ppi.Street.models.dto.DetalleProductoInDTO;
import co.com.ppi.Street.models.dto.ImagenProductoInDTO;
import co.com.ppi.Street.models.entity.DetalleProductoEntity;
import co.com.ppi.Street.models.entity.ImagenProductoEntity;
import co.com.ppi.Street.models.entity.ProductoEntity;
import co.com.ppi.Street.util.Constantes.Activo;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 12:59:18 AM <br>
 *
 */
@Service
public class ProductoManagerImpl implements ProductoManager {

	@Autowired
	private DetalleProductoDAO detalleProductoDAO;

	@Autowired
	private ImagenProductoDAO imagenProductoDAO;

	@Autowired
	private ImagenProductoManager imagenProductoManager;

	@Autowired
	private ProductoDAO productoDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.com.ppi.Street.manager.ProductoManager#registrarProducto(co.com.ppi.Street
	 * .models.dto.CrearProductoInDTO)
	 */
	@Override
	@Transactional
	public Response registrarProducto(CrearProductoInDTO producto) {
		ProductoEntity productoRegistrar = new ProductoEntity();
		productoRegistrar.setNombre(producto.getNombre());
		productoRegistrar.setDescripcion(producto.getDescripcion());
		productoRegistrar.setPrecio(producto.getPrecio());
		productoRegistrar.setActivo(Activo.SI);
		productoDAO.insert(productoRegistrar);

		for (DetalleProductoInDTO detalle : producto.getListaDetallesProducto()) {
			DetalleProductoEntity detalleRegistrar = new DetalleProductoEntity();
			detalleRegistrar.setIdProducto(productoRegistrar.getIdProducto());
			detalleRegistrar.setCantidad(detalle.getCantidad());
			detalleRegistrar.setIdTipoColor(detalle.getIdTipoColor());
			detalleRegistrar.setIdTipoTalla(detalle.getIdTipoTalla());
			detalleRegistrar.setIdTipoGenero(detalle.getIdTipoGenero());
			detalleProductoDAO.insert(detalleRegistrar);
		}

		for (ImagenProductoInDTO imagenProducto : producto.getImagenesProducto()) {
			ImagenProductoEntity imagenRegistrar = new ImagenProductoEntity();
			imagenRegistrar.setImagen(this.imagenProductoManager.base64ToBytes(imagenProducto.getImagenBase64()));
			imagenRegistrar.setIdProducto(productoRegistrar.getIdProducto());
			imagenRegistrar.setIdTipoColor(imagenProducto.getIdTipoColor());
			imagenProductoDAO.insert(imagenRegistrar);
		}
		return Response.status(Response.Status.OK).build();
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.ppi.Street.manager.ProductoManager#delete(java.lang.Long)
	 */
	@Override
	public Response delete(Long idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.ppi.Street.manager.ProductoManager#findByPK(java.lang.Long)
	 */
	@Override
	public ProductoEntity findByPK(Long idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.ppi.Street.manager.ProductoManager#findByNombre(java.lang.String)
	 */
	@Override
	public ProductoEntity findByNombre(String nombreProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see co.com.ppi.Street.manager.ProductoManager#getAll()
	 */
	@Override
	public List<ProductoEntity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ProductoManager#actualizarProducto(co.com.ppi.Street.models.dto.ActualizarPeoductoInDTO)
	 */
	@Override
	public Response actualizarProducto(ActualizarProductoInDTO producto) {
		ProductoEntity productoRegistrar = new ProductoEntity();
		productoRegistrar.setNombre(producto.getNombre());
		productoRegistrar.setDescripcion(producto.getDescripcion());
		productoRegistrar.setPrecio(producto.getPrecio());
		productoRegistrar.setActivo(Activo.SI);
		productoDAO.insert(productoRegistrar);

		for (DetalleProductoInDTO detalle : producto.getListaDetallesProducto()) {
			DetalleProductoEntity detalleRegistrar = new DetalleProductoEntity();
			detalleRegistrar.setIdProducto(productoRegistrar.getIdProducto());
			detalleRegistrar.setCantidad(detalle.getCantidad());
			detalleRegistrar.setIdTipoColor(detalle.getIdTipoColor());
			detalleRegistrar.setIdTipoTalla(detalle.getIdTipoTalla());
			detalleRegistrar.setIdTipoGenero(detalle.getIdTipoGenero());
			detalleProductoDAO.insert(detalleRegistrar);
		}

		for (ImagenProductoInDTO imagenProducto : producto.getImagenesProducto()) {
			ImagenProductoEntity imagenRegistrar = new ImagenProductoEntity();
			imagenRegistrar.setImagen(this.imagenProductoManager.base64ToBytes(imagenProducto.getImagenBase64()));
			imagenRegistrar.setIdProducto(productoRegistrar.getIdProducto());
			imagenRegistrar.setIdTipoColor(imagenProducto.getIdTipoColor());
			imagenProductoDAO.insert(imagenRegistrar);
		}
		return Response.status(Response.Status.OK).build();

	}


}
