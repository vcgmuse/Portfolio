package com.vcgmuse.algoexpertio;

public class PalindromeCheck {
  public static boolean isPalindrome(String str) {
    // Write your code here.
    int left = 0;
    int right = str.length();
    while(left < right){
      String leftStr = str.substring(left,left+1);
      String rightStr = str.substring(right-1,right);
      if(!leftStr.equals(rightStr)){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
