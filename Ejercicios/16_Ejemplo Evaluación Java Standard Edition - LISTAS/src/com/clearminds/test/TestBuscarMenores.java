package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {
	public static void main(String[] args) {
		
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		maquina.agregarCelda("F");
		maquina.agregarCelda("G");
		
		Producto producto1=new Producto("A1","Doritos",0.9);
		maquina.cargarProducto(producto1, "A", 5);
		
		Producto producto2=new Producto("B1","Gaseosa",2.0);
		maquina.cargarProducto(producto2, "B", 3);
		
		Producto producto3=new Producto("C1","Papas",1.9);
		maquina.cargarProducto(producto3, "C", 5);
		
		Producto producto4=new Producto("D1","7Up",2.5);
		maquina.cargarProducto(producto4, "D", 3);
		
		Producto producto5=new Producto("F1","Choclitos",4.9);
		maquina.cargarProducto(producto5, "F", 5);
		
		Producto producto6=new Producto("G1","Agua",1.0);
		maquina.cargarProducto(producto6, "G", 3);
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos.add(maquina.buscarMenores(3.0));
		
		for (Producto p: productos){
			System.out.println(p.getNombre());
		}
		
		
	}
	
}
