package ejercicios_evaluacion.EvaluacionBUG.test;

import ejercicios_evaluacion.EvaluacionBUG.componentes.Producto;
import ejercicios_evaluacion.EvaluacionBUG.maquina.MaquinaDulces;

public class TestConsultarPrecio {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		System.out.println("Precio en B1:"+maquina.consultarPrecio("B1"));
		
		
		
		
	}
}
