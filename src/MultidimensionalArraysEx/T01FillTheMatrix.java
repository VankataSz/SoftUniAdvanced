package MultidimensionalArraysEx;

import java.util.Scanner;

public class T01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(", ");

        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];
        int counter = 1;

        if (pattern.equals("A")) {

            fillMatrixPatternA(n, counter, matrix);

        } else {

            fillMatrixPatternB(n, counter, matrix);
        }


        printMatrix(n, matrix);

    }

    //fill matrix zigzag - from top to bottom , from bottom to top
    private static void fillMatrixPatternB(int n, int counter, int[][] matrix) {

        for (int col = 0; col < n; col++) {

            if (col % 2 == 0) {//even column

                for (int row = 0; row < n; row++) {

                    matrix[row][col] = counter;
                    counter++;
                }

            } else { //odd column

                for (int row = n - 1; row >= 0; row--) {

                    matrix[row][col] = counter;
                    counter++;

                }
            }
        }
    }

    private static void printMatrix(int n, int[][] matrix) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {

                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }
    }

    //for every column, fill every row
    //fill matrix from top to bottom row
    private static void fillMatrixPatternA(int n, int counter, int[][] matrix) {


        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {

                matrix[row][col] = counter;

                counter++;

            }

        }
    }
}
