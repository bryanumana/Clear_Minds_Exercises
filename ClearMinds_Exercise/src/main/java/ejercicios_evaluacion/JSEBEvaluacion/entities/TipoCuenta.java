package ejercicios_evaluacion.JSEBEvaluacion.entities;

public class TipoCuenta {

    private int codigo;
    private String nombre;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre; // O personalízalo según tus necesidades
    }

    public TipoCuenta(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int obtenerValorRecargo (){
        int recargo = 0;

        if(this.getCodigo()<=10){
            recargo = 20;
        } else if(this.getCodigo()<20 && this.getCodigo()>10){
            recargo = 30;
        } else if(this.getCodigo()>=20){
            return 40;
        } else{
            return 0;
        }
        return recargo;
    }
}
