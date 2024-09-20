public class Main {
    public static void main(String[] args) {

        System.out.println("bienvenidos(a) a sreen match");
        System.out.println("pelicula: matrix");

        int fechaDeLanzamiento=1999;
        boolean incluidoEnElPlan=true;
        double notaDeLaPelicula= 8.2;

        double media=(8.2+6.0+9.0) /3;
        System.out.println(media);

        String sinopsis = """
                matrix es una paradoja 
                la mejor pelicula del fin del milenio
                fue lanzada en:
                """+ fechaDeLanzamiento ;
        System.out.println(sinopsis);

        int clasificaion = (int) (media/2);
        System.out.println(clasificaion);

    }
}