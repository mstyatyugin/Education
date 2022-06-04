package ObjektsAndClasses;


import java.util.Arrays;

public class Company implements IdealCompany {
    private Employee[] employees;
    private String name;

    public Company(String name, int amount) {
        this.name = name;
        this.employees = new Employee[amount];
    }

    @Override
    public void hire(Employee worker) {
        Employee[] checkArray = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = worker;
                return;
            }
            checkArray[i] = employees[i];
        }
        checkArray[employees.length] = worker;
        employees = checkArray;
    }

    @Override
    public void fire(Employee worker) {
        Employee[] newArray = new Employee[employees.length - 1];
        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] != worker) {
                newArray[j++] = employees[i];
            }
        }
        employees = newArray;

    }

    public void printWorkers() {
        for (Employee employee : employees) {
            employee.printPersonalInfo();

        }
        System.out.println(Arrays.toString(employees));
    }


}
    
