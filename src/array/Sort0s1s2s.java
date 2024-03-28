package array;

public class Sort0s1s2s {
    void sort(int a[]){
        int l = 0, m = 0, h = a.length-1;
        while (m<=h){
            int x = a[0];
            if (x==0){
                swap(a[l],a[m]);
                l++;
                m++;
            } else if (x==1) {
                m++;
            }else {
                swap(a[h],a[m]);
                h--;
            }
        }
    }

    private void swap(int i, int i1) {
        int temp = i;
        i = i1;
        i1 = temp;
    }

    public static void main(String[] args) {
        Sort0s1s2s s = new Sort0s1s2s();
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        s.sort(arr);


    }
}
