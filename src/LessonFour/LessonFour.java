package LessonFour;

public class LessonFour {

    public static void main(String[] args) {

        int year = 1980;

        for (int j = 0; j < 6; j++) {
            System.out.println("Год " + year++);
        }
        int[] array = new int[5];
        System.out.println(array[4]);

        array[3] = 67;
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        array = new int[]{1, 2, 3, 4, 78};
        System.out.println(array[4]);

        for (int item : array) {
            System.out.println(item);
        }
    }
}