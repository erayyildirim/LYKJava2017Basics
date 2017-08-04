package tr.org.linux.kamp.abstractex;

public class Snake extends  Reptile implements Herbivore, Carnivore {
	
	

	public Snake(String eyeColor, String furColor, int age, String species) {
		super(eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println(getEyeColor()+" gözlü yılan avlandı");
		
	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		System.out.println("Yılan yemek yedi");
		
	}

	@Override
	void crawl() {
		// TODO Auto-generated method stub
		
	}
	

}
