package Lesson4Z;

public class Student {
    int idcard;
    String name;
    String lastname;
    int yearofcollege;
    //Оценка 10 бальная шкала
    double mathevaluation;
    double economicevaluation;
    double languagegradeevaluation;

    double sredneeArifm ( double a1, double b1, double c1){
        double result = (a1 + b1 + c1) / 3;
        System.out.println("!!! Средний бал - " + result);
        return result;
    }
}

class StudentTest {
    public static void main(String[] args) {



        Student Petrov = new Student();
        Student Ivanov = new Student();
        Student Sidorov = new Student();

        Petrov.idcard = 01;
        Petrov.name = "Kolya";
        Petrov.lastname = "Petrov";
        Petrov.yearofcollege = 2015;
        Petrov.mathevaluation = 8.8;
        Petrov.economicevaluation = 9.3;
        Petrov.languagegradeevaluation = 7;

        Ivanov.idcard = 02;
        Ivanov.name = "Olya";
        Ivanov.lastname = "Ivanov";
        Ivanov.yearofcollege = 2013;
        Ivanov.mathevaluation = 7;
        Ivanov.economicevaluation = 6;
        Ivanov.languagegradeevaluation = 10;

        Sidorov.idcard = 03;
        Sidorov.name = "Misha";
        Sidorov.lastname = "Sidorov";
        Sidorov.yearofcollege = 2010;
        Sidorov.mathevaluation = 9;
        Sidorov.economicevaluation = 10;
        Sidorov.languagegradeevaluation = 6;

        System.out.println("Студент " + Petrov.lastname + " " + Petrov.name);
        System.out.println("ID студента - " + Petrov.idcard);
        System.out.println("Средний бал - " + (Petrov.mathevaluation + Petrov.economicevaluation + Petrov.languagegradeevaluation) / 3 + " За " + Petrov.yearofcollege + " год обучения");

        System.out.println("Студент " + Ivanov.lastname + " " + Ivanov.name);
        System.out.println("ID студента - " + Ivanov.idcard);
        System.out.println("Средний бал - " + (Ivanov.mathevaluation + Ivanov.economicevaluation + Ivanov.languagegradeevaluation) / 3 + " За " + Ivanov.yearofcollege + " год обучения");

        System.out.println("Студент " + Sidorov.lastname + " " + Sidorov.name);
        System.out.println("ID студента - " + Sidorov.idcard);
        System.out.println("Средний бал - " + (Sidorov.mathevaluation + Sidorov.economicevaluation + Sidorov.languagegradeevaluation) / 3 + " За " + Sidorov.yearofcollege + " год обучения");

        Student s1=new Student();
        double SR = s1.sredneeArifm(20.5,30.56,45.45);
        System.out.println("gotovo "+SR);
    }

}
