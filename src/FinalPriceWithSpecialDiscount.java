import java.util.Stack;

public class FinalPriceWithSpecialDiscount {
    public int[] getDiscount(int a[]) {
        int arr[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = a.length-1; i >= 0; i--){
            int a1 = a[i];
            while (a1 < st.peek()){
                st.pop();
            }
            arr[i] = a1 - st.peek();
            st.push(a1);
        }
        return arr;
    }
    public static void main(String[] args) {
        FinalPriceWithSpecialDiscount sf = new FinalPriceWithSpecialDiscount();
        int arr[] = {8,4,6,2,3};
        int array[] = sf.getDiscount(arr);
        for (int i = 0; i<array.length ; i++)
        System.out.print(array[i] + " ");
    }
}
