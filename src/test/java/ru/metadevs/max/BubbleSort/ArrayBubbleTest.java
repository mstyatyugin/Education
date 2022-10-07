package ru.metadevs.max.BubbleSort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class ArrayBubbleTest {

    @Test
    void insert() {
        int maxSize = 100;
        ArrayBubble arr = new ArrayBubble(maxSize);
        arr.insert(77);
        arr.display();
    }

    @Test
    void bubbleSort() {
        int maxSize = 10;
        ArrayBubble arr = new ArrayBubble(maxSize);
        int[] array = {00, 11, 22, 33, 44, 55, 66, 77,88,99 };
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.bubbleSort();
        assertThat(arr.getA()).usingDefaultElementComparator().isEqualTo(array);
    }

    @Test
    void selectionSort() {
        int maxSize = 10;
        ArrayBubble arr = new ArrayBubble(maxSize);
        int[] array = new int[]{00, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        arr.insert(7);
        arr.insert(9);
        arr.insert(4);
        arr.insert(5);
        arr.insert(2);
        arr.insert(0);
        arr.insert(1);
        arr.insert(0);
        arr.insert(6);
        arr.insert(4);
        arr.selectionSort();
        assertArrayEquals(arr.getA(),array);
    }

    @Test
    void insertionSort(){
        int maxSize = 10;
        ArrayBubble arr = new ArrayBubble(maxSize);
        int[] array = new int[]{00, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.insertionSort();
        assertArrayEquals(arr.getA(),array);
    }

}