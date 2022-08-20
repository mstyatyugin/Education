package ru.metadevs.max.OOP;

public interface IdealCompany {

    void hire(AbstractEmployee employee, int salary);

    void fire(AbstractEmployee worker);

    void printEmployees();

    Employee employeeByName(String name);
}

