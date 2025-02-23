package com.cmc.test;

import com.cmc.entidades.Telefono;

public class TestTelefono {
	public static void main(String[] args) {
		Telefono telefono1=new Telefono("0992920306", "convencional");
		System.out.println("telefono 1: "+telefono1.getEstado());
		
		Telefono telefono2=new Telefono("0992920306", "MOVIL");
		System.out.println("  telefono 2: "+telefono2.getEstado());
		
		Telefono telefono3=new Telefono("0999220306", "Movil");
		System.out.println("    telefono 3: "+telefono3.getEstado());

		Telefono telefono4=new Telefono("2375467", "CONVENCIONAL");
		System.out.println("     telefono 4: "+telefono4.getEstado());
		
		Telefono telefono5=new Telefono("0992920306",null);
		System.out.println("telefono 5: "+telefono5.getEstado());
		
		Telefono telefono6=new Telefono(null,"Convencional");
		System.out.println("  telefono 6: "+telefono6.getEstado());
		
		Telefono telefono7=new Telefono(null,"Convencional");
		System.out.println("    telefono7: "+telefono7.getEstado());
		
		Telefono telefono8=new Telefono("2387991","convencional");
		System.out.println("      telefono8: "+telefono8.getEstado());
	
		Telefono telefono9=new Telefono("2387991","Fijo");
		System.out.println("telefono9: "+telefono9.getEstado());
		
		Telefono telefono10=new Telefono("2222222","CoNvEnCiOnAL");
		System.out.println("   telefono10: "+telefono10.getEstado());
		
	}
}