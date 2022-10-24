/**
 * 
 */
package co.com.ppi.Street.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.ppi.Street.manager.LoginManager;
import co.com.ppi.Street.models.dto.LoginJWTInDTO;
import co.com.ppi.Street.models.dto.LoginJWTOutDTO;
import co.com.ppi.Street.models.dto.ResponseDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * TODO: descripción <br>
 * Creado el Oct 23, 2022 a las 2:29:07 PM <br>
 *
 */
@Path("login")
@Api("/login")
@Component
public class LoginService {

	@Autowired
	private LoginManager loginManager;
	
	@POST
	@Path("/login")
	@ApiOperation(value = "/login", notes = "")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(LoginJWTInDTO login) {
		return this.loginManager.loginJwt(login.getEmail(), login.getClave());
	}
	
	@POST
	@Path("/JWT/verify")
	@ApiOperation(value = "/JWT/verify", notes = "")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response login(@QueryParam("token") String token) {
		LoginJWTOutDTO dataToken = this.loginManager.verifyToken(token);
		if (dataToken == null) {
			return new ResponseDTO().authErrorResponse("El token no es valido");
		}
		return Response.status(Response.Status.OK).entity(dataToken).build();
	}
}
