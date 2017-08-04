package tr.org.linux.kamp.abstractex;

public class Cat extends Mammal implements Carnivore {

	public Cat(String eyeColor, String furColor, int age, String species) {
		super(eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	public void miyav() {
		System.out.println("Kedi miyavladı.");
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println(getFurColor()+" renkli kedi avlandı");

	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		System.out.println("Kedi doğum yaptı");

	}

}
