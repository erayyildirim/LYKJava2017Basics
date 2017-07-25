package tr.org.linux.kamp.array;

public class MultiplicationTable {
	
	public static int [][] initialize(int n){
		int [][] matrices = new int [n][n];
		
		
		for(int j = 0 ; j<matrices.length; j++){
			for(int k = 0; k<matrices[j].length; k++){
				matrices[j][k] =(j+1)*(k+1);
			}
		}
		return matrices;
	}
	
	public static void arrayToPrint(int [][] matrices){
		for (int j = 0; j < matrices.length; j++) {
			for (int k = 0; k < matrices[j].length; k++) {
				System.out.print(matrices[j][k] + "");
				
			}
			System.out.println("");
			
		}
	}
	public static void main(String[] args) {
		arrayToPrint(initialize(5));
	}
	
}

	

