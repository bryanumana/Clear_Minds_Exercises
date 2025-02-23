package com.cmc.test;

import com.cmc.entidades.Direccion;
import com.cmc.entidades.Estudiante;

public class TestEstudiante {
	public static void main(String[] args) {
		Estudiante est1=new Estudiante("Marco","Rosales");
		Estudiante est2=new Estudiante("Erika","Rivera");
		
		Direccion d1=new Direccion("Amazonas","Naciones Unidas");
		est1.setDireccion(d1);
		est2.imprimir();
		est1.imprimir();
		
		/*
		 * Clase donde se produce el NullPointerException: El error se produce en la clase Estudiante.
		 * L�nea exacta del NullPointerException: En la linea 45
		 * Variable que ocasiona el NullPointerException: las variable de tipo Direccion
		 * Porque esa variable est� null en ese punto?:  Falta la asignaci�n this en el m�todo y no se ha a�adido al contructor el atributo Direccion
		 * 
		 * */
	}
}
