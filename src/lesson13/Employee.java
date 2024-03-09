package lesson13;

public class Employee {
    public static void main(String[] args) {
        switch ("saturday") {
            case "ponedeljnik":

            case "vtornik":

            case "sreda":

            case "4etverg":

            case "friday":
                System.out.println("Rabota do 18:00");
                break;
            case "saturday":
                System.out.println("Rabota do 14:00");
                break;
            case "sunday":
                System.out.println("No work");
                break;
            default:System.out.println("Day Error");

        }
    }
}
