package tr.org.linux.kamp.enumeration;

public class DayTest {
	static Day day;
	
	public DayTest(Day day){
		this.day = day;
	}
	
	
	public static void tellAboutDay(){
		switch(day){
		case PAZARTESI:
			System.out.println("Pazartesi igrenctir.");
			break;
		case CUMA:
			System.out.println("Cuma güzeldir");
			break;
		case CUMARTESI:
			System.out.println("Haftasonu harikadır");
			break;
		default:
			System.out.println("diger gunler");
			break;
		
		
		}
		
	}
	
	public static void main(String[] args) {
		DayTest days = new DayTest(Day.PAZARTESI);
		days.tellAboutDay();
		
	}

}
