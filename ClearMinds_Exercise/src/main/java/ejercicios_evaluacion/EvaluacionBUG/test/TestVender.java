package ejercicios_evaluacion.EvaluacionBUG.test;

import ejercicios_evaluacion.EvaluacionBUG.componentes.Producto;
import ejercicios_evaluacion.EvaluacionBUG.maquina.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		
		maquina.vender("A1");
		maquina.vender("B1");
		
		maquina.mostrarProducto();
		

	}

}