package ru.metadevs.max.CustomArrayList;

//import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import ru.metadevs.max.OOP.*;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class CustomArrayListTest {

    Manager sasha = new Manager("SASHA", 40);
    Worker pasha = new Worker("PASHA", 28);
    Worker alesha = new Worker("ALESHA", 27);

    private ArrayList<AbstractEmployee> employeeArrayList = new ArrayList<>();

    @Test
    void add() {
        employeeArrayList.add(sasha);
        employeeArrayList.add(pasha);
        assertThat(employeeArrayList.get(0)).isEqualTo(sasha);
    }

    @Test
    void remove() {
        employeeArrayList.add(sasha);
        employeeArrayList.add(pasha);
        employeeArrayList.remove(1);
        assertThat(employeeArrayList.size()).isEqualTo(1);
    }

    @Test
    void size() {
        employeeArrayList.add(sasha);
        employeeArrayList.add(pasha);
        assertThat(employeeArrayList.size()).isEqualTo(2);
    }

    @Test
    void isEmpty() {
        employeeArrayList.add(sasha);
        employeeArrayList.add(pasha);
        assertThat(employeeArrayList.isEmpty()).isFalse();
    }
}