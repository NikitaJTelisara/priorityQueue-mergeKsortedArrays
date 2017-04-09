import java.util.PriorityQueue;

class ArrayContainer implements Comparable<ArrayContainer> {
    int index;
    int[] arr;

    public ArrayContainer(int[] arr, int index){
        this.arr = arr;
        this.index = index;
    }

    @Override
    public int compareTo(ArrayContainer o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
