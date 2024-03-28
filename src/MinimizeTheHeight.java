import java.util.Arrays;

public class MinimizeTheHeight {
    int minimize(int[] a, int k, int n) {

        Arrays.sort(a);
        int diff = a[n-1] - a[0];
        int max = a[n-1];
        int min = a[0] ;

        for(int i = 1; i < n ; i++){
            if (a[i] - k < 0)
                continue;
            min = Math.min((a[0] + k), (a[i] - k));
            max = Math.max((a[i-1] + k), (a[n-1] - k));

            diff = Math.min(diff, max-min);
        }
        return diff;
    }
    public static void main(String[] args) {
        int a[] = {1, 5, 8, 10};
        int k = 2;
        int n = 4;

        MinimizeTheHeight m = new MinimizeTheHeight();
        System.out.println(m.minimize(a, k, n));

    }

}
