/**
 * Created by ronald on 19-3-2016.
 */
public class Fac {

    public static int factor(int n) {
        if (n < 0) {
            return 0;
        } else if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return n * factor(n - 1);
        }
    }

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Fac(" + i + ") = " + factor(i));

        }
    }
}


