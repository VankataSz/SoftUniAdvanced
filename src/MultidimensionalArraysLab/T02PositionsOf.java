package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class T02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int arrayCount = scanner.nextInt();
//        int arraySize = scanner.nextInt();
//
//        int[][] array = new int[arrayCount][arraySize];
//
//        for (int row = 0; row < arrayCount; row++) {
//            for (int col = 0; col < arraySize; col++) {
//
//               array[row][col] = scanner.nextInt();
//
//            }
//
//        }


        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {

            matrix[row] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        int searchNumber = Integer.parseInt(scanner.nextLine());
     //   boolean isFoundAtLeastOnce = false;

        StringBuilder output = new StringBuilder();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                int currentNumber = matrix[row][col];

                if (currentNumber == searchNumber) {

                    output.append(row)
                            .append(" ")
                            .append(col)
                            .append(System.lineSeparator());


                  //  System.out.println(row + " " + col);
                //    isFoundAtLeastOnce = true;

                }
            }

        }


        System.out.println(output.isEmpty() ? "not found" : output);


//            if(output.isEmpty()){
//                System.out.println("not found");
//
//            } else {
//
//                System.out.println(output);
//
//            }




//        if (!isFoundAtLeastOnce) {
//
//            System.out.println("not found");
//        }


    }
}
