import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evaluate(String[] str){
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for (String x : str){
            //int y = Integer.parseInt(x);
            if(x == "+" || x == "-" || x == "*" || x == "/" ){
                int ops1 = st.peek();
                st.pop();
                int ops2 = st.peek();
                st.pop();
                if (x == "+")
                {
                    result = ops2 + ops1;
                }
                else if (x == "-"){
                    result = ops2 - ops1;
                }
                else if (x == "*"){
                    result = ops2 * ops1;
                }
                else if (x == "/"){
                    result = ops2 / ops1;
                }
                st.push(result);
            } else {
                st.push(Integer.parseInt(x));
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String[] arr = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        EvaluateReversePolishNotation e = new EvaluateReversePolishNotation();
        int res = e.evaluate(arr);
        System.out.println("result "+res);
    }
}
