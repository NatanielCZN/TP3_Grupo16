package ar.edu.unju.fi.tp3.punto3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Alumno alumno = new Alumno();
		System.out.println("Ingrese datos de un alumno: ");
		
		System.out.print("Nombre: ");
		String nom = scan.next();		
		alumno.setNombre(nom);
		
		System.out.print("Apellido: ");
		String ape = scan.next();
		alumno.setApellido(ape);
		
		boolean band;
		do {
			band = false;
			try {
				System.out.println("Libreta Universitaria: ");
				int lu = scan.nextInt();
				alumno.setLu(lu);
				band = true;
			}catch(InputMismatchException ie) {
				System.out.println("Ocurrio un error -> " + ie.getMessage());
				scan.nextLine();
			}
		}while(band == false);
		
		double[] notas = new double[alumno.getNotas().length];
		System.out.println("Notas de materias: ");
		for(int i = 0;i < notas.length;i++) {
			do {
				band = false;
				try {
					System.out.print("Nota " + (i+1) + ": ");
					double not = scan.nextDouble();
					notas[i] = not;
					band = true;
				}catch(InputMismatchException ie) {
					System.out.println("Ocurrio un error -> " + ie.getMessage());
					scan.nextLine();
				}
			}while(band == false);						
		}
		alumno.setNotas(notas);
		
		System.out.println("Promedio de notas: " + alumno.calcularPromedio());
		System.out.println("Nota mas alta: " + alumno.obtenerNotaMaxima());
	}
}