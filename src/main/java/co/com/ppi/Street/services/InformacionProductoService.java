/**
 * 
 */
package co.com.ppi.Street.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ppi.Street.manager.InformacionProductoManager;
import co.com.ppi.Street.models.dto.InformacionProductoDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 2, 2022 a las 3:39:43 PM <br>
 *
 */
@Path("informacion-producto")
@Api("/informacion-producto")
@Component
public class InformacionProductoService {
	
	@Autowired
	private InformacionProductoManager informacionProductoManager;

	@GET
	@Path("/finInformacionProductoById")
	@ApiOperation(value = "/finInformacionProductoById", notes = "Retorna la información del producto")
	@Produces(MediaType.APPLICATION_JSON)
	public InformacionProductoDTO finInformacionProductoById(@QueryParam ("idProducto")Long idProducto) {
		return this.informacionProductoManager.findInformacionProductoByIdProducto(idProducto);
	}
}