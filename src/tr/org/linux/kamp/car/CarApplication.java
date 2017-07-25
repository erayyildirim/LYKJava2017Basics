package tr.org.linux.kamp.car;

public class CarApplication {
	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car(3,40, "Mercedes");

		System.out.println("Brand :" + car1.getBrand() + " " + "Gear :"
				+ car1.getGear() + " " + "Speed :" + car1.getSpeed());

		car1.setSpeed(50);

		System.out.println("Hız= " + car1.getSpeed());
		car1.speedUp(40);
		System.out.println("Car1 yeni hız= " + car1.getSpeed());

		car1.changeGerar(3);
		System.out.println("Vites artırıldı= " + car1.getGear());

		car1.changeGerar(4);
		System.out.println("Vites artırıldı= " + car1.getGear());

		System.out.println("Car2 Brand= " + car2.getBrand());

		car2.setGear(3);
		car2.setSpeed(100);
		System.out.println("Car2 hızı= " + car2.getSpeed() + " "
				+ "Car2 gear= " + car2.getGear());
		car2.speedDown(20);
		car2.changeGerar(2);

		System.out.println("Car2 hızı= " + car2.getSpeed() + " "
				+ "Car2 gear= " + car2.getGear());

		car3.setSpeed(0);
		car3.speedDown(20);
			
		System.out.println(car4.getBrand() + " " + car4.getGear() + " " + car4.getSpeed());
		
	}

}
