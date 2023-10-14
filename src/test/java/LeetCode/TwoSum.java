package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSumWithNestedLoop(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i,j};
                }
            }
        }
        return result;

    }


    public int[] twoSumWithMap(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
         if(!map.containsKey(target-nums[i])){
             map.put(nums[i],i);
         }else {
          result[1]=map.get(target-nums[i]);
          result[0]=i;
         }

        }
     return result;
    }

    public static void main(String[] args) {

        TwoSum twoSum=new TwoSum();
        int[] num={3,8,5,6,7,1,9,2};
        System.out.println("twoSum.twoSum(num,17) = " + Arrays.toString( twoSum.twoSumWithMap(num, 17)));
    }


}

