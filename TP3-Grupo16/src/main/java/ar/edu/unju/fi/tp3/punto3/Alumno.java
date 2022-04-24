package ar.edu.unju.fi.tp3.punto3;

public class Alumno {
	private String nombre;
	private String apellido;
	private int lu;
	private double[] notas = new double[5];
	
	/*
	 * Constructor no parametrizado
	 */
	public Alumno() {
		
	}

	/*
	 * Metodos accesores
	 */
	public String getNombre() {
		return nombre;
	}	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLu() {
		return lu;
	}
	public void setLu(int lu) {
		this.lu = lu;
	}

	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	/*
	 * Metodo que retorna el promedio de notas
	 */
	public double calcularPromedio() {
		double suma = 0;
		
		for(double n:notas) {
			suma = suma + n;
		}
		
		double promedio = suma / notas.length;
		
		return promedio;
	}
	
	/*
	 * Metodo que retorna la nota maxima
	 */
	public double obtenerNotaMaxima() {
		double notaM = 0;
		for(double n:notas) {
			if(n > notaM){
				notaM = n;
			}
		}
		return notaM;
	}

	@Override
	public String toString() {
		return "[Nombre= " + nombre + ", Apellido= " + apellido + ", LU= " + lu + ", Promedio= " + calcularPromedio() + "]";
	}	
}