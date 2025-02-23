package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TestMostrarTelefonos {

	public static void main(String[] args) {
		Contacto contacto=new Contacto("1714616123","Carmen","Estrada");
		contacto.agregarTelefono(new Telefono("0992920306", "Convencional"));
		contacto.agregarTelefono(new Telefono("0992920306", null));
		contacto.agregarTelefono(new Telefono("0992920306", "Movil"));
		contacto.agregarTelefono(new Telefono("2375467", "convencional"));
		
		contacto.mostrarTelefonos();
		

	}

}
