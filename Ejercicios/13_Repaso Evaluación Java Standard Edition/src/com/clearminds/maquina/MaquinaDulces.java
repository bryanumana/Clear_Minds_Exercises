package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	private Producto producto;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void configurarMaquina(String celda1, String celda2, String celda3, String celda4) {
		this.celda1 = new Celda(celda1);
		this.celda2 = new Celda(celda2);
		this.celda3 = new Celda(celda3);
		this.celda4 = new Celda(celda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1:" + this.celda1.getCodigo());
		System.out.println("Celda 2:" + this.celda2.getCodigo());
		System.out.println("Celda 3:" + this.celda3.getCodigo());
		System.out.println("Celda 4:" + this.celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (codigo == this.celda1.getCodigo()) {
			return this.celda1;
		} else if (codigo == this.celda2.getCodigo()) {
			return this.celda2;
		} else if (codigo == this.celda3.getCodigo()) {
			return this.celda3;
		} else if (codigo == this.celda4.getCodigo()) {
			return this.celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = this.buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);

	}

	public void mostrarProducto() {
		System.out.println("***********" + this.celda1.getCodigo() + "\n" + "Stock: " + this.celda1.getStock());
		if (this.celda1.getProducto() == null) {
			System.out.println(this.saldo);
			System.out.println( this.celda1.getStock());
			System.out.println("La celda no tiene productos.");
		} else {
			System.out.println("Nombre producto: " + this.celda1.getProducto().getNombre());
			System.out.println("Precio producto: " + this.celda1.getProducto().getPrecio());
			System.out.println("Codigo producto: " + this.celda1.getProducto().getCodigo());
		}

		System.out.println("***********" + this.celda2.getCodigo() + "\n" + "Stock: " + this.celda2.getStock());
		if (this.celda2.getProducto() == null) {
			System.out.println(this.saldo);
			System.out.println( this.celda2.getStock());
			System.out.println("La celda no tiene productos.");
		} else {
			System.out.println("Nombre producto: " + this.celda2.getProducto().getNombre());
			System.out.println("Precio producto: " + this.celda2.getProducto().getPrecio());
			System.out.println("Codigo producto: " + this.celda2.getProducto().getCodigo());
		}

		System.out.println("***********" + this.celda3.getCodigo() + "\n" + "Stock: " + this.celda3.getStock());
		if (this.celda3.getProducto() == null) {
			System.out.println(this.saldo);
			System.out.println( this.celda3.getStock());
			System.out.println("La celda no tiene productos.");
		} else {
			System.out.println("Nombre producto: " + this.celda3.getProducto().getNombre());
			System.out.println("Precio producto: " + this.celda3.getProducto().getPrecio());
			System.out.println("Codigo producto: " + this.celda3.getProducto().getCodigo());
		}

		System.out.println("***********" + this.celda4.getCodigo() + "\n" + "Stock: " + this.celda4.getStock());
		if (this.celda4.getProducto() == null) {
			System.out.println(this.saldo);
			System.out.println( this.celda4.getStock());
			System.out.println("La celda no tiene productos.");
		} else {
			System.out.println("Nombre producto: " + this.celda4.getProducto().getNombre());
			System.out.println("Precio producto: " + this.celda4.getProducto().getPrecio());
			System.out.println("Codigo producto: " + this.celda4.getProducto().getCodigo());
		}
	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda buscar;
		buscar = this.buscarCelda(codigo);
		return buscar.getProducto();
	}

	public double consultarPrecio(String codigo) {
		Celda buscar;
		buscar = this.buscarCelda(codigo);
		return buscar.getProducto().getPrecio();
	}

	public Celda buscarCeldaProducto(String codigo) {
		
		if(this.celda1.getProducto()==null){
			if(this.celda2.getProducto()==null){
				if(this.celda3.getProducto()==null){
					if(this.celda4.getProducto()==null){
						System.out.println("El producto no existe");
						return null;
					}else{
						if(this.celda4.getProducto().getCodigo() == codigo)
						return celda4;
						else
							return null;
					}
				}else{
					if(this.celda3.getProducto().getCodigo() == codigo)
					return celda3;
					else
						return null;
				}
			}else{
				if(this.celda2.getProducto().getCodigo() == codigo)
				return celda2;
				else
					return null;
			}
		}else{
			if(this.celda1.getProducto().getCodigo() == codigo)
			return celda1;
			else
				return null;
		}
		
				
	
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
}