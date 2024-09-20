import java.util.Scanner;

public class evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota=0;
        double mediaEvaluacion=0;
        double totalEvalucion=0;

        while (nota !=-1){

                System.out.println("escribe la nota que le darias" +
                        "a la palicula matrix");
                nota=teclado.nextDouble();
            if (nota != -1) {
                mediaEvaluacion+=nota;
                totalEvalucion++;
            }


        }
        System.out.println("la media para matrix "+mediaEvaluacion/totalEvalucion);
    }
}
