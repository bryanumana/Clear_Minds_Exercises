package repaso_clases.entidades;

public class Account {
    private String id;
    private String tipoCuenta;
    private int saldo;

    public Account(String id) {
        this.id = id;
        this.tipoCuenta = "A";
    }

    public Account(String id, String tipoCuenta, int saldo) {
        this.id = id;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getId() {
        return this.id;
    }

    public void imprimir() {
        System.out.println("********************\nCUENTA\n********************\nNúmero de cuenta: " + this.id + "\n" + "Tipo: " + this.tipoCuenta + "\n" + "Saldo: USD " + this.saldo + "\n" + "**********************" + "\n");
    }

    public void imprimirConMiEstilo() {
        if (this.saldo >= 0) {
            System.out.println("_________________________________\n|             CUENTA            |\n|_______________________________|\n|El número de la cuenta es: " + this.id + "|" + "\n" + "|" + "El tipo de la cuenta es: " + this.tipoCuenta + "     |" + "\n" + "|" + "El saldo de la cuenta es: " + this.saldo + "   |" + "\n" + "|_______________________________|" + "\n");
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }

    }
}
