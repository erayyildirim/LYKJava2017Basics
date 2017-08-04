package tr.org.linux.kamp.oop;

public class BicycleTest {
	public static void main(String[] args) {

		MountainBicycle bc1 = new MountainBicycle(10);

		bc1.setColor("Sarı");
		bc1.setSpeed(24);
		bc1.setSpin(15);

		System.out.println(bc1.getColor() + " renkli " + bc1.getSpeed()
				+ " km/s hızına sahip " + "spin:" + bc1.getSpin()
				+ " olan bisiklet");

		bc1.changeGear(5);
		bc1.changeSpeed(-5);

		System.out.println("Yeni vites " + bc1.getGear() + " Yeni hızı: "
				+ bc1.getSpeed());
		System.out.println(bc1.toString());
	}

}
