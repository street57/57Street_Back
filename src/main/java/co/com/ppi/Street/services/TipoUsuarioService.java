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

import co.com.ppi.Street.dao.TipoUsuarioDAO;
import co.com.ppi.Street.manager.TipoUsuarioManager;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.TipoUsuarioEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 22, 2022 a las 12:21:53 AM <br>
 *
 */
@Path("tipo-usuario")
@Api("/tipo-usuario")
@Component
public class TipoUsuarioService {

	@Autowired
	private TipoUsuarioManager tipoUsuarioManager;
	
	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra tipo usuario nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarTipoUsuario(TipoUsuarioEntity tipoUsuarioRegistrar) {
		return this.tipoUsuarioManager.create(tipoUsuarioRegistrar);
	}
	
	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de tipo usuario")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoUsuarioEntity> getAll(){
		return this.tipoUsuarioManager.getAll();
	}
	
	@DELETE
	@Path("/delete/{idTipoUsuario}")
	@ApiOperation(value = "/", notes = "Elimina tipo usuario")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam ("idTipoUsuario") Long idTipoUsuario) {
		return this.tipoUsuarioManager.delete(idTipoUsuario);				 
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice tipo usuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(TipoUsuarioEntity tipoUsuario) {
		return this.tipoUsuarioManager.update(tipoUsuario);
	}

}
