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
 * Creado el Oct 21, 2022 a las 8:19:00 PM <br>
 *
 */
@Entity
@Table(name = "TIPO_USUARIO")
public class TipoUsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TIPO_USUARIO")
	private Long idTipoUsuario;
	
	@Column(name = "NOMBRE_USUARIO")
	private String nombreUsuario;
	
	@Column(name = "ACTIVO")
	private String activo;

	/**
	 * @return the idTipoUsuario
	 */
	public Long getIdTipoUsuario() {
		return idTipoUsuario;
	}

	/**
	 * @param idTipoUsuario the idTipoUsuario to set
	 */
	public void setIdTipoUsuario(Long idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
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
	
	
}
