import java.util.Stack;

public class BackspaceStringCompare {

    public boolean stringCompare(String str1, String str2) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        String str3 = "", str4 = "";

        for (int i = 0; i<str1.length(); i++){
            if(!s1.isEmpty() && str1.charAt(i) == '#'){
                s1.pop();
            } else if ( str1.charAt(i) != '#'){
                s1.push(str1.charAt(i));
            }
        }
        for (int i = 0; i<str2.length(); i++){
            if(!s2.isEmpty() && str2.charAt(i) == '#'){
                s2.pop();
            } else if ( str2.charAt(i) != '#'){
                s2.push(str2.charAt(i));
            }
        }

        while (!s1.isEmpty()){
            str3 =  s1.peek() + str3;
            s1.pop();
        }
        System.out.println(" str3 "+str3);
        while (!s2.isEmpty()){
            str4 = s2.peek() + str4;
            s2.pop();
        }
        System.out.println(" str4 "+str4);

        return (str3.equals(str4)) ? true : false;
    }

    public static void main(String[] args) {
        String str1 = "equ#ual";
        String str2 = "ee#quaal#";
        BackspaceStringCompare s = new BackspaceStringCompare();
        System.out.println(s.stringCompare(str1, str2));
    }

}
