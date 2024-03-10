package lesson13_dz;

public class Month {
    int n;
    public static void searchForNumberOfDays(int mon) {
        switch (mon) {
            case 1://31 day
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
              case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("28 days");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 13; i++) {
            searchForNumberOfDays(i);
        }
    }
}