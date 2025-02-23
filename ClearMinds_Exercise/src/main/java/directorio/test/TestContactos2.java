package directorio.test;

import directorio.entidades.AdminContactos;
import directorio.entidades.AdminTelefono;
import directorio.entidades.Contacto;
import directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "09941234123", 10);
		Telefono telf2 = new Telefono("claro", "322343", 10);
		
		Contacto c1 = new Contacto("Bryan", "Umana", telf1, 1.6);
		Contacto c2 = new Contacto("Maria", "Gomez", telf2, 23.0);
		
		AdminContactos admC = new AdminContactos();
		
		AdminTelefono admin = new AdminTelefono();
		
		admin.activarMensajeria(telf1);
		admin.activarMensajeria(telf2);
		
		System.out.println(admC.buscarMasPesado(c1, c2).imprimir());
		System.out.println("Comparar operadoras: " + admC.compararOperadoras(c1, c2));
		admC.activarUsuario(c2);
	}

}
