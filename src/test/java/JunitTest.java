
import static org.testng.Assert.assertEquals;
import org.junit.Test;

import com.iplacex.app.Conexion;

public class JunitTest {

	@Test
	public void testCenexión() {
		System.out.println("Probando Conexión Con contraseña Correcta");
		Conexion conn = new Conexion();
		boolean esperado= true;
		boolean real = conn.test("pet_User_2022");
		assertEquals(esperado, real);
		
	}

}
