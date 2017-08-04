package tr.org.linux.kamp.oopatm;

public class Atm {
	// atmyi user kullanacagı ıcın user nesnesı burada olusturuldu. (atm userla
	// varoluyor)
	private Kullanıcı user;
	private Kullanıcı[] userList = new Kullanıcı[5]; // kullanıcıları burada
														// topladık
	boolean isLogin = false;

	public Atm(Kullanıcı user) {
		this.user = user;
	}

	public Kullanıcı getUser() {
		return user;
	}

	public void setUser(Kullanıcı user) {
		this.user = user;
	}

	public Kullanıcı[] getUserList() {
		return userList;
	}

	public void setUserList(Kullanıcı user, int index) {
		this.userList[index] = user;
	}

	public boolean getIsLogin() {
		return isLogin;
	}

	public void setIsLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}

	// login para cek para yatır logout login

	public void login(Kullanıcı user) {
		if (!isLogin) {
			for (int i = 0; i < userList.length; i++) {
				if (user.getAccountNumber().equals(
						userList[i].getAccountNumber())) {
					if (user.getPassword().equals(userList[i].getPassword())) {
						isLogin = true;
						System.out.println("giriş yapıldı");

						this.user = userList[i];
						break;
					} else {
						System.out.println("Hatalı giriş");
					}

				}
			}
		} else {
			System.out.println("Zaten giriş yapıldı");
		}

	}

	public void logout() {
		isLogin = false;

	}

	public int credit(double amount) {
		if (isLogin) {
			if (amount < 0) {
				return -1;
			} else {
				double credit = this.user.getAmount();
				this.user.setAmount(credit + amount);
				return 1;
			}

		} else {
			System.out.println("Lütfen giriş yapınız");
			return 0;
		}

	}

	public int withDrawal(double amount) {
		if (isLogin) {
			if (amount <= this.user.getAmount()) {

				this.user.setAmount(this.user.getAmount() - amount);
				return 1;

			} else {

				return 0; // bakiyeden fazla para cekılmek ıstendıgı zaman.
			}

		} else {
			return -1; // giris yapılmadı
		}
	}

}
