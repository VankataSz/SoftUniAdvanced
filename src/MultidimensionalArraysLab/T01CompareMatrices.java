package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class T01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//
//        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();


        int arraysCount = scanner.nextInt();
        int sizeOfArray = scanner.nextInt();

        int[][] firstMatrix = new int[arraysCount][sizeOfArray];

        //поредния масив -> ред
        for (int rows = 0; rows < arraysCount; rows++) {
//
            // елемент в поредния масив -> колона
            for (int cols = 0; cols < sizeOfArray; cols++) {

                firstMatrix[rows][cols] = scanner.nextInt();

            }

        }



        arraysCount = scanner.nextInt();
        sizeOfArray = scanner.nextInt();

        int[][] secondMatrix = new int[arraysCount][sizeOfArray];

        for (int row = 0; row < secondMatrix.length; row++) {
            for (int cols = 0; cols < secondMatrix[row].length; cols++) {

                secondMatrix[row][cols] = scanner.nextInt();

            }

        }
        //проверено е до тук;

        boolean areEqual = areArraysEqual(firstMatrix, secondMatrix);


//        if (areEqual) {
//
//            areEqual = areArraysEqual(firstMatrix, secondMatrix);
//
//        }

        System.out.println(areEqual ? "equal" : "not equal");


    }

    private static boolean areArraysEqual(int[][] firstMatrix, int[][] secondMatrix) {

            //сравняваме броя на редовете
        if (firstMatrix.length != secondMatrix.length) {

            return false;
        }

        //сравняваме броя на колоните
        for (int row = 0; row < firstMatrix.length; row++) {

            int[] firstArray = firstMatrix[row];//брой на колоните в първия масив
            int[] secondArray = secondMatrix[row];//брой на колоните във втория масив

            //ако броя на колоните не е един и същ -> false
            if (firstArray.length != secondArray.length) {

                return false;

            }

            //сравняваме елементите
            for (int i = 0; i < firstArray.length; i++) {

                int firstNumber = firstArray[i];
                int secondNumber = secondArray[i];

                if (firstNumber != secondNumber) {

                    return false;

                }
            }
        }


        return true;

    }

}

//    public static void printMatrix(int[][] matrix) {
//
////            for (int rows = 0; rows < matrix.length; rows++) {
////                for (int cols = 0; cols < matrix[rows].length; cols++) {
////
////                    System.out.print(matrix[rows][cols] + " ");
////
////                }
////                System.out.println();
////
////            }
//
//        for (int[] arr : matrix) {
//            for (int num : arr) {
//                System.out.println(num + " ");
//            }
//            System.out.println();
//        }
//
//
//    }

