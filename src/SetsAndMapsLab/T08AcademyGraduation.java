package SetsAndMapsLab;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class T08AcademyGraduation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> gradesByStudents = new TreeMap<>();

        while (n-- > 0) {

            String name = scanner.nextLine();

            double grade = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .average()
                    .orElse(0);


            gradesByStudents.put(name, grade);


        }

            DecimalFormat format = new DecimalFormat(".###############");

        gradesByStudents.forEach((nameStudent, grade) -> System.out.printf("%s is graduated with %.15f%n", nameStudent, grade));


    }
}
