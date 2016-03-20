/**
 * Created by ronald on 19-3-2016.
 *
 * @author (Ronald)
 * @version (1)
 */
public class QuickSort {
    // instance variables
    private int[] nums;

    /**
     * Constructor for objects of class BubbleSort
     */
    public QuickSort() {
        int g = 5; // generator
        int n = 1;
        int p = 7; // prime number; p should be greater than g
        nums = new int[p];

        // generate unsorted array (in a tricky way)
        for (int i = 0; i < nums.length - 1; i++) {
            n = n * g % p;
            nums[i] = n;
        }
        nums[nums.length - 1] = 0;
    }

    public void print() {
        for (int item : nums) {
            System.out.println(item);
        }
    }

    public void quickSorting() {
        qs(0, nums.length-1);
    }

    private void qs(int left, int right) {
        int i, j;
        int x;

        i = left;
        j = right;
        x = nums[(left + right) / 2]; // the number in the middle

        do {
            while ((nums[i] < x) && (i < right)) i++; // find the right end of the unsorted numbers
            while ((x < nums[j]) && (j > left)) j--;  // find the left end of the unsorted numbers

            if (i <= j) {
                // swap nums[i] with nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (left < j) qs(left, j);
        if (i < right) qs(i, right);
    }
}

