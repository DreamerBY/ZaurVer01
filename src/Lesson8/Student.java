package Lesson8;

public class Student {
    String name;
    int cource;
    static int count = 0;
    int a;

    public Student(String name2, int cource2) {
        count++;
        name = name2;
        cource = cource2;
        System.out.println("Студент № " + count + " sozdan");

    }

    public static void showCount() {
        System.out.println("Всего создано студентов - " + count);
    }

    public void showInfo() {
        System.out.println("Welcom to the student class");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        //a++; Нельзя потому что зависит от объекта
        Student st2 = new Student("Petr", 1);
        st2.a++;
    }

    public static void main(String[] args) {
        abcd();
        Student s1 = new Student("Ivan", 1);
        Student s2 = new Student("Petr", 4);
        Student s3 = new Student("Masha", 2);
        System.out.println(count);
        showCount();
        s3.abc();
    }
}

class StudenTest {
    public static void main(String[] args) {


//        Student s1=new Student("Ivan",1);
//        Student s2=new Student("Petr",4);
//        Student s3=new Student("Masha",2);
//        System.out.println(Student.count);
//        System.out.println(s1.count);
//        System.out.println(s2.count);
//        Student.showCount();

    }
}
