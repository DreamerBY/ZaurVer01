package Lesson6Z;

public class MetodOverloading2 {
    public int sum ( int i1, int i2){
        return i1+i2;
    }

    public String sum (String s1, String s2){
        return s1+s2;
    }

   /* protected void  sum ( int a, int b){
        System.out.println("Hi!!");
    }*/

}

class MethodOverloading2Test{

    public static void main(String[] args) {
        MetodOverloading2 mo2=new MetodOverloading2();

        int a=mo2.sum(5,7);
        System.out.println(a);

        String s=mo2.sum("privet,"," my friend");
        System.out.println(s);
    }
}

