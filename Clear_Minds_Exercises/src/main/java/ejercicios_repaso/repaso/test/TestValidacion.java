package ejercicios_repaso.repaso.test;

import ejercicios_repaso.repaso.entidades.Validaciones;

public class TestValidacion {

	public static void main(String[] args) {
		Validaciones val = new Validaciones();
		
		System.out.println(val.validarMonto(0));
		System.out.println(val.validarMonto(10));
		

	}

}
