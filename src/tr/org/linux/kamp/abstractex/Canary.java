package tr.org.linux.kamp.abstractex;

public class Canary extends Bird implements Herbivore {
	


	
	public Canary(String eyeColor, String furColor, int age, String species) {
		super(eyeColor, furColor, age, species);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		System.out.println("Kuş yemek yedi");
		
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Kanarya uçtu");
		
	}

	@Override
	void cikCik() {
		// TODO Auto-generated method stub
		System.out.println("Kuş ötmeye başladı.");
		
	}
	
	public void drinkWater(){
		System.out.println("Kus su içti");
	}

}
