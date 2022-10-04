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
@Table(name = "TIPO_COLOR")
public class TipoColorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TIPO_COLOR")
	private Long idTipoColor;

	@Column(name = "NOMBRE")
	private String nombre;

	public Long getIdTipoColor() {
		return idTipoColor;
	}

	public void setIdTipoColor(Long idTipoColor) {
		this.idTipoColor = idTipoColor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
