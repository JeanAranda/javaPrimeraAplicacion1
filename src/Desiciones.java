public class Desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 2021;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoDePlan = "Plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("La pelicula esta en estreno");
        }else {
            System.out.println("La pelicula es una recomendacion antgua");
        }

        if (incluidoEnElPlan && tipoDePlan.equals("Plus")){
            System.out.println("Disfrute de la pelicula");
        }else {
            System.out.println("Pelicula no incluida en su plan");
        }
    }
}
