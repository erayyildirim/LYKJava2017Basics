package tr.org.linux.kamp.array;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {

		int[] intArray = { 4, 8, 15, 16, 23, 42 };
		int[] intArray2 = { 4, 8, 15, 16, 23, 423 };

		boolean result = Arrays.equals(intArray, intArray2);
		System.out.println("Arayler eşit mi? : " + result);

	}
}
