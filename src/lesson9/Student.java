package lesson9;

public class Student {
    int a=10;
    public int z = 5;
    public static int c = 5;
}

class StudentTest{
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2=new Student();
        Student st3;
        st1=null;//пригоден для удаления
        String s="privet";
    }
}
