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
 * Creado el Aug 30, 2022 a las 2:19:43 PM <br>
 *
 */
@Entity
@Table(name = "TIPO_SUBCATEGORIA_PRODUCTO")
public class TipoSubcategoriaProductoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TIPO_SUBCATEGORIA_PRODUCTO")
	private Long idTipoSubcategoriaProducto;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "ACTIVA")
	private String activa;

	@Column(name = "ID_TIPO_CATEGORIA_PRODUCTO")
	private Long idTipoCategoriaProducto;

	public Long getIdTipoSubcategoriaProducto() {
		return idTipoSubcategoriaProducto;
	}

	public void setIdTipoSubcategoriaProducto(Long idTipoSubcategoriaProducto) {
		this.idTipoSubcategoriaProducto = idTipoSubcategoriaProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getActiva() {
		return activa;
	}

	public void setActiva(String activa) {
		this.activa = activa;
	}

	public Long getIdTipoCategoriaProducto() {
		return idTipoCategoriaProducto;
	}

	public void setIdTipoCategoriaProducto(Long idTipoCategoriaProducto) {
		this.idTipoCategoriaProducto = idTipoCategoriaProducto;
	}

}
