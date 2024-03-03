package cheque_static_import;
public class Test1 {
    static int A=10;
    public static void run() {
        System.out.println("RUN");
    }


    public static class Test2{
        public static int B=15;
        static void gold (){
            System.out.println("GOLD");
        }
    }
}
