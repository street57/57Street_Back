package co.com.ppi.Street.manager.impl;

import java.util.LinkedList;
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
import co.com.ppi.Street.models.dto.ProductoWithDetalleDTO;
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
		return Response.status(Response.Status.OK).entity(productoRegistrar).build();
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
		return this.productoDAO.findByPK(idProducto);
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
	 * @see co.com.ppi.Street.manager.ProductoManager#actualizarProducto(java.lang.Long, co.com.ppi.Street.models.dto.ActualizarProductoInDTO)
	 */
	@Override
	public Response actualizarProducto(Long idProducto, ActualizarProductoInDTO producto) {
		ProductoEntity productoRegistrar = this.productoDAO.findByPK(idProducto);
		productoRegistrar.setNombre(producto.getNombre());
		productoRegistrar.setDescripcion(producto.getDescripcion());
		productoRegistrar.setPrecio(producto.getPrecio());
		productoRegistrar.setActivo(producto.getActivo());
		productoDAO.update(productoRegistrar);

		for (DetalleProductoInDTO detalle : producto.getListaDetallesProducto()) {
			DetalleProductoEntity detalleRegistrar = this.detalleProductoDAO.findByPK(detalle.getIdDetalleProducto());
			detalleRegistrar.setIdProducto(productoRegistrar.getIdProducto());
			detalleRegistrar.setCantidad(detalle.getCantidad());
			detalleRegistrar.setIdTipoColor(detalle.getIdTipoColor());
			detalleRegistrar.setIdTipoTalla(detalle.getIdTipoTalla());
			detalleRegistrar.setIdTipoGenero(detalle.getIdTipoGenero());
			detalleProductoDAO.update(detalleRegistrar);
		}

		for (ImagenProductoInDTO imagenProducto : producto.getImagenesProducto()) {
			ImagenProductoEntity imagenRegistrar = this.imagenProductoDAO.findByPK(imagenProducto.getIdProducto());
			imagenRegistrar.setImagen(this.imagenProductoManager.base64ToBytes(imagenProducto.getImagenBase64()));
			imagenRegistrar.setIdProducto(productoRegistrar.getIdProducto());
			imagenRegistrar.setIdTipoColor(imagenProducto.getIdTipoColor());
			imagenProductoDAO.update(imagenRegistrar);
		}
		
		return Response.status(Response.Status.OK).build();
	}


	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.ProductoManager#findDetalleProducto(java.lang.Long)
	 */
	@Override
	public Response findDetalleProducto(Long idProducto) {
		ProductoWithDetalleDTO productoConDetalles = new ProductoWithDetalleDTO();
		
		ProductoEntity productoEntity = this.productoDAO.findByPK(idProducto);
		productoConDetalles.setNombre(productoEntity.getNombre());
		productoConDetalles.setDescripcion(productoEntity.getDescripcion());
		productoConDetalles.setPrecio(productoEntity.getPrecio());
		productoConDetalles.setIdTipoSubcategoriaProducto(productoEntity.getIdTipoSubcategoriaProducto());
		productoConDetalles.setIdProducto(idProducto);
		
		List<DetalleProductoEntity> listaDetallesProductoEntity = this.detalleProductoDAO.findByIdProducto(idProducto);
		List<DetalleProductoInDTO> detallesProducto = new LinkedList<>();
		for (DetalleProductoEntity detalleProductoEntity : listaDetallesProductoEntity) {
			DetalleProductoInDTO detalle = new DetalleProductoInDTO();
			detalle.setCantidad(detalleProductoEntity.getCantidad());
			detalle.setIdDetalleProducto(detalleProductoEntity.getIdDetalleProducto());
			detalle.setIdProducto(idProducto);
			detalle.setIdTipoColor(detalleProductoEntity.getIdTipoColor());
			detalle.setIdTipoGenero(detalleProductoEntity.getIdTipoGenero());
			detalle.setIdTipoTalla(detalleProductoEntity.getIdTipoTalla());
			detallesProducto.add(detalle);
		}
		productoConDetalles.setListaDetallesProducto(detallesProducto);
		
		List<ImagenProductoEntity> imagenesEntity = this.imagenProductoDAO.findByIdProducto(idProducto);
		List<ImagenProductoInDTO> imagenesProducto = new LinkedList<>();
		for (ImagenProductoEntity imagenEntity : imagenesEntity) {
			ImagenProductoInDTO imagen = new ImagenProductoInDTO();
			imagen.setIdProducto(idProducto);
			imagen.setIdTipoColor(imagenEntity.getIdTipoColor());
			imagen.setIdImagenProducto(imagenEntity.getIdImagenProducto());
			imagen.setImagenBase64(this.imagenProductoManager.bytesToBase64(imagenEntity.getImagen()));
			imagenesProducto.add(imagen);
		}
		
		productoConDetalles.setImagenesProducto(imagenesProducto);
		return Response.status(Response.Status.OK).entity(productoConDetalles).build();
	}

}