package lesson14_dz;

public class Test14dz {

    public static void time() {
        int chas = 0;

        OUTER:
        while (chas < 6) {
            int min = 0;

            if (chas > 1 && min % 10 == 0) {
                break OUTER;
            }
            MIDDLE:
            do {
                int sec = 0;
                INNER:
                if (sec * chas > min) {
                    continue MIDDLE;
                }
                while (sec <= 59) {
                    System.out.println(chas + ":" + min + ":" + sec);
                sec++;
                }

                min++;
            } while (min <= 59);


            chas++;
        }
    }


    public static void main(String[] args) {
        time();
    }
}
