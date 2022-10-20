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

import co.com.ppi.Street.manager.TipoGeneroManager;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.TipoGeneroEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 11, 2022 a las 4:46:01 PM <br>
 *
 */
@Path("tipo-genero")
@Api("/tipo-genero")
@Component
public class TipoGeneroService {

	@Autowired
	private TipoGeneroManager tipoGeneroManager;

	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra genero nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarGenero(TipoGeneroEntity generoRegistrar) {
		return this.tipoGeneroManager.create(generoRegistrar);
	}

	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de tipo genero")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoGeneroEntity> getAll() {
		return this.tipoGeneroManager.getAll();
	}

	@DELETE
	@Path("/delete/{idTipoGenero}")
	@ApiOperation(value = "/", notes = "Elimina genero")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("idTipoGenero") Long idTipoGenero) {
		return this.tipoGeneroManager.delete(idTipoGenero);
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice genero")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(TipoGeneroEntity tipoGenero) {
		return this.tipoGeneroManager.update(tipoGenero);
	}
}
