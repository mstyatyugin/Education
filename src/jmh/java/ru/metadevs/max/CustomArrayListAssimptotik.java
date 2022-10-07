package ru.metadevs.max;

import org.openjdk.jmh.annotations.*;
import ru.metadevs.max.OOP.*;

import java.util.ArrayList;

@State(Scope.Benchmark)
public class CustomArrayListAssimptotik {

    @Param({"100", "1000", "10000"})
    int value;

    ArrayList<Integer> employeeArrayList;

    @Setup(Level.Invocation)
    public void prepare() {
        employeeArrayList = new ArrayList<Integer>(10001);
        //sasha = new Manager("SASHA", 40);
        for (int i = 0; i < value - 1; i++) {

            employeeArrayList.add(i);
        }
    }

    @Benchmark
    public void add() {
        employeeArrayList.add(value);
    }

    @Benchmark
    public void remove() {
        employeeArrayList.remove(value - 2);
    }

    @Benchmark
    public void remove0() {
        employeeArrayList.remove(0);
    }
    @Benchmark
    public void size(){
        employeeArrayList.size();
    }
}

