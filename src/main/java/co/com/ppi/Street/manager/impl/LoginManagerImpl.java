/**
 * 
 */
package co.com.ppi.Street.manager.impl;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth0.jwt.interfaces.Claim;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.ppi.Street.conf.jwt.JwtManager;
import co.com.ppi.Street.manager.LoginManager;
import co.com.ppi.Street.manager.UsuarioSistemaManager;
import co.com.ppi.Street.models.dto.LoginJWTOutDTO;
import co.com.ppi.Street.models.dto.ResponseDTO;
import co.com.ppi.Street.models.entity.UsuarioSistemaEntity;

/**
 * TODO: descripción <br>
 * Creado el Oct 22, 2022 a las 8:10:33 PM <br>
 *
 */
@Service
public class LoginManagerImpl implements LoginManager {
	
	@Autowired
	private UsuarioSistemaManager usuarioSistemaManager;

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.LoginManager#loginJwt(java.lang.String, java.lang.String)
	 */
	@Override
	public Response loginJwt(String correo, String clave) {
		UsuarioSistemaEntity usuarioSistema = this.usuarioSistemaManager.findByEmailAndClave(correo, clave);
		if (usuarioSistema == null) {
			// El usuario no existe retornar el response.
			return new ResponseDTO().paramError("El usuario no se encuentra registrado en el sistema");
		}
		LoginJWTOutDTO respuesta = new LoginJWTOutDTO();
		respuesta.setIdUsuario(usuarioSistema.getIdUsuarioSistema());
		respuesta.setIdTipoUsuario(usuarioSistema.getIdTipoUsuario());
		respuesta.setNombres(usuarioSistema.getNombres());
		respuesta.setApellidos(usuarioSistema.getApellidos());
		respuesta.setCelular(usuarioSistema.getCelular());
		respuesta.setCorreo(usuarioSistema.getEmail());
		respuesta.setToken(JwtManager.sign((Map<String, Object>) new ObjectMapper().convertValue(respuesta, Map.class)));
		return Response.status(Response.Status.OK).entity(respuesta).build();
	}

	/* (non-Javadoc)
	 * @see co.com.ppi.Street.manager.LoginManager#verifyToken(java.lang.String)
	 */
	@Override
	public LoginJWTOutDTO verifyToken(String token) {
		try {
			Map<String, Claim> dataToken = JwtManager.getClaims(token);
			Map<String, Object> dataParse = new HashMap<>();
			for (Map.Entry<String, Claim> entry : dataToken.entrySet()) { 
	            System.out.println("Key = " + entry.getKey() +
	                             ", Value = " + entry.getValue());
	            if (entry.getValue().asString() != null) {
	            	dataParse.put(entry.getKey(), entry.getValue().asString());
	            } else {
	            	dataParse.put(entry.getKey(), entry.getValue().asInt());
	            }
			}
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			
			LoginJWTOutDTO dataInToken = mapper.convertValue(dataParse, LoginJWTOutDTO.class);
			dataInToken.setToken(token);
			return dataInToken;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
