import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);

        int intentos = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de adivinanzas!!!");
        System.out.println("Intenta adivinar un número entre 0 y 100");

        while (intentos < 5){
            System.out.println("Ingresa tu intento");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroAleatorio){
                System.out.println("!Felicidades! has adivinado el número en " + intentos + " inetntos!");
                break;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número ingresado es menor que el número generado");
            } else {
                System.out.println("El número ingressado es mayor que el número generado");
            }
        }

        if (intentos == 5){
            System.out.println("Lo siento, no adivinaste en los 5 intentos!!!");
        }
        scanner.close();
    }
}
