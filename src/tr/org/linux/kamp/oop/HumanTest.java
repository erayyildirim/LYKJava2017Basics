package tr.org.linux.kamp.oop;

public class HumanTest {
	public static void main(String[] args) {
		
		Human usr1 = new Human();
		Human usr2 = new Human("1","Ahmet","Erkek", 25);
		Human usr3 = new Human();
		//nesnenin durumları atandı.
		usr1.name = "Eray";
		usr1.age = 52;
		usr1.gender = "Erkek";
		usr1.id = "959";
		//nesnenin davranışları girildi.
		usr1.eat();
		usr1.speak();
		usr1.sleep();
		System.out.println(Human.i + " adet nesne oluşturuldu.");
		
		
		
	}

}
