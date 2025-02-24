package ejercicios_repaso.repaso.test;

import ejercicios_repaso.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto1 = new Producto("Papas", -122);
		
		System.out.println("El nombre del primer producto es: "+producto1.getNombre());
		System.out.println("El precio del primer producto es: "+producto1.getPrecio());
		System.out.println("El descuento del primer producto es: " + producto1.calcularPrecioPromo(10));
		
		Producto producto2 = new Producto();
		producto2.setNombre("Zanahoria");
		producto2.setPrecio(-10);
		
		System.out.println("\nEl nombre del segundo producto es: " +producto2.getNombre());
		System.out.println("El preico del segundo producto es: " + producto2.getPrecio());
		System.out.println("El descuento del segundo prodcuto es: " + producto2.calcularPrecioPromo(5));
	}
	
}
