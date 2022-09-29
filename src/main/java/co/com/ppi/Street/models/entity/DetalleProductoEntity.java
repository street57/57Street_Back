package co.com.ppi.Street.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE_PRODUCTO")
public class DetalleProductoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_DETALLE_PRODUCTO")
	private Long idDetalleProducto;

	@Column(name = "ID_TIPO_TALLA")
	private Long idTipoTalla;

	@Column(name = "ID_TIPO_COLOR")
	private Long idTipoColor;

	@Column(name = "ID_PRODUCTO")
	private Long idProducto;

	@Column(name = "ID_TIPO_GENERO")
	private Integer idTipoGenero;

	@Column(name = "CANTIDAD")
	private Integer cantidad;

	public Long getIdDetalleProducto() {
		return idDetalleProducto;
	}

	public void setIdDetalleProducto(Long idDetalleProducto) {
		this.idDetalleProducto = idDetalleProducto;
	}

	public Long getIdTipoTalla() {
		return idTipoTalla;
	}

	public void setIdTipoTalla(Long idTipoTalla) {
		this.idTipoTalla = idTipoTalla;
	}

	public Long getIdTipoColor() {
		return idTipoColor;
	}

	public void setIdTipoColor(Long idTipoColor) {
		this.idTipoColor = idTipoColor;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Integer getIdTipoGenero() {
		return idTipoGenero;
	}

	public void setIdTipoGenero(Integer idTipoGenero) {
		this.idTipoGenero = idTipoGenero;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
