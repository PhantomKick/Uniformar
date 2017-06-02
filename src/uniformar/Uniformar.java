package uniformar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.function.Predicate;

public class Uniformar {

	private int[][] imagen;
	private int cantidadLineas;
	private int cantidadRegiones;
	private int cantidadMovimientos = 0;

	public Uniformar(String path) {
		try {
			leerArchivo(path);
		} catch (Exception e) {
			System.out.println("Error abrir archivo.");
			e.printStackTrace();
		}
	}

	public void calcular() {

	}

	public void leerArchivo(String path) {
		Scanner sc = null;
		try {
			String linea;
			sc = new Scanner(new File(path));
			this.cantidadLineas = Integer.parseInt(sc.nextLine());
			this.imagen = new int[this.cantidadLineas][this.cantidadLineas];
			for (int j = cantidadRegiones; j < this.cantidadLineas; j++) {
				linea = sc.nextLine();
				for (int i = 0; i < linea.length(); i++)
					this.imagen[i][j] = Integer.parseInt("" + linea.charAt(i));
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		sc.close();
	}

	public void escribirMatriz() {
		for (int j = 0; j < this.cantidadLineas; j++) {
			for (int i = 0; i < this.cantidadLineas; i++) {
				System.out.print(this.imagen[i][j]);
			}
		}
	}

	public void grabarArchivo(String path) {
		PrintWriter salida;
		try {
			salida = new PrintWriter(new FileWriter(path));
			salida.print(this.cantidadMovimientos);

			salida.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
