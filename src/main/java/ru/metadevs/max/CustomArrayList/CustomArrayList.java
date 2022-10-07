package ru.metadevs.max.CustomArrayList;

import ru.metadevs.max.OOP.AbstractEmployee;
import ru.metadevs.max.OOP.Employee;
import ru.metadevs.max.OOP.EmployeeAlreadyExistsInCompanyException;

import java.util.*;

public class CustomArrayList<T> implements List<T> {
    private T[] customArray;
    private int size;
    private void ensureCapacity() {
        if (size == CustomArrayList.DEFAULT_CAPACITY) {
            int newLength = (int) (CustomArrayList.DEFAULT_CAPACITY * 1.5);
        }
    }

    @Override
    public boolean add(T t) {
        size++;
        return true;
    }

    public final static int DEFAULT_CAPACITY = 10;

    public CustomArrayList() {
        this.customArray = (T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public CustomArrayList(T[] customArray) {
        this.customArray = customArray;
        this.size = customArray.length;
    }


    @Override
    public void add(int index, T element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index is out of size ");
        }

        for (int i = size; i > index; i--) {
            customArray[i] = customArray[i - 1];
        }
        customArray[index] = element;
        size++;
    }


    @Override
    public boolean remove(Object o) {
        AbstractEmployee[] newArray = new AbstractEmployee[customArray.length - 1];
        int newEmployeesIndex = 0;

        for (T value : customArray) {
            if (!value.equals(customArray)) {
                newArray[newEmployeesIndex] = (AbstractEmployee) value;
                newEmployeesIndex++;
            }
        }
        customArray = (T[]) newArray;
        return false;
    }

    @Override
    public int size() {
        this.size = customArray.length;
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {

        for (T employee : customArray) {
            if (employee.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {

        T[] subCustomArray = (T[]) new Object[toIndex - fromIndex];
        int s = 0;
        for (int i = fromIndex; i < toIndex; i++) {
            subCustomArray[s] = customArray[i];
            s++;
        }
        return new CustomArrayList<>(subCustomArray);
    }

    @Override
    public T get(int index) {
        return customArray[index];
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }


}
