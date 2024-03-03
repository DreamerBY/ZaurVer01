package lesson7_0Z;

public class DrugoyClass {
    public static void main(String[] args) {
        System.out.println("*************");
        //Сначало надо создать объект Класса Employee
        Employee emp/*тут хрантися путь*/ = new Employee(500);

        System.out.println(emp.salary+" третий покер");
        emp.dvoynayazp();
    }
}
