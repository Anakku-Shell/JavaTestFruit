package model;

public class Fruta {
	
	private String nombre;
	private int cantidad;
	private double precio;
	private String lote;
	private String madurez;
	
	// CONSTRUCTOR
	public Fruta() {
		super();
	}

	// CONSTRUCTOR
	public Fruta(String nombre, int cantidad, double precio, String lote, String madurez) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.lote = lote;
		this.madurez = madurez;
	}

	//GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getMadurez() {
		return madurez;
	}

	public void setMadurez(String madurez) {
		this.madurez = madurez;
	}
	
	@Override
	public String toString() {
		return "Fruta [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + ", lote=" + lote
				+ ", madurez=" + madurez + "]";
	}

}
