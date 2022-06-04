package ObjektsAndClasses;

public class Manager implements Employee {
    private String name;
    private int age;
    private double salary;
    private String company;

    public Manager(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public void printPersonalInfo() {
        System.out.println("I am Manager!");
    }
}
