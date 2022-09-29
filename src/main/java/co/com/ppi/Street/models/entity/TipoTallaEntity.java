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
 * Creado el Aug 30, 2022 a las 1:30:59 PM <br>
 *
 */
@Entity
@Table(name = "TIPO_TALLA")
public class TipoTallaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TIPO_TALLA")
	private Long idTalla;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	public Long getIdTalla() {
		return idTalla;
	}

	public void setIdTalla(Long idTalla) {
		this.idTalla = idTalla;
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

}
