package tr.org.linux.kamp.oop;

public class Animal {
	
	private String gender;
	private String kind;
	private int age;
	
//	public Animal(String tur){
//		this.kind = tur ;
//	}
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getKind() {
		return kind;
	}


	public void setKind(String kind) {
		this.kind = kind;
	}


	public void hunt(){
		System.out.println("Hayvan avlandı");
	}
	
	public void eat(){
		System.out.println("Yememek bulundu.");
	}
	

	
	
	
	
	
	
	

}
