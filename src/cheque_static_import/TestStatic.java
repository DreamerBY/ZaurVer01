package cheque_static_import;

import static cheque_static_import.Test1.A;
import static cheque_static_import.Test1.Test2.B;
import static cheque_static_import.Test1.Test2.gold;
import static cheque_static_import.Test1.run;
import   cheque_static_import.Test1.Test2;

public class TestStatic {
    public static void main(String[] args) {
        System.out.println(A);
       System.out.println(B);
        run();

        Test2 test12 = new Test2();
        gold();

    }
}//1
