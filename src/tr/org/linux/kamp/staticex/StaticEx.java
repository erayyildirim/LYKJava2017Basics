package tr.org.linux.kamp.staticex;

public class StaticEx {
	
	public static String myStaticString = "BU BIR STATIK STRING";
	
	public static String myStaticStringMEthod(){
		return "BU BIR STATIK STRING METOD";
	}
	
	static{
		System.out.println("bu bir statik blok");
	}
	
	static{
		System.out.println("bu ikinci statik blok");
	}
	
	static{
		System.out.println("bu üçüncü statik blok");
	}
	

}
