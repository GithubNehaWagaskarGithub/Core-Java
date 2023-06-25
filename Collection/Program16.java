package Collection;

import java.util.Stack;

public class Program16 {
    public static void main(String[] args) {
        Stack<Character> c1=new Stack<Character>();// stack follows the (FILO) means first in last out.
        c1.push('A');
        c1.push('B');
        c1.push('C');
        c1.push('D');
        c1.push('E');//is used for to add new element in stack.
        c1.add('F');
        System.out.println(c1);
        c1.pop();//last element is removed by pop();
        System.out.println(c1);
        System.out.println(c1.peek());//fetch to top most element in stack
        System.out.println(c1.search('B'));// is used for to find the position of element from top of the stack
        System.out.println(c1.isEmpty());//is used for to check the stack is empty or not
    }
}
