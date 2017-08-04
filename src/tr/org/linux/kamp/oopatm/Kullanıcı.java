package tr.org.linux.kamp.oopatm;

public class Kullanıcı {
	private String accountNumber;
	private String password;
	private double amount;

	public Kullanıcı(String accountNumber, String password) {

		this.accountNumber = accountNumber;
		this.password = password;

	}

	// yalancı databese kontrol
	public Kullanıcı(String accountNumber, String password, double amount) {

		this.accountNumber = accountNumber;
		this.password = password;
		this.amount = amount;

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
