/**
 * Created by ronald on 20-3-2016.
 */
public class DynamicMethodDispatchDemo {
    public static void main(String args[]) {
        Sup sup = new Sup();
        Sub sub = new Sub();

        Sup supRef;

        supRef = sup;
        supRef.who();

        supRef = sub;
        supRef.who();
    }
}
