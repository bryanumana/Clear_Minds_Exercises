package ejercicios_evaluacion.JSEBEvaluacion.tests;


import ejercicios_evaluacion.JSEBEvaluacion.entities.Cliente;
import ejercicios_evaluacion.JSEBEvaluacion.entities.Cuenta;
import ejercicios_evaluacion.JSEBEvaluacion.entities.TipoCuenta;
import ejercicios_evaluacion.JSEBEvaluacion.services.AdminPagos;

public class TestCuentas {
	public static void main(String[] args) {
		//1. Creo una instancia de Cuenta
		Cuenta cuenta = new Cuenta("123ABC",1000.00 , new TipoCuenta(20, "Ahorros"));
		
		//2. Creo una instancia de cliente
		Cliente cliente = new Cliente("174265893", "Paul Jimenez", null);

		//3. Imprimo cliente
		cliente.imprimir();

		//4. Instancio otro cliente y otra cuenta y uso el AdminPagos
		AdminPagos adminPagos = new AdminPagos ();
		adminPagos.asignarCuenta(cliente, cuenta);
		cliente.imprimir();

		//5. Invoco el mtodo depositar
		adminPagos.depositar(200, cliente);
		cliente.imprimir();

		//6. Invoco el metodo retirar
		adminPagos.retirar(200, cliente);
		cliente.imprimir();

		//7. Invoco al metodo obtener tipo cuenta
		
		TipoCuenta tipoCuenta =adminPagos.obtenerTipoCuenta(cliente);
		System.out.println("-------------------------------------------");
		System.out.println("Tipo Cuenta: " + tipoCuenta.getNombre());


		//8. Invoco al metodo mostrarPrestamo
		String tipoPrestamo= adminPagos.mostrarPrestamo(cliente);
		System.out.println("-------------------------------------------");
		System.out.println("Tipo Prestamo: " + tipoPrestamo);

	}
}
