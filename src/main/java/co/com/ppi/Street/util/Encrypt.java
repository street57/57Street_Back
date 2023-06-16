/**
 * 
 */
package co.com.ppi.Street.util;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

/**
 * TODO: descripción <br>
 * Creado el Jun 12, 2023 a las 8:55:10 PM <br>
 *
 */
public class Encrypt {
	
	public static Argon2PasswordEncoder argonEncoder = new Argon2PasswordEncoder(16, 32, 1, 6000, 10);
	
	public static String encriptar(String valorEncriptar) {
		return argonEncoder.encode(valorEncriptar);
	}
	
	public static Boolean validate(String valorSinEncriptar, String valorencriptado) {
		return argonEncoder.matches(valorSinEncriptar, valorencriptado);
	}
}
