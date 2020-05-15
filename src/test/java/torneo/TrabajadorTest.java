package torneo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.torneo.model.Partido;
import com.sanvalero.torneo.model.Trabajador;

public class TrabajadorTest {
	
	private static Trabajador trabajador;
	
	public static void setupAll() {
		trabajador = new Trabajador (null, null, null, null, null, null, null, 0);
	}
	
	public void registrarResultado() {
		Partido primerPartido = new Partido();
		Partido segundoPartido = new Partido();
		
		try {
			trabajador.registrarResultado(primerPartido);
			trabajador.añadirObservacion(segundoPartido);
			
			assertEquals("3-3", primerPartido.getObservaciones());
			assertEquals("Partido con tres tarjetas rojas", primerPartido.getObservaciones());
		} finally {
			System.out.println("Correcto");
		}
	}
	
}
