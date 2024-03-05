package lesson7_dz_2;

public class Employee {
    public static void main(String[] args) {

        lesson7_dz_1.Employee emp7 = new lesson7_dz_1.Employee("Petrov", 30);
        System.out.println(emp7.surname);
        System.out.println(emp7.age);
        System.out.println();

        emp7.show1MethodID();
        emp7.show2MethodsSalary();
        emp7.show3MethodAge();
        emp7.show3MethodSurname();


    }


}
