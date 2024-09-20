import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        String nombre="Tony Stark";
        String tipoDeCuenta="correinte";
        double saldo= 1599.99;
        int opcion = 0;

        System.out.println("---------------------");
        System.out.println("\nnombre del cliente: "+nombre);
        System.out.println("el tipo de cuenta es: "+tipoDeCuenta);
        System.out.println("su saldo disponible es: "+saldo);
        System.out.println("\n---------------------");

        String menu = """
                \n\n*** escriba el numero de la opcion***
                1 - consulta de saldo
                2 - retirar
                3 - depositar
                9 - salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion !=9){
            System.out.println(menu);
            opcion= teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("\nel saldo actua es: "+saldo);
                    break;
                case 2:
                    System.out.println("\ncuanto va a retirar: ");
                    int retiro = teclado.nextInt();

                    if (saldo<retiro) {
                        System.out.println("el saldo es insuficiente");
                    }else{
                        saldo -=retiro;
                        System.out.println("\ntu saldo actual es "+saldo);
                    }
                    break;
                case 3:
                    System.out.println("\ncuanto va a depositar: ");
                    int depositar = teclado.nextInt();
                    saldo += depositar;
                    System.out.println("\ntu saldo actual es "+saldo);
                    break;
                case 9:
                    System.out.println("progrma finalizando, gracia por usarlos");

                default:
                    System.out.println("opcion no valida");

            }

        }
    }
}
