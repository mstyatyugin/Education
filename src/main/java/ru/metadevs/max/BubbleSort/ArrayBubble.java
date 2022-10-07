package ru.metadevs.max.BubbleSort;

public class ArrayBubble implements BubbleSort {

    int[] a;
    int nElems;


    public ArrayBubble(int max) {
        a = new int[max];
        nElems = 0;
    }

    @Override
    public void insert(int value) {
        a[nElems] = value;
        nElems++;
    }

    @Override
    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    @Override
    public void bubbleSort() {
        int out, in;
        for (out = nElems - 1; out > 1; out--)
            for (in = 0; in < out; in++)
                if (a[in] > a[in + 1])
                    swap(in, in + 1);
    }

    @Override
    public void selectionSort()
    {
        int out, in, min;
        for(out=0; out<nElems-1; out++) // Внешний цикл
        {
            min = out; // Минимум
            for(in=out+1; in<nElems; in++) // Внутренний цикл
                if(a[in] < a[min] ) // Если значение min больше,
                    min = in; // значит, найден новый минимум
            swap(out, min); // swap them
        }
    }

    @Override
    public void insertionSort() {
        int in, out;
        for (out= 1; out <nElems; out++){
            int temp = a[out];
            in = out;
            while (in > 0 && a[in -1] >= temp) {
                a [in] = a [in-1];
                --in;
            }
            a[in] = temp;
        }
    }

    private void swap(int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public int[] getA() {
        return a;
    }
}



