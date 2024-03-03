package lesson4Z;

public class Car {
    Car(String cvet, String motor){
        color=cvet;
        engine=motor;
        System.out.println("Object is created!!!");
    }

    String color  ;
    String engine ;

    String name = "Petr";
    String name1 = new String("Petr");

}

class CarTest {
    public static void main(String[] args) {

        Car car1=new Car("Red","V8");
        Car car3;



        System.out.println("Cvet: "+car1.color);
        System.out.println(car1.engine);
    }
}