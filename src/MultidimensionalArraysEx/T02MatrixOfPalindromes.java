package MultidimensionalArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class T02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matrixSize = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = new String[rows][cols];


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                //enter the palindrome
                char outsideLetter = (char) ('a' + row);
                char middleLetter = (char) ('a' + row + col);

                matrix[row][col] = String.valueOf(outsideLetter) + middleLetter + outsideLetter;

            }
        }


        for (String[] strings : matrix) {
            for (String string : strings) {

                System.out.print(string + " ");

            }
            System.out.println();
        }


    }
}
