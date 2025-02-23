package com.cmc.entidades;

public class Telefono {

	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}
	
	public Telefono(String numero) {
		this.numero = numero;
		
	}
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstado() {
		String tipo = this.getTipo();
		String numero = this.getNumero();

		if (this.getNumero() != null && this.getTipo() != null) {
			this.estado = "C";

			if (tipo.equalsIgnoreCase("movil")) {
				this.estado = "C";
				if (numero.length() == 10) {
					this.estado = "C";
				} else {
					this.estado = "E";
				}
			} else if (tipo.equalsIgnoreCase("convencional")) {
				this.estado = "C";
				if (numero.length() == 7) {
					this.estado = "C";
				} else {
					this.estado = "E";
				}
			} else {
				this.estado = "E";
			}

		} else {
			this.estado = "E";
		}

		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
