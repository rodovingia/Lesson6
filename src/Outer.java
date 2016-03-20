/**
 * Created by ronald on 19-3-2016.
 */
public class Outer {
    double nums[];

    Outer(double n[]) {
        nums = n;
    }

    void analyse() {
        Inner inner = new Inner();

        System.out.println("Maximum: " + inner.max());
        System.out.println("Minimum: " + inner.min());
        System.out.println("Average: " + inner.avg());
    }

    // This is an inner class
    private class Inner {
        public double min() {
            double m = Double.MAX_VALUE;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] < m) m = nums[i];
            }

            return m;

        }

        public double max() {
            double m = Double.MIN_VALUE;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > m) m = nums[i];
            }

            return m;

        }

        public double avg() {

            if (nums.length > 0) {

                double a = 0;

                for (double e : nums) {
                    a += e;
                }

                return a / nums.length;

            } else
                return 0;
        }
    }
}
