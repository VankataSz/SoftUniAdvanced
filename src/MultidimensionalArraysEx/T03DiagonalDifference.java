package MultidimensionalArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class T03DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];


        for (int row = 0; row < matrix.length; row++) {

            String[] rowInput = scanner.nextLine().split(" ");

            for (int col = 0; col < matrix[row].length; col++) {

                matrix[row][col] = Integer.parseInt(rowInput[col]);

            }
        }


        int mainDiagonal = 0;
        //намиране на диагонал чрез сравнение на индексите

//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//
//                if(row == col){
//
//                    mainDiagonal += matrix[row][col];
//                }
//            }
//        }

        //намира диагонала чрез стойността на индексите
        for (int index = 0; index < size; index++) {

            mainDiagonal += matrix[index][index];

        }

        int secondaryDiagonal = 0;

        //намиране на вторичен диагонал // rows -- cols ++

//        for (int row = size - 1, col = 0; col < size && row >= 0; row--, col++) {
//
//            secondaryDiagonal += matrix[row][col];
//
//        }


        for (int row = 0; row < matrix.length; row++) {

            secondaryDiagonal += matrix[row][size - row - 1];
        }


        System.out.println(Math.abs(mainDiagonal - secondaryDiagonal));


    }
}

//      print matrix with for loop
//        for (int row = 0; row < matrix.length; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//
//                System.out.print(matrix[row][col] + " ");
//
//            }
//            System.out.println();
//        }