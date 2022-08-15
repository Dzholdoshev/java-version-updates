package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountTest {
    public static void main(String[] args) {
        List<Integer> ci = new ArrayList<>( Arrays.asList(1,2,3,4));
        int count = countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);

        List<Integer> a = new ArrayList<>();

    }

    public static <K, T> int countIf(List<T> list, UnaryPredicate<T> obj){

      int count = 0;
        for (T elem:list) {
            if(obj.test(elem)){
                ++count;
            }
        }

        return count;
    }
}
