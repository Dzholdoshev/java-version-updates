package com.cydeo.task;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        //Print all dish's name that has less than 400 calories
        List<Dish> list = DishData.getAll();

        Stream<Dish> streamList = DishData.getAll().stream();


        list.stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
              //  .map(dish -> dish.getName())
                .forEach(System.out::println);
        System.out.println("___________________________________");
        //Print the length of the name of each dish

        list.stream()
                .map(dish -> dish.getName().length())
                .forEach(System.out::println);


        //Print three high caloric dish name (>300)
        System.out.println("___________________________________");
        list.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted((o1, o2) -> o2.getCalories() - o1.getCalories())
                .limit(3)
                .map(dish -> dish.getName())
                .forEach(System.out::println);
        System.out.println("___________________________________________________________");


        //Print all dish name that are below 400 calories in sorted
        System.out.println("//Print all dish name that are below 400 calories in sorted");

        list.stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted((dish1, dish2) -> dish1.getCalories() - dish2.getCalories())
               // .sorted(Comparator.comparing(Dish::getCalories))
             //   .sorted(Comparator.comparing(Dish::getCalories).reversed()) //reversed

                .map(dish -> dish.getName())
                .forEach(System.out::println);

        list.stream().map(dish -> dish.getType()).forEach(System.out::println);
    }
}

