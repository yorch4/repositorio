package openarrays;

public class array {

	public static void main(String[] args) {
		int[] array = new int[8];
		rellenaarray(array);
	}
//CAMBIO2
	private static void rellenaarray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.round(Math.random() * 19) + 1);
		}
	}

}