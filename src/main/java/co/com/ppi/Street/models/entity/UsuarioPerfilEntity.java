/**
 * 
 */
package co.com.ppi.Street.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 8:23:56 PM <br>
 *
 */
@Entity
@Table(name = "USUARIO_PERFIL")
public class UsuarioPerfilEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO_PERFIL")
	private Long idUsuarioPerfil;
	
	@Column(name = "ID_USUARIO_SISTEMA")
	private Long idUsuarioSistema;
	
	@Column(name = "ID_TIPO_PERFIL_USUARIO")
	private Long idTipoPerfilUsuario;
	
	@Column(name = "FECHA_MODIFICA_BD")
	private Date fechaModificaBD;

	/**
	 * @return the idUsuarioPerfil
	 */
	public Long getIdUsuarioPerfil() {
		return idUsuarioPerfil;
	}

	/**
	 * @param idUsuarioPerfil the idUsuarioPerfil to set
	 */
	public void setIdUsuarioPerfil(Long idUsuarioPerfil) {
		this.idUsuarioPerfil = idUsuarioPerfil;
	}

	/**
	 * @return the idUsuarioSistema
	 */
	public Long getIdUsuarioSistema() {
		return idUsuarioSistema;
	}

	/**
	 * @param idUsuarioSistema the idUsuarioSistema to set
	 */
	public void setIdUsuarioSistema(Long idUsuarioSistema) {
		this.idUsuarioSistema = idUsuarioSistema;
	}

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
	 * @return the fechaModificaBD
	 */
	public Date getFechaModificaBD() {
		return fechaModificaBD;
	}

	/**
	 * @param fechaModificaBD the fechaModificaBD to set
	 */
	public void setFechaModificaBD(Date fechaModificaBD) {
		this.fechaModificaBD = fechaModificaBD;
	}
	
	
}
