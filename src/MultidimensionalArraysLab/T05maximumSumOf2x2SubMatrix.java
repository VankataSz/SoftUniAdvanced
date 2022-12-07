package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class T05maximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        int[][] maxSumMatrix = new int[2][2];

        int maxSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {

                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];

                if (sum > maxSum) {

                    maxSum = sum;

                    maxSumMatrix[0][0] = matrix[row][col];
                    maxSumMatrix[0][1] = matrix[row][col + 1];
                    maxSumMatrix[1][0] = matrix[row + 1][col];
                    maxSumMatrix[1][1] = matrix[row + 1][col + 1];

                }

            }
        }

        for (int[] arr : maxSumMatrix) {
            for (int n : arr) {

                System.out.print(n + " ");
            }

            System.out.println();
        }

        System.out.println(maxSum);

    }

}
