package ejercicios_repaso.repaso.entidades;

public class Producto {

	private String nombre;
	private double precio;
	
	public Producto(){
		
	}
	public Producto (String noombre, double precio){
		this.nombre = noombre;
		if(precio < 0){
			this.precio = -1*precio;
		}else{
			this.precio = precio;
		}
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

	public void setPrecio(double precio) {
		if(precio < 0){
			this.precio = -1*precio;
		}else{
			this.precio = precio;
		}
		
	}
	
	public double calcularPrecioPromo(double porcentaje){
		if(porcentaje >= 0 && porcentaje <=100){
			double resta= (this.precio * porcentaje)/100;
			
			return this.precio -resta;
		}else{
			System.out.println("Porcentaje no valido");
			return 0;
		}
		
	}
	
	
}
