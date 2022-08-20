package ru.metadevs.max.OOP;


import java.util.Arrays;

public class Company implements IdealCompany {
    private AbstractEmployee[] employees;
    private String companyName;

    public Company(String companyName, int amount) {
        this.companyName = companyName;
        this.employees = new AbstractEmployee[amount];
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public void hire(AbstractEmployee employee, int salary) {
        if (isEmployeeBelongsToCompany(employee)) {
            throw new EmployeeAlreadyExistsInCompanyException("This person is already in staff!");
        }

        employee.salaryValidate(salary);
        employee.setSalary(salary);
        employee.setCompanyName(companyName);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }

        employees = Arrays.copyOf(employees, employees.length + 1);
        employees[employees.length - 1] = employee;
    }

    @Override
    public void fire(AbstractEmployee employee) {
        if (!existsByName(employee.getName())) {
            throw new EmployeeNotFoundException("There is no such employee in the company");
        }

        AbstractEmployee[] newArray = new AbstractEmployee[employees.length - 1];
        int newEmployeesIndex = 0;

        for (Employee value : employees) {
            if (!value.equals(employee)) {
                newArray[newEmployeesIndex] = (AbstractEmployee) value;
                newEmployeesIndex++;
            }
        }
        employees = newArray;
    }

    @Override
    public void printEmployees() {
        for (AbstractEmployee employee : employees) {
            employee.printPersonalInfo();
            System.out.println();
        }
    }

    @Override
    public AbstractEmployee employeeByName(String name) {
        for (AbstractEmployee employee : employees) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException("Employee this name is not found");
    }

    private boolean isEmployeeBelongsToCompany(AbstractEmployee employee) {
        return Arrays.asList(employees).contains(employee);
    }

    private boolean existsByName(String name) {
        try {
            employeeByName(name);
            return true;
        } catch (EmployeeNotFoundException e) {
            return false;
        }
    }// Метод не сильно красивый, но немного иллюстрирует как работать с try\catch
}
    
