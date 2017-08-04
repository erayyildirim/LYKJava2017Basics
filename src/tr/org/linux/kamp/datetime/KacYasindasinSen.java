package tr.org.linux.kamp.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class KacYasindasinSen {
	
	
	
	//dateobjesı olarak tut suankı zamanı al
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Gun giriniz");
		int day = sc.nextInt();
		System.out.println("Ay giriniz");
		int month = sc.nextInt();
		System.out.println("Yıl giriniz");
		int year = sc.nextInt();
		
		LocalDate currentDate = LocalDate.now();
		System.out.println("Şuanki tarih:" + currentDate);
		
		LocalDate birthDate = LocalDate.of(year, month, day);
		System.out.println("Doğum tarihiniz:" +birthDate);
		
		System.out.println(ChronoUnit.DAYS.between(birthDate, currentDate));
		System.out.println(ChronoUnit.YEARS.between(birthDate, currentDate));
		
		
		
		
	}

}
