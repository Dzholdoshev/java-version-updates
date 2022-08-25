package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.cydeo.task.DishData.getAll;

public class CollectorsDemo {
    public static void main(String[] args) {

        //toCollection(supplier): is used to create a Collection using Collector

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList);

        Set<Integer> numberSet = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        //toList() : returns a Collector interface that gathers the input data into a new list


       List<Integer> numberList1 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        //toSet() : returns a Collector interface that gathers the input data into a new set


        Set<Integer> numberSet1 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());

//toMap(Function,Function)

       Map<String,Integer> dishMap =  getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //summingInt (ToIntFunction) : returns a Collectors that produces the sum of a Integer - valued func

       Integer sumInt = getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sumInt);

        //counting(): returns a Collector that counts the number of the elements

        Long evenCount = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

       // Collectors.averagingInt(ToIntFunction) : returns the average of the integers passed values
       Double avgCalorie = getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(avgCalorie);

      // Collectors.joining() : is used to join various elements of a character or string array into a single object
        List<String> courses = Arrays.asList("Java","C++","C#");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        //partitioningBy() : is used to partitioning a stream of objects (or a set of elements (based on a given predicate))

        Map <Boolean, List<Dish>> mapDish =   getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(mapDish);

        //groupingBy(): is used for grouping objects by some property and storing results in a Map instance

     Map<Type,List<Dish>>  dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);


    }
}
