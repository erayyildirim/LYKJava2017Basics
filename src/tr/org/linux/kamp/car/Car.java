package tr.org.linux.kamp.car;

public class Car {

	private int gear;
	private int speed;
	String brand;

	public Car() {
		brand = "volvo";

	}

	public Car(int gear, int speed, String brand) {
		this.gear = gear;
		this.speed = speed;
		this.brand = brand;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int speedUp(int up) {
		return speed = speed + up;
	}

	public int speedDown(int down) {
		if(speed == 0){
			System.out.println(getBrand() + " hıza sahip değil azaltılamaz");
			return speed;
		}
		return speed = speed - down;
	}

	public void changeGerar(int gear) {
		this.gear = gear;

	}

}
