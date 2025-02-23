package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		/*La exception NullPointerException está en la linea 18
		y se da debido a que en la Celda A1 no se han agregado productos,
		es decir que todos los valores de productos para esta celda son Nulos.*/
		System.out.println("Producto encontrado:"+prod.getNombre());	
	}
}
