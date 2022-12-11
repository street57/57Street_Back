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

import co.com.ppi.Street.manager.UsuarioSistemaManager;
import co.com.ppi.Street.models.dto.RegistrarUsuarioInDTO;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.UsuarioSistemaEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 10:30:53 PM <br>
 *
 */
@Path("usuario-sistema")
@Api("/usuario-sistema")
public class UsuarioSistemaService {

	@Autowired
	private UsuarioSistemaManager usuarioSistemaManager;
	
	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra usuario sistema nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarUsuarioSistema(RegistrarUsuarioInDTO registrarUsuario) {
		return this.usuarioSistemaManager.create(registrarUsuario);
	}
	
	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de usuarios sistema")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UsuarioSistemaEntity> getAll(){
		return this.usuarioSistemaManager.getAll();
	}

	@DELETE
	@Path("/delete/{idUsuarioSistema}")
	@ApiOperation(value = "/", notes = "Elimina usuario Sistema")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam ("idUsuarioSistema") Long idUsuarioSistema) {
		return this.usuarioSistemaManager.delete(idUsuarioSistema);				 
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice usuario Sistema")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(UsuarioSistemaEntity usuarioSistema) {
		return this.usuarioSistemaManager.update(usuarioSistema);
	}

}
