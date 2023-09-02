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
 * Creado el Aug 16, 2023 a las 10:24:30 PM <br>
 *
 */
@Entity
@Table(name = "COMPRA")
public class CompraEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_COMPRA")
	private Long idCompra;
	
	@Column(name = "FECHA_COMPRA")
	private Date fechaCompra;

	@Column(name = "VALOR_TOTAL")
	private Double valorTotal;
	
}
