package Lesson7_DZ_1;

/*
 *https://www.youtube.com/watch?v=7FsDj1Otco8
 * */
//Метод 0
public class PodskazkaPoMethod {

    public static void main(String[] args) {
        System.out.println("New world");
        hello();
        welcom();
        hello();
        int a = sum(5, 9, 45);
        System.out.println(a);
    }
// STATIC - что бы вызвать в методе main другие методы котороые объеденнены в классе
// своим методом main необходимо вставить модификатор static

    //Метод 1
    static void hello() {
        System.out.println("Hello ==");
    }

    //Метод 2
    static void welcom() {
        System.out.println("Welcom!");
    }

    //Метод 3
    static int sum(int x, int y, int z) {
        return x + y + z;
        //int z=x+y;
        // System.out.println(z);

    }

}
