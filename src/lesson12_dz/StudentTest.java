package lesson12_dz;

import lesson11.Student;

public class StudentTest {


    public static void compareWwoMethods(Student stud1, Student stud2) {
        if (stud1.name == stud2.name && stud1.course == stud2.course && stud1.grade == stud2.grade) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты НЕ равны");
        }

    }

    public static String compareWwoMethods2(Student stud1, Student stud2) {
        if (stud1.name == stud2.name) {
            if (stud1.course == stud2.course) {
                if (stud1.grade == stud2.grade) {
                    System.out.println("Студенты равны");
                } else {
                    System.out.println("Имена студентов и курсы равны, но средний бал не равен");
                }

            } else {
                System.out.println("Имена студентов равны, но курсы не равны");
            }

        } else {
            System.out.println("Имена студентов не равны");
        }


        return null;

    }

    public static void main(String[] args) {
        Student stud1 = new Student("Sasha", 5, 9.6);
        Student stud2 = new Student("Sasha", 4, 9.6);
        compareWwoMethods(stud1, stud2);
        System.out.println(compareWwoMethods2(stud1, stud2));

    }

}
