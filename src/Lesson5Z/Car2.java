package Lesson5Z;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;

    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
        System.out.println("cvet: " + color + " motor: " + engine + " skorostj: " + speed);
    }
}


class car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();// конструктор

        c1.color = "white";
        c1.engine = "V6";
        c1.speed = 60;
        c1.gaz(20);
        c1.tormoz(80);
        c1.showInfo();

    }
}