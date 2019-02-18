import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Introduce un número a encontrar:");
        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();

        int[] array = {32, 19, 17, 15, 10, 9, 8, 4, 1};
        int izq = 0;
        int der = array.length - 1;
        int cen = (izq + der) / 2;

        while (array[cen] != num && (izq <= der)){
            if (num < array[cen]) {
                izq = cen + 1;
            } else {
                der = cen - 1;
            }
            cen = (izq + der) / 2;
        }

        if (array[cen] == num) {
            System.out.println("El número " + num + " se encuentra en la posición " + cen);
        } else {
            System.out.println("El número " + num + " no se ha encontrado");
        }
    }

}
