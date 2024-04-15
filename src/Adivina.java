import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
        int intentos = 0;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Intenta adivinar un número entre 0 y 100 en un máximo de 5 intentos.");

        while (intentos < 5) {
            System.out.print("Ingresa tu intento: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
                break;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor que el número generado.");
            } else {
                System.out.println("El número que ingresaste es mayor que el número generado.");
            }
        }

        if (intentos == 5) {
            System.out.println("Lo siento, has agotado tus 5 intentos. El número correcto era: " + numeroAleatorio);
        }

        scanner.close();
    }
}
