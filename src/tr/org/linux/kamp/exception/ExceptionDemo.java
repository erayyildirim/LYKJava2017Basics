package tr.org.linux.kamp.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		int z[]={1};
		Scanner sc = new Scanner(System.in);
		//System.out.println("Bir sayi giriniz");
		int yas = -10;
		
		
		try{
			if (yas < 0){
				throw new MyException();
			}
			int sayi = sc.nextInt();
		//	z[100]=5;
			int bolum = a/b;
		}catch(ArrayIndexOutOfBoundsException e){
			
			
			System.out.println("ArrayIndexOutOfBoundsException hatası yakalandı");
			
		}catch(ArithmeticException e){
			System.out.println("Sıfıra bolme hatası yakalandı");
			
		}catch(InputMismatchException e){
			System.out.println("girdi hatası");
		}catch(MyExcepton e){
			System.out.println("myexception");
		}
		
		System.out.println("try-catch bloğu bitti");
	}



}
