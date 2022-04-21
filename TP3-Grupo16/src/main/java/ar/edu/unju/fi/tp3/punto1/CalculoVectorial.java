package ar.edu.unju.fi.tp3.punto1;

public class CalculoVectorial {
public CalculoVectorial() {
		
	}
	public int [][] Division(int [] a,int []b ) {
		int[][] matriz= new int[a.length][b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				int division= a[i]  / b[i];
				matriz[i][j]=division;							
			}
			
		}
		return matriz;
	}
	
}
