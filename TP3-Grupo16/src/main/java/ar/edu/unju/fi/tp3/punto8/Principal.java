package ar.edu.unju.fi.tp3.punto8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ar.edu.unju.fi.tp3.punto3.Alumno;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Alumno> lista = new ArrayList<Alumno>();
		
		boolean band;
		do {
			band = false;
			try {
				System.out.println("-------MENU-------");
				System.out.println("1- Nuevo alumno" );
				System.out.println("2- Eliminar alumno");
				System.out.println("3- Modificar notas alumno");
				System.out.println("4- Mostrar todos los alumno");
				System.out.println("5- Mostrar los que superan el promedio de 6");
				System.out.println("6- Salir");
				System.out.print("-> Elija opcion: ");
				
				int num = scan.nextInt();
				switch(num) {
				case 1:
					Alumno alumno = new Alumno();
					
					System.out.println("Ingrese datos del nuevo Alumno: ");					
					/*
					 * Ingreso nombre
					 */
					System.out.print("Nombre: ");
					String nom = scan.next();		
					alumno.setNombre(nom);
					
					/*
					 * Ingreso apellido
					 */
					System.out.print("Apellido: ");
					String ape = scan.next();
					alumno.setApellido(ape);
					
					/*
					 * Ingreso LU
					 */
					boolean correcto1;
					do {
						correcto1 = false;
						try {
							System.out.println("Libreta Universitaria: ");
							int lu = scan.nextInt();
							alumno.setLu(lu);
							correcto1 = true;
						}catch(InputMismatchException ie) {
							System.out.println("Ocurrio un error -> " + ie.getMessage());
							scan.nextLine();
						}
					}while(correcto1 == false);
					
					/*
					 * Ingreso notas
					 */
					double[] notas = new double[alumno.getNotas().length];
					System.out.println("Notas de materias: ");
					for(int i = 0;i < notas.length;i++) {
						do {
							correcto1 = false;
							try {
								System.out.print("Nota " + (i+1) + ": ");
								double not = scan.nextDouble();
								notas[i] = not;
								correcto1 = true;
							}catch(InputMismatchException ie) {
								System.out.println("Ocurrio un error -> " + ie.getMessage());
								scan.nextLine();
							}
						}while(correcto1 == false);						
					}
					alumno.setNotas(notas);
					/*
					 * Agrego el objeto de tipo Alumno al arraylist lista
					 */
					lista.add(alumno);
					System.out.println("Nuevo Alumno creado con exito");
					break;
				case 2:
					boolean correcto2;
					do {
						correcto2 = false;
						try {
							System.out.print("Ingrese LU para eliminar Alumno: ");
							
							int lu = scan.nextInt();
							/*
							 * Busco el Alumno por lista segun su LU
							 */
							for(Alumno al : lista) {
								if(al.getLu() == lu) {
									correcto2 = true;
									lista.remove(al);									
									break;
								}
							}
							
							if(correcto2 == true) {
								System.out.println("Alumno con el LU " + lu + " fue eliminado");
							}else {
								System.out.println("No se encontro al Alumno con LU " + lu);
								correcto2 = true;
							}							
						}catch(InputMismatchException ie) {
							System.out.println("Ocurrio un error -> " + ie.getMessage());
							scan.nextLine();
						}
					}while(correcto2 == false);
					break;
				case 3:
					boolean correcto3;
					do {
						correcto3 = false;
						try {
							System.out.println("Ingrese LU para cambiar notas del Alumno: ");
							
							int lu = scan.nextInt();
							/*
							 * Busco el Alumno por lista segun su LU
							 */
							for(Alumno al : lista) {
								if(al.getLu() == lu) {
									correcto3 = true;
									
									boolean change;
									double[] newNotas = new double[al.getNotas().length];
									for(int i = 0;i < newNotas.length;i++) {
										do {
											change = false;
											try {
												System.out.print("Nota " + (i+1) + ": ");
												double not = scan.nextDouble();
												newNotas[i] = not;
												change = true;												
											}catch(InputMismatchException ie) {
												System.out.println("Ocurrio un error -> " + ie.getMessage());
												scan.nextLine();
											}
										}while(change == false);
									}
									al.setNotas(newNotas);
									break;
								}
							}
							
							if(correcto3 == true) {
								System.out.println("Las notas del Alumno con el LU " + lu + " fueron cambiadas");								
							}else {
								System.out.println("No se encontro al Alumno con LU " + lu);
								correcto3 = true;
							}							
						}catch(InputMismatchException ie) {
							System.out.println("Ocurrio un error -> " + ie.getMessage());
							scan.nextLine();
						}
					}while(correcto3 == false);
					break;
				case 4:
					System.out.println("Listado de todos los Alumnos: ");
					for(Alumno vAl : lista) {
						System.out.println(vAl.toString());
					}
					break;
				case 5:
					System.out.println("Lista de todos los Alumnos que superan el promedio de 6: ");
					for(Alumno vAl : lista) {
						if(vAl.calcularPromedio() > 6){
							System.out.println(vAl.toString());
						}						
					}
					break;
				case 6:
					System.out.println("-------EXIT-------");
					band = true;
					break;
				default:
					System.out.println("Ingreso una opcion no valida");
					break;
				}
			}catch(InputMismatchException ie) {
				System.out.println("Ocurrio un error ->" + ie.getMessage());
				scan.nextLine();
			}			
			System.out.println("");
		}while(band == false);	
		scan.close();
	}
}