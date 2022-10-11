/**
 * 
 */
package co.com.ppi.Street.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ppi.Street.manager.ProductoManager;
import co.com.ppi.Street.models.dto.ActualizarProductoInDTO;
import co.com.ppi.Street.models.dto.CrearProductoInDTO;
import co.com.ppi.Street.models.entity.DetalleProductoEntity;
import co.com.ppi.Street.models.entity.TipoColorEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 7, 2022 a las 9:39:33 PM <br>
 *
 */
@Path("producto")
@Api("/producto")
@Component
public class ProductoService {
	
	@Autowired
	private ProductoManager productoManager;

	@POST
	@Path("/registrarProducto")
	@ApiOperation(value = "/registrarProducto", notes = "Registra producto nuevo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registrarProducto(CrearProductoInDTO productoRegistrar) {
		return this.productoManager.registrarProducto(productoRegistrar);
	}
	
	@PUT
	@Path("/actualizarProducto")
	@ApiOperation(value = "/", notes = "Actualice detalle producto")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response update(ActualizarProductoInDTO productoActualizar) {
		return this.productoManager.actualizarProducto(productoActualizar);
	}
}
