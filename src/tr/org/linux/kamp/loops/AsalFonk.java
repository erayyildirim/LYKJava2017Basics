package tr.org.linux.kamp.loops;

import java.util.Scanner;

public class AsalFonk {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("bir sayi gir");
		int number = input.nextInt();
		boolean isPrime = true;

		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println(number +"= bir asal sayı");
		}
		else System.out.println(number +"= bir asal sayı değildir");

	}
}