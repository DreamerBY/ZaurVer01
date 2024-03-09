package lesson13;

public class Test1 {
}

class Student {
    int grade/*Оценка*/;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(2);

        switch (st1.grade) {
            case 2:
                System.out.println("dvoeshnik");
                break;
            case 3:
                System.out.println("troeshnik");
                break;
            case 4:
                System.out.println("horoshist");
                break;
            case 5:
                System.out.println("otlichnik");
                break;
            default:
                System.out.println("ocenka ne verna");
        }


//            System.out.println("dvoeshnik");
//        } else if (st1.grade == 3) {
//            System.out.println("troeshnik");
//        } else if (st1.grade == 4) {
//            System.out.println("horoshist");
//        } else if (st1.grade == 5) {
//            System.out.println("otlichnik");
//        } else {
//            System.out.println("ocenka ne verna");
//        }

    }

}
