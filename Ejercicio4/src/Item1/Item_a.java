package Item1;

import java.util.Arrays;
import java.util.Collections;

public class Item_a {

	public static void main(String[] args) {
		Integer arreglo[] = {3, 8, 1};
		ordenamiento(arreglo, 'd');
		System.out.println(Arrays.toString(arreglo));
	}
	public static void ordenamiento(Integer arr[], char letra) {
			switch(letra) {
			case 'a':
				Arrays.sort(arr);
				break;
			case 'd':
				Arrays.sort(arr, Collections.reverseOrder());
				break;
			}
	}

}
