package tr.org.linux.kamp.array;

public class Hobbit {
	String name;

	public static void main(String[] args) {
		Hobbit[] hobbits = new Hobbit[3];
		int z = 0;
		while (z < 3) {
			hobbits[z] = new Hobbit();
			hobbits[z].name = "Frodo";

			if (z == 1) {
				hobbits[z].name = "Bilbo";
			}
			if (z == 1) {
				hobbits[z].name = "Sam";
			}

			System.out.println(hobbits[z].name + "Mordor'a ilerliyor");
			z++;

		}
	}

}
