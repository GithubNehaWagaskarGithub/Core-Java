package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Program19 {
    public static void main(String[] args) {
        Queue<Character> c1=new LinkedList<>();// Queue Interface implements the LinkedList Class // Upcasting is happens here
        c1.offer('A');
        c1.offer('B');
        c1.add('C');
        c1.offer('D');
        c1.add('E');
        System.out.println(c1);
        System.out.println(c1.peek());//fetch the first element from Queue when our queue is empty the peek() return null value
        System.out.println(c1.element());//fetch the first element from Queue when our queue is empty the peek() throw
        // NoSuchElementException.
        System.out.println(c1.poll());//remove the first element from Queue when our queue is empty the poll() return null value.
        System.out.println(c1.remove());//remove the first element from Queue when our queue is empty the remove() throw
        // NoSuchElementException.
        System.out.println(c1);

        System.out.println("--------------------");

        for(Character c:c1)
        {
            System.out.println(c);
        }

        System.out.println("---------------------");

        Iterator<Character> itr= c1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
