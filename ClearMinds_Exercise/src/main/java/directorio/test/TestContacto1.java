package directorio.test;

import directorio.entidades.Contacto;
import directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "09941234123", 10);
		Contacto c = new Contacto("Bryan", "Umana", telf, 110.0);
		System.out.println(c.imprimir());
	
	}

}
