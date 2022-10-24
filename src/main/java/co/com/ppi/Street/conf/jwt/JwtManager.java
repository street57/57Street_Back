/**
 * 
 */
package co.com.ppi.Street.conf.jwt;

import java.util.Map;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * TODO: descripción <br>
 * Creado el Oct 22, 2022 a las 8:13:48 PM <br>
 *
 */
public class JwtManager {
	
	public static String SECRET_KEY = "57StreetSecretKey";
	
	public static String sign(Map<String, Object> data) {
		try {
		    Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY);
		    String token = JWT.create()
		        .withIssuer("auth0")
		        .withPayload(data)
		        .sign(algorithm);
		    return token;
		} catch (JWTCreationException exception){
			return null;
		}
	}
	
	public static Map<String, Claim> getClaims(String token) {
		try {
		    Algorithm algorithm = Algorithm.HMAC256(SECRET_KEY); //use more secure key
		    JWTVerifier verifier = JWT.require(algorithm)
		        .withIssuer("auth0")
		        .build(); //Reusable verifier instance
		    DecodedJWT jwt = verifier.verify(token);
		    return jwt.getClaims();
		} catch (JWTVerificationException exception){
		    return null;
		}
	}

}
