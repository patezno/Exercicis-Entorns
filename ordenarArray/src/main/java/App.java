import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        boolean intercambio = true;
        int[] array = {4, 7, 12, 65, 23, 767, 32, 1, 3};
        int pos = 0;
        int aux = 0;

        while (intercambio) {
            intercambio = false;
            pos = 0;
            while (pos < array.length -1) {
                if (array[pos] < array[pos + 1]) {
                    aux = array[pos];
                    array[pos] = array[pos + 1];
                    array[pos + 1] = aux;
                    intercambio = true;
                }
                pos += 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
