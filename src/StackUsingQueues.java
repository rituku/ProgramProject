import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    private void push(int i) {
        q1.add(i);
        while (!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();
        }
        // swap the names of two queues
        Queue<Integer> q = q1;
        q1 = q2;
        q2 = q;

    }

    private void pop(){
        if (q2.isEmpty()){
            return;
        }
        q2.remove();
    }

    private int size(){
        return q2.size();
    }

    private int top(){
        if (q2.isEmpty()){
            return -1;
        }
        return q2.peek();
    }
    public static void main(String[] args)
    {
        StackUsingQueues s = new StackUsingQueues();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }

}
