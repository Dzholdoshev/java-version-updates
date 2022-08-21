package com.cydeo;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        //Creating Stream from Array
        String[] courses = {"Java", "Spring", "Agile"};

        Stream<String> courseStream = Arrays.stream(courses);

        //Creating Stream from Collection
        List<String> courseList = Arrays.asList("Java", "Spring", "Agile");
        Stream<String> courseStream2 = courseList.stream();

        //Creating Stream from Class

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("MS", 102)
        );


        Stream<Course> myCourseStream = myCourses.stream();

        Map<Integer, String> m = new HashMap<>();

        //Creating Stream Values
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6);

    }
}