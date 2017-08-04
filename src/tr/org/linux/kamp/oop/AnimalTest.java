package tr.org.linux.kamp.oop;

public class AnimalTest {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.setKind("Surungen");
		animal.setAge(5);
		animal.setGender("dişi");
		
		animal.hunt();
		animal.eat();
		
		System.out.println(animal.getAge() +" yaşında " + animal.getGender()+ " bir " + animal.getKind());
	
		
		
		
	}

}
