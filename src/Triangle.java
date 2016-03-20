/**
 * Created by ronald on 20-3-2016.
 */
public class Triangle extends TwoDShape{
    String style;

    Triangle(double width, double height, String style) {
        super(width,height);
        this.style = style;
    }

    double area() {
        return width * height/2;
    }

    void showStyle() {
        System.out.println("Style  = " + style);
    }
}
