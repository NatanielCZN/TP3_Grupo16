package ar.edu.unju.fi.tp3.punto1;

public class CalculoVectorial {

	/*
	 * Constructor no parametrizado
	 */
	public CalculoVectorial() {
		
	}
	
	/*
	 * Metodo que calcula la division entre vectores
	 */
	public void DivisionEntreVectoresIguales(int[] v1, int[] v2) {
		int div;
		System.out.println("Resultado de la division entre v1 y v2: ");
		for(int i = 0;i < v1.length;i++) {
			try {
				div = v1[i] / v2[i];
				System.out.println("Division entre " + v1[i] + " y " + v2[i] + ": " + div);
			}catch(ArithmeticException ae) {
				System.out.println("Ocurrio un error -> " + ae.getMessage());
			}
		}
	}
}