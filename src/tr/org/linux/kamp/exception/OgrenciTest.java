package tr.org.linux.kamp.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OgrenciTest {
	
	public static void main(String[] args) throws OgrenciException {
		Scanner sc = new Scanner(System.in);
		Ogrenci ogr1 = new Ogrenci();
		
		
		
		

			
			try{
				System.out.println("Tc giriniz");
				ogr1.tc = sc.next();
				
				System.out.println("Not Giriniz:");
				ogr1.not = sc.nextInt();
				
				
				
				
				
			}catch(InputMismatchException e){
				
				System.out.println("Hatalı tip girişi");
				
 		}
			
		}
	}


