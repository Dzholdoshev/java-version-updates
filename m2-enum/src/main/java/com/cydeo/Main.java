package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant");

        Currency c = Currency.DIME;
        System.out.println(c);

        System.out.println(Currency.PENNY);

        Currency[] currencies = Currency.values();
        System.out.println(Arrays.toString(currencies));
        for (Currency currency : currencies) {
            System.out.println(currency);
        }

        System.out.println("How to use switch case with enums?");

        switch (Currency.PENNY) {
            case PENNY:
                System.out.println("it's 1 cent");
                break;
            case NICKLE:
                System.out.println("It's 5 cent");
                break;
            case DIME:
                System.out.println("it's 10 cent");
                break;
            case QUARTER:
                System.out.println("it's 25 cent");
                break;
        }

        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal());  //3



    }
}
