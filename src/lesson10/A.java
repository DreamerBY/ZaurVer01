package lesson10;

import lesson9.Car;
import lesson9.Student;
import lesson9.*;
import lesson4Z.lesson4.*;
import static lesson9.Car.a;


public class A {
    public static void main(String[] args) {

        java.lang.String st1 = new String("Hello");

        Car c1 = new Car("red", "V6");
        Student st2 = new Student();

        lesson9.Car c2 = new Car("red", "V6");
        Student st3 = new Student();
        System.out.println(st2.z);
        System.out.println(Student.c);
        StudentSS sss = new StudentSS();
        System.out.println("Эй равно "+a);


    }

}

class B {
    Student st3 = new Student();
}