package array;

public class KadanesAndLargetContSum {
    public static void maxSubArraySum(int[] array, int len){
        int max_sum = Integer.MIN_VALUE,
                curr_sum = 0, start = 0, end = 0, s = 0;

        for (int i = 0; i < array.length ; i++){
            curr_sum += array[i];
            if (curr_sum > max_sum){
                max_sum = curr_sum;
                start = s;
                end = i;
            }
            if (curr_sum < 0){
                curr_sum = 0;
                s = i + 1;
            }
        }
        System.out.println("max sum "+max_sum);
        System.out.println("start index "+start);
        System.out.println("end index "+end);
    }
    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        maxSubArraySum(a, n);
    }
}
