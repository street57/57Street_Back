/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import co.com.ppi.Street.dao.DetalleProductoDAO;
import co.com.ppi.Street.dao.ImagenProductoDAO;
import co.com.ppi.Street.dao.ProductoDAO;
import co.com.ppi.Street.manager.InformacionProductoManager;
import co.com.ppi.Street.models.dto.InformacionProductoDTO;
import co.com.ppi.Street.models.entity.DetalleProductoEntity;
import co.com.ppi.Street.models.entity.ImagenProductoEntity;
import co.com.ppi.Street.models.entity.ProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 2, 2022 a las 2:35:43 PM <br>
 *
 */
@Service
public class InformacionProductoManagerImpl implements InformacionProductoManager {

	private ProductoDAO productoDAO;
	private DetalleProductoDAO detalleProductoDAO;
	private ImagenProductoDAO imagenProductoDAO;
	
	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.InformacionProductoManager#findInformacionProductoByIdProducto(java.lang.Long)
	 */
	@Override
	public InformacionProductoDTO findInformacionProductoByIdProducto(Long idProducto) {
		
		InformacionProductoDTO informacionProducto = new InformacionProductoDTO();
		ProductoEntity producto = this.productoDAO.findByPK(idProducto);
		List<DetalleProductoEntity> listaDetalleProducto = this.detalleProductoDAO.findByIdProducto(idProducto);
		List<ImagenProductoEntity> listaImagenProducto = this.imagenProductoDAO.findAllByIdProducto(idProducto);
				informacionProducto.setListaImagen(listaImagenProducto);
				informacionProducto.setDetalleProducto(listaDetalleProducto);
		return informacionProducto;
	}

}
