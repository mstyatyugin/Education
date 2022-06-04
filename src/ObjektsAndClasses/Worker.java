package ObjektsAndClasses;

public class Worker implements Employee {
    private String name;
    private int age;
    private double salary;
    private String companyName;

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    // region getters/setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //endregion

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }    // endregion

    private boolean checkSalary() {
        return salary > age;

    }

    public void salaryValidate() throws Exception {
        if (!checkSalary()) throw new Exception("ERROR");
    }

    @Override
    public void printPersonalInfo() {

        System.out.println("I am worker!");
        System.out.println("My name " + name + ", i am " + age + " and i have got " + salary);
    }
}


