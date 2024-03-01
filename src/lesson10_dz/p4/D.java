package lesson10_dz.p4;

import lesson10_dz.p1.A;
import lesson10_dz.p1.p2.*;
import lesson10_dz.p1.p2.p3.*;
import lesson10_dz.p4.p5.E;

public class D {
    public static void main(String[] args) {

        String st1 = new String("Hello");
        A a1 = new A();
        System.out.println(a1.c);


        System.out.println(B.a);
        System.out.println("count = "+B.count);

        C c1 = new C();
        System.out.println(c1.st1);

        E e1=new E();
        System.out.println(e1.e);

    }
}
