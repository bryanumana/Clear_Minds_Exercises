package com.cmc.test;

import com.cmc.entidades.Direccion;

public class TestDireccion {

	public static void main(String[] args) {
		Direccion direccion1=new Direccion();
		System.out.println(direccion1.getCallePrincipal());
		
		Direccion direccion2=new Direccion("Amazonas","Naciones Unidas");
		System.out.println(direccion2.getCallePrincipal());

	}

}
