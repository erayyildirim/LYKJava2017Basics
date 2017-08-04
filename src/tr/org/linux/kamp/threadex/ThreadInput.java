package tr.org.linux.kamp.threadex;

import java.util.Scanner;

public class ThreadInput {
	
	static Scanner scan = new Scanner(System.in);
	static int i = 0;
	
	public static void main(String[] args) {
		
		new Thread ( new Runnable(){
			@Override
			public void run() {
				while(true){
					System.out.println("Sayi: " + i);
				try {
					Thread.sleep(500);
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}
				
				
			}
			}
			
		}).start();
		
		new Thread ( new Runnable(){
			@Override
			public void run() {
				while(true){
					//devam et
				try {
					Thread.sleep(500);
				}catch(InterruptedException e){
					e.printStackTrace();
					
				}
				
				
			}
			}
			
		}).start();
	}

}
