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
 * Creado el Oct 21, 2022 a las 8:59:27 PM <br>
 *
 */
@Entity
@Table(name = "TIPO_USUARIO_PERFIL")
public class TipoPerfilUsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_TIPO_PERFIL_USUARIO")
	private Long idTipoPerfilUsuario;
	
	@Column(name = "NOMBRE_PERFIL")
	private String nombrePerfil;
	
	@Column(name = "ACTIVO")
	private String activo;

	/**
	 * @return the idTipoPerfilUsuario
	 */
	public Long getIdTipoPerfilUsuario() {
		return idTipoPerfilUsuario;
	}

	/**
	 * @param idTipoPerfilUsuario the idTipoPerfilUsuario to set
	 */
	public void setIdTipoPerfilUsuario(Long idTipoPerfilUsuario) {
		this.idTipoPerfilUsuario = idTipoPerfilUsuario;
	}

	/**
	 * @return the nombrePerfil
	 */
	public String getNombrePerfil() {
		return nombrePerfil;
	}

	/**
	 * @param nombrePerfil the nombrePerfil to set
	 */
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
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
