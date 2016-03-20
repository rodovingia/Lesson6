/**
 * Created by ronald on 19-3-2016.
 */
public class Reverse {
    public static void printBackwards(String s) {
        if (s.isEmpty()) {
            ;
        } else {
            printBackwards(s.substring(1, s.length()));
            System.out.print(s.charAt(0));
        }
    }

    public static void main(String args[]) {
        String s = "Hello World!";
        printBackwards(s);
    }
}


