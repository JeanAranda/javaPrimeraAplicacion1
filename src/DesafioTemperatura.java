public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperatuEnCelsius = 30.5;
        double temperaturaEnfahrenheit = (temperatuEnCelsius *1.8) +32;

        String mensaje = String.format("La temperatura en grado Celsius es %.2fCº es equivalente a %.2fFº grados Fahrenheit", temperatuEnCelsius, temperaturaEnfahrenheit);
        System.out.println(mensaje);

        int temperaturaEnfahrenheitEntero = (int) temperaturaEnfahrenheit;
        System.out.println("La temperatura Fahrenheit en entero es: %dFº grados Fahrenheit".formatted(temperaturaEnfahrenheitEntero));
    }
}
