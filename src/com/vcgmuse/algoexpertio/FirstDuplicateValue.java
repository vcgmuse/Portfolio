package com.vcgmuse.algoexpertio;

public class FirstDuplicateValue {
  public int firstDuplicateValue(int[] array) {
    // Write your code here.
    int minSecIndex = array.length;
    for(int i = 0; i < array.length; i++){
      int value = array[i];
      for( int j = i + 1; j < array.length; j++){

        int valueToCompare = array[j];
        if(value == valueToCompare) {

          minSecIndex = Math.min(minSecIndex, j);
        }
      }
    }
    if( minSecIndex == array.length) {
      return -1;
    }
    return array[minSecIndex];
  }
}
