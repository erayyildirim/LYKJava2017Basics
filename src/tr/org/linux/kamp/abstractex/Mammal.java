package tr.org.linux.kamp.abstractex;

public abstract class Mammal extends Animal{
	
	public Mammal(String eyeColor, String furColor, int age, String species) {
		super(eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	abstract void giveBirth();

}
