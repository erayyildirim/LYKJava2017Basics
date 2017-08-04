package tr.org.linux.kamp.abstractex;

public class Deer extends Mammal implements Herbivore{

	public Deer(String eyeColor, String furColor, int age, String species) {
		super(eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}
	
	public void kac(){
		System.out.println(getFurColor()+"renkli geyik kaçtı");
	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		
	}

}
