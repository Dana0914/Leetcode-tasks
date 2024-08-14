package leetcodetasks;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));

    }
    public static boolean containsDuplicate(int[] nums) {
        //first approach
        Map<Integer, Integer> dups = new HashMap<>();
        for (int num : nums) {
            dups.put(num, dups.getOrDefault(num, 0) + 1);
            if (dups.get(num) > 1) {
                return true;
            }
        }
        return false;

        //second approach
//        Map<Integer, Integer> dups = new HashMap<>();
//        int count = 0;
//        for (int num : nums) {
//            if (dups.containsKey(num)) {
//                count = dups.get(num);
//            }
//            dups.put(num, count+1);
//            if (dups.get(num) > 1) {
//                return true;
//            }
//        }
//        return false;
    }
}
