package Item1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Item_b {
	public static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		int indice = 3;
		Integer arreglo[]= new Integer[indice];
		ordenamiento(arreglo, 'd');
		System.out.println(Arrays.toString(arreglo));
	}
	public static void ordenamiento(Integer array[], char letra) {
		System.out.println("Ingrese 3 numeros de manera aleatoria: ");
			for (int i = 0; i < array.length; i++) {
				 array[i]= leer.nextInt();
			}
			switch(letra) {
			case 'a':
				Arrays.sort(array);
				break;
			case 'd':
				Arrays.sort(array, Collections.reverseOrder());
				break;
				}
	}

}
