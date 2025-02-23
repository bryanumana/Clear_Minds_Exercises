package com.cmc.entidades;

import java.util.ArrayList;

public class Contacto {

	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private Telefono telefono;
	private Directorio directorio;
	private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
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

	public void imprimir() {
		System.out.println("*****" + this.nombre + " " + this.apellido + "*****" );

		if (this.getDireccion() != null) {
			System.out.println(
					"Direccion: " + this.direccion.getCallePrincipal() + " " + this.direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene direccion.");
		}
	}
	
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {

		for (int i = 0; i < telefonos.size(); i++) {
			
			Telefono t = telefonos.get(i);
			if(t.getEstado() == "C")
			System.out.println(t.getTipo() + " - " + t.getNumero() );
		}
	}
	
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> incorrectos = new ArrayList<Telefono>();
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono t = telefonos.get(i);
			if(t.getEstado() == "C"){
				incorrectos.add(t);
			}
		}
		
		return incorrectos; 
	}

}
