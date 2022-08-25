package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindingMatching {
    public static void main(String[] args) {


        //ALL MATCH
        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories() < 1000); //return boolean //returns true because all the dish is less than 1000 calories
        System.out.println(isHealthy);

        System.out.println("Any match");

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) { //isVegetarian  is variable from Dish
            System.out.println("The menu is vegetarian friendly");
        }
        boolean isVegetarianFriendly = DishData.getAll().stream().anyMatch(Dish::isVegetarian);


        System.out.println("Non match");

        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 10000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");

        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get());  //.get -> return Dish from Optional<Dish>

        System.out.println("FIND ANY");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());  //.get -> return Dish from Optional<Dish>

        //Parallel Streams (ASYNC)

        System.out.println(IntStream.range(0, 100).parallel().findAny());
        System.out.println(IntStream.range(0, 100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");
        List<String> list2 = Arrays.asList("Jhonny", "David", "Jack", "Duke", "Jill", "Dany", "Julia", "Jenish", "Divya");


        Optional<String> findFirst1 = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findFirst2 = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findFirst3 = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
        Optional<String> findAny = list1.parallelStream().filter(s -> s.startsWith("J")).findAny();
        System.out.println("_______________________________");
        System.out.println(findFirst1.get());
        System.out.println(findFirst2.get());
        System.out.println(findFirst3.get());
        System.out.println(findAny.get());


        //MIN AND MAX
        System.out.println("min and max");
        System.out.println(DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories)));
        System.out.println(DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories)));


        //  System.out.println( DishData.getAll().stream().min(Comparator.comparing(d-> d.getCalories() ))   );

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);

        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);
        int result1 = numbers.stream().reduce((a, b) -> a + b).get();
        System.out.println(result1);

        int num = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce(Integer::sum)
                .get();

        System.out.println(num);


        //Max and Min
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum1 = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum1 = " + sum1);


        // COUNT

    long dishcount  = DishData.getAll().stream()
                .count();
        System.out.println("dishcount" + dishcount);

    }


}
