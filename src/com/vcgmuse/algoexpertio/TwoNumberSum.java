package com.vcgmuse.algoexpertio;

import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
    Map<Integer, Boolean> nums = new HashMap<>();
    for (int num:array){
      int potentialMatch = targetSum - num;
      if(nums.containsKey(potentialMatch)) {
        return new int[] {potentialMatch, num};
      } else {
        nums.put(num, true);
      }
    }
    return new int[0];
  }
}
