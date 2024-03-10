package lesson14_dz;

public class Test14dz {

    public static void time() {

        OUTER:
        for (int chas = 0; chas <= 5; chas++) {

            for (int min = 0; min <= 59; min++) {
                if (chas > 1 && min % 10 == 0) {
                    break OUTER;
                }
                MIDDLE:
                for (int sec = 0; sec <= 59; sec++) {
                    INNER:
                    if (sec * chas > min) {
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + min + ":" + sec);
                }
            }
        }
    }

    public static void main(String[] args) {
        time();
    }
}
