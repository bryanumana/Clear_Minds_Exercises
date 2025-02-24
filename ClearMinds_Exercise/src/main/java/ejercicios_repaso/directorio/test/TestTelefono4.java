package ejercicios_repaso.directorio.test;

import ejercicios_repaso.directorio.entidades.AdminTelefono;
import ejercicios_repaso.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "311253", 10);
		Telefono telf2= new Telefono("movi", "322343", 10);
		Telefono telf3= new Telefono("claro",  "304502", 10);
		Telefono telf4 = new Telefono("movi", "312256", 10);
		
		AdminTelefono admin = new AdminTelefono();
		
		System.out.println("El numero de operadoras CLARO es: " + admin.contarClaro(telf1, telf2, telf3, telf4));
	}
}
