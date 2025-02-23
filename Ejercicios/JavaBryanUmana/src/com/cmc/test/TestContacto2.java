package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Direccion;

public class TestContacto2 {
	public static void main(String[] args) {
		Contacto ct=new Contacto("1714616123","Rosa","Chavez");
		ct.setDireccion(new Direccion("Av. Siempre Viva","Calle 4"));
		ct.imprimir();
		
		Contacto ct1=new Contacto("1721346554","Ernesto","Montoya");
		ct1.imprimir();
	}
}
