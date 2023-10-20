package Item2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Item_a {
	public static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		String rutaRel = "Recursos/numeros.txt";
		int suma = 0, multi= 1;
		String op;
		Path pathDelArchivo = Paths.get(rutaRel); 
		
		try {
			System.out.println("Que operacion desea realizar (Sumar (s) o Multiplicar (m)) ");
			op = leer.next();
			for (String linea: Files.readAllLines(pathDelArchivo)) {
				switch(op) {
				case "s":
					suma += Integer.parseInt(linea);
					break;
				case "m":
					multi = multi * Integer.parseInt(linea);
					break;
				default:
					System.out.println("Opcion ingresada incorrecta");
				}
			}
			
			if (op == "s") {
				System.out.println("La suma de los numeros en el archivo es igual a: "+ suma);
			}else if (op == "m") {
					System.out.println("La multiplicacion de los numeros en el archivo es igual a: "+ multi);
			}
			
		} catch (FileNotFoundException s) {
            System.out.println("Error al leer el archivo ");
            return; 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
