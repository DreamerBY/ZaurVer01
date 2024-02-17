package Lesson7_1Z;

public class TretiyClass {

    public static void main(String[] args) {
        System.out.println("-----------------");
        //Сначало надо создать объект Класса Employee
        Lesson7_0Z.Employee emp/*тут хрантися путь*/ = new Lesson7_0Z.Employee(500);

        System.out.println(emp.salary+" \nВторой ПАКЕТ");
        emp.dvoynayazp();
    }
}
