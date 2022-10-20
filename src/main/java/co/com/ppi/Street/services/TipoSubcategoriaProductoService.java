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

import co.com.ppi.Street.manager.TipoSubcategoriaProductoManager;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import co.com.ppi.Street.models.entity.TipoSubcategoriaProductoEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 11, 2022 a las 5:09:29 PM <br>
 *
 */
@Path("tipo-subcategoria-producto")
@Api("/tipo-subcategoria-producto")
@Component
public class TipoSubcategoriaProductoService {

	@Autowired
	private TipoSubcategoriaProductoManager tipoSubcategoriaProductoManager;
	
	@POST
	@Path("/Insert")
	@ApiOperation(value = "/", notes = "Registra subcategoria producto nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarSubcategoriaProducto(TipoSubcategoriaProductoEntity SubcategoriaProductoRegistrar) {
		return this.tipoSubcategoriaProductoManager.create(SubcategoriaProductoRegistrar);
	}
	
	@GET
	@Path("/getAll")
	@ApiOperation(value = "/getAll", notes = "Retorna la lista de tipo Subcategoria Producto")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoSubcategoriaProductoEntity> getAll(){
		return this.tipoSubcategoriaProductoManager.getAll();
	}
	
	@DELETE
	@Path("/delete/{idTipoSubcategoriaProducto}")
	@ApiOperation(value = "/", notes = "Elimina Subcategoria Producto")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam ("idTipoSubcategoriaProducto") Long idTipoSubcategoriaProducto) {
		return this.tipoSubcategoriaProductoManager.delete(idTipoSubcategoriaProducto);				 
	}
	
	@PUT
	@Path("/update")
	@ApiOperation(value = "/", notes = "Actualice Subcategoria Producto")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(TipoSubcategoriaProductoEntity tipoSubcategoriaProducto) {
		return this.tipoSubcategoriaProductoManager.update(tipoSubcategoriaProducto);
	}
}
