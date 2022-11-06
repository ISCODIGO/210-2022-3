package arreglos;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int[][] matriz = new int[3][2];
        int[][] irregular = new int[][]{
                {1, 2, 3},
                {4, 5},
                {6}
        };

        System.out.println(Arrays.deepToString(irregular));

        irregular[0][1] = 100;

        for(int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                System.out.printf("%-5d", irregular[i][j]);
            }
            System.out.println();
        }
    }
}
