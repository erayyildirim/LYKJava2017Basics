package tr.org.linux.kamp.oop;

public class Human {
	int age;
	String name;
	String gender;
	String id;
	static int i =0;
	public Human(){
		i++;
		System.out.println("Insan nesnesi oluşturuldu");
	}
	
	public Human(String id, String name, String gender, int age){
	//	System.out.println("Insan nesnesi oluşturuldu"); // parametresiz constructor ıcındekı kodları almak için
		this(); //constructor ıcındekı kodlar alındı
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void sleep(){
		System.out.println("Insan uyudu.");
	}
	
	public void eat(){
		System.out.println("Insan yemek yedi.");
	}
	
	public void speak(){
		System.out.println("Insan konuştu.");
	}

}
