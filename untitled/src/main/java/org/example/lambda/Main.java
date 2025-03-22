package org.example.lambda;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alex", 18);
        Student student1 = new Student("Bob", 1);

        //реализация метода функционального интерфейса с помощью лямбды
        MyInterface myInterface = () -> "Имя персоны: " + person1.getName() + ", возраст: " + person1.getAge();

        //использование лямбды в качестве параметра метода infoPerson класса Person
        System.out.println(person1.infoPerson(myInterface));

        System.out.println("**********************************************");
        //используем объект класса Student в качестве параметра метода infoPerson класса Person
        //это возможно благодаря полиморфизму
        System.out.println(person1.infoPerson(student1));
        

    }
}
