package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.Collectors;

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

       Map<String,Integer> dishMap =  DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //summingInt (ToIntFunction) : returns a Collectors that produces the sum of a Integer - valued func

       Integer sumInt = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sumInt);

        //counting(): returns a Collector that counts the number of the elements

        Long evenCount = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);
    }
}
