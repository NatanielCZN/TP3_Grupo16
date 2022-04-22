package ar.edu.unju.fi.tp3.punto1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese 5 numeros");
		int[] v1 = new int[5];
		int[] v2 = new int[5];
		try {
		for (int i = 0; i < v1.length; i++) {
			System.out.print("Ingrese un numero:");
			int num1 = entrada.nextInt();
			v1[i] = num1;
		}
		System.out.println("Ingrese Otros 5 numeros");
		for (int i = 0; i < v2.length; i++) {
			System.out.print("Ingrese un numero:");
			int num1 = entrada.nextInt();
			v2[i] = num1;
		}
		
		CalculoVectorial vector= new CalculoVectorial();
		int [][] matrizz= vector.Division(v1, v2);
		for (int i = 0; i < v1.length; i++) {
			for (int j = 0; j < v2.length; j++) {
				
				System.out.print(matrizz[i][j]+" ");
				
			}
			System.out.println("");
		}
		}catch (InputMismatchException e) {
			System.out.println("Ocurrio un error del tipo " + e.getMessage() + ", ingreso un dato invalido.");
		}
		
	}

}
	