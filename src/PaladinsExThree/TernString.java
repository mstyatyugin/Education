package PaladinsExThree;

public class TernString {
    public static void main(String[] args) {
        int a = 2;
        String b = String.valueOf(0);
        b = ((a > 0) && (a < 5)) ? "Верно" : "Не верно";
        System.out.println(b);
    }
}