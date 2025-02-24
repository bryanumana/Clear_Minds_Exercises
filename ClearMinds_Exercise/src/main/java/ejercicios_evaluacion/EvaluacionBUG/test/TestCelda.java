package ejercicios_evaluacion.EvaluacionBUG.test;

import ejercicios_evaluacion.EvaluacionBUG.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		/*La exception NullPointException se da en la línea 11,
		ya que no se ha creado un objeto de tipo Producto,
		es decir que todos los valores del producto son NULL*/
		Celda celda=new Celda();
		System.out.println(celda.getProducto().getNombre());
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}