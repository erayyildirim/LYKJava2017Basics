package tr.org.linux.kamp.abstractex;

public abstract class Reptile extends Animal {
	
	public Reptile(String eyeColor, String furColor, int age, String species) {
		super(eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	abstract void crawl();

}
