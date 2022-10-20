/**
 * 
 */
package co.com.ppi.Street.models.dto;

import java.util.List;

/**
 * TODO: descripción <br>
 * Creado el Oct 19, 2022 a las 8:46:03 PM <br>
 *
 */
public class ProductoWithDetalleDTO {
	
	private Long idProducto;
	
	private String nombre;
	
	private String descripcion;
	
	private Double precio;
	
	private Long idTipoSubcategoriaProducto;
	
	List<DetalleProductoInDTO> listaDetallesProducto;
	
	List<ImagenProductoInDTO> imagenesProducto;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the idProducto
	 */
	public Long getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the idTipoSubcategoriaProducto
	 */
	public Long getIdTipoSubcategoriaProducto() {
		return idTipoSubcategoriaProducto;
	}

	/**
	 * @param idTipoSubcategoriaProducto the idTipoSubcategoriaProducto to set
	 */
	public void setIdTipoSubcategoriaProducto(Long idTipoSubcategoriaProducto) {
		this.idTipoSubcategoriaProducto = idTipoSubcategoriaProducto;
	}

	/**
	 * @return the listaDetallesProducto
	 */
	public List<DetalleProductoInDTO> getListaDetallesProducto() {
		return listaDetallesProducto;
	}

	/**
	 * @param listaDetallesProducto the listaDetallesProducto to set
	 */
	public void setListaDetallesProducto(List<DetalleProductoInDTO> listaDetallesProducto) {
		this.listaDetallesProducto = listaDetallesProducto;
	}

	/**
	 * @return the imagenesProducto
	 */
	public List<ImagenProductoInDTO> getImagenesProducto() {
		return imagenesProducto;
	}

	/**
	 * @param imagenesProducto the imagenesProducto to set
	 */
	public void setImagenesProducto(List<ImagenProductoInDTO> imagenesProducto) {
		this.imagenesProducto = imagenesProducto;
	}

}
