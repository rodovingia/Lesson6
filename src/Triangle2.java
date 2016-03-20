/**
 * Created by ronald on 20-3-2016.
 */
public class Triangle2 extends TwoDShape2{
    String style;

    Triangle2(double width, double height, String style) {
        super(width,height);
        this.style = style;
    }

    double area() {
        return getWidth() * getHeight()/2;
    }

    void showStyle() {
        System.out.println("Style  = " + style);
    }
}
