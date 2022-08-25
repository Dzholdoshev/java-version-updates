package com.cydeo.flatMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("Print All Emails");
        EmployeeData.readAll()
             //   .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        System.out.println("Print All phone numbers");

        EmployeeData.readAll()
                //   .map(employee -> employee.getEmpEmail())
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);

        System.out.println("Print All phone numbers with double colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("_____________________________");
       List<Employee> employeeList= EmployeeData.readAll()
               .sorted(Comparator.comparing(Employee::getSalary).reversed())
               .collect(Collectors.groupingBy(Employee::getSalary))
               .values().stream().skip(0).findFirst().get();


        //  .map(Collections::singletonList)
              // .orElseGet(Collections::emptyList);

        System.out.println(employeeList);

        System.out.println(EmployeeData.readAll().collect(Collectors.groupingBy(Employee::getSalary)));
    }
}
