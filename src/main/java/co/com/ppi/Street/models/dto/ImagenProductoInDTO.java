/**
 * 
 */
package co.com.ppi.Street.models.dto;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 8:00:09 PM <br>
 *
 */
public class ImagenProductoInDTO {
	
	private Long idImagenProducto;

	private Long idTipoColor;
	
	private Long idProducto;
	
	private String imagenBase64;

	/**
	 * @return the idImagenProducto
	 */
	public Long getIdImagenProducto() {
		return idImagenProducto;
	}

	/**
	 * @param idImagenProducto the idImagenProducto to set
	 */
	public void setIdImagenProducto(Long idImagenProducto) {
		this.idImagenProducto = idImagenProducto;
	}

	/**
	 * @return the idTipoColor
	 */
	public Long getIdTipoColor() {
		return idTipoColor;
	}

	/**
	 * @param idTipoColor the idTipoColor to set
	 */
	public void setIdTipoColor(Long idTipoColor) {
		this.idTipoColor = idTipoColor;
	}

	/**
	 * @return the idProducto
	 */
	public Long getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @return the imagenBase64
	 */
	public String getImagenBase64() {
		return imagenBase64;
	}

	/**
	 * @param imagenBase64 the imagenBase64 to set
	 */
	public void setImagenBase64(String imagenBase64) {
		this.imagenBase64 = imagenBase64;
	}
	
	
}
