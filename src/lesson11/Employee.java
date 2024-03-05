package lesson11;

public class Employee {
    public String name;
    public Double salary;

    public Employee(String name, Double salary) {//конструктор
        this.name = name;
        this.salary = salary;
    }

    public Double uvelichitrl(double a) { //метод
        a = a * 2;
        return a;
    }

    public Double zp2() { //метод
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvelichitrl(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println("salary " + emp1.salary);
    }

}


