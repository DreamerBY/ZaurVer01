package lesson8_dz_1;

//1. В первом классе создайте 2 static метода. 1-ый пусть умножает 3 числа
//из параметра метода и возвращает их произведение;
//
// 2-ой – делит первое число из параметра на второе и ничего не возвращает, лишь
//выводит на дисплей в читабельном виде целое частное и остаток.
//
//
//втором классе по два раза используйте данные методы.


public class DZ_8_1 {
    static int umnogaemNaTriNumbers(int a, int b, int c) {
        int a1 = a;
        int b1 = b;
        int c1 = c;
        int answer = a * b * c;
        return answer;
    }

    static void calculateQuotient(int numerator, int denominator) {

        int quotient = numerator / denominator;
        int remainder = numerator % denominator;
        System.out.println("Integer quotient = " + quotient + "\nRemainder = " + remainder);
    }

}

class DZ_Test {
    public static void main(String[] args) {

        System.out.println(DZ_8_1.umnogaemNaTriNumbers(4, 2, 3));
        System.out.println(DZ_8_1.umnogaemNaTriNumbers(7, 3, 7));

        DZ_8_1.calculateQuotient(10, 2);
        DZ_8_1.calculateQuotient(10, 3);
    }
}
