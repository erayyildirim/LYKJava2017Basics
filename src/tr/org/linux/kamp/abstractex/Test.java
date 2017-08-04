package tr.org.linux.kamp.abstractex;


//String eyeColor;
//String furColor;
//int age;
//String species;
public class Test {
	public static void main(String[] args) {
		Cat cat1 = new Cat("Yeşil", "Gri", 3, "Ankara");
		Snake snake = new Snake("Kırmızı", "Gri", 50, "Engerek");
		Canary canary = new Canary("Mavi", "Beyaz", 7, "Muhabbet");
		System.out.println(cat1.getEyeColor()  +" gözlü " + cat1.getFurColor() + " renkli "
				+ cat1.getAge() + " yaşında " + cat1.getSpecies() + " kedisi.");
		cat1.miyav();
		cat1.hunt();
		
		snake.hunt();
		
		
		
		
	}

}
