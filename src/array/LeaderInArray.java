package array;

import java.util.Stack;

public class LeaderInArray {
    void leader(int a[]) {
        int size = a.length;
        Stack<Integer> s = new Stack<>();
        s.push(a[size-1]);
        for (int i = size-2; i>=0; i--){
            if(a[i] >= s.peek()){
                s.push(a[i]);
            }
        }
        while (!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
    public static void main(String[] args) {
        LeaderInArray l = new LeaderInArray();
        int a[] = {16,17,4,3,5,2};
        l.leader(a);
    }
}
