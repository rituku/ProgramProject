import java.util.Stack;

public class RemoveAllDublicates {

    public String ShortenString(String str1) {
        Stack<Character> s = new Stack<>();

        int i =0;
        while (i < str1.length()){
            if (s.isEmpty() || str1.charAt(i) != s.peek()){
                s.add(str1.charAt(i));
                i++;
            } else {
                s.pop();
                i++;
            }
        }
        if (s.isEmpty())
        {
            return ("Empty String");
        }

        // If stack is not Empty
        else
        {
            String short_String = "";
            while (!s.isEmpty())
            {
                short_String = s.peek() +
                        short_String;
                s.pop();
            }
            return (short_String);
        }
    }
    public static void main(String[] args) {
        String str1 ="azxxzy";
        RemoveAllDublicates s = new RemoveAllDublicates();
        System.out.print(s.ShortenString(str1));
    }

}
