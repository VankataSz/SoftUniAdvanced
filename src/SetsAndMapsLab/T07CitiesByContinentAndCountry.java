package SetsAndMapsLab;

import java.util.*;

public class T07CitiesByContinentAndCountry {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        Map<String, LinkedHashMap<String, List<String>>> continents = new LinkedHashMap<>();


        while (n-- > 0) {

            String[] input = scanner.nextLine().split(" ");


            String continent = input[0];
            String country = input[1];
            String city = input[2];


            continents.putIfAbsent(continent, new LinkedHashMap<>());

            Map<String, List<String>> countries = continents.get(continent);

            countries.putIfAbsent(country, new ArrayList<>());

            List<String> cities = countries.get(country);

            cities.add(city);


        }

        continents.forEach((key, value) -> {
            System.out.println(key + ":");
            value.forEach((key1, value1) -> {

                String cities = String.join(", ", value1);
                System.out.println(" " + key1 + " -> " + cities);

            });
        });


//        continents.entrySet().stream()
//                .forEach(entry -> {
//                    System.out.println(entry.getKey() + ":");
//                    entry.getValue().entrySet().stream()
//                            .forEach(innerEntry -> {
//
//                                String cities = String.join(", ", innerEntry.getValue());
//                                System.out.println(" " + innerEntry.getKey() + " -> " + cities);
//
//                            });
//                });


    }
}
