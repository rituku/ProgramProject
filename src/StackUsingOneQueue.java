import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {

    Queue<Integer> q1 = new LinkedList<>();
    private void push(int i) {
        int size = q1.size();
        q1.add(i);
        for (int j = 0; j < size; j++){
            q1.add(q1.remove());
        }
    }
    int pop()
    {
        if (q1.isEmpty())
        {
            System.out.println("No elements");
            return -1;
        }
        int x = q1.remove();
        return x;
    }

    // Returns top of stack
    int top()
    {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    // Returns true if Stack is empty else false
    boolean isEmpty()
    {
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        StackUsingOneQueue s = new StackUsingOneQueue();
        s.push(10);
        s.push(20);
        System.out.println("Top element :" + s.top());
        s.pop();
        s.push(30);
        s.pop();
        System.out.println("Top element :" + s.top());
    }
}
