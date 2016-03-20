/**
 * Created by ronald on 20-3-2016.
 */
public class TestStaticDynamic {
    public static void main(String args[]) {
        Triangle t = new Triangle(3.0, 4.0, "filled");
        TwoDShape twoD = new Triangle(5.0, 3.0, "dashed");

        t.showDim();
        t.showStyle();
        System.out.println("Area: " + t.area());

        twoD.showDim();
        // twoD.showStyle();
        // System.out.println("Area: " + twoD.area());
    }
}
