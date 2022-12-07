package StacksandQueuesLab;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class T02SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] input = scanner.nextLine().split(" ");


        ArrayDeque<Integer> digits = new ArrayDeque<>();
        List<String> operators = new ArrayList<>();


        for (int i = 0; i < input.length; i++) {

            String currentSymbol = input[i];

            if (currentSymbol.equals("+")) {

                operators.add(currentSymbol);

            } else if (currentSymbol.equals("-")) {

                operators.add(currentSymbol);

            } else {

                digits.push(Integer.parseInt(currentSymbol));
            }

        }


        ArrayDeque<Integer> reversed = new ArrayDeque<>();

        //reverse stack with for cycle
        for (int i = digits.size() - 1; i >= 0; i--) {

            int currentNum = digits.pop();


            reversed.push(currentNum);

        }


        for (int i = 0; i < operators.size(); i++) {

            String currentOperator = operators.get(i);
            int result = 0;

            if (currentOperator.equals("+")) {

                int firstNum = (reversed.pop());
                int secondNum = (reversed.pop());

                result = firstNum + secondNum;

                reversed.push(result);


            } else if (currentOperator.equals("-")) {

                int firstNum = (reversed.pop());
                int secondNum = (reversed.pop());

                result = firstNum - secondNum;

                reversed.push(result);

            }

        }

        for (Integer integer : reversed) {
            System.out.println(integer);
        }
    }
}

