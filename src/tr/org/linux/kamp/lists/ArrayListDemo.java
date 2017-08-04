package tr.org.linux.kamp.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayListDemoObject aListDemo = new ArrayListDemoObject();
		// aListDemo.addElement("LKD");
		// aListDemo.addElement("2017");
		// aListDemo.addElement("Java");
		//
		//
		ArrayList<String> list = new ArrayList<String>();
		// list.addAll(aListDemo.getListDemo());
		//
		// for (String element : list) {
		// System.out.println(element);
		//
		// }
		//
		// boolean removeResult = aListDemo.removeElement("Java");
		// if(removeResult){
		// System.out.println("Silme başarılı");
		// }
		// else{
		// System.out.println("Silme başarısız");
		// }

		int input = 0;
		Scanner scan = new Scanner(System.in);

		while (input != -1) {
			System.out.println("-----------------");
			System.out.println("1 - Add element: ");
			System.out.println("2 - Remove element: ");
			System.out.println("3 - Check element exists: ");
			System.out.println("4 - Show size: ");
			System.out.println("Enter -1 to exit");
			input = scan.nextInt();
			System.out.println("-----------------");

			switch (input) {
			case 1:
				System.out.println("Enter a String to add to the list");
				boolean result = list.add(scan.next());
				if (result) {
					System.out.println("Adding is succesful: "
							+ list.get(list.size() - 1));
				} else {
					System.out.println("Adding failed");
				}

				break;

			case 2:
				System.out.println("Enter a String to add to the list");
				String elementToRemove = scan.next();
				result = list.remove(elementToRemove);
				if (result) {
					System.out.println("Removing is succesful: "
							+ elementToRemove);
				} else {
					System.out.println("Removing failed" + elementToRemove);
				}

				break;

			case 3:
				System.out
						.println("Enter a String to check if it exists in the list");
				String elementToCheck = scan.next();
				result = list.contains(elementToCheck);
				if (result) {
					System.out.println("Element exists: " + elementToCheck);
				} else {
					System.out.println("Element is not found" + elementToCheck);
				}

				break;

			case 4:
				System.out.println("Size of the list is " + list.size());

				break;

			case -1:
				System.exit(0);
				break;

			default:
				System.out.println("Enter a valid value");
				break;
			}

		}

	}

}
