package co.com.ppi.Street.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.com.ppi.Street.models.dto.DetalleProductoInDTO;

@Entity
@Table(name = "PRODUCTO")
public class ProductoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_PRODUCTO")
	private Long idProducto;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "PRECIO")
	private Double precio;

	@Column(name = "ACTIVO")
	private String activo;

	@Column(name = "ID_TIPO_SUBCATEGORIA_PRODUCTO")
	private Long idTipoSubcategoriaProducto;

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the activo
	 */
	public String getActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(String activo) {
		this.activo = activo;
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




}
