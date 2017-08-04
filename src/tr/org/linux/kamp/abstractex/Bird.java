package tr.org.linux.kamp.abstractex;

public abstract class Bird extends Animal {
	
	public Bird(String eyeColor, String furColor, int age, String species) {
		super(eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}
	abstract void fly();
	abstract void cikCik();
	

}
