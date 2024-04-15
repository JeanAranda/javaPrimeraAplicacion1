import java.util.Scanner;

public class DesafioCuentas {
    public static void main(String[] args) {
        String nombre = "Jean Pierre Aranda";
        String tipoDeCuenta = "Cuenta corriente";
        double saldo = 1900.99;
        int opcion = 0;

        System.out.println("*****************************************");
        System.out.println("\nNombre del Cliente: "+nombre);
        System.out.println("Tipo de cuenta: "+tipoDeCuenta);
        System.out.println("Saldo actual: S/."+saldo);
        System.out.println("\n*****************************************");

        String menu = """
                ***Escribe el número de la opcion deseada***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: S/." + saldo);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorARetirar;
                        System.out.println("El saldo atual es: S/." + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el valor que desea despositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo = saldo + valorADepositar;
                    System.out.println("El saldo actualizado es: S/."+saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilzar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
