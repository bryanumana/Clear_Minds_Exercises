package ejercicios_repaso.repaso.entidades;

public class Estudiante {

	private String nombre;
	private double nota;
	private String resultado;
	
	public Estudiante(String nombre){
		this.nombre = nombre;
	}
	
	public void calificar(double nota){
		this.nota = nota;
		if(this.nota >= 0 && this.nota <= 10){
			if(this.nota < 8){
				resultado = "F";
				System.out.println("La nota del estudiante " +this.nombre+ " es: " + this.resultado );
			}
			else{
				resultado = "A";
				System.out.println("La nota del estudiante " +this.nombre+ " es: " + this.resultado);
			}
		}else{
			System.out.println("Nota incorrecta");
		}
	}
}
