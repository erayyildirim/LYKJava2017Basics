package tr.org.linux.kamp.staticex;


public class StaticExApplication {
	private static int x=5;
	public static void main(String[] args) {
		System.out.println(x);
		System.out.println(StaticEx.myStaticString);
		System.out.println(StaticEx.myStaticStringMEthod());
	}

}
