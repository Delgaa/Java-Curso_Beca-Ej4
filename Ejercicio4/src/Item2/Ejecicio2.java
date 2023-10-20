package Item2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejecicio2 {

	public static void main(String[] args) {
		String rutaRel = "Recursos/numeros.txt";
		int suma = 0;
		
		Path pathDelArchivo = Paths.get(rutaRel); 
		
		try {
			for (String linea: Files.readAllLines(pathDelArchivo)) {
				suma += Integer.parseInt(linea);
				
			}
			System.out.println("La suma de los numeros en el archivo es igual a: "+ suma);
		} catch (FileNotFoundException s) {
            System.out.println("Error al leer el archivo ");
            return; 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
