package directorio.test;

import directorio.entidades.AdminTelefono;
import directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi", "098234234", 20);
		telef.imprimir();

		AdminTelefono admin = new AdminTelefono();

		admin.activarMensajeria(telef);
		telef.imprimir();
	}

}
