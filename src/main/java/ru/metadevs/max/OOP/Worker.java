package ru.metadevs.max.OOP;

public class Worker extends AbstractEmployee {

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public void printPersonalInfo() {
        System.out.println("I am worker!");
        super.printPersonalInfo();
    }

    @Override
    public String toString() {
        return "Worker" + super.toString();
    }
}


