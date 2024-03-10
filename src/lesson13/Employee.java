package lesson13;

public class Employee {
    public static void main(String[] args) {
        byte denNedeli = 2;
        final int a =1;
        final int b =2;

        switch (denNedeli ) {
            case 1:

            case -2:

            case a*b:

            case 4:

            case 5:
                System.out.println("Rabota do 18:00");
                break;
            case 6:
                System.out.println("Rabota do 14:00");
                break;
            case 7:
                System.out.println("No work");
                break;
            default:System.out.println("Day Error");

        }
    }
}
