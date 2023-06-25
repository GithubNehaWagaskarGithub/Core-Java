package Collection;

import java.util.PriorityQueue;
import java.util.Queue;//Queue Interface has two Implemented Classes

public class Program20 {
    public static void main(String[] args) {
        Queue<Integer> q1=new PriorityQueue<>();//Queue Interface implements the PriorityQueue Class  //Upcasting
        q1.offer(10);
        q1.add(1);
        q1.add(15);
        q1.offer(5);
        q1.offer(-17);
        System.out.println(q1);
        System.out.println(q1.peek());//fetch the sorted first element from the Queue
        System.out.println(q1.element()); //fetch the sorted first element from the Queue
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1.poll());//Remove the sorted first element from the Queue
        System.out.println(q1);
        System.out.println(q1.remove());//Remove the sorted first element from the Queue
        System.out.println(q1);
    }
}
