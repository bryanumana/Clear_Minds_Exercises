package repaso.test;

import repaso.entidades.Item;

public class TestItem {
	public static void main(String[] args) {
		Item item = new Item ("Computador",20,0,0);
		
		item.imprimir();
		System.out.println("Primer Venta");
		item.vender(3);
		System.out.println("\tActuales: " + item.getProductosActuales());
	    System.out.println("\tVendidos: " +item.getProductosVendidos() + "\n");
	    
	    System.out.println("Segunda Venta");
	    item.vender(1);
	    System.out.println("\tActuales: " +item.getProductosActuales());
	    System.out.println("\tVendidos: " + item.getProductosVendidos() +"\n");
	    
	    item.vender(30);
	    System.out.println("\tActuales: " +item.getProductosActuales());
	    System.out.println("\tVendidos: " + item.getProductosVendidos()+"\n");
	    
	    item.devolver(4);
	    System.out.println("\tActuales: " +item.getProductosActuales());
	    System.out.println("\tVendidos: " + item.getProductosVendidos());
	    System.out.println("\tDevueltos: " + item.getProductosDevueltos());
	    
	}
	
	
}
