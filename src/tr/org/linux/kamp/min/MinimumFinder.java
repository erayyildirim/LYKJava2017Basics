package tr.org.linux.kamp.min;

import java.util.Scanner;

public class MinimumFinder {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out
				.println("Lütfen aralarına boşluk koyarak iki sayı tanımlayınız");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();

		double result = min(number1, number2);

		System.out.println("En kucuk sayi: " + result);

	}

	public static double min(double x, double y) {
		double minValue = x;

		if (y < minValue)
			minValue = y;

		return minValue;

	}

}
