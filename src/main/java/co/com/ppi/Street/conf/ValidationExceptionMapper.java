package co.com.ppi.Street.conf;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * Clase encargada de las validaciones. <br>
 * Creado el 16/05/2022 a las 5:57:55 p. m. <br>
 *
 */
@Provider
public class ValidationExceptionMapper implements ExceptionMapper<ConstraintViolationException> {

	@Override
	public Response toResponse(final ConstraintViolationException exception) {
		return Response.status(Response.Status.BAD_REQUEST).entity(prepareMessage(exception)).type("text/plain")
				.build();
	}

	private String prepareMessage(ConstraintViolationException exception) {
		String msg = "";
		for (ConstraintViolation<?> cv : exception.getConstraintViolations()) {
			msg += cv.getPropertyPath() + " " + cv.getMessage() + "\n";
		}
		return msg;
	}
}