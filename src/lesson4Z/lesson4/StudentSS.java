package lesson4Z.lesson4;

public class StudentSS {

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
