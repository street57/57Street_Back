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

import co.com.ppi.Street.manager.TipoPerfilUsuarioManager;
import co.com.ppi.Street.models.entity.TipoPerfilUsuarioEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 22, 2022 a las 1:06:25 AM <br>
 *
 */
@Path("tipo-perfil-usuario")
@Api("/tipo-perfil-usuario")
@Component
public class TipoPerfilUsuarioService {

	@Autowired
	private TipoPerfilUsuarioManager tipoPerfilUsuarioManager;
	
	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra tipo perfil usuario  nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarTipoPerfilUsuario(TipoPerfilUsuarioEntity tipoPerfilUsuarioRegistrar) {
		return this.tipoPerfilUsuarioManager.create(tipoPerfilUsuarioRegistrar);
	}
	
	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de tipo perfil usuario")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoPerfilUsuarioEntity> getAll(){
		return this.tipoPerfilUsuarioManager.getAll();
	}
	
	@DELETE
	@Path("/delete/{idTipoPerfilUsuario}")
	@ApiOperation(value = "/", notes = "Elimina tipo perfil usuario")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam ("idTipoPerfilUsuario") Long idTipoPerfilUsuario) {
		return this.tipoPerfilUsuarioManager.delete(idTipoPerfilUsuario);				 
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice tipo perfil usuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(TipoPerfilUsuarioEntity tipoPerfilUsuario) {
		return this.tipoPerfilUsuarioManager.update(tipoPerfilUsuario);
	}

}
