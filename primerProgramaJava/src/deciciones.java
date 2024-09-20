public class deciciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento=1999;
        boolean incluidoEnElPlan=false;
        double notaDeLaPelicula= 8.2;
        String plan="plus";

        if (fechaDeLanzamiento>=2022){
            System.out.println("peliculas mas populares");
        }else {
            System.out.println("peliculas reto que aun vale la pena ver");
        }

        if (incluidoEnElPlan && plan.equals("plus")){
            System.out.println("disfrute de la pelicula");
        }else{
            System.out.println("la pelicula no disponible para su plan actual");
        }
    }
}
