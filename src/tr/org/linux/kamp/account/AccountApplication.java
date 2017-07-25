package tr.org.linux.kamp.account;

public class AccountApplication {
	public static void main(String[] args) {

		Account myAccount = new Account();

		Account myAccount2 = new Account("Yavuz Çetin", 300);

		Account myAccount3 = new Account("Jim Morrison");

		myAccount3.setBalance(3000.0);
		System.out.println(myAccount3.getBalance());

		myAccount.setName("Eray Yıldırım");
		System.out.println(myAccount.getName());

		System.out.println(myAccount2.getName());

	}

}
