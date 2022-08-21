package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        list.forEach(x-> System.out.print(x));// this is using lambda
     //   list.forEach(System.out::println);// this is using double colon
        System.out.println();
        //FILTER
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::print);


        System.out.println("Distinct");
        Stream<Integer> str = list.stream()
                .filter(i->i%2==0)
                .distinct();
        str.forEach(System.out::println);// Stream is closed


        System.out.println("Limit");
        list.stream()
                .filter(i -> i%2==0 )
                .limit(3)  //number of digits to show
                .forEach(System.out::println);


        System.out.println("Skip");
        list.stream()
                .filter(i -> i%2==0 )
                .skip(2) //skip first n elements
                .forEach(System.out::println);

        System.out.println("Map");

        list.stream()
                .map(number ->number*3)
                .filter(number->number>4)
                .forEach(System.out::println);


        System.out.println("___________");
        List<String> strList = new ArrayList<>(Arrays.asList("Java","Python","JavaScript"));

        strList.stream()

                .map(String::length)
                .forEach(System.out::println);


       ArrayList<String> arr = new ArrayList<>(Arrays.asList("1","2","3"));

       arr.stream().collect(Collectors.joining(","));
        System.out.println(arr);


    }

}
