package lesson11_dz1;

public class Car {
    String color="White";
    String engine="V4";
    int doorsN=2;


//    Car(String cvet, String motor) {
//        color = cvet;
//        engine = motor;
//        int doorsN=2;
//        System.out.println("Object is created!!!");
//    }
}

class CarTest {

    public static void main(String[] args) {
        Car bmw=new Car();
        Car mers=new Car();
        System.out.println(bmw.doorsN);
        makeDoors(bmw,6);
        System.out.println(bmw.doorsN);
        System.out.println();

        mers.color="Red";
        System.out.println( bmw.color);
        System.out.println( mers.color);
        changeColor(bmw,mers);
        System.out.println();
        System.out.println( bmw.color);
        System.out.println( mers.color);

    }
    public static void makeDoors(Car c,int n){
        c.doorsN=n;
    }

    public static void changeColor(Car c1,Car c2){
        Car c3=new Car();
        c3.color= c1.color;
        c1.color= c2.color;
        c2.color= c3.color;

    }


}
