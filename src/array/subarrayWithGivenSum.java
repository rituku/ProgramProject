package array;

import java.util.*;

public class subarrayWithGivenSum {
    List<Integer> findSubarrayWithGivenSum(List<Integer> arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> subarray = new ArrayList<>();
        int currsum = 0;
        for (int i = 0; i < arr.size() ; i++){
            currsum += arr.get(i);
            if (map.containsKey(currsum - sum)){
                subarray = arr.subList(map.get(currsum - sum) + 1, i + 1);
                break;
            }
            map.put(currsum, i);
        }

        return subarray;
    }
    public static void main(String[] args) {
        List<Integer> arr
                = Arrays.asList(15, 2, 4, 8, 9, 5, 10, 23);
        subarrayWithGivenSum s = new subarrayWithGivenSum();
        List<Integer> subarray
                = s.findSubarrayWithGivenSum(arr, 23);
        if (subarray.isEmpty()) {
            System.out.println(
                    "No subarray with given sum found");
        }
        else {
            System.out.print("Subarray: [ ");
            for (int i : subarray) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
    }
}
