/**
 * 
 */
package co.com.ppi.Street.models.dto;

import javax.ws.rs.core.Response;

/**
 * TODO: descripción <br>
 * Creado el Oct 22, 2022 a las 8:35:39 PM <br>
 *
 */
public class ResponseDTO {

	private String message;
	private Integer code;

	public ResponseDTO() {
	}
	
	public Response authErrorResponse(String messageNew) {
		ResponseDTO respuesta = new ResponseDTO();
		respuesta.setCode(Response.Status.FORBIDDEN.getStatusCode());
		respuesta.setMessage((messageNew != null) ? messageNew : "Autenticación fallida");
		return Response.status(Response.Status.FORBIDDEN).entity(respuesta).build();
	}

	public Response paramError(String messageNew) {
		ResponseDTO respuesta = new ResponseDTO();
		respuesta.setCode(Response.Status.BAD_REQUEST.getStatusCode());
		respuesta.setMessage((messageNew != null) ? messageNew : "Param Exception");
		return Response.status(Response.Status.BAD_REQUEST).entity(respuesta).build();
	}
	
	public Response noContentResponse(String messageNew) {
		ResponseDTO respuesta = new ResponseDTO();
		respuesta.setCode(Response.Status.NO_CONTENT.getStatusCode());
		respuesta.setMessage((messageNew != null) ? messageNew : "Param Exception");
		return Response.status(Response.Status.NO_CONTENT).entity(respuesta).build();
	}
	
	public Response unexpectedResponse(String messageNew) {
		ResponseDTO respuesta = new ResponseDTO();
		respuesta.setCode(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
		respuesta.setMessage((messageNew != null) ? messageNew : "Param Exception");
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(respuesta).build();
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

}
