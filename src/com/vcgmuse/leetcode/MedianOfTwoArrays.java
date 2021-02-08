package com.vcgmuse.leetcode;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoArrays {
  public int[] nums1 = {0, 5, 6, 7};
  public int[] nums2 = {1, 2, 3, 4};

  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    List<Integer> integerList = new ArrayList<>();
    for (int a : nums1) {
      integerList.add(a);
    }
    for (int b : nums2) {
      integerList.add(b);
    }
    integerList.sort(null);
    double median = 0;
    double pos1 = Math.floor((integerList.size() - 1.0) / 2.0);
    double pos2 = Math.ceil((integerList.size() - 1.0) / 2.0);
    if (pos1 == pos2) {
      median = integerList.get((int) pos1);
    } else {
      median = (integerList.get((int) pos1) + integerList.get((int) pos2)) / 2.0;
    }
    return median;
  }

  public static void main(String[] args) {
    MedianOfTwoArrays test = new MedianOfTwoArrays();
    test.findMedianSortedArrays(test.nums1, test.nums2);
  }
}
