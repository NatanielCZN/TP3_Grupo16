package ar.edu.unju.fi.tp3.punto9;

public class Producto {
	private int codigo;
	private String descripcion;
	private double precio;
	private String marca;
	
	/*
	 * Constructor no parametrizado
	 */
	public Producto() {
		
	}

	/*
	 * Constructor parametrizado
	 */
	public Producto(int codigo, String descripcion, double precio, String marca) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.marca = marca;
	}

	/*
	 * Metodos accesores
	 */
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Producto [Codigo= " + codigo + ", Descripcion= " + descripcion + ", Precio= " + precio + ", Marca= " + marca
				+ "]";
	}
}
