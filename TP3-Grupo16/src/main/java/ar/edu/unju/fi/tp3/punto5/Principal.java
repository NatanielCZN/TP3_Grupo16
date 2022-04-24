package ar.edu.unju.fi.tp3.punto5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Ingrese una cadena de texto: ");
		String cad = scan.next();
		
		char[] cadC = cad.toCharArray();
		
		System.out.print("Cadena invertida: ");
		for(int i = cadC.length-1;i >= 0;i--) {
			System.out.print(cadC[i]);
		}
		scan.close();
	}
}
