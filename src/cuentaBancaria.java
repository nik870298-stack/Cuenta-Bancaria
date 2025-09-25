import java.util.Scanner;
public class cuentaBancaria {
    //Atributos de la clase

    private double numeroDeCuenta;
    private double cedulaDeCliente;
    private double saldoActual;

    //Constructor vacio

    public cuentaBancaria() {
    }


    //  Constructor de todos los parametros

    public cuentaBancaria(double numeroDeCuenta, double cedulaDeCliente, double saldoActual) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cedulaDeCliente = cedulaDeCliente;
        this.saldoActual = saldoActual;
    }

    public double getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(double numeroDeCuenta) {
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

    public double setsaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
        return saldoActual;
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

    //Metodo Ingresar Dinero
    public double ingresarDinero(double monto){
        if (monto<0){
            System.out.println("No es posible ingresar ese monto");
        }
        return this.saldoActual;
    }

    //Retirar dinero
    public double retirarDinero(double monto){
        if(monto>saldoActual){
            System.out.println("Fondos insuficientes de la cuenta");
        }
        return this.saldoActual;
    }

    //Extraccion rapida
    public double retiroRapido(double retiro){
        if(saldoActual<10000){
            System.out.println("La cuenta no tiene fondos");
        }
        return this.saldoActual;
    }

    //Consultar saldo
    public double consultarSaldo(){
        System.out.println("Tu saldo actual es de: ");
        return this.saldoActual;
    }

    //Menu
    public static void menu(){
        Scanner leer = new Scanner(System.in);
        double monto;
        cuentaBancaria count1 = new cuentaBancaria();
        System.out.println("Digite su numero de cuenta: ");
        count1.setNumeroDeCuenta(leer.nextDouble());
        System.out.println("Digite su numero de cliente(cedula): ");
        count1.setCedulaDeCliente(leer.nextDouble());
        count1.setsaldoActual(10000);
        do{
            System.out.println("-----------------------Cuenta Bancaria--------------------");
            System.out.println("Datos de su cuenta: "+count1.toString());
            System.out.println("¿Que tramite quiere hacer?");
            System.out.println("1. Ingresar Dinero");
            System.out.println("2. Retirar Dinero");
            System.out.println("3. Extraccion Rapida");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Salir");
            System.out.println("Escriba la opcion que desee: ");


            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Su saldo es: ");
                    System.out.println(count1.ingresarDinero(count1.getsaldoActual()));
                    System.out.println("Ingrese el monto que quiere ingresar: ");
                    monto = leer.nextDouble();
                    count1.ingresarDinero(count1.saldoActual+=monto);
                    System.out.println("Su saldo ahora es de:");
                    System.out.println(count1.ingresarDinero(count1.getsaldoActual()));
                    break;
                case 2:
                    System.out.println("Su saldo es: ");
                    System.out.println(count1.retirarDinero(count1.getsaldoActual()));
                    System.out.println("Ingrese el monto que quiere retirar: ");
                    monto = leer.nextDouble();
                    count1.retirarDinero(count1.saldoActual-=monto);
                    System.out.println("Su saldo ahora es de:");
                    System.out.println(count1.retirarDinero(count1.getsaldoActual()));
                    break;
                case 3:
                    System.out.println("Su saldo es: ");
                    System.out.println(count1.retiroRapido(count1.getsaldoActual()));
                    monto = 0.20;
                    double retiro = count1.retiroRapido(count1.saldoActual)*monto;
                    System.out.println("Usted retiro este monto: "+retiro);
                    count1.retiroRapido(count1.saldoActual-=retiro);
                    System.out.println(count1.retiroRapido(count1.getsaldoActual()));
                    break;
                case 4:
                    System.out.println(count1.consultarSaldo());
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(true);
    }



}

