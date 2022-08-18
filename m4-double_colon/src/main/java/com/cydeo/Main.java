package com.cydeo;

import java.util.concurrent.Callable;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> pred = (p) -> p % 2 == 0 ? true : false;

        Calculate myLambda = (x, y) -> System.out.println(x + y);
        Calculate my2Lambda = (x, y) -> Calculator.findSum(x, y);

        //reference to a Static method
        Calculate my3Lambda = Calculator::findSum;

        my3Lambda.calculate(10, 20);


        Calculate m1 = new Calculator()::findMultiply;


        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String::substring;


        Function<Integer, Double> f = new MyClass()::method;
        BiFunction<MyClass, Integer, Double> f1 = MyClass::method;

        Consumer<Integer> display = i -> System.out.println(i);

        Consumer<Integer> display1 = System.out::println;


    }
}
