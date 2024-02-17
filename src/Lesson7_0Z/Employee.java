package Lesson7_0Z;

public class Employee {
    public double salary; //Одна переменная

    //Метод двойная зарпалата
    public void dvoynayazp(){

        double result=salary*2;
        System.out.println("Novaya z/p= "+result);
    }
    //Делаем конструктор
    public Employee(double salary2){

        salary=salary2;
    }

    public static void main(String[] args) {
        //Сначало надо создать объект Класса Employee
        Employee emp/*тут хрантися путь*/ = new Employee(500);

        System.out.println(emp.salary);
        emp.dvoynayazp();

    }
}
class EmployeeTest{
    public static void main(String[] args) {
        System.out.println();
        //Сначало надо создать объект Класса Employee
        Employee emp/*тут хрантися путь*/ = new Employee(500);

        System.out.println(emp.salary);
        emp.dvoynayazp();
    }


}
