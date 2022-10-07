package ru.metadevs.max.OOP;

import java.util.Arrays;

public class Appliaction {
    public static void main(String[] args) throws Exception {

        Company company = new Company("Рога и Копыта", 3);
        Worker sasha = new Worker("Саша", 30);
        Worker pasha = new Worker("Паша", 28);
        Manager alesha = new Manager("Алеша", 27);

        company.hire(sasha, 100);
        company.hire(pasha, 100);
        company.hire(alesha, 100);
        //       sasha.setSalary(100);
//        sasha.setCompanyName("Рога и Копыта");
//        System.out.println(Arrays.toString(company.getEmployees()));
//        company.hire(pasha);
//        company.hire(alesha);
//        company.fire(pasha);
        // sasha.printPersonalInfo();
        company.printEmployees();
        //worker.salaryValidate();

    }

}

