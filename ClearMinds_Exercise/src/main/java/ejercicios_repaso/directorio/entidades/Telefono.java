package ejercicios_repaso.directorio.entidades;

public class Telefono {

	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhastsapp;

	public Telefono(String operadora, String numero, int codigo) {
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
		this.tieneWhastsapp = false;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isTieneWhastsapp() {
		return tieneWhastsapp;
	}

	public void setTieneWhastsapp(boolean tieneWhastsapp) {
		this.tieneWhastsapp = tieneWhastsapp;
	}

	public void imprimir() {
		System.out.println("**********************************" + "\n" + "             TELEFONO           " + "\n"
				+ "**********************************" + "\n" + "La operadora del telefono es: " + this.operadora + "\n"
				+ "El numero del telefono es: " + this.numero + "\n" + "El codigo del telefono es: " + this.codigo
				+ "\n" + "Tiene whatsapp?: " + this.tieneWhastsapp + "\n" + "**********************************"
				+ "\n");
	}
}
