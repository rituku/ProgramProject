import java.util.Stack;

public class ParenthesisChecker {
    boolean checker(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            if(isOpening(ch)){
                st.push(ch);
            } else {
                if (st.isEmpty()){
                    return false;
                } else if (!isMatching(st.peek(), ch)){
                    return false;
                } else {
                    st.pop();
                }
            }

        }
        return st.isEmpty();
    }

    public boolean isMatching(Character peek, char ch) {
        return (peek == '{' && ch == '}') || (peek == '[' && ch == ']') || (peek == '(' && ch == ')');
    }

    public boolean isOpening(char c) {
        return (c == '{' || c == '(' || c == '[');
    }

    public static void main(String[] args) {
        String s = "{()}(]";
        ParenthesisChecker p = new ParenthesisChecker();
        System.out.println(p.checker(s));
    }

}
