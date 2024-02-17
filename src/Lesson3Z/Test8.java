package Lesson3Z;

public class Test8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;

        System.out.println(a-- - --a + ++a + a++ + a);// todo
        System.out.println(++b - b++ + b - --b);// todo

        int i1 = 5;
        int i2 = 11;


        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println(result);//12 02 2024++

    }
}
