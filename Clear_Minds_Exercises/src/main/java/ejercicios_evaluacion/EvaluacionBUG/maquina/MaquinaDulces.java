package ejercicios_evaluacion.EvaluacionBUG.maquina;

import ejercicios_evaluacion.EvaluacionBUG.componentes.Celda;
import ejercicios_evaluacion.EvaluacionBUG.componentes.Producto;

public class MaquinaDulces {

	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	private Producto producto;

	public MaquinaDulces() {
		this.celda1 = new Celda();
		this.celda2 = new Celda();
		this.celda3 = new Celda();
		this.celda4 = new Celda();
		this.saldo = 0.0;
	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		celda1.setCodigo(codigo1);
		celda2.setCodigo(codigo2);
		celda3.setCodigo(codigo3);
		celda4.setCodigo(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("CELDA 1: " + celda1.getCodigo());
		System.out.println("CELDA 2: " + celda2.getCodigo());
		System.out.println("CELDA 3: " + celda3.getCodigo());
		System.out.println("CELDA 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo().equals(codigo)) return celda1;
		if (celda2.getCodigo().equals(codigo)) return celda2;
		if (celda3.getCodigo().equals(codigo)) return celda3;
		if (celda4.getCodigo().equals(codigo)) return celda4;
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int stock) {
		Celda celdaRecuperada = this.buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, stock);
	}

	public void mostrarProducto() {
		Celda[] celdas = {celda1, celda2, celda3, celda4};

		for (Celda celda : celdas) {
			System.out.println("***********CELDA " + celda.getCodigo() + "\n" + " Stock: " + celda.getStock());
			if (celda.getProducto() == null) {
				System.out.println(" La celda no tiene producto!!!");
			} else {
				Producto producto = celda.getProducto();
				System.out.println(" Nombre producto: " + producto.getNombre());
				System.out.println(" Precio producto: " + producto.getPrecio());
				System.out.println(" Código producto: " + producto.getCodigo());
			}
		}
		System.out.println("Saldo: " + this.saldo);
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
		Celda[] celdas = {celda1, celda2, celda3, celda4};

		for (Celda celda : celdas) {
			if (celda.getProducto() != null && celda.getProducto().getCodigo().equals(codigo)) {
				return celda;
			}
		}

		System.out.println("El producto no existe");
		return null;
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

	public double venderConCambio(String codigoCelda, double dineroIngresado) {
		Celda celda = buscarCelda(codigoCelda);
		if (celda != null && celda.getStock() > 0) {
			double precio = celda.getProducto().getPrecio();
			if (dineroIngresado >= precio) {
				saldo += precio;
				return dineroIngresado - precio;
			} else {
				System.out.println("Dinero insuficiente");
			}
		} else {
			System.out.println("Producto no disponible");
		}
		return dineroIngresado;
	}

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

}