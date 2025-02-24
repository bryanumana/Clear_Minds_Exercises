package ejercicios_repaso.repaso.test;

import ejercicios_repaso.repaso.entidades.Estudiante;

public class TestEstudiante {
	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Bryan");
		estudiante.calificar(-2);
		estudiante.calificar(3);
		estudiante.calificar(9);
	}
}
