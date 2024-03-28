import java.util.Stack;

public class GetMin {

    private Stack<Integer> s;
    private Stack<Integer> aux;
    public GetMin(){
        s = new Stack<>();
        aux = new Stack<>();
    }
    public void push(int x){

        if(aux.isEmpty()){
            aux.push(x);
        } else {
            if(aux.peek() >= x){
                aux.push(x);
            }
        }
        s.push(x);
    }

    public int pop(){
        if(s.isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(-1);
        }

        int top = s.pop();
        if(top == aux.peek()){
            aux.pop();
        }
        return top;
    }

    public int top(){
        return s.peek();
    }
    public int size() {
        return s.size();
    }

    // Returns true if the stack is empty; false otherwise
    public boolean isEmpty() {
        return s.isEmpty();
    }

    public int getMin(){
        if (aux.isEmpty())
        {
            System.out.println("Stack underflow!!");
            System.exit(-1);
        }
        return aux.peek();
    }


    public static void main(String[] args) {
        GetMin s = new GetMin();
        s.push(6);
        System.out.println(s.getMin());    // prints 6

        s.push(7);
        System.out.println(s.getMin());    // prints 6

        s.push(8);
        System.out.println(s.getMin());    // prints 6

        s.push(5);
        System.out.println(s.getMin());    // prints 5

        s.push(3);
        System.out.println(s.getMin());    // prints 3

        System.out.println(s.pop());    // prints 3
        System.out.println(s.getMin());    // prints 5

        s.push(10);
        System.out.println(s.getMin());    // prints 5

        System.out.println(s.pop());    // prints 10
        System.out.println(s.getMin());    // prints 5

        System.out.println(s.pop());    // prints 5
        System.out.println(s.getMin());    // prints 6
    }
}
