public class Main {
    public static void main(String[] args) {
        cuentaBancaria count1 = new cuentaBancaria(11002251, 1122513880, 11000);
        System.out.println(count1.toString());
        System.out.println(count1.ingresarDinero(count1.getsaldoActual()));
    }
}