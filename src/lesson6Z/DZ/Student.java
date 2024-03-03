package lesson6Z.DZ;

public class Student {

    Student(int idcard1, String name1, String lastname1, int yearofcollege1, double mathevaluation1, double economicevaluation1, double languagegradeevaluation1) {
        idcard = idcard1;
        name = name1;
        lastname = lastname1;
        yearofcollege = yearofcollege1;
        mathevaluation = mathevaluation1;
        economicevaluation = economicevaluation1;
        languagegradeevaluation = languagegradeevaluation1;
    }

    Student(int idcard2, String name2, String lastname2, int yearofcollege2) {
        this(idcard2, name2, lastname2, yearofcollege2, 0.0, 0.0, 0.0);
    }

    Student() {
       // Тела нет - параметров нет - конструктор ничего не делает this(0, null, null, 0, 0.0, 0.0, 0.0);
    }


    int idcard;
    String name;
    String lastname;
    int yearofcollege;
    //Оценка 10 бальная шкала
    double mathevaluation;
    double economicevaluation;
    double languagegradeevaluation;
}

class StudentTest {


    public static void main(String[] args) {


        Student st1 = new Student(1, "Lisa", "Petrova", 2020, 5.5, 4.2, 4.5);
        System.out.println(st1.lastname);

        Student st2 = new Student(2, "Olya", "Sidorova", 2015);
        System.out.println(st2.lastname);

        Student st3 = new Student( );
        System.out.println(" NULL "+st3.lastname);


    }

}
