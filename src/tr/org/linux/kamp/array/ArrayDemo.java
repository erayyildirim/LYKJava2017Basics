package tr.org.linux.kamp.array;

import java.util.Random;

public class ArrayDemo {

	private static Random rand = new Random();
	private static int bound = 10;
	private static int[] array = new int[bound];

	public static void generateArray() {
		int item;
		for (int i = 0; i < array.length; i++) {
			item = rand.nextInt(10);
			array[i] = item;

		}
	}

	public static void printArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

	public static void sortArray() {
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++)

				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
		}
	}

	public static void main(String[] args) {
		generateArray();
		printArray();
		System.out.println("");
		System.out.println("Dizi sıralandı...");
		sortArray();
		printArray();

		int item = 5;
		if (searchItem(item)) {
			System.out.println("");
			System.out.println(item + " dizi içinde bulundu..");
		} else {
			System.out.println("");
			System.out.println("Bulunamadi..");
		}

		System.out.println(" ");
		int index = lastIndex(item);
		if (index != -1) {
			System.out.println(index + "'nci indiste bulundu");
		}
	}

	private static int lastIndex(int item) {
		for (int i = (array.length - 1); i >= 0; i--) {
			if (array[i] == item) {
				return i;
			}
		}

		return -1;

	}

	private static boolean searchItem(int item) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == item)
				return true;
		}
		return false;

	}

}
