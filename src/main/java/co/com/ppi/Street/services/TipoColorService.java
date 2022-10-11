/**
 * 
 */
package co.com.ppi.Street.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ppi.Street.manager.TipoColorManager;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Sep 30, 2022 a las 12:09:15 AM <br>
 *
 */
@Path("tipo-color")
@Api("/tipo-color")
@Component
public class TipoColorService {
	
	@Autowired
	private TipoColorManager tipoColorManager;
	
	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra color nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarColor(TipoColorEntity colorRegistrar) {
		return this.tipoColorManager.create(colorRegistrar);
	}
	
	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de tipo color")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoColorEntity> getAll(){
		return this.tipoColorManager.getAll();
	}
	
	@DELETE
	@Path("/delete/{idTipoColor}")
	@ApiOperation(value = "/", notes = "Elimina color")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam ("idTipoColor") Long idTipoColor) {
		return this.tipoColorManager.delete(idTipoColor);
				 
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice color")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(TipoColorEntity tipoColor) {
		return this.tipoColorManager.update(tipoColor);
	}
	
}
