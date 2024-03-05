package lesson7_1;

public class TretiyClass {

    public static void main(String[] args) {
        System.out.println("-----------------");
        //Сначало надо создать объект Класса Employee
        lesson7_0.Employee emp/*тут хрантися путь*/ = new lesson7_0.Employee(500);

        System.out.println(emp.salary+" \nВторой ПАКЕТ");
        emp.dvoynayazp();
    }
}
