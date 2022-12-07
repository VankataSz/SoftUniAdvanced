package MultidimensionalArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[2][3];
            //read with for loop
//        for (int row = 0; row < 2; row++) {
//            String[] rowFromConsole = scanner.next().split(" ");
//
//            for (int col = 0; col < 3; col++) {
//
//                matrix[row][col] = Integer.parseInt(rowFromConsole[col]);
//
//            }
//        }

        //read matrix with Stream API
        for (int row = 0; row < 2; row++) {
            int[] rowFromConsole = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

                matrix[row] = rowFromConsole;


            
        }
        

        //print matrix

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print(matrix[row][col] + " ");

            }
            System.out.println();
        }


        for (int[] ints : matrix) {
            for (int digit : ints) {

                System.out.print(digit + " ");
            }
            System.out.println();
        }

    }
}
