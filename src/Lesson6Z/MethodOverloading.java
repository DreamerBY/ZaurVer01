package Lesson6Z;

public class MethodOverloading {
    // ===int===
    void show(int i1) {
        System.out.println(i1);
        System.out.println("Data type is INT!!!");
    }

    // ===boolean===
    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Data type is boolean!!!");
    }
    // ===String===
    void show(String s1) {
        System.out.println(s1);
        System.out.println("Data type is String!!!");
    }

    void show (String s, int a){
        System.out.println("String: "+s+" int: "+a);

    }void show (int a, String s){
        System.out.println("Какой хороший день");
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading m0 = new MethodOverloading();
        int a = 500;
        m0.show(a);

        boolean b = true;
        m0.show(b);

        String s = "Privet";
        m0.show(s);
        m0.show("привет",10);
        m0.show(10,"привет");

    }

}
