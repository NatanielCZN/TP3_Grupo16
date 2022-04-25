package ar.edu.unju.fi.tp3.punto7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		boolean right;
		String fruta;
		/*
		 * Ingreso frutas a la lista hasta que se indique lo contrario
		 */
		do {
			right = false;
			System.out.print("Ingrese nombre de una fruta: ");
			fruta = scan.next();
			lista.add(fruta);
			
			boolean entendido;
			do {
				entendido = false;
				System.out.println("¿Desea ingresar otra fruta? (y/n)");
				char st = scan.next().charAt(0);
				
				switch(st) {
				case 'y':case'Y':
					entendido = true;
					break;
				case 'n':case'N':
					entendido = true;
					right = true;
					break;
				default:
					System.out.println("El caracter ingresado no es valido");
					break;
				}
			}while(entendido == false);
		}while(right == false);
	
		for(int i = 0;i < lista.size();i++) {
			if(i % 2 != 0) {
				System.out.println("Fruta: " + lista.get(i));
			}
		}
		
		/*
		 * Solicito al usuario un numero para borrar un elemento de la lista de frutas
		 */
		do {
			right = false;
			try {
				System.out.print("Ingrese un numero entero para eliminar una fruta: ");
				int pos = scan.nextInt();
				if(pos >= 0 && pos <= lista.size()) {					
					System.out.println("-" + lista.get(pos) + " eliminada de la lista");
					lista.remove(pos);
				}
				else {
					System.out.println("El numero ingresado no pertenece al indicie de la lista de frutas (" + lista.size() + ")");
				}
				right = true;
			}catch(InputMismatchException ie) {
				System.out.println("Ocurrio un error -> " + ie.getMessage());
				scan.nextLine();
			}
		}while(right == false);
		
		/*
		 * Muestro la cantidad de elementos de la lista
		 */
		System.out.println("La lista de fruta contiene " + lista.size() + " elementos: ");
		
		/*
		 * Muestro el contenido de la lista
		 */
		for(String st : lista) {
			System.out.println("-" + st);
		}
		
		scan.close();
	}
}