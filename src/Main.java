import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //clase escaner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido a la maquina expendedora de bebidad");
        System.out.println("Elige una de las opciones siguienres: ");
        System.out.println("1 Cafe");
        System.out.println("2 Mate");
        System.out.println("3 Gaseosa");
        System.out.println("4 Vino");

        int opcion = scanner.nextInt();


        //Cuando hay demasiados else if


        //¿Que tipo de bebida te gusta?

        switch (opcion){
            case 1:
                System.out.println("CAFE, Buena eleccion a mi tambien me gusta el cafe");
                break;
            case 2:
                System.out.println("MATE, Debes ser argentino o uruguayo");
                break;
            case 3:
                System.out.println("GASEOSA, Debes tener cuidado con el azucar");
                break;
            case 4:
                System.out.println("VINO, Tener cuidado si tomas no manejes");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        if (opcion<= 4){
            System.out.println("Disfrute de su bebida");
        }

        //El teclado ya no siga escuchando y cierre el programa
        //scanner.close();

    }
}