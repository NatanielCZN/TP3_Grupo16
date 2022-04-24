package ar.edu.unju.fi.tp3.punto4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese 8 valores:");
		int[]numeros = new int[8];
		boolean band;
		for(int i=0;i<numeros.length;i++) {
			band = true;
			while(band==true){
				try {
					numeros[i] = input.nextInt();
					band = false;
				}catch (InputMismatchException ime){
					System.out.println("Error: "+ime.getMessage());
					input.nextLine();
				}
			}	
		}
		for(int j=0;j<numeros.length;j++) {
			int resto = numeros[j] % 2;
			if( resto == 0 ) {
				System.out.println(numeros[j] + " par");
				
			}else {
				System.out.println(numeros[j] + " impar");
			}
		}
		input.close();
	}

}
