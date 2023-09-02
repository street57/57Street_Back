/**
 * 
 */
package co.com.ppi.Street.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TODO: descripción <br>
 * Creado el Aug 16, 2023 a las 9:37:16 PM <br>
 *
 */
@Entity
@Table(name = "DETALLE_COMPRA")
public class DetalleCompraEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_DETALLE_COMPRA")
	private Long idDetalleCompra;
	
	@Column(name = "VALOR_TOTAL")
	private Double valorTotal;
	
	@Column(name = "CANTIDAD")
	private Integer cantidad;
	
	@Column(name = "ID_COMPRA")
	private Long idCompra;
	
	@Column(name = "ID_PRODUCTO")
	private Long idProducto;

	public Long getIdDetalleCompra() {
		return idDetalleCompra;
	}

	public void setIdDetalleCompra(Long idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Long getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Long idCompra) {
		this.idCompra = idCompra;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}
	
	
}
