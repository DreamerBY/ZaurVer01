package lesson14;

public class Test6 {
    public void time() {
        OUTER: for (int chas = 0; chas <= 23; chas++) {
            System.out.println("Nachalo outer loopa");
            INNER: for (int min = 0; min <= 59; min++) {
                if (min == 20) {
                    continue OUTER;
                }
                System.out.println(chas + ":" + min);
                System.out.println("Konec outer loopa");
            }
        }


    }
    public static void main (String[]args){
        Test6 t = new Test6();
        t.time();
    }

    }