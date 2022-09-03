package probandoPruebillas;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class personaPruebillas {

	private persona persona1 = new persona("griselo","philip");
	private persona persona2 = new persona("mussa","araña");
	
	@Test
	void pruebasIndividuales() {
		assertEquals("griselo",persona1.getNombre());
		assertEquals("araña",persona2.getNombre());
	}
	
	@Test
	void pruebasFuncionLambda() {
		assertAll("Persona",
			() -> {
				assertEquals("Griselo", persona1.getNombre());
				assertEquals("Philip", persona1.getApellido());
			},
			() -> {
				assertEquals("Mussa", persona2.getNombre());
				assertEquals("Araña", persona2.getApellido());
			}
		);
	}

}