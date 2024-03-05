package lesson12;

public class Test10_2 {
    void abc() {
        String str;
        int a = 10;

        if (a >= 10) {
            str = "Privet";
        }
        else if (a < 10) {
            str = "Poka";
        } else {
            str = null;
        }
        System.out.println(str);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int maximum = (a > b) ? a : b;
        System.out.println(maximum);
        Test10_2 t = new Test10_2();
        t.abc();

    }
}
