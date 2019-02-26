import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}};
        int[][] secondArray = {{2, 3}, {3, 4}, {5, 6}};
        int[][] result = multiply(firstArray, secondArray);

        System.out.println("El resultado de la multiplicación de los arrays es: " + Arrays.deepToString(result));
    }

    public static int[][] multiply(int[][] a, int[][] b) {

        int[][] c = new int[a.length][b[0].length];

        if (a[0].length == b.length) {

            for (int i = 0; i < a.length; i++) {

                for (int j = 0; j < b[0].length; j++) {

                    for (int k = 0; k < a[0].length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }
        return c;
    }

}
