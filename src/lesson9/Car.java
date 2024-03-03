package lesson9;

public class Car {
    String color;
    public static int a=10;
    String engine;
    static int count;


    public static void changeA(int b){
        Car c=new Car("Black","V8");
        c.a=b;
    }

      public Car(String color, String engine2) {
        int x=5;
        int y=x+10;
        this.count++;
        this.color/*Это переменная метода*/ = color;//парпаметр
        engine = engine2;
          System.out.println("Кар создан");
    }

    public void showColor() {
        System.out.println("Цвет машины: " + color);
        this.changeColor("Red");
    }

    public void changeColor(String color3) {

        System.out.println("Цвет машины изменился ");
        int cena = 5000; //local variable;
        this.color = color3;
        cena += 1000;
        count++;
    }

    void abc (int a , int b){
//        boolean a = true;//// Не допустимо так как данная переменная уже есть

    }
    void abcd (int a , int b){

    }

    void changeColor1(String color){
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Car c=new Car("red","V6");
        System.out.println(c.color);
        c.changeColor1("black");
        System.out.println(c.color);
    }

//    int a = cena;
}
