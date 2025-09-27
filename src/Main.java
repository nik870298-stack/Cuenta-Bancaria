import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal(){
        Scanner leer = new Scanner(System.in);
        List<cuentas> listaCuentas = new ArrayList<>();
        do{
            System.out.println("-----------------------Bienvenido--------------------");
            System.out.println("¿Que tramite quiere hacer?");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Mostrar Cuentas");
            System.out.println("3. Eliminar Cuentas");
            System.out.println("4. Buscar Cuenta y tramitar con ella");
            System.out.println("5. Salir");
            System.out.println("Escriba la opcion que desee: ");


            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Digite su numero de cuenta: ");
                    String numeroCuenta = leer.next();
                    System.out.println("Digite su numero de cliente(cedula): ");
                    String numeroCedula=leer.next();
                    System.out.println("Ingrese su saldo inicial: ");
                    double saldo =leer.nextDouble();
                    while(saldo<10000){
                        System.out.println("El monto minimo inicial debe ser de 10000 ");
                        System.out.println("Ingrese su saldo inicial: ");
                        saldo = leer.nextDouble();
                    }
                    listaCuentas.add(new cuentas(numeroCuenta, numeroCedula, saldo));
                    break;
                case 2:
                    for(cuentas N: listaCuentas){
                        System.out.println(N);
                    }

                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta a eliminar: ");
                    String numCuentaEliminar = leer.next();

                    boolean eliminada = false;

                    for (int i = 0; i < listaCuentas.size(); i++) {
                        if (listaCuentas.get(i).getNumeroCuenta().equals(numCuentaEliminar)) {
                            listaCuentas.remove(i);
                            eliminada = true;
                            System.out.println("Cuenta eliminada");
                            break;
                        }
                    }

                    if (!eliminada)
                        System.out.println("La cuenta no existe.");
                    break;
                case 4:
                    System.out.println("Ingrese su numero de cuenta: ");
                    String numCuenta= leer.next();

                    boolean existen = false;

                    for(cuentas N: listaCuentas){
                        if (N.getNumeroCuenta().equals(numCuenta)){
                            cuentaBancaria cb = new cuentaBancaria(Double.parseDouble(N.getNumeroCuenta()),Double.parseDouble(N.getNumeroCedula()), N.getSaldo());
                            cb.menu();
                        }
                        existen = true;
                    }

                    if (!existen)
                        System.out.println("La cuenta no existe");
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(true);
    }

    //Cuentas
    public static class cuentas {
        private String numeroCuenta;
        private String numeroCedula;
        private double saldo;

        public cuentas() {
        }

        public cuentas(String numeroCuenta, String numeroCedula, double saldo) {
            this.numeroCuenta = numeroCuenta;
            this.numeroCedula = numeroCedula;
            this.saldo = saldo;
        }
        public String getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(String numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        public String getNumeroCedula() {
            return numeroCedula;
        }

        public void setNumeroCedula(String numeroCedula) {
            this.numeroCedula = numeroCedula;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        @Override
        public String toString() {
            return "cuentas{" +
                    "numeroCuenta='" + numeroCuenta + '\'' +
                    ", numeroCedula='" + numeroCedula + '\'' +
                    ", saldo=" + saldo +
                    '}';
        }


    }

}
