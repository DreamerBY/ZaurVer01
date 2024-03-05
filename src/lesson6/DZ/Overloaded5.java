package lesson6.DZ;

public class Overloaded5 {

    int sum() {
        int result=0;
        System.out.println(result);
        return result;
    }

    int sum(int a) {
        int result1=a;
        System.out.println(result1);
        return result1;
    }

    int sum(int a, int b) {
        int result2=a+b;
        System.out.println(result2);
        return result2;
    }

    int sum(int a, int b, int c) {
        int result3=a+b+c;
        System.out.println(result3);
        return result3;
    }
//метод
    int sum(int a, int b, int c, int d) {
        int result4=a+b+c+d;
        System.out.println(result4);
        return result4;
    }

}
class Overloade5Test {
    public static void main(String[] args) {


    Overloaded5 ov5 = new Overloaded5();
    ov5.sum(1,2,4,7);
    ov5.sum(1,2,4);

    }

}