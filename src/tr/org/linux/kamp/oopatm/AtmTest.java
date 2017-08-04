package tr.org.linux.kamp.oopatm;

import java.util.Scanner;

public class AtmTest {
	public static void main(String[] args) {
		Kullanıcı user = new Kullanıcı("100", "101"); // kullanıcı id sıfresı
														// gırıldı kontrol
														// edılecek
		Atm atm = new Atm(user);

		generateUsers(atm);
		showUsers(atm);
		atm.login(user);
		System.out.println("bakiye " + atm.getUser().getAmount());
		int credit = atm.credit(100);
		if (credit == 1) {
			System.out.println("para yatırma işlemi basarılı");
		} else if (credit == 0) {
			System.out.println("para yatırılamadı");

		}
		System.out.println("güncel bakiye:" + atm.getUser().getAmount());

		atm.logout();
		// atm.login(user);

		int withDrawal = atm.withDrawal(85);
		if (withDrawal == 1) {
			System.out.println("Para çekme işlemi başarılı.");
		} else if (withDrawal == -1) {
			System.out.println("Lütfen giriş yapınız, para çekilemedi");
		} else {
			System.out.println("Bakiye yetersiz.");
		}

		System.out.println("güncel bakiye:" + atm.getUser().getAmount());

	}

	private static void generateUsers(Atm atm) {
		Kullanıcı u;
		int amount = 500;
		for (int i = 0; i < atm.getUserList().length; i++) {
			u = new Kullanıcı(Integer.toBinaryString(i + 1),
					Integer.toBinaryString(i + 2), amount + 100);
			// int degiri stringe cevırıp yolladık

			// atm.getUserList()[i] = u;
			atm.setUserList(u, i);
		}
	}

	private static void showUsers(Atm atm) {
		System.out.println("Müşteriler:");
		for (int i = 0; i < atm.getUserList().length; i++) {
			System.out.println(atm.getUserList()[i].getAccountNumber() + " "
					+ atm.getUserList()[i].getPassword() + " "
					+ atm.getUserList()[i].getAmount());
		}

	}

}
