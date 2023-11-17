import java.util.Scanner;

public class Proceso {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar nombre del cliente:");
        String Cliente = sc.nextLine();
        System.out.println("Ingresar número de parte:");
        String Parte = sc.nextLine();
        System.out.println("Ingresar cantidad requerida:");
        int Cantidad = sc.nextInt();
        System.out.println("¿Qué tipo de pedido es? " );



        System.out.println("Cliente: " + Cliente);

    }
}
