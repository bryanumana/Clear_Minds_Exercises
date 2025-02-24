package ejercicios_evaluacion.EvaluacionBUG.componentes;

public class Producto {

    private String nombre;
    private double precio;
    private String codigo;

    public Producto() {

    }

    public Producto(String codigo, String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void incrementarPrecio(int porcentaje) {
        if (porcentaje >= 0) {
            double incremento = this.precio * (porcentaje / 100.0);
            this.precio += incremento;
        } else {
            System.out.println("El porcentaje de incremento debe ser positivo.");
        }
    }

    public void disminuirPrecio(double descuento) {
        this.precio -= descuento;
    }
}

