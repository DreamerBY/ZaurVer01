package Lesson5Z.DZ;

public class Employee {
    //Конструктор
    Employee(int id1, String surname1, int age1, int salary1, String department1) {  //конструктор
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;

        System.out.println("Object is created!!!");

    }

    int id;
    String surname;
    int age;
    int salary;
    String department;

    // Метод увелечения зарплаты вдвое
    int zpx2() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {


        Employee e1 = new Employee(1, "Petrov", 64, 250, "PTO");
        Employee e2 = new Employee(2, "Ivanov", 124, 670, "SDO");

        System.out.println(e1.salary);
        System.out.println(e2.salary);
        e1.zpx2();
        e2.zpx2();

        System.out.println(e1.salary);
        System.out.println(e2.salary);

    }
}
