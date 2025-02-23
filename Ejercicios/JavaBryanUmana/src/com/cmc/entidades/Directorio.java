package com.cmc.entidades;

import java.util.ArrayList;
import java.util.Date;



public class Directorio {
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	private Contacto contacto;
	private Date fechaModificacion;
	
	
	public boolean agregarContacto(Contacto contacto) {
		Contacto contactoEncontrado;
		contactoEncontrado = this.buscarCedula(contacto.getCedula());
			contactos.add(contacto);
			return true;
				
	}

	public Contacto buscarCedula(String cedula) {
		for (Contacto co: contactos){
			if(co.getCedula() == cedula){
				return co;
			}
		}
		return contacto;
	}
	
}
