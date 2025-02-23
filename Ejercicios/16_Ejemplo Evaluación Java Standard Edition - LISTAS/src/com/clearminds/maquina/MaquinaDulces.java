package com.clearminds.maquina;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private ArrayList<Celda> celdas = new ArrayList<Celda>();
	private double saldo;
	private Celda celda;
	private Celda c;
	private Producto producto;

	public void agregarCelda(String celda) {
		celdas.add(new Celda(celda));
	}

	public void mostrarConfiguracion() {

		for (int i = 0; i < celdas.size(); i++) {
			Celda c = celdas.get(i);
			System.out.println("Celda: " + c.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		for (Celda ce: celdas){
			if(ce.getCodigo() == codigo){
				return ce;
			}
		}
		return c;
	}
	
	public void mostarProductos(){
		for (Celda c: celdas){
			System.out.println("Celda: " +c.getCodigo() + " Stock: " + c.getStock() );
			if(c.getProducto() ==null){
				System.out.println("Sin producto asignado." + "\n");
			}else{
				System.out.println( "Producto: " + c.getProducto().getCodigo() + " Precio: " + c.getProducto().getPrecio() + "\n");
			}
		}
	}

	public void cargarProducto(Producto producto1, String string, int stock) {
		Celda celdaRecuperada = this.buscarCelda(string);
		celdaRecuperada.ingresarProducto(producto1, stock);
	}
	
	public Producto buscarProductoEnCelda(String codigo){
			Celda buscar;
			buscar = this.buscarCelda(codigo);
			return buscar.getProducto();
		}
	
	public double consultarPrecio(String codigo) {
		Celda buscar;
		buscar = this.buscarCelda(codigo);
		return buscar.getProducto().getPrecio();
	}
	
	public Celda buscarCeldaProducto(String codigo){
		for (Celda ce: celdas){
			if(ce.getProducto() != null){
				if(ce.getProducto().getCodigo() == codigo){
					return ce;
				}
			}
		}
		return c;
	}
	
	public void incrementarProductos(String codigo, int stock) {
		Celda celdaEncontrada;
		celdaEncontrada = this.buscarCeldaProducto(codigo);

		celdaEncontrada.setStock(stock + celdaEncontrada.getStock());
	}
	
	public void vender(String codigoCelda) {
		Celda encontrar;
		double saldo;
		encontrar = this.buscarCelda(codigoCelda);

		encontrar.setStock(encontrar.getStock() - 1);
		saldo = this.saldo + encontrar.getProducto().getPrecio();
		this.saldo = saldo;

	}
	
	public double venderConCambio(String codigoCelda, double dinero) {
		Celda encontrar;
		encontrar = this.buscarCelda(codigoCelda);
		if (dinero >= encontrar.getProducto().getPrecio()) {
			encontrar.setStock(encontrar.getStock() - 1);
			return dinero - encontrar.getProducto().getPrecio();
		} else {
			System.out.println("No alcanza.");
			return 0;
		}

	}
	
	public Producto buscarMenores (double limite){
		for (Celda ce: celdas){
			if(ce.getProducto().getPrecio() < limite){
				return ce.getProducto();
			}
		}
		return producto;
	}

	
}
