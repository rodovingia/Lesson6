/**
 * Created by ronald on 20-3-2016.
 */
public class TestTriangle2 {

    public static void main(String args[]) {
        Triangle2 t = new Triangle2(3.0, 4.0, "filled");

        t.showDim();
        t.showStyle();
        System.out.println("Area: " + t.area());
    }
}
