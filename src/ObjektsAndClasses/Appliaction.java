package ObjektsAndClasses;

public class Appliaction {
    public static void main(String[] args) throws Exception {

        Employee sasha = new Manager("Саша", 30, 35000.00);
        Employee pasha = new Worker("Паша", 28, 29000.00);
        Employee alesha = new Worker("Алеша", 27, 33000.00);
        Company company = new Company("Рога и Копыта", 3);
        company.hire(sasha);
        company.hire(pasha);
        company.hire(alesha);
        company.fire(pasha);
        sasha.printPersonalInfo();
        company.printWorkers();

        //worker.salaryValidate();

    }

}

