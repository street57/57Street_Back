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
 * Creado el Aug 30, 2022 a las 1:09:51 PM <br>
 *
 */
@Entity
@Table(name = "IMAGEN_PRODUCTO")
public class ImagenProductoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_IMAGEN_PRODUCTO")
	private Long idImagenProducto;

	@Column(name = "IMAGEN")
	private byte[] imagen;

	@Column(name = "ID_PRODUCTO")
	private Long idProducto;

	@Column(name = "ID_TIPO_COLOR")
	private Long idTipoColor;

	public Long getIdImagenProducto() {
		return idImagenProducto;
	}

	public void setIdImagenProducto(Long idImagenProducto) {
		this.idImagenProducto = idImagenProducto;
	}

	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdTipoColor() {
		return idTipoColor;
	}

	public void setIdTipoColor(Long idTipoColor) {
		this.idTipoColor = idTipoColor;
	}

}
