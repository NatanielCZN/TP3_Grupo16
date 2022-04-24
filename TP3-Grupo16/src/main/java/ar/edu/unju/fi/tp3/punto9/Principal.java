package ar.edu.unju.fi.tp3.punto9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Producto> lista = new ArrayList<Producto>();
		
		boolean band;
		do {
			band = false;
			try {
				System.out.println("-------MENU-------");
				System.out.println("1- Nuevo producto" );
				System.out.println("2- Mostrar todos los productos");
				System.out.println("3- Incrementar precio a todos los productos");
				System.out.println("4- Monto total de todos los productos");
				System.out.println("5- Fin");
				System.out.print("-> Elija opcion: ");
				
				int num = scan.nextInt();
				switch(num) {
				case 1:
					System.out.println("Ingrese datos de un nuevo Producto: ");
					
					/*
					 * Ingreso codigo
					 */
					boolean correcto1;
					int codigo = 0;
					do {
						correcto1 = false;
						try {
							System.out.print("Codigo: ");
							codigo = scan.nextInt();
							correcto1 = true;
						}catch(InputMismatchException ie) {
							System.out.println("Ocurrio un error -> " + ie.getMessage());
							scan.nextLine();
						}						
					}while(correcto1 == false);
					
					/*
					 * Ingreso descripcion
					 */
					System.out.print("Descripcion: ");
					String descripcion = scan.next();
					
					/*
					 * Ingreso precio
					 */
					double precio = 0;
					do {
						correcto1 = false;
						try {
							System.out.print("Precio: ");
							precio = scan.nextDouble();
							correcto1 = true;
						}catch(InputMismatchException ie) {
							System.out.println("Ocurrio un error -> " + ie.getMessage());
							scan.nextLine();
						}						
					}while(correcto1 == false);
					
					/*
					 * Ingreso marca
					 */
					System.out.print("Marca: ");
					String marca = scan.next();
					
					/*
					 * Agrego el nuevo Producto a la lista
					 */
					Producto producto = new Producto(codigo,descripcion,precio,marca);
					lista.add(producto);
					System.out.println("Nuevo Producto creado con exito");
					break;
				case 2:
					for(Producto prod : lista) {
						System.out.println(prod.toString());
					}
					break;
				case 3:
					boolean correcto2;
					double newPrecio = 0;
					do {
						correcto2 = false;
						try {
							System.out.print("Precio a aumentar: ");
							newPrecio = scan.nextDouble();
							correcto2 = true;
						}catch(InputMismatchException ie) {
							System.out.println("Ocurrio un error -> " + ie.getMessage());
							scan.nextLine();
						}	
					}while(correcto2 == false);
					
					for(Producto prod : lista) {
						prod.setPrecio(prod.getPrecio() + newPrecio);
					}
					System.out.println("Se subio el precio de todos los Productos");
					break;
				case 4:
					double suma = 0;
					
					for(Producto prod : lista) {
						suma = suma + prod.getPrecio();
					}
					System.out.println("La suma de todos los Productos es: " + suma);
					break;
				case 5:
					System.out.println("-------EXIT-------");
					band = true;
					break;
				default:
					System.out.println("Ingreso una opcion no valida");
					break;
				}
				
			}catch(InputMismatchException ie) {
				System.out.println("Ocurrio un error -> " + ie.getMessage());
				scan.nextLine();
			}
			System.out.println("");
		}while(band == false);
		scan.close();
	}
}
