package array;

public class MajorityElement {
    int printMajority(int[] a, int size) {
        int count = 1; int res = a[0];
        for (int i = 1; i < size; i++){
            if (a[i] == res){
                count++;
            }
            else {
                count--;
            }
            if (count==0){
                count=1;
                res = i;
            }
        }

        for (int i =0;i<size;i++){
            if (a[i] == res){
                count++;
            }
        }

        if (count>=size/2){
            return res;
        }else {
            return -1;
        }
    }
    public static void main(String[] args) {
        MajorityElement majorelement
                = new MajorityElement();
        int a[] = new int[] { 3, 3, 4, 2, 4, 4, 2, 4, 4};

        // Function call
        int size = a.length;
        int ele = majorelement.printMajority(a, size);
        System.out.println("ele "+ele);
    }

}
