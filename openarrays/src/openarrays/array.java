package openarrays;

public class array {

	public static void main(String[] args) {
		int[] array = new int[10];
		rellenaarray(array);
	}

	private static void rellenaarray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.round(Math.random() * 19) + 1);
		}
	}
	
	private static void sumaarray(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		System.out.println(suma);
	}

}