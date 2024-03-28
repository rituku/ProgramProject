import java.util.Stack;

public class RemoveKDigit {
    public static String removeKdigits(String s, int k){
        Stack<Character> st = new Stack<>();

        if(k == 0){return s;}
        if (s.length() <= k){return "0";}

        int n = s.length();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);

            while(!st.isEmpty() && k>0 && st.peek() > ch){
                st.pop();
                k--;
            }
            if (!st.isEmpty() || ch != '0') {
                st.push(ch);
            }
        }

        for(int j = 0; j < k; j++){
            st.pop();
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()){sb.append(st.pop());}
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == 0){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "4325043";
        int k = 3;
        System.out.println(removeKdigits(s, k));
    }
}
