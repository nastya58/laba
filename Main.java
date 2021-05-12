package com.company;
public class Main {
    public static void main(String[] args) {
        Person  Semyon = new Person("Semyon", 28);
        Person Kirill = new Person();
        Semyon.talk();
        Kirill.move();
    }}
class Person {
    String FullName;
    int Age;

    Person() {
        FullName = "Maks";
        Age = 20;
    }

    Person(String FullName, int age) {
        this.FullName = FullName;
        this.Age = Age;
    }

    void talk() {
        System.out.println(FullName + " говорит");
    }

    void move() {
        System.out.println(FullName +  Age);
    }
}