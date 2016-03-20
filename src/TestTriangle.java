/**
 * Created by ronald on 20-3-2016.
 */
public class TestTriangle {

    public static void main(String args[]) {
        Triangle t = new Triangle(3.0, 4.0, "filled");

        t.showDim();
        t.showStyle();
        System.out.println("Area: " + t.area());
    }
}
