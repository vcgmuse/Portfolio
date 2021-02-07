package com.vcgmuse.algoexpertio;

import java.util.List;

public class ValidateSubsequence {
  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code her
    int seqIdx = 0;
    for (Integer value : array) {
      if (seqIdx == sequence.size()) {
        break;
      }
      if (sequence.get(seqIdx).equals(value)) {
        seqIdx++;
      }
    }
    return seqIdx == sequence.size();
  }
}
