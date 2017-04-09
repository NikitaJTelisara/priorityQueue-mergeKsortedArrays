import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
    public static void main(String[] args) {
        int[][] m = {{ 1, 3, 5, 7 },
                { 2, 4, 6, 8 },
                { 0, 9, 10, 11 }};


        int[] res = mergeKSortedArr(m);
        //for (int a : res) {
        System.out.println(Arrays.toString(res));
        //}
    }

    public static int[] mergeKSortedArr(int[][] arr) {
        //PriorityQueue is heap in Java
        PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>();
        int total = 0;

        //add arrays to heap
        for (int i = 0; i < arr.length; i++) {
            queue.add(new ArrayContainer(arr[i], 0));
            total = total + arr[i].length;
        }

        int m = 0;
        int result[] = new int[total];

        //while heap is not empty
        while (!queue.isEmpty()) {
            ArrayContainer ac = queue.poll();
            result[m++] = ac.arr[ac.index];

            if (ac.index < ac.arr.length - 1) {
                queue.add(new ArrayContainer(ac.arr, ac.index + 1));
            }
        }

        return result;
    }
}
