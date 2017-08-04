package tr.org.linux.kamp.exception;

import java.util.InputMismatchException;

public class Ogrenci {
	String adi;
	String tc;
	int not;
	
	
	
	
	
	
	
	public  void notKontrol (int not) throws NotException{
		
		if(not < 0 && not > 100){
			throw new NotException();
			
		}
		else this.not = not;
	}
	
	
	public  void tcKontrol (String tc) throws OgrenciException{
		if(tc.length() != 11)  throw new OgrenciException();
			
		else this.tc = tc;
		
	}

}
