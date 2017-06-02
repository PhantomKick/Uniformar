package uniformar;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniformarTest {

	private static String archivoIn = "Preparacion de Prueba/Lote de Prueba/Entrada/";
	private static String archivoOut = "Ejecucion de Prueba/Salida Obtenida/";

	@Test
	public void test() {
		Uniformar uniformar = new Uniformar(archivoIn + "00_Enunciado.in");
		// uniformar.calcula();
		// uniformar.grabarArchivo(archivoOut + "00_Enunciado.out");
	}

}
