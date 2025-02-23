package repaso.entidades;

public class Item {

	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public Item(String nombre, int productosActuales, int productosDevueltos, int productosVendidos) {
		this.nombre = nombre;
		this.productosActuales = productosActuales;
		this.productosDevueltos = productosDevueltos;
		this.productosVendidos = productosVendidos;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getProductosActuales() {
		return productosActuales;
	}



	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}



	public int getProductosDevueltos() {
		return productosDevueltos;
	}



	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}



	public int getProductosVendidos() {
		return productosVendidos;
	}



	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}



	public void imprimir(){
		System.out.println("*****************************" +"\n" +
						   "PRODUCTO" +"\n" +
						   "*****************************" +"\n" +
						   "Prodcuto: " + this.nombre + "\n" +
					 	   "Productos actuales: " + this.productosActuales + "\n" +
						   "Productos devueltos: " + this.productosDevueltos +"\n" +
					 	   "Productos vendidos: " + this.productosVendidos + "\n" +
					 	   "*****************************" +"\n" );
		
	}
	
	public void vender(int vendidos){
		if(this.productosActuales >= vendidos){
			this.productosActuales= this.productosActuales-vendidos;
			this.productosVendidos = vendidos + this.productosVendidos;
		}else{
			System.out.println("No es posible.");
		}
	}
	
	public void devolver (int devueltos){
		if(this.productosVendidos >= devueltos){
			this.productosActuales = this.productosActuales + devueltos;
			this.productosVendidos = this.productosVendidos - devueltos;
			this.productosDevueltos = devueltos;
		}else{
			System.out.println("No es posuble.");
		}
	}
	
	
}
