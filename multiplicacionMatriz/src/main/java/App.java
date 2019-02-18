import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        int[][] firstArray = {{1, 2, 3}, {4, 5, 6}};
        int[][] secondArray = {{2, 3}, {3, 4}, {5, 6}};
        int ff = 0;
        int fa = firstArray.length;
        int cc;
        int cB;
        int cActual;
        int r;
        int cA;
        int[][] thirdArray = {{}};

        while (ff < fa) {
            cc = 0;
            cB = secondArray[0].length;
            while (cc < cB) {
                r = 0;
                cActual = 0;
                cA = firstArray[0].length;
                while (cActual < cA) {
                    r += firstArray[cc][cActual] * secondArray[cActual][cc];
                    cActual += 1;
                }
                thirdArray[ff][cc] = r;
            }
            ff += 1;
        }
        System.out.println(Arrays.deepToString(thirdArray));
    }

}
