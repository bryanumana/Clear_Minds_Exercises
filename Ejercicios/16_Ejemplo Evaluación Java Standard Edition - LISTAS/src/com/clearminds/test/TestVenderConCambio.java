package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVenderConCambio {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A1");
		maquina.agregarCelda("B1");
		maquina.agregarCelda("C1");
		maquina.agregarCelda("D1");
		
		Producto producto=new Producto("DP100","Doritos",0.9);
		maquina.cargarProducto(producto, "B1", 5);
		
		Producto producto2=new Producto("GB300","Gaseosa",2.0);
		maquina.cargarProducto(producto2, "D1", 3);
		
		double cambio = maquina.venderConCambio("D1", 2.1);
		double cambio2 = maquina.venderConCambio("B1", 3.0);
		System.out.println("El cambio de la primera venta es: " + cambio);
		System.out.println("El cambio de la segunda venta es: " + cambio2);
		System.out.println("");
		
		maquina.mostarProductos();
		
		
		
		
		
	}
}
