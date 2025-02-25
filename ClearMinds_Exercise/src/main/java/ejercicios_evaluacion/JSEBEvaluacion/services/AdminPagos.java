package ejercicios_evaluacion.JSEBEvaluacion.services;


//import com.clearminds.entidades.Prestamo;
import ejercicios_evaluacion.JSEBEvaluacion.entities.Cliente;
import ejercicios_evaluacion.JSEBEvaluacion.entities.Cuenta;
import ejercicios_evaluacion.JSEBEvaluacion.entities.TipoCuenta;

public class AdminPagos {
    private Cliente cliente;
    private Cuenta cuenta;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public AdminPagos() {
    }

    public void asignarCuenta(Cliente cliente, Cuenta cuenta) {
        cliente.setCuenta(cuenta);
    }

    public void depositar(double valor, Cliente cliente) {

        if (cliente == null || cliente.getCuenta() == null) {
            System.out.println("Cliente o cuenta no válidos.");
            return;
        }

        double recargo = cliente.getCuenta().getTipoCuenta().obtenerValorRecargo();

        if (cliente.getCuenta().validarSaldo(valor)) {
            double montoTotal = valor * recargo;

            double nuevoSaldo = cliente.getCuenta().getSaldo() + montoTotal;
            cliente.getCuenta().setSaldo(nuevoSaldo);
        } else {
            System.out.println("No se puede depositar");
        }
    }

    public void retirar(int retiro, Cliente cliente) {
        if (cliente == null || cliente.getCuenta() == null) {
            System.out.println("Cliente o cuenta no válidos.");
            return;
        }

        if (cliente.getCuenta().validarSaldo(retiro)) {
            double montoTotal = cliente.getCuenta().getSaldo() - retiro;
            cliente.getCuenta().setSaldo(montoTotal);
        } else {
            System.out.println("No se puede retirar");
        }
    }

    public TipoCuenta obtenerTipoCuenta(Cliente cliente) {
        return cliente.getCuenta().getTipoCuenta();
    }

 /*   public String mostrarPrestamo(Cliente cliente) {
        String mensaje = "";
        Prestamo prestamo = new Prestamo();
        double saldo = cliente.getCuenta().getSaldo();
        if (prestamo.obtenerPrestamo(saldo) < 500) {
            mensaje = "Préstamo A";
        } else if (prestamo.obtenerPrestamo(saldo) >= 500 || prestamo.obtenerPrestamo(saldo) <= 1000) {
            mensaje = "Prestamo B";
        } else if (prestamo.obtenerPrestamo(saldo) < 1000) {
            mensaje = "Prestamo C";
        } else {
            mensaje = "No puede obtener préstamo";
        }

        return mensaje;
    } */
}
