package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Directorio;


public class TestAgregarContacto {
	public static void main(String[] args) {
		Directorio directorio = new Directorio();
		System.out.println(directorio.agregarContacto(new Contacto("1234","Armando","Broncas")));
		
		System.out.println(directorio.agregarContacto(new Contacto("3489","Patricia","Fernandez")));
		System.out.println(directorio.agregarContacto(new Contacto("1234","Beatriz","Pinzon")));
		System.out.println(directorio.agregarContacto(new Contacto("3314","Pablo","Montenegro")));
		
	}
}
