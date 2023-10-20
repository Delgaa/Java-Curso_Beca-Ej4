package Item1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Item_c {
	public static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		int indice = 3;
		Integer[] arreglo = new Integer[indice];
		Integer[] nros = {3,8,5};
		ordenamiento(nros, 'a');
		ordenamiento(arreglo, 'd');
		System.out.println("Arrays sin argumentos: ");
		System.out.println(Arrays.toString(arreglo));
		System.out.println("Arrays con argumentos: ");
		System.out.println(Arrays.toString(nros));
	}
	public static void ordenamiento(Integer array[], char letra) {
		System.out.println("Ingrese 3 numeros de manera aleatoria: ");
			for (int i = 0; i < array.length; i++) {
				if (array[i] == null) {
				 array[i]= leer.nextInt();
				}
				else {
					System.out.println("El parametro " + (i + 1) + " tiene el valor " + array[i]);
				}
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
