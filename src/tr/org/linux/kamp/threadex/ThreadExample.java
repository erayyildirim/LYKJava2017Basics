package tr.org.linux.kamp.threadex;

public class ThreadExample {
	public static void main(String[] args) {
		
		new Thread ( new Runnable(){
			@Override
			public void run() {
				
				System.out.println("0. çalıştı");
			}
			
		}).start();
		
		System.out.println("1. çalıştı");
		try {
			Thread.sleep(500); //yarım saniye thread bekletildi
		}catch(InterruptedException e){
			e.printStackTrace();
			
		}
		System.out.println("2. çalıştı");
		System.out.println("3. çalıştı");
		
		new Thread ( new Runnable(){
			@Override
			public void run() {
				
				System.out.println("4. çalıştı");
			}
			
		}).start();
		
		new Thread ( new Runnable(){
			@Override
			public void run() {
				
				System.out.println("5. çalıştı");
			}
			
		}).start();
	}

}
