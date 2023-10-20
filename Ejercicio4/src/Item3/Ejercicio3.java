package Item3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio3 {
	public static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		String rutaRelEntrada = "Recursos/entrada.txt";
		String arreglo =""; 
		String codoDeco;
		int desplazo = 0;
		String rutaRelSalida = "Recursos/salida.txt";
		
		File salida = new File(rutaRelSalida);
		salida.createNewFile();
		FileWriter escritor = new FileWriter(rutaRelSalida);

		
		Path pathDelArchivo = Paths.get(rutaRelEntrada); 
		
		try {
			arreglo = Files.readString(pathDelArchivo);
			
		} catch (FileNotFoundException s) {
            System.out.println("Error al leer el archivo ");
            return; 
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte[] decodedBytes = arreglo.getBytes();
		System.out.println("Desea Codificar(cod) o Decodificar(dec): ");
		codoDeco = leer.nextLine();
		switch(codoDeco) {
		case "cod":
			System.out.println("Cual es el valor del desplazamiento (1 o 2): ");
			desplazo = leer.nextInt();
			switch(desplazo) {
			case 1:
				for (int i = 0; i < decodedBytes.length; i++) {
					decodedBytes[i]++;
				}
				String arreglocod = new String(decodedBytes);
				escritor.write(arreglocod);
				escritor.close();
				break;
			case 2:
				for (int i = 0; i < decodedBytes.length; i++) {
					decodedBytes[i] = (byte) (decodedBytes[i] + 2);
				}
				String arreglocodi = new String(decodedBytes);
				escritor.write(arreglocodi);
				escritor.close();
				break;
			}
		case "dec":
			System.out.println("Cual es el valor del desplazamiento (1 o 2): ");
			desplazo = leer.nextInt();
			switch(desplazo) {
			case 1:
				for (int i = 0; i < decodedBytes.length; i++) {
					decodedBytes[i]++;
					escritor.write(decodedBytes[i]);
				}
				escritor.close();
				break;
			case 2:
				for (int i = 0; i < decodedBytes.length; i++) {
					decodedBytes[i] = (byte) (decodedBytes[i] + 2);
					escritor.write(decodedBytes[i]);
				}
				escritor.close();
				break;
			}
		}
		
	}
	
}
