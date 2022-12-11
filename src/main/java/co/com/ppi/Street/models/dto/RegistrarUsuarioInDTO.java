/**
 * 
 */
package co.com.ppi.Street.models.dto;

/**
 * TODO: descripción <br>
 * Creado el Dec 11, 2022 a las 4:22:07 PM <br>
 *
 */
public class RegistrarUsuarioInDTO {

	private String nombre;
	
	private String correo;
	
	private String clave;

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
