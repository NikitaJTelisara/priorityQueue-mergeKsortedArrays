/*  a priority queue is an abstract data type which is like a regular queue or stack data structure, but where additionally each
element has a "priority" associated with it. In a priority queue, an element with high priority is
served before an element with low priority. If two elements have the same priority, they are served according to their order
in the queue.
 */
public class PriorityQueue {
    int heapSize;
    int capacity;
    Task[] heap;

    PriorityQueue(int capacity){
        this.capacity = capacity +1;
        heap = new Task[capacity];
        heapSize = 0;
    }
    public void insert(Task task)
    {
        heap[heapSize++] = task;
        int pos = heapSize;
        while (pos != 1 && task.priority > heap[pos/2].priority)
        {
            heap[pos] = heap[pos/2];   // check parents priority
            pos /=2;
        }
        heap[pos] = task;
    }

    public Task remove() {
        int parent, child;
        Task item, temp;
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return null;
        }
        item = heap[1];
        temp = heap[heapSize--];
        parent = 1;
        child = 2;
        while (child <= heapSize) {
            if (child < heapSize && heap[child].priority < heap[child + 1].priority)
                child++;
            if (temp.priority >= heap[child].priority)
                break;

            heap[parent] = heap[child];
            parent = child;
            child *= 2;
        }
        heap[parent] = temp;
        return item;
    }

    boolean isEmpty() {
        return heapSize==0;
    }
}
