import java.util.Stack;

public class RemoveDublicate {
    public static String removeDublicate(String sen){
        Stack<Character> st = new Stack<>();
        char chars[] = sen.toCharArray();
        st.push(sen.charAt(0));
        String s = "";

        for (int i = 1; i<=chars.length-1;i++) {
            if (chars[i-1] != chars[i]){
                st.push(chars[i]);
            }
        }
        for (Character c: st) {
            s = s + c;
        }
        return s;
    }
    public static void main(String[] args) {
        String sentance = "Tttthis iss aa Simmmmmmmmpleeeeeee.";
        String newSentance = removeDublicate(sentance);
        System.out.println(newSentance);
    }
}
