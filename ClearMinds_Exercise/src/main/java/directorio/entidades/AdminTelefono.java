package directorio.entidades;

public class AdminTelefono {

	private Telefono telefono;

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora() == "movi") {
			telefono.setTieneWhastsapp(true);
		}
	}
	
	public int contarMovi(Telefono tel1, Telefono tel2, Telefono tel3){
		int contador = 0;
		
		if(tel1.getOperadora() == "movi"){
			contador += 1;
		}
		if(tel2.getOperadora() == "movi"){
			contador += 1;
		}
		if(tel3.getOperadora() == "movi"){
			contador += 1;
		}
		return contador;
	}
	
	public int contarClaro(Telefono tel1, Telefono tel2, Telefono tel3, Telefono tel4){
		int contador = 0;
		
		if(tel1.getOperadora() == "claro"){
			contador += 1;
		}
		if(tel2.getOperadora() == "claro"){
			contador += 1;
		}
		if(tel3.getOperadora() == "claro"){
			contador += 1;
		}
		if(tel4.getOperadora() == "claro"){
			contador += 1;
		}
		return contador;
	}
}
