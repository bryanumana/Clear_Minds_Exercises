package ejercicios_evaluacion.JSEBEvaluacion.entities;

public class Cuenta {
    private String codigo;
    private double saldo;
    private TipoCuenta tipoCuenta;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public Cuenta(String codigo, double saldo, TipoCuenta tipoCuenta) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public Cuenta() {
    }

    public boolean validarSaldo(double saldo) {
        boolean valido = false;
        if (saldo >= 0) {
            valido = true;
        }
        return valido;
    }
}
