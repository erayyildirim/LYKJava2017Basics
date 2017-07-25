package tr.org.linux.kamp.interest;

public class Interest {
	public static void main(String[] args) {

		double amount;
		double principal = 1000.0;
		double rate = 0.05;

		for (int year = 1; year <= 19; year++) {
			amount = principal * Math.pow(1.0 + rate, year);
			System.out.println(amount);
		}

	}
}