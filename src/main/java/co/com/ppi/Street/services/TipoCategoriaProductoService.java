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

import co.com.ppi.Street.manager.TipoCategoriaProductoManager;
import co.com.ppi.Street.models.entity.TipoCategoriaProductoEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 10, 2022 a las 9:27:14 PM <br>
 *
 */
@Path("tipo-categoria-producto")
@Api("/tipo-categoria-producto")
@Component
public class TipoCategoriaProductoService {

	@Autowired
	private TipoCategoriaProductoManager tipoCategoriaProductoManager;
	
	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra categoria producto nueva")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarCategoriaProducto(TipoCategoriaProductoEntity categoriaProductoRegistrar) {
		return this.tipoCategoriaProductoManager.create(categoriaProductoRegistrar);
	}
	
	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de tipo categoria producto")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoCategoriaProductoEntity> getAll(){
		return this.tipoCategoriaProductoManager.getAll();
	}
	
	@DELETE
	@Path("/delete/{idTipoCategoriaProducto}")
	@ApiOperation(value = "/", notes = "Elimina categoria producto")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("idTipoColor") Long idTipoCategoriaProducto) {
		return this.tipoCategoriaProductoManager.delete(idTipoCategoriaProducto);
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice categoria producto")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(TipoCategoriaProductoEntity tipoCategoriaProducto) {
		return this.tipoCategoriaProductoManager.update(tipoCategoriaProducto);
	}
}
