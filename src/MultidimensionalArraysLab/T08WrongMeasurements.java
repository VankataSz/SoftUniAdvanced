package MultidimensionalArraysLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T08WrongMeasurements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());


        int[][] matrix = new int[size][];


        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = readArray(scanner);
        }


        int[] indexes = readArray(scanner);

        int valueToReplace = matrix[indexes[0]][indexes[1]];

        List<int[]> correctValues = new ArrayList<>();


        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (matrix[row][col] == valueToReplace) {

                    int correctValue = getNearbySum(matrix, row, col, valueToReplace);

                    correctValues.add(new int[]{row, col, correctValue});
                }
            }
        }

        for (int[] correctValue : correctValues) {

            int row = correctValue[0];
            int col = correctValue[1];

            matrix[row][col] = correctValue[2];

        }

        for (int[] arr : matrix) {
            for (int num : arr) {

                System.out.print(num + " ");

            }
            System.out.println();
        }


    }

    private static int getNearbySum(int[][] matrix, int row, int col, int valueToReplace) {

        int sum = 0;

        if (isInBounds(matrix, row + 1, col) && matrix[row + 1][col] != valueToReplace) {

            sum += matrix[row + 1][col];//нагоре

        }

        if (isInBounds(matrix, row - 1, col) && matrix[row - 1][col] != valueToReplace) {

            sum += matrix[row - 1][col];//надолу
        }

        if (isInBounds(matrix, row, col - 1) && matrix[row][col - 1] != valueToReplace) {

            sum += matrix[row][col - 1];//наляво
        }


        if (isInBounds(matrix, row, col + 1) && matrix[row][col + 1] != valueToReplace) {

            sum += matrix[row][col + 1];//надясно
        }

        return sum;
    }

    //метод за проверка на валидността на даден индекс по ред и колона (дали е в матрицата)

    private static boolean isInBounds(int[][] matrix, int row, int col) {

        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;

    }


    //метод за проверка на елемент дали е извън границите на матрицата
    private static boolean isOutOfBounds(int[][] matrix, int row, int col) {

        return !isInBounds(matrix, row, col);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
