import java.util.Scanner;
public class cuentaBancaria {
    //Atributos de la clase

    private int numeroDeCuenta;
    private double cedulaDeCliente;
    private double saldoActual;

    //Constructor vacio

    public cuentaBancaria() {
    }


    //  Constructor de todos los parametros

    public cuentaBancaria(int numeroDeCuenta, double cedulaDeCliente, double saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cedulaDeCliente = cedulaDeCliente;
        this.saldoActual = saldoActual;
    }

    public double getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getCedulaDeCliente() {
        return cedulaDeCliente;
    }

    public void setCedulaDeCliente(double cedulaDeCliente) {
        this.cedulaDeCliente = cedulaDeCliente;
    }

    public double getsaldoActual() {
        return saldoActual;
    }

    public void setsaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    //Metodo to String
    @Override
    public String toString() {
        return "cuentaBancaria{" +
                "numeroDeCuenta=" + numeroDeCuenta +
                ", cedulaDeCliente=" + cedulaDeCliente +
                ", saldoActual=" + saldoActual +
                '}';
    }

    //Metodos Propios
    public double ingresarDinero(double n1){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Su saldo actual es: "+saldoActual);
        System.out.println("Digite la cantidad de dinero que quiere ingresar: ");
        n1 = ingreso.nextDouble();
        saldoActual+=n1;
        System.out.println("Su nuevo saldo es: "+saldoActual);
        return 0;
    }


}
