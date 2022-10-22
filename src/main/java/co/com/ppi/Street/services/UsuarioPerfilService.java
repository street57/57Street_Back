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

import co.com.ppi.Street.manager.UsuarioPerfilManager;
import co.com.ppi.Street.models.entity.UsuarioPerfilEntity;
import co.com.ppi.Street.models.entity.UsuarioSistemaEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 21, 2022 a las 11:29:20 PM <br>
 *
 */
@Path("usuario-perfil")
@Api("/usuario-perfil")
@Component
public class UsuarioPerfilService {

	@Autowired
	private UsuarioPerfilManager usuarioPerfilManager;
	
	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra usuario perfil nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarUsuarioPerfil(UsuarioPerfilEntity usuarioPerfilRegistrar) {
		return this.usuarioPerfilManager.create(usuarioPerfilRegistrar);
	}
	
	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de usuarios perfil")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UsuarioPerfilEntity> getAll(){
		return this.usuarioPerfilManager.getAll();
	}

	@DELETE
	@Path("/delete/{idUsuarioPerfil}")
	@ApiOperation(value = "/", notes = "Elimina usuario Perfil")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam ("idUsuarioPerfil") Long idUsuarioPerfil) {
		return this.usuarioPerfilManager.delete(idUsuarioPerfil);				 
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice usuario Perfil")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(UsuarioPerfilEntity usuarioPerfil) {
		return this.usuarioPerfilManager.update(usuarioPerfil);
	}

	
}
