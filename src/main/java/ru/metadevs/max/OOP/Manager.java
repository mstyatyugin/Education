package ru.metadevs.max.OOP;

public class Manager extends AbstractEmployee {

    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void printPersonalInfo() {
        System.out.println("I am Manager!");
        super.printPersonalInfo();
    }

    @Override
    public String toString() {
        return "Manager" + super.toString();
    }
}