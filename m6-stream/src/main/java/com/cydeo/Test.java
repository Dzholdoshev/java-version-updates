package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,10,8,7,9,6));

        System.out.println(   list.stream()
                .sorted(Comparator.comparing(Integer::intValue).reversed())
                .collect(Collectors.toList()));





    }
}
