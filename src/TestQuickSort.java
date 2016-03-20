/**
 * Created by ronald on 19-3-2016.
 */
public class TestQuickSort {
    public static void main(String args[]) {
        QuickSort q = new QuickSort();

        System.out.println("Unsorted array:");
        q.print();

        q.quickSorting();
        System.out.println("Sorted array:");
        q.print();

    }
}
