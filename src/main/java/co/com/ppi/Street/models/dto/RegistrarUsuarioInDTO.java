/**
 * 
 */
package co.com.ppi.Street.models.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * TODO: descripción <br>
 * Creado el Dec 11, 2022 a las 4:22:07 PM <br>
 *
 */
public class RegistrarUsuarioInDTO {

	@NotNull(message = "El nombre es obligatorio")
	@NotEmpty(message = "El nombre es obligatorio")
	private String nombre;
	
	@NotNull(message = "Los apellidos son obligatorios")
	@NotEmpty(message = "Los apellidos son obligatorios")
	private String apellidos;
	
	@NotNull(message = "El correo es obligatorio")
	@NotEmpty(message = "El correo es obligatorio")
	@Email(message = "El correo debe ser valido")
	private String correo;
	
	@NotNull(message = "La clave es obligatorio")
	@NotEmpty(message = "La clave es obligatorio")
	private String clave;
	
	@NotNull(message = "El número de celular es obligatorio")
	@NotEmpty(message = "El número de celular es obligatorio")
	private String celular;

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
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
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
	
	
}
