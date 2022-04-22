package ar.edu.unju.fi.tp3.punto2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un numero entre 1 y 9:");

		int[] v1 = new int[11];
		int cont = 1;
		for (int i = 0; i < v1.length; i++) {// cargamos el vector con valores del 0-10
			v1[i] = cont * i;
		}
		try {
			int num = entrada.nextInt();
			if (num <= 9 && num >= 1) {
				for (int i = 0; i < v1.length; i++) {// multiplicamos cada casillero del vector por el numero ingresado
					int producto = v1[i] * num;
					System.out.println(num + " X " + i + " = " + producto);
				}
			} else {
				System.out.println("No ingreso un numero valido");
			}
		} catch (InputMismatchException e) {
			System.out.println("Ocurrio un error del tipo " + e.getMessage() + ", ingreso un dato invalido.");
		}

	}

}
