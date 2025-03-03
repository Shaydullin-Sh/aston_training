package org.example.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainStreamApi {
    static class Employee{
        enum Position{
            DIRECTOR, MANAGER, ENGINEER, PROGRAMMER;
        }
        private String name;
        private String lastName;
        private int age;
        private Position position;
        private double salary;

        public Employee(String name, String lastName, int age, Position position, double salary) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.position = position;
            this.salary = salary;
        }

    }


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee("Aleksandr", "Pushkin", 25, Employee.Position.DIRECTOR, 5000),
                new Employee("Nicolay", "Gogol", 24, Employee.Position.MANAGER, 2500),
                new Employee("Michail", "Lermontov", 26, Employee.Position.PROGRAMMER, 2900),
                new Employee("Lev", "Tolstoy", 46, Employee.Position.ENGINEER, 3400),
                new Employee("Fedor", "Dostoevskiy", 44, Employee.Position.MANAGER, 2700)
        ));
        //Использование стримов через коллекции
        List<String> collect = employeeList.stream()
                .filter(employee -> employee.position == Employee.Position.MANAGER)
                .sorted(Comparator.comparingDouble(o -> o.salary))
                .map((Function<Employee, String>) employee -> employee.name
                        + " " + employee.lastName
                        + " " + employee.age
                        + " " + employee.position
                        + " " + employee.salary)
                .toList();


        //Использование стримов через массивы
        int[] array = {1, 2, 3, 4, 5};
        Arrays.stream(array).forEach(System.out::println);

        //Использование стримов через примитивы
        IntStream intStream = Stream.of(1, 2, 3, 4, 5).mapToInt(i -> i);
    }
}
