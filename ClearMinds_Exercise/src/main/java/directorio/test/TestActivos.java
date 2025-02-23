package directorio.test;

import directorio.entidades.AdminContactos;
import directorio.entidades.AdminTelefono;
import directorio.entidades.Contacto;
import directorio.entidades.Telefono;

public class TestActivos {
	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "322343", 10);
		Contacto c1 = new Contacto("Bryan", "Umana", telf1, 110.6);
		
		AdminTelefono admin = new AdminTelefono();
		admin.activarMensajeria(telf1);
		
		System.out.println(c1.imprimirConWhastapp());
		
		AdminContactos admC = new AdminContactos();
		admC.activarUsuario(c1);
	}
	
}
