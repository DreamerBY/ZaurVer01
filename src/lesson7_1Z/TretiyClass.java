package lesson7_1Z;

public class TretiyClass {

    public static void main(String[] args) {
        System.out.println("-----------------");
        //Сначало надо создать объект Класса Employee
        lesson7_0Z.Employee emp/*тут хрантися путь*/ = new lesson7_0Z.Employee(500);

        System.out.println(emp.salary+" \nВторой ПАКЕТ");
        emp.dvoynayazp();
    }
}