package lesson15;

public class Test9 {
    public static void main(String[] args) {

        int chas = -1;
        OUTER:
        do {
            chas++;
            int minuta = 0;
            INTER:
            while (minuta < 60) {
                if(minuta==20){continue OUTER;};
                System.out.println(chas + ":" + minuta);
                minuta++;
            }

        } while (chas < 24);


    }
}
