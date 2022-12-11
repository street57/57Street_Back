/**
 * 
 */
package co.com.ppi.Street.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 8:07:15 PM <br>
 *
 */
@Entity
@Table (name = "USUARIO_SISTEMA")
public class UsuarioSistemaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO_SISTEMA")
	private Long idUsuarioSistema;
	
	@Column(name = "ID_TIPO_USUARIO")
	private Long idTipoUsuario;
	
	@Column(name = "NOMBRES")
	private String nombres;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "CLAVE")
	private String clave;
	
	@Column(name = "USUARIO_ACCESO")
	private String usuarioAcceso;
	
	@Column(name = "CELULAR")
	private String celular;
	
	@Column(name = "ACTIVO")
	private String activo;

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
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}

	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}

	/**
	 * @return the usuarioAcceso
	 */
	public String getUsuarioAcceso() {
		return usuarioAcceso;
	}

	/**
	 * @param usuarioAcceso the usuarioAcceso to set
	 */
	public void setUsuarioAcceso(String usuarioAcceso) {
		this.usuarioAcceso = usuarioAcceso;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
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
