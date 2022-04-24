package ar.edu.unju.fi.tp3.punto1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ctt = 5;
		
		int[] v1 = new int[ctt]; 
		int[] v2 = new int[ctt];
			
		int num = 0;
		boolean band;
		
		System.out.println("Ingrese 5 numeros enteros para el vector1: ");
		for(int i = 0;i < v1.length;i++) {
			band = true;
			do {
				try {						
					System.out.print("Numero " + (i+1) + ": ");
					num = scan.nextInt();
					v1[i] = num;
					band = false;
				}catch(InputMismatchException ex) {
					System.out.println("Ocurrio un error con el valor ingresado -> " + ex.getMessage());
					/*
					 * Para evitar un bucle infinito, agrego la sentencia "scan.nextLine()".
					 * Esto es para evitar el valor "basura" ingresado. 
					 * Ya que este valor se restablece al momento de ejecutar la estructura repetitiva.
					 */
					scan.nextLine();
				}	
			}while(band == true);							
		}	
		
		System.out.println("Ingrese 5 numeros enteros para el vector2: ");
		for(int i = 0;i < v2.length;i++) {
			band = true;
			do {
				try {
					System.out.print("Numero " + (i+1) + ": ");
					num = scan.nextInt();
					v2[i] = num;
					band = false;
				}catch(InputMismatchException ex) {
					System.out.println("Ocurrio un error con el valor ingresado -> " + ex.getMessage());
					scan.nextLine();
				}
			}while(band == true);
		}
		
		CalculoVectorial calculo = new CalculoVectorial();
		calculo.DivisionEntreVectoresIguales(v1, v2);
		
		scan.close();
	}
}