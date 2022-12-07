package MultidimensionalArraysEx;

import java.util.Scanner;

public class T04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] matrixSizes = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(matrixSizes[0]);
        int cols = Integer.parseInt(matrixSizes[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }

        }

        int maxSum = Integer.MIN_VALUE;
        int bestStartingRow = 0;
        int bestStartingCol = 0;

        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {

                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2] //1 ред
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]//2 ред
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2]; //3 ред


//                for (int currentRow = row; currentRow < row + 3; currentRow++) {
//                    for (int currentCol = col; currentCol < col + 3; currentCol++) {
//
//                        sum += matrix[currentRow][currentCol];


                if (sum > maxSum) {

                    maxSum = sum;

                    bestStartingRow = row;//запаметяваме старт индекса на реда на най-голямата матрица
                    bestStartingCol = col;//запаметяваме старт индекса на колоната на най-голямата матрица

                }
            }
        }

        System.out.printf("Sum = %d%n", maxSum);

        //принтираме най-голямата матрица

        for (int row = bestStartingRow; row < bestStartingRow + 3; row++) {
            for (int col = bestStartingCol; col < bestStartingCol + 3; col++) {

                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }


    }
}
