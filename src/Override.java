/**
 * Created by ronald on 20-3-2016.
 */

class A {
    int i;

    public A(int i) {
        this.i = i;
    }

    public void show() {
        System.out.println("i is " + i);
    }
}

class B extends A {
    int j;

    public B(int i, int j) {
        super(i);
        this.j = j;
    }

    public void show() {
        System.out.println("i is " + i + " and j is " + j);
    }
}

public class Override {
    public static void main(String args[]) {
        A object = new A(5);
        B subObject = new B(3,4);

        object.show();
        subObject.show();
    }
}
