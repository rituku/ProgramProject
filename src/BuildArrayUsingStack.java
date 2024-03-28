import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BuildArrayUsingStack {
    public Stack<String> buildArray(int a[], int target) {
        Stack<String> ans = new Stack<>();
        int j = 0;
        for (int i = 1; i <= target; i++){
            if(a.length <= j){
                break;
            }
            if(i == a[j]){
                ans.push("push");
                j++;
            } else {
                ans.push("push");
                ans.push("pop");
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        BuildArrayUsingStack s = new BuildArrayUsingStack();
        int array[] = {1, 3};
        int target = 3;
        Stack<String> st = s.buildArray(array, target);
        System.out.println(st);
    }
}
