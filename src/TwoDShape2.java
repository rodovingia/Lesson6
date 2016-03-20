/**
 * Created by ronald on 20-3-2016.
 */
public class TwoDShape2 {
    private double width, height;

    TwoDShape2(double width, double height) {
        this.width=width;
        this.height=height;
    }

    void showDim() {
        System.out.println("Width  = " + width);
        System.out.println("Height = " + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
