
import static org.testng.Assert.assertEquals;
import org.junit.Test;

import com.iplacex.app.Conexion;
import com.iplacex.app.Login;

public class JunitTest {

	@Test
	public void testCenexión() {
		System.out.println("Probando Conexión Con contraseña Correcta");
		Conexion conn = new Conexion();
		boolean esperado= true;
		boolean real = conn.test("pet_User_2022");
		assertEquals(esperado, real);
		
	}
	
	@Test
	public void testLogin() {
		System.out.println("Probando Login");
		Login log = new Login();
		boolean esperado= true;
		boolean real = log.TryLogin("pet", "pet123");
		assertEquals(esperado, real);
		
	}

}
