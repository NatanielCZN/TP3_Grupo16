package ar.edu.unju.fi.tp3.punto6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("********Ingrese 10 numeros enteros********");
		int[] v1 = new int[10];
		try {
			for (int i = 0; i < v1.length; i++) {// cargamos el vector
				System.out.print("Ingrese un numero:");
				int num = entrada.nextInt();
				v1[i] = num;
			}
			System.out.println("********Orden Inverso********");
			for (int i = v1.length - 1; i >= 0; i--) {// le restamos 1 a la longitud del vector por que
														// no existe un indice v1[10].
				System.out.print(v1[i] + " ");

			}
		} catch (InputMismatchException e) {
			System.out.println("Ocurrio un error del tipo " + e.getMessage() + ", ingreso un dato invalido.");
		}
	}

}
