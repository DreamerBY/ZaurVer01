package lesson12;

public class Test10_1 {
    void maximum(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            int a = 5;
            System.out.println("Maximum - " + i1);
        } else if (i2 > i1 && i2 > i3) {
            int a = 10;
            System.out.println("Maximum - " + i2);
        } else {
            int a=2;
            System.out.println("Maximum - " + i3);}


    }

    public static void main(String[] args) {
        Test10_1 t = new Test10_1();
        t.maximum(4, 7, 0);

    }
}
