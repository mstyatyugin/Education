package ru.metadevs.max.OOP;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CompanyTest {

    @Test
    public void shouldHireEmployeesToCompany() {
        Company metadevs = new Company("Metadevs", 2);
        Manager sasha = new Manager("Саша", 40);
        Worker pasha = new Worker("Паша", 28);
        Worker alesha = new Worker("Алеша", 27);

        metadevs.hire(sasha, 100);
        metadevs.hire(pasha, 100);
        metadevs.hire(alesha, 100);

        assertThat(metadevs.getEmployees().length).isEqualTo(3);
        assertThat(metadevs.employeeByName(sasha.getName())).isEqualTo(sasha);
        assertThat(metadevs.employeeByName(pasha.getName())).isEqualTo(pasha);
        assertThat(metadevs.employeeByName(alesha.getName())).isEqualTo(alesha);
    }

    @Test
    public void shouldThrowEmployeeAlreadyExistsInCompanyExceptionWhenTryHireEmployeeToTheCompany() {
        Company metadevs = new Company("Metadevs", 2);
        Manager sasha = new Manager("Саша", 30);
        metadevs.hire(sasha, 100);

        assertThatExceptionOfType(EmployeeAlreadyExistsInCompanyException.class).isThrownBy(() -> metadevs.hire(sasha, 100));
    }

    @Test
    public void shouldThrowSalaryValidateExceptionWhenTryHireEmployeeToTheCompany() {
        Company metadevs = new Company("Metadevs", 2);
        Manager sasha = new Manager("Саша", 30);

        assertThatExceptionOfType(SalaryValidateException.class).isThrownBy(() -> metadevs.hire(sasha, 10));
    }

    @Test
    public void shouldFireEmployeeFromCompany() {
        Company metadevs = new Company("Metadevs", 2);
        Manager sasha = new Manager("Sasha", 30);
        Worker pasha = new Worker("Pasha", 28);

        metadevs.hire(sasha, 100);
        metadevs.hire(pasha, 100);

        metadevs.fire(pasha);

        assertThat(metadevs.getEmployees().length).isEqualTo(1);
        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() -> metadevs.employeeByName(pasha.getName()));
    }

    @Test
    public void shouldThrowEmployeeNotFoundExceptionWhenTryToFireEmployeeFromCompany() {
        Company metadevs = new Company("Metadevs", 1);
        Manager sasha = new Manager("Саша", 30);
        Worker pasha = new Worker("Паша", 28);

        metadevs.hire(sasha, 100);

        assertThatExceptionOfType(EmployeeNotFoundException.class).isThrownBy(() -> metadevs.fire(pasha));
    }
}