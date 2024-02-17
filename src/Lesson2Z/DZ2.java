package Lesson2Z;

public class DZ2 {
    public static void main(String[] args) {
        char c1='Y';
        char c2='y';
        char c3 = 89; //10 ричный
        char c4 = '\u0059';//16 ричный ABCDEF
        char c5 = '\u05AB';

        float f1 = 25.00f;
        float f2 = 33.00f;
        boolean b1=true;
        boolean b2=false;
        double d1=25.53D;
        double d2=13.56D;
        System.out.println(f1+" "+f2+" "+d1+" "+d2+" "+b1+b2);


        System.out.println(c1+" "+c2+" "+c3+" "+c4+" "+c5);

        byte b11 = 12;
        byte b12 = 0b1100;
        byte b13 = 0xc;
        byte b14 = 014;
        System.out.println(b11+" "+b12+" "+b13+" "+b14);

        short s1 = 1300;//dec
        short s2 = 0b010100010100;//bin
        short s3 = 0x514;//hex
        short s4 = 02424;//oct
        System.out.println(s1+" "+s2+" "+s3+" "+s4);



        int is1 = 0;//dec
        int is2 = 0b0;//bin
        int is3 = 0x0;//hex
        int is4 = 00;//oct
        System.out.println(is1+" "+is2+" "+is3+" "+is4);

        long i1s1 = 123456789L;//dec
        long i1s2 = 0b0111010110111100110100010101L;//bin
        long i1s3 = 0x75BCD15L;//hex
        long i1s4 = 0726746425L;//oct
        System.out.println(i1s1+" "+i1s2+" "+i1s3+" "+i1s4);






    }
}
