/**
 * 
 */
package co.com.ppi.Street.models.dto;

import java.io.Serializable;
import java.util.List;

import co.com.ppi.Street.models.entity.DetalleProductoEntity;
import co.com.ppi.Street.models.entity.ImagenProductoEntity;

/**
 * TODO: descripción <br>
 * Creado el Sep 29, 2022 a las 12:48:32 PM <br>
 *
 */
public class InformacionProductoDTO implements Serializable{
	
	private Long idDetalleProducto;
	private Long idProducto;
	private Long idTipoTalla;
	private Long idTipoColor;
	private Integer idTipoGenero;
	private Integer cantidad;
	private List<ImagenProductoEntity> listaImagen;
	private List<DetalleProductoEntity> detalleProducto;
	
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
	/**
	 * @return the listaImagen
	 */
	public List<ImagenProductoEntity> getListaImagen() {
		return listaImagen;
	}
	/**
	 * @param listaImagen the listaImagen to set
	 */
	public void setListaImagen(List<ImagenProductoEntity> listaImagen) {
		this.listaImagen = listaImagen;
	}
	/**
	 * @return the detalleProducto
	 */
	public List<DetalleProductoEntity> getDetalleProducto() {
		return detalleProducto;
	}
	/**
	 * @param detalleProducto the detalleProducto to set
	 */
	public void setDetalleProducto(List<DetalleProductoEntity> detalleProducto) {
		this.detalleProducto = detalleProducto;
	}
	
	
	
}
