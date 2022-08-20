package ru.metadevs.max.OOP;

public abstract class AbstractEmployee implements Employee {
    private String name;
    private int age;
    private String companyName;
    private int salary;

    protected AbstractEmployee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    protected AbstractEmployee(String name, int age, String companyName, int salary) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
        this.salary = salary;
    }

    protected AbstractEmployee() {
    }

    @Override
    public void printPersonalInfo() {
        System.out.print(this.name);
        System.out.print(" " + this.age + " ");
        System.out.printf("%d", this.salary);
        System.out.println(" " + this.companyName);
    }

    @Override
    public void salaryValidate(int salary) {
        if (salary < age) {
            throw new SalaryValidateException("Salary could not be lower than age.");
        }
    }

    @Override
    public String toString() {
        return "{" +
                "nameOfPerson='" + name + '\'' +
                ", ageOfPerson=" + age +
                ", salary=" + salary +
                ", companyName= " + companyName +
                '}';
    }
}
