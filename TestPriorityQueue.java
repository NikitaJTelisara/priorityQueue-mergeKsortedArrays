
public class TestPriorityQueue {

    public static void main(String[] arags){
        Task task1= new Task("Job1", 1);
        Task task3 = new Task("Job3", 1);
        Task task2 = new Task("Job2", 2);
        Task task5 = new Task("Job5", 5) ;
        Task task4 = new Task("Job4", 4) ;

        PriorityQueue q = new PriorityQueue(6);
        q.insert(task1);
        q.insert(task3);
        q.insert(task2);
        q.insert(task5);
        q.insert(task4);

        System.out.println(q.remove().job);
        System.out.println(q.remove().job);
        System.out.println(q.remove().job);
        System.out.println(q.remove().job);
        System.out.println(q.remove().job);
    }

    /* output
    Job5
    Job4
    Job2
    Job1
    Job3
     */
}
