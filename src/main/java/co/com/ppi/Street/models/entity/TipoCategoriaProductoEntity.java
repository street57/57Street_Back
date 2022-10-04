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
 * Creado el Aug 30, 2022 a las 2:29:09 PM <br>
 *
 */
@Entity
@Table(name = "TIPO_CATEGORIA_PRODUCTO")
public class TipoCategoriaProductoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TIPO_CATEGORIA_PRODUCTO")
	private Long idTipoCategoriaProducto;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ACTIVA")
	private Boolean activate;

	/**
	 * @return the idTipoCategoriaProducto
	 */
	public Long getIdTipoCategoriaProducto() {
		return idTipoCategoriaProducto;
	}

	/**
	 * @param idTipoCategoriaProducto the idTipoCategoriaProducto to set
	 */
	public void setIdTipoCategoriaProducto(Long idTipoCategoriaProducto) {
		this.idTipoCategoriaProducto = idTipoCategoriaProducto;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the activate
	 */
	public Boolean getActivate() {
		return activate;
	}

	/**
	 * @param activate the activate to set
	 */
	public void setActivate(Boolean activate) {
		this.activate = activate;
	}
	
	
}
