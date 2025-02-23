package com.cmc.entidades;

public class Estudiante {
	private String nombre;
	private String apellido;
	private Direccion direccion;
	
	public Estudiante(String nombre,String apellido){
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public void imprimir(){
		System.out.println("Nombre:"+nombre+" Apellido:"+apellido+" Direccion:"+ direccion.getCallePrincipal()+" y "+ direccion.getCalleSecundaria());
	}
}
