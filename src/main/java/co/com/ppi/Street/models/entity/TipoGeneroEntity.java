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
 * Creado el Aug 30, 2022 a las 2:11:21 PM <br>
 *
 */
@Entity
@Table(name = "TIPO_GENERO")
public class TipoGeneroEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TIPO_GENERO")
	private Long idTipoGenero;

	@Column(name = "GENERO")
	private String genero;

	@Column(name = "ABREVIATURA")
	private String abreviatura;

	@Column(name = "ACTIVO")
	private String activo;

	public Long getIdTipoGenero() {
		return idTipoGenero;
	}

	public void setIdTipoGenero(Long idTipoGenero) {
		this.idTipoGenero = idTipoGenero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

}
