import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }
    public static void menuPrincipal(){
        Scanner leer = new Scanner(System.in);
        List<cuentas> lista = new ArrayList();
        do{
            System.out.println("-----------------------Bienvenido--------------------");
            System.out.println("¿Que tramite quiere hacer?");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Mostrar Cuentas");
            System.out.println("3. Eliminar Cuentas");
            System.out.println("4. Buscar Cuentas");
            System.out.println("5. Salir");
            System.out.println("Escriba la opcion que desee: ");


            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Digite su numero de cuenta: ");
                    double numeroCuenta = leer.nextDouble();
                    System.out.println("Digite su numero de cliente(cedula): ");
                    double numeroCedula=leer.nextDouble();
                    System.out.println("Ingrese su saldo inicial: ");
                    double saldo =leer.nextDouble();
                    if(saldo<10000){
                        System.out.println("El monto minimo inicial debe ser de 10000 ");
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(true);
    }

    //Cuentas
    public class cuentas {
        private String numeroCuenta;
        private String numeroCedula;
        private double saldo;
    }

}
