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

import co.com.ppi.Street.manager.TipoTallaManager;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.TipoTallaEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 11, 2022 a las 5:31:37 PM <br>
 *
 */
@Path("tipo-talla")
@Api("/tipo-talla")
@Component
public class TipoTallaService {

	@Autowired
	private TipoTallaManager tipoTallaManager;
	
	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra talla nueva")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarTalla(TipoTallaEntity tallaRegistrar) {
		return this.tipoTallaManager.create(tallaRegistrar);
	}
	
	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de tipo talla")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoTallaEntity> getAll(){
		return this.tipoTallaManager.getAll();
	}
	
	@DELETE
	@Path("/delete/{idTipoColor}")
	@ApiOperation(value = "/", notes = "Elimina talla")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam ("idTipoTalla") Long idTipoTalla) {
		return this.tipoTallaManager.delete(idTipoTalla);				 
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice talla")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(TipoTallaEntity tipoTalla) {
		return this.tipoTallaManager.update(tipoTalla);
	}
}
