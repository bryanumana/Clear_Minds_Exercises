package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Direccion;

public class TestContacto {
	public static void main(String[] args) {
		Contacto ct=new Contacto("1714616123","Rosa","Chavez");
		ct.setDireccion(new Direccion("Av. Siempre Viva","Calle 4"));
		ct.imprimir();
		
	
	}
}
