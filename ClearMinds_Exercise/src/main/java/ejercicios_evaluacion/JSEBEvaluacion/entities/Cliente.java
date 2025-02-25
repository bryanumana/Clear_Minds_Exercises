package ejercicios_evaluacion.JSEBEvaluacion.entities;

public class Cliente {

    private String cedula;
    private String nombre;
    private Cuenta cuenta;

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

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Cliente(String cedula, String nombre, Cuenta cuenta) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public void imprimir() {
        String mensaje = String.format(
                "**************CLIENTE ************************%n" +
                        "Nombre: %s%n" +
                        "Cedula: %s%n" +
                        "---------------CUENTA ------------------------%n" +
                        (this.cuenta != null ?
                                        "Codigo: " + this.cuenta.getCodigo() + "\n" +
                                        "Tipo: " + this.cuenta.getTipoCuenta().getNombre() + "\n" +
                                        "Saldo actual: " + this.cuenta.getSaldo() + "\n"
                                : "Cuenta no asignada" + "\n") +
                        "**********************************************",
                this.nombre, this.cedula,
                (this.cuenta != null ? this.cuenta.getCodigo() : ""),
                (this.cuenta != null ? this.cuenta.getTipoCuenta().getNombre() : ""),
                (this.cuenta != null ? this.cuenta.getSaldo() : 0.0)
        );
        System.out.println(mensaje);
    }
}

