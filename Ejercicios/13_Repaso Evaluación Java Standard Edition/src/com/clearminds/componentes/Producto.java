package com.clearminds.componentes;

public class Producto {

	private String nombre;
	private double precio;
	private String codigo;

	public Producto (){
		
	}
	public Producto(String codigo, String nombre, double precio ) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void incrementarPrecio(int porcentaje) {
		if (porcentaje >= 0 && porcentaje <= 100) {
			double suma = (this.precio * porcentaje) / 100;
			this.precio += suma;
		} else {
			System.out.println("Porcentaje no valido");
		}

	}

	public void disminuirPrecio(double porcentaje) {
		if (porcentaje >= 0 && porcentaje <= 100) {
			double resta = (this.precio * porcentaje)/100;

			this.precio -= resta;
		} else {
			System.out.println("Porcentaje no valido");
		}
	}
}
