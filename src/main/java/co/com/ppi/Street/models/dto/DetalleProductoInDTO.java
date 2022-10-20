/**
 * 
 */
package co.com.ppi.Street.models.dto;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 7:56:09 PM <br>
 *
 */
public class DetalleProductoInDTO {
	
	private Long idDetalleProducto;

	private Long idTipoTalla;
	
	private Long idTipoColor;
	
	private Integer idTipoGenero;
	
	private Long idProducto;
	
	private Integer cantidad;

	
	/**
	 * @return the idDetalleProducto
	 */
	public Long getIdDetalleProducto() {
		return idDetalleProducto;
	}

	/**
	 * @param idDetalleProducto the idDetalleProducto to set
	 */
	public void setIdDetalleProducto(Long idDetalleProducto) {
		this.idDetalleProducto = idDetalleProducto;
	}

	/**
	 * @return the idTipoTalla
	 */
	public Long getIdTipoTalla() {
		return idTipoTalla;
	}

	/**
	 * @param idTipoTalla the idTipoTalla to set
	 */
	public void setIdTipoTalla(Long idTipoTalla) {
		this.idTipoTalla = idTipoTalla;
	}

	/**
	 * @return the idTipoColor
	 */
	public Long getIdTipoColor() {
		return idTipoColor;
	}

	/**
	 * @param idTipoColor the idTipoColor to set
	 */
	public void setIdTipoColor(Long idTipoColor) {
		this.idTipoColor = idTipoColor;
	}

	/**
	 * @return the idTipoGenero
	 */
	public Integer getIdTipoGenero() {
		return idTipoGenero;
	}

	/**
	 * @param idTipoGenero the idTipoGenero to set
	 */
	public void setIdTipoGenero(Integer idTipoGenero) {
		this.idTipoGenero = idTipoGenero;
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
	 * @return the cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
