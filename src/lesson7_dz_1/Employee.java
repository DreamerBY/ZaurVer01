package lesson7_dz_1;

public class Employee {
//Конструкторы
    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0.0, null);
    } // Default

    public Employee(String surname3, int age3) {

        this(0, surname3, age3, 0.0, null);
    }

    private Employee(int id4, String surname4, int age4, double salary4, String department4)/*в скобках параметры*/ {
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

     Employee(double salary5)/*в скобках параметры*/ {

        salary = salary5;

    }

    //Создаем три метода
    public void show1MethodID() {

        System.out.println(id);
    }

    public void show2MethodsSalary() {

        System.out.println(salary);
    }

    public void show3MethodSurname() {

        System.out.println(surname);
    }

    public void show3MethodAge() {

        System.out.println(age);
    }


    int id;// default
    public String surname;
    public int age;
    private double salary;
    String department;
}


class EmployeeTest {

    public static void main(String[] args) {


        Employee emp1 = new Employee(1, "Ivanov", 26);
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        System.out.println(emp1.age);
        System.out.println("*****************");


        Employee emp2 = new Employee("Petrov", 30);
        System.out.println(emp2.surname);
        System.out.println(emp2.age);
        System.out.println("*****************");


        System.out.println("=====================");
        System.out.println("=====================");
        emp1.show3MethodSurname();
        emp1.show3MethodAge();

        Employee empZP = new Employee (234234234.45646);
        //System.out.println(empZP.salary);

        empZP.show2MethodsSalary();



        /*Employee emp3 = new Employee(12, "Sidorov", 40, 100.35, "IT");
        System.out.println(emp3.department);
        System.out.println("***************************");
        emp3.show1MethodID();
        emp3.show2MethodsSalary();
        emp3.show3MethodSurname();*/


    }


}

/*
+++ 1/Пересоздайте класс Employee таким образом, чтобы переменная
salary была недоступна вне класса,
переменная surname была доступна отовсюду,
а переменная id тольковнутри пакета.

+++ 2/Также создайте 3 public метода, которые будут показывать на дисплее значения этих переменных.


+++ 3/Создайте для данного класса 3 разных конструктора с public, default и private -- access modifier-ами.

+++ В констукторах присваивайте переменным класса значения из параметров.

+++ Создайте новые классы в том же и в другом пакете.

 * Попытайтесь в них создать объекты класса Employee и вывести на экран значения переменных данного объекта с помощью
- метода println
- и методов самого класса.
 */