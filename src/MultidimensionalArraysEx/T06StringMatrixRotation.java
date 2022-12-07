package MultidimensionalArraysEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T06StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //From top to bottom -> row ++
        //From bottom to top -> row --
        //From left to right -> col++
        //From right to left -> col--


        String rotation = scanner.nextLine();
        String rotationString = rotation.split("[()]")[1];
        int rotationNumber = Integer.parseInt(rotationString);

        int angleOfRotation = rotationNumber % 360;


        String input = scanner.nextLine();


        //колкото думи имаме - толкова реда ще имаме в матрицата
        //колоните = размерът на най-дългата дума


        List<String> wordList = new ArrayList<>();

        int maxLength = Integer.MIN_VALUE;


        while (!input.equals("END")) {


            wordList.add(input);

            if (input.length() > maxLength) {

                maxLength = input.length();

            }


            input = scanner.nextLine();
        }


        int rows = wordList.size();//броя на редовете е големината на списъка
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];


        //пълнене на матрица с думи, с различна дължина
        for (int row = 0; row < rows; row++) {

            String currentWord = wordList.get(row);

            for (int col = 0; col < cols; col++) {
                //проверка на индекс - ако колоната на която се намираме е по-малка от дължината на нашата дума
                if (col < currentWord.length()) {

                    char currentChar = currentWord.charAt(col);

                    matrix[row][col] = currentChar;

                } else { //ако е свършила дължината на думата - добавяме спейс ' '

                    matrix[row][col] = ' ';

                }
            }
        }

        switch (angleOfRotation) {

            case 0:

                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < cols; col++) {

                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;

            case 90:

                for (int col = 0; col < cols; col++) {
                    for (int row = rows - 1; row >= 0; row--) {

                        System.out.print(matrix[row][col]);

                    }

                    System.out.println();
                }

                break;

            case 180:

                for (int row = rows - 1; row >= 0; row--) {
                    for (int col = cols - 1; col >= 0; col--) {

                        System.out.print(matrix[row][col]);
                    }
                    System.out.println();
                }
                break;

            case 270:

                for (int col = cols - 1; col >= 0; col--) {
                    for (int row = 0; row < rows; row++) {

                        System.out.print(matrix[row][col]);


                    }
                    System.out.println();
                }


                break;


        }


    }
}
